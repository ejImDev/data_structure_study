package HashTable;

import java.util.Random;

public class RandProbing<K,V> {

    public int N = 0; // 항목수
    public final int M = 13; // 테이블 크기
    public K[] a = (K[]) new Object[M]; // 해시테이블
    public V[] d = (V[]) new Object[M]; // key관련 데이터 저장
    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }
    public void put(K key, V data) {
        int initialpos = hash(key);
        int i = initialpos;
        Random rand = new Random();
        rand.setSeed(10);
        do {
            if(a[i] == null) { // 삽입위치 발견
                a[i] = key; // key를 해시테이블에 저장
                d[i] = data; N++; // key관련 데이터 저장. 항목수 매칭
                return;
            }
            if (a[i].equals(key)) { // 삽입위치에 이미 key 존재
                d[i] = data; // 데이터만 갱신
                return;
            }
            i = (initialpos + rand.nextInt(1000)) % M; // i = 다음위치
        } while (N < M); // 현재 i가 초기위치와 같게되면 루프 종료
    }

    public V get(K key) { // 탐색연산
        Random rand = new Random();
        rand.setSeed(10); // 삽입때와 같은 seed값 사용
        int initialpos = hash(key);
        int i = initialpos, j=1;
        while (a[i] != null) { // a[i]가 empty가 아니면
            if(a[i].equals(key)){
                return d[i];
            }
            i = (initialpos + rand.nextInt(1000)) % M; // i = 다음 위치
        }
        return null;
    }
}
