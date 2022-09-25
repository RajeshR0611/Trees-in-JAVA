package com.rajesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree tree = new BinaryTree(10);
        tree.InsertLeft(tree.root,5);
        tree.InsertRight(tree.root,15);
        tree.InsertLeft(tree.root.left,3);
        tree.InsertRight(tree.root.left,8);
        tree.InsertLeft(tree.root.right,12);
        System.out.println("Binary tree preOrder");
        BinaryTree.preOrder(tree.root);
        System.out.println();      System.out.println("Binary tree InOrder");
        BinaryTree.inOrder(tree.root);
        System.out.println();      System.out.println("Binary tree postOrder");
        BinaryTree.postOrder(tree.root);
        System.out.println();
        System.out.println();


        //-------------------------------------BINARY SEARCH TREE-----------------------------------------------------//
        System.out.println("Binary search tree");
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.insertBST(bst.root, 20);
        bst.insertBST(70);
        bst.insertBST(10);
        bst.insertBST(25);
        bst.insertBST(60);
        bst.insertBST(90);
        bst.insertBST(80);
        bst.insertBST(75);

        bst.inOrder(bst.root);
        System.out.println();

        if(bst.Search(bst.root,90)==null ){
            System.out.println("val Not found");
        }else{
            System.out.println("val found");

        }
        bst.Delete(bst.root, 70);
        bst.inOrder(bst.root);
        System.out.println();

        BinarySearchTree bst1 = new BinarySearchTree(50);
        bst1.insertBST(bst1.root, 20);
        bst1.inOrder(bst1.root);
        System.out.println();
        bst1.Delete(50);
        bst1.inOrder(bst1.root);

        System.out.println();
        System.out.println();

        //-----------------------------------------------AVL TREE-----------------------------------------------------//
        System.out.println("AVL Tree");
        AVLTree avl = new AVLTree(50);
        avl.InsertAvl(20);
        avl.InsertAvl(60);
        avl.InsertAvl(10);
        avl.InsertAvl(30);
        avl.InsertAvl(40);
        avl.Inorder(avl.root);

    }
}
