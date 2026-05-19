package com.sunbeam;


class BinSearchTree {
   
    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return this.data;
        }
    }

    private Node root;

    public BinSearchTree() {
        root = null;
    }

  
    private Node addRec(Node trav, int val) {
        if (trav == null)
            return new Node(val);

        if (val < trav.data)
            trav.left = addRec(trav.left, val);
        else
            trav.right = addRec(trav.right, val);

        return trav;
    }

    public void addRec(int val) {
        root = addRec(root, val);
    }

    
    private void preorder(Node trav) {
        if (trav == null)
            return;
        System.out.print(trav.data + ", ");
        preorder(trav.left);
        preorder(trav.right);
    }

    public void preorder() {
        System.out.print("PRE : ");
        preorder(root);
        System.out.println();
    }

    

    private void inorder(Node trav) {
        if (trav == null)
            return;
        inorder(trav.left);
        System.out.print(trav.data + ", ");
        inorder(trav.right);
    }

    public void inorder() {
        System.out.print("IN  : ");
        inorder(root);
        System.out.println();
    }

       
}


public class BinarySearchTree {
    public static void main(String[] args) {

        BinSearchTree t = new BinSearchTree();

       
        t.addRec(50);
        t.addRec(25);
        t.addRec(10);
        t.addRec(75);
        t.addRec(90);
        t.addRec(35);
        t.addRec(60);
        t.addRec(15);
        t.addRec(55);
        t.addRec(70);

        t.preorder();

        t.inorder();
        


    }
}
