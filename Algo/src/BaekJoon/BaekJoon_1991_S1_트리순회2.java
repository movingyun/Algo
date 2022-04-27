package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    char data;
    Node left;
    Node right;
    Node(char data){
        this.data = data;
    }
}

class Tree{
    public Node root;
    public void createNode(char data, char left, char right){
        if(root == null){
            root = new Node(data);
            root.left = left != '.' ? new Node(left) : null;
            root.right = right != '.' ? new Node(right) : null;
        }else{
            searchNode(root, data, left, right);
        }
    }
    public void searchNode(Node node, char data, char left, char right){
        if(node == null){
            return;
        }
        if(node.data == data){
            node.left = left != '.' ? new Node(left) : null;
            node.right = right != '.' ? new Node(right) : null;
        }else{
            searchNode(node.left, data, left, right);
            searchNode(node.right, data, left, right);
        }
    }
    //Preorder : root -> left -> right
    public void preOrder(Node node){
        if(node != null) {
            System.out.print(node.data);
            if(node.left != null) {preOrder(node.left);}
            if(node.right != null) {preOrder(node.right);}
        }
    }
    //Inorder : left -> root -> right
    public void inOrder(Node node){
        if(node != null) {
            if(node.left != null) {inOrder(node.left);}
            System.out.print(node.data);
            if(node.right != null) {inOrder(node.right);}
        }

    }
    //Postorder : left -> right -> root
    public void postOrder(Node node){
        if(node != null) {
            if(node.left != null) {postOrder(node.left);}
            if(node.right != null) {postOrder(node.right);}
            System.out.print(node.data);
        }
    }
}

public class BaekJoon_1991_S1_트리순회2 {

    static public void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        Tree tree = new Tree();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(input.readLine(), " ");
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            tree.createNode(root, left, right);
        }
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();

        input.close();
    }
}