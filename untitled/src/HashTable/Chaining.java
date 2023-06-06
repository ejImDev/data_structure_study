package HashTable;

import java.util.Random;

public class Chaining<K,V> {
    public final int M = 13; // 테이블 크기

    public Node[] a = new Node[M];

    private int hash(K key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public V get (K key){
        int i = hash(key);
        for(Node x = a[i]; x !=null; x=x.next){
            if (key.equals(x.key)){ // 연결리스트 탐색
                return (V) x.data; // 탐색 성공
            }
        }
        return null; // 탐색 실패
    }

    public void put(K key, V data) {
        int i = hash(key);
        for(Node x = a[i]; x !=null; x=x.next){
            if (key.equals(x.key)){
                x.data = data;
                return;
            }
        }
        a[i] = new Node(key, data, a[i]);
    }

    public static class Node {
        public Object key;
        public Object data;
        public Node next;
        public Node(Object newkey, Object newdata, Node ref){
            key = newkey;
            data = newdata;
            next = ref;
        }
        public Object getKey() {
            return key;
        }
        public Object getData() {
            return data;
        }
    }

}
