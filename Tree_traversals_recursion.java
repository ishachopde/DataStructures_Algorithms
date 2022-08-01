// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//trees recrusion
import java.util.*;

class Tree{
    int value;
    Tree left;
    Tree right;
    
    Tree(int value){
        this.value = value;
        left = right = null;
    }
}

class HelloWorld {
    
    public static void inOrder(Tree root){
        if(root == null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }
    
    public static void preOrder(Tree root){
        if(root == null){
            return;
        }
        
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void postOrder(Tree root){
        if(root == null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // BinaryTree tree = new BinaryTree();
        Tree root = new Tree(1);
         root.left = new Tree(2);
         root.right = new Tree(3);
         root.left.left = new Tree(4);
         root.left.right = new Tree(5);
        //  root.right.left = new Tree(6);
        //  root.right.right = new Tree(7);
        //  root.left.left.left = new Tree(8);
        //  root.left.left.right = new Tree(9);
        //  root.left.right.left = new Tree(10);
        //  root.left.right.right = new Tree(11);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
}
