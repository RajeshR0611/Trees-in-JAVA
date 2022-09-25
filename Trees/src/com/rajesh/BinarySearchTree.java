package com.rajesh;

public class BinarySearchTree {
    Node root;
    class Node{
        int key;
        Node left;
        Node right;
        Node(int val){
            this.key = val;
            this.left = this.right = null;
        }
    }
    public BinarySearchTree(int val){
        root = new Node(val);
    }
    public BinarySearchTree(){
        root = null;
    }
    public void insertBST(int val){
        insertBST(root,val);
    }

    public Node insertBST(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.key){
            root.left = insertBST(root.left,val);
        }else{
            root.right = insertBST(root.right,val);
        }
        return root;
    }
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }
    public Node Search(Node root, int val){
        if(root==null||root.key==val){
            return root;
        }
            if(val<root.key){
                return Search(root.left,val);
            }
            else{
                return Search(root.right,val);
            }

    }
    public void Delete (int val){
        root = Delete(root,val);
    }
    public Node Delete(Node root,int val){
        if(root == null) {
            return root;
        }

        if(root.key > val){
            root.left = Delete(root.left,val);
        }
        else if (root.key < val){
            root.right = Delete(root.right,val);
        }else{
            if(root.left==null){
                return root.right;
            }else if( root.right==null){
                return root.left;
            }

            root.key = Min(root.right);
            root.right = Delete(root.right, root.key);

        }
        return root;
    }

    private int Min(Node root){
        if(root.left==null&&root.right==null){
            return root.key;
        }
        int minvalue = Min(root.left);
        return minvalue;
    }

    /*private int Min(Node root){
        int Minvalue = root.key;//90-80-70
        while(root.left!=null){
            Minvalue = root.left.key;
            root = root.left;
        }
        return Minvalue;
    }*/


}
