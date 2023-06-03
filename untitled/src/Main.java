import AVL.AVL;
import BinaryMinHip.BHeap;
import BinaryMinHip.Entry;
import BinaryMinHip.LinearProbing;
import List.*;
import SerchTree.BST;
import Tree.BinaryTree;
import Tree.Node;

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

        //해시 테이블
        LinearProbing t = new LinearProbing();
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
    }
}