package AVL;

import SerchTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class AVL <Key extends Comparable<Key>, Value> {
    public Node root;
    public class Node {
        private Key id;
        private Value name;
        private int height;
        private Node left, right;
        public Node(Key newID, Value newName, int newHt) {
            id = newID;
            name = newName;
            height = newHt;
            left = right = null;
        }
    }

    private int height(Node n) {
        if(n==null) { return 0; }
        return n.height;
    }

    public void put(Key k, Value v) { root = put(root, k, v); }
    private Node put(Node n, Key k, Value v) {
        if(n==null) {
            return new Node(k, v, 1);
        }
        int t = k.compareTo(n.id);
        if(t<0) {
            n.left = put(n.left, k, v);
        } else if (t>0) {
            n.right = put(n.right, k, v);
        } else {
            n.name = v;
            return n;
        }
        n.height = tallerHeight(height(n.left), height(n.right))+1;
        return balance(n);
    }

    private Node balance(Node n) {
        if(bf(n)>1) {
            if(bf(n.left)<0) {
                n.left = rotateLeft(n.left);
            }
            n = rotateRight(n);
        } else if (bf(n)<-1) {
            if(bf(n.right)>0) {
                n.right = rotateRight(n.right);
            }
            n = rotateLeft(n);
        }
        return n;
    }

    private int bf(Node n) {
        return height(n.left) - height(n.right);
    }

    private int tallerHeight(int x, int y) {
        if(x>y) { return x; }
        else { return y; }
    }

    public void delete(Key k) { root = delete(root, k); }
    public Node delete(Node n, Key k) {
        int t = n.id.compareTo(k);
        if(t>0) {
            n.left = delete(n.left, k);
        } else if (t<0) {
            n.right = delete(n.right, k);
        } else {
            if(n.right==null) {
                return n.left;
            }
            if(n.left==null) {
                return n.right;
            }
            Node target = n;
            n = min(target.right);
            n.right = deleteMin(target.right);
            n.left = target.left ;
        }
        n.height = tallerHeight(height(n.left), height(n.right))+1;
        return balance(n);
    }

    public Key min() {
        return min(root).id;
    }
    private Node min(Node n) {
        if(n.left==null) {
            return n;
        }
        return min(n.left);
    }

    public void deleteMin() {
        if(root==null) {
            System.out.print("empty 트리");
            root = deleteMin(root);
        }
    }
    public Node deleteMin(Node n) {
        if(n.left==null){
            return n.right;
        }
        n.left = deleteMin(n.left);
        n.height = tallerHeight(height(n.left), height(n.right))+1;
        return balance(n);
    }

    private Node rotateRight(Node n) {
        Node x = n.left;
        n.left = x.right;
        x.right = n;
        n.height = tallerHeight(height(n.left), height(n.right)) +1;
        x.height = tallerHeight(height(x.left), height(x.right)) +1;
        return x;
    }

    private Node rotateLeft(Node n) {
        Node x = n.right;
        n.right = x.left;
        x.left = n;
        n.height = tallerHeight(height(n.left), height(n.right)) +1;
        x.height = tallerHeight(height(x.left), height(x.right)) +1;
        return x;
    }


    public void print(Node root) {
        System.out.printf("\ninorder : \n");
        inorder(root);
        System.out.printf("\npreorder : \n");
        preorder(root);
        System.out.printf("\nlevelorder : \n");
        levelorder(root);
    }

    public void inorder(Node n) {
        if(n!=null) {
            inorder(n.left);
            System.out.print(n.id+" ");
            inorder(n.right);
        }
    }

    public void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        Node t;
        q.add(root);
        while (!q.isEmpty()) {
            t = q.remove();
            System.out.print(t.id + " ");
            if (t.left != null) {
                q.add(t.left);
            }
            if (t.right != null) {
                q.add(t.right);
            }
        }
    }

    public void preorder(Node n) {
        if(n!=null) {
            System.out.print(n.id+" ");
            preorder(n.left);
            preorder(n.right);
        }
    }

}
