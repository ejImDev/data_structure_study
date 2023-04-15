import List.ArrList;
import List.SList;

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
        SList<String> s = new SList<String>();
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
        System.out.println("t.size() = " + t.size());
    }
}