package com.rajesh;

public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node left,right;
        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    public BinaryTree(int d){
        root = new Node(d);
    }
    public void InsertLeft(Node r,int val){
        Node newNode = new Node(val);
        r.left = newNode;
    }
    public void InsertRight(Node r,int val){
        Node newNode = new Node(val);
        r.right = newNode;
    }
    public static void preOrder(Node root){

        if(root!=null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root){

        if(root!=null) {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public static void postOrder(Node root){

        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

}
