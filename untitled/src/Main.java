import Grape.*;
import HashTable.*;
import Sort.Heap;
import Sort.Insertion;
import Sort.Merge;
import Sort.Selection;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //배열 리스트
        /*
        ArrList<String> s = new ArrList<String>();
        s.insertLast("apple");
        s.print();
        s.insertLast("orange");
        s.print();
        s.insertLast("cherry");
        s.print();
        s.insertLast("pear");
        s.print();
        s.insert("grape",1);
        s.print();
        s.insert("lemon",4);
        s.print();
        s.insertLast("kiwi");
        s.print();
        s.delete(4);
        s.print();
        s.delete(0);
        s.print();
        s.delete(0);
        s.print();
        s.delete(3);
        s.print();
        s.delete(0);
        s.print();

        System.out.println("s.peek(1) = " + s.peek(1));
        System.out.println();

        ArrList<Integer> i = new ArrList<Integer>();
        i.insertLast(100);
        i.insertLast(200);
        i.insertLast(300);
        i.insertLast(400);
        i.print();
        i.insert(350,3);
        i.print();
        i.insert(250,2);
        i.print();
        i.insertLast(500);
        i.print();
        */

        //단순연결리스트
        /*SList<String> s = new SList<String>();
        s.insertFront("orange");
        s.insertFront("apple");
        s.insertAfter("cherry", s.getHead().getNext());
        s.insertFront("pear");
        s.print();
        System.out.println("s.size() : " + s.size()+"\n");
        System.out.println("체리의 위치 : "+s.search("cherry"));
        System.out.println("키위의 위치 : "+s.search("kiwi"));
        s.deleteAfter(s.getHead());
        s.print();
        s.deleteFront();
        s.print();
        System.out.println("s.size() = " + s.size()+"\n");
        
        SList<Integer> t = new SList<Integer>();
        t.insertFront(500);
        t.insertFront(200);
        t.insertAfter(400, t.getHead());
        t.insertFront(100);
        t.insertAfter(300, t.getHead().getNext());
        t.print();
        System.out.println("t.size() = " + t.size());*/

        //스택
        /*
        ArrayStack<String> stack = new ArrayStack<String>();
        stack.push("apple");
        stack.push("orange");
        stack.push("cherry");
        System.out.println(stack.peek());
        stack.push("pear");
        stack.print();
        stack.pop();
        System.out.println(stack.peek());
        stack.push("grape");
        stack.print();*/

        //배열 큐
        /*
        ArrayQueue<String> queue = new ArrayQueue<String>();

        queue.add("apple");
        queue.add("orange");
        queue.add("cherry");
        queue.add("pear");
        queue.print();
        queue.remove();
        queue.print();

        queue.add("grape");
        queue.print();
        queue.remove();
        queue.print();

        queue.add("lemon");
        queue.print();
        queue.add("mango");
        queue.print();
        queue.add("lime");
        queue.print();
        queue.add("kiwi");
        queue.print();

        queue.remove();
        queue.print();*/

        //리스트 큐
        /*
        ListQueue<String> q = new ListQueue<String>();

        q.add("apple");
        q.add("orange");
        q.add("cherry");
        q.add("pear");
        q.print();

        q.remove();
        q.print();
        q.remove();
        q.print();

        q.add("grape");
        q.print();*/

        //이진트리 연산
        /*
        Node n1 = new Node<>(100, null, null);
        Node n2 = new Node<>(200, null, null);
        Node n3 = new Node<>(300, null, null);
        Node n4 = new Node<>(400, null, null);
        Node n5 = new Node<>(500, null, null);
        Node n6 = new Node<>(600, null, null);
        Node n7 = new Node<>(700, null, null);
        Node n8 = new Node<>(800, null, null);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);
        n4.setLeft(n8);

        BinaryTree t = new BinaryTree();
        t.setRoot(n1);

        System.out.println("트리 노드 수 = " + t.size(t.getRoot()) + "\n트리 높이 = " + t.height(t.getRoot()));
        System.out.printf("\n전위 순회 : ");
        t.preorder(t.getRoot());
        System.out.printf("\n중위 순회 : ");
        t.inorder(t.getRoot());
        System.out.printf("\n후위 순회 : ");
        t.postorder(t.getRoot());
        System.out.printf("\n레벨 순회 : ");
        t.levelorder(t.getRoot());
        System.out.println();*/

        //이진트리 isEqual()
        /*
        Node n10 = new Node(100, null, null);
        Node n20 = new Node(200, null, null);
        Node n30 = new Node(300, null, null);
        Node n40 = new Node(400, null, null);
        Node n50 = new Node(500, null, null);
        Node n60 = new Node(600, null, null);
        Node n70 = new Node(700, null, null);
        Node n80 = new Node(800, null, null);

        n10.setLeft(n20);
        n10.setRight(n30);
        n20.setLeft(n40);
        n20.setRight(n50);
        n30.setLeft(n60);
        n30.setRight(n70);
        n40.setLeft(n80);

        BinaryTree t2 = new BinaryTree();
        t2.setRoot(n10);
        System.out.printf("동일성 검사 : "+BinaryTree.isEqual(t.getRoot(), t2.getRoot()));
        System.out.println();

        BinaryTree t3 = new BinaryTree();
        t3.setRoot(t3.copy(t.getRoot()));
        System.out.printf("copy 테스트 : "+ BinaryTree.isEqual(t.getRoot(), t3.getRoot()));
        System.out.println();*/

        //탐색트리
        /*
        BST t = new BST(500, "Apple");
        
        t.put(600, "Banana");
        t.put(200, "Melon");
        t.put(100, "Orange");
        t.put(400, "Tangerine");
        t.put(250, "Kiwi");
        t.put(150, "Grape");
        t.put(800, "Strawberry");
        t.put(700, "Cherry");
        t.put(50, "Pear");
        t.put(350, "Lemon");
        t.put(10, "Watermelon");
        
        t.print(t.root);
        System.out.println();
        System.out.println("t.height() = " + t.height());
        */

        //AVL트리
        /*
        AVL<Integer, String> st = new AVL<Integer, String>();
        st.put(75, "Apple");
        st.put(80, "Grape");
        st.put(85, "Lime");
        st.put(20, "Mango");
        st.put(10, "Strawberry");
        st.put(50, "Banana");
        st.put(30, "Cherry");
        st.put(40, "Watermelon");
        st.put(70, "Melon");
        st.put(90, "fruit");
        st.print(st.root);

        System.out.println();
        System.out.println();
        System.out.printf("75와 85 삭제 후 : \n");
        st.delete(75);
        st.delete(85);
        st.print(st.root);*/

        //이진 힙
        /*
        Entry[] a = new Entry[16];
        a[1] = new Entry(90, "watermelon");
        a[2] = new Entry(80, "pear");
        a[3] = new Entry(70, "melon");
        a[4] = new Entry(50, "lime");
        a[5] = new Entry(60, "mango");
        a[6] = new Entry(20, "cherry");
        a[7] = new Entry(30, "grape");
        a[8] = new Entry(35, "orange");
        a[9] = new Entry(10, "apricot");
        a[10] = new Entry(15, "banana");
        a[11] = new Entry(45, "lemon");
        a[12] = new Entry(40, "kiwi");

        BHeap h = new BHeap(a,12);
        System.out.println("힙 만들기 전 : ");
        h.print();
        h.createHeap();
        System.out.println("최소 힙 : ");
        h.print();
        System.out.println("min 삭제 후 : ");
        System.out.println(h.deleteMin().getValue());
        h.print();
        h.insert(5,"apple");
        System.out.println("5 삽입 후 : ");
        h.print();
*/

        //해시 테이블 - 개방주소 방식
        /*
        //LinearProbing t = new LinearProbing(); // 선형조사
        //QuadProbing t = new QuadProbing(); // 이차 조사
        //RandProbing t = new RandProbing(); // 랜덤 조사
        DoubleProbing t = new DoubleProbing();

        t.put(25, "grape");
        t.put(37, "apple");
        t.put(18, "banana");
        t.put(55, "cherry");
        t.put(22, "mango");
        t.put(35, "lime");
        t.put(50, "orange");
        t.put(63, "watermelon");

        System.out.println("탐색결과 : ");
        System.out.println("50의 data = " + t.get(50));
        System.out.println("63의 data = " + t.get(63));
        System.out.println("");

        System.out.println("해시 테이블 : ");
        for(int i=0; i<t.M; ++i){
            System.out.printf("\t%2d", i);
        }
        System.out.println();
        for(int i=0; i<t.M; ++i){
            System.out.print("\t"+t.a[i]);
        }
        System.out.println();
    */

        //해시 테이블 - 폐쇄주소 방식
       /* Chaining t = new Chaining();

        t.put(25, "grape");
        t.put(37, "apple");
        t.put(18, "banana");
        t.put(55, "cherry");
        t.put(22, "mango");
        t.put(35, "lime");
        t.put(50, "orange");
        t.put(63, "watermelon");

        System.out.println("탐색 결과");
        System.out.println("50의 데이터 = "+t.get(50));
        System.out.println("63의 데이터 = "+t.get(63));
        System.out.println("37의 데이터 = "+t.get(37));
        System.out.println("22의 데이터 = "+t.get(22));
        *//*
        t.put(71, "grape");
        t.put(23, "apple");
        t.put(73, "banana");
        t.put(49, "cherry");
        t.put(54, "mango");
        t.put(89, "lime");
        t.put(39, "orange");*//*

        System.out.println();
        System.out.println("해시테이블");

        for(int i=0; i<t.M; ++i){
            System.out.print(String.format("%2d", i));
            Chaining.Node x = t.a[i];
            while (x!=null){
                System.out.print("--> [" + x.getKey()+", "+x.getData()+"]");
                x = x.next;
            }
            System.out.println();
        }
        */

        //선택 정렬
        /*
        String a[] = {"S", "E", "L", "E", "C", "T", "I", "O", "N", "S", "O", "R", "T"};
        Selection.sort(a);
        System.out.println(" 정렬 결과 : ");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + " ");
        }*/

        //삽입 정렬
        /*
        String a[] = {"I", "N", "S", "E", "R", "T", "I", "O", "N", "S", "O", "R", "T"};
        Insertion.sort(a);
        System.out.println(" 정렬 결과 : ");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + " ");
        }*/

        //쉘정렬
        /*
        String a[] = {"S", "H", "E", "L", "L", "S", "O", "R", "T", "T", "E", "X", "T", "S", "A", "M", "P", "P", "L", "E"};
        Selection.sort(a);
        System.out.println(" 정렬 결과 : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }*/

        //힙 정렬
        /*
        String a[] = {" ", "H", "E", "A", "P", "S", "O", "R", "T", "T", "E", "X", "T", "S", "A", "M", "P", "P", "L", "E"};
        Heap.sort(a);
        System.out.println(" 정렬 결과 : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }*/

        //합병 정렬
        /*
        String a[] = {"M", "E", "R", "G", "E", "S", "O", "R", "T", "T", "E", "X", "T", "S", "A", "M", "P", "P", "L", "E"};
        Merge.sort(a);
        System.out.println(" 정렬 결과 : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }*/

        //퀵 정렬
        /*
        String a[] = {"Q", "U", "I", "C", "K", "S", "O", "R", "T", "T", "E", "X", "T", "S", "A", "M", "P", "P", "L", "E"};
        Merge.sort(a);
        System.out.println(" 정렬 결과 : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }*/


        //BFS, DFS
        /*
        // 그래프 초기 셋팅
        int N = 10;
        List<Edge>[] adjList = new List[N];
        adjList[0] = new LinkedList<>();
        Edge e2 = new Edge(2);
        adjList[0].add(e2);
        Edge e1 = new Edge(1);
        adjList[0].add(e1);
        
        adjList[1] = new LinkedList<>();
        Edge e4 = new Edge(3);
        adjList[1].add(e4);
        Edge e3 = new Edge(0);
        adjList[1].add(e3);
        
        adjList[2] = new LinkedList<>();
        Edge e6 = new Edge(3);
        adjList[2].add(e6);
        Edge e5 = new Edge(0);
        adjList[2].add(e5);
        
        adjList[3] = new LinkedList<>();
        Edge e8 = new Edge(9);
        adjList[3].add(e8);
        Edge e9 = new Edge(8);
        adjList[3].add(e9);
        Edge e10 = new Edge(2);
        adjList[3].add(e10);
        Edge e7 = new Edge(1);
        adjList[3].add(e7);

        adjList[4] = new LinkedList<>();
        Edge e11 = new Edge(5);
        adjList[4].add(e11);

        adjList[5] = new LinkedList<>();
        Edge e12 = new Edge(7);
        adjList[5].add(e12);
        Edge e13 = new Edge(6);
        adjList[5].add(e13);
        Edge e14 = new Edge(4);
        adjList[5].add(e14);

        adjList[6] = new LinkedList<>();
        Edge e16 = new Edge(5);
        adjList[6].add(e16);

        adjList[7] = new LinkedList<>();
        Edge e18 = new Edge(5);
        adjList[7].add(e18);

        adjList[8] = new LinkedList<>();
        Edge e19 = new Edge(3);
        adjList[8].add(e19);

        adjList[9] = new LinkedList<>();
        Edge e20 = new Edge(3);
        adjList[9].add(e20);

        //DFS
        System.out.println(" DFS 방문순서 : ");
        DFS d = new DFS(adjList);
        System.out.println();

        //BFS
        System.out.println(" BFS 방문순서 : ");
        BFS b = new BFS(adjList);
        System.out.println();*/

        //위상정렬
        /*
        int N = 9;
        List<Integer>[] adjList = new List[N];
        for (int i=0; i<N; i++){
            adjList[i] = new LinkedList<>();
        }
        adjList[2].add(0);
        adjList[2].add(1);
        adjList[0].add(1);
        adjList[1].add(3);
        adjList[1].add(4);
        adjList[4].add(5);
        adjList[5].add(3);
        adjList[5].add(7);
        adjList[3].add(6);
        adjList[6].add(7);
        adjList[7].add(8);

        TopologicalSort t = new TopologicalSort(adjList);
        List<Integer> sortedSeq = t.tsort();
        System.out.printf(" 위상 정렬 : \n ");
        System.out.println(sortedSeq);*/

        int[][] weight = {
                {0, 9, 10, 0, 0, 0, 0},
                {9, 0, 0, 10, 5, 0, 3},
                {0, 0, 0, 9, 7, 2, 0},
                {0, 10, 9, 0, 0, 4, 8},
                {0, 5, 7, 0, 0, 0, 1},
                {0, 0, 2, 4, 0, 0, 6},
                {0, 3, 0, 8, 1, 6, 0},
        };
        int N = weight.length;
        int M = 0; // 그래프 간선의 수
        List<GreedyEdge>[] adjList = new List[N];
        for(int i=0; i<N; i++){
            adjList[i] = new LinkedList<>();
            for(int j=0; j<N; j++){
                if(weight[i][j] != 0){
                    GreedyEdge e = new GreedyEdge(i,j,weight[i][j]);
                    adjList[i].add(e);
                    M++;
                }
            }
        }

        KruskalMST k = new KruskalMST(adjList, M); // KruskalMST 객체 생성
        GreedyEdge[] tree = new GreedyEdge[N-1]; // 최소신장트리의 간선을 출력하기 위해

        System.out.print(" 최소신장트리 간선 : ");
        tree = k.mst();

        int sum = 0;
        for(int i=0; i< tree.length; i++){
            System.out.print("(" + tree[i].vertex + "," + tree[i].adjvertex+")");
            sum += tree[i].weight;
        }
        System.out.println();
        System.out.println();
        System.out.println("최소신장트리의 간선 가중치 합 = " + sum);
    }
}