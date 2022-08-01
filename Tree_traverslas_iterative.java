// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//tree traversals iterative
import java.util.*;

class Tree{
    Tree left;
    Tree right;
    int value;
    
    Tree(int value){
        this.value = value;
        left = right = null;
    }
}

class HelloWorld {
    
    public static void inOrder(Tree root){
        Stack<Tree> stack = new Stack<>();
        Tree curr = root;
       while(!stack.isEmpty() || curr != null){
        while(curr != null){
            stack.push(curr);
            curr = curr.left;
        }
        
        curr = stack.pop();
        System.out.print(curr.value + " ");
        curr = curr.right;
       }
    }
    
    public static void preOrder(Tree root){
        Stack<Tree> stack = new Stack<>();
        Tree curr = root;
        stack.push(curr);
        while(!stack.isEmpty()){
            curr = stack.pop();
            System.out.print(curr.value + " ");
            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
        }
    }
    
    public static void postOrder(Tree root){
        Stack<Tree> stack1 = new Stack<>();
        Stack<Tree> stack2 = new Stack<>();
        Tree curr = root;
        stack1.push(curr);
        while(!stack1.isEmpty()){
            curr = stack1.pop();
            stack2.push(curr);
            if(curr.left != null){
                stack1.push(curr.left);
            }
            if(curr.right != null){
                stack1.push(curr.right);
            }
        }
        
        while(!stack2.isEmpty()){
            System.out.print(stack2.pop().value + " ");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
}
