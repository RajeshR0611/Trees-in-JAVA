package com.rajesh;

public class AVLTree {
    Node root;
    class Node{
        int key;
        int height;
        Node left;
        Node right;
        public Node(int val){
            this.key = val;
            left = right = null;
            height = 0;
        }
        }
    public AVLTree(){root = null;}
    public AVLTree(int val){
        root = new Node(val);
    }
    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public int max(int a,int b){
        return a>b?a:b;
    }
    public void InsertAvl(int val){
        root = InsertAVL(root,val);
    }
    public Node InsertAVL(Node node,int val){
        if(node==null){
            return new Node(val);
        }
        if(val<node.key){
            node.left = InsertAVL(node.left,val);
        }else if(val>node.key){
            node.right = InsertAVL(node.right,val);
        }else{
            return node;
        }

        node.height = 1+max(getHeight(node.left),getHeight(node.right));
       // if(val==40){ System.out.println("The height of "+node.key + " node is "+node.height);}
        int balFactor = getBalanceFactor(node);

        //LL Case
        if(balFactor >1 && val< node.left.key){
            return RightRotate(node);
        }
        //LR Case
        if(balFactor >1 && val> node.left.key){
            node.left = LeftRotate(node.left);
            return RightRotate(node);

        }
        //RR Case
        if(balFactor < -1 && val> node.right.key){
            return LeftRotate(node);
        }
        //RL Case
        if(balFactor < -1 && val< node.right.key){
            node.right = RightRotate(node.right);
            return LeftRotate(node);

        }

        return node;
    }
    private Node RightRotate(Node z){ //check diagram in note
        Node y = z.left;
        Node t3 = y.right;

        y.right = z;
        z.left =t3;

        z.height= 1+ max(getHeight(z.left),getHeight(z.right));
        y.height= 1+ max(getHeight(y.left),getHeight(y.right));

        return y;

    }

    private Node LeftRotate(Node z){
        Node y = z.right;
        Node t3 = y.left;

        y.left = z;
        z.right = t3;

        z.height= 1+ max(getHeight(z.left),getHeight(z.right));
        y.height= 1+ max(getHeight(y.left),getHeight(y.right));

        return y;


    }


    private int getBalanceFactor(Node node){
        if(node==null)
            return 0;
        return (getHeight(node.left)-(getHeight(node.right)));
    }
    public void Inorder(Node root){
        if(root!=null) {
            Inorder(root.left);
            System.out.println(root.key+" the height of the node is " + root.height);
            Inorder(root.right);
        }
    }

}
