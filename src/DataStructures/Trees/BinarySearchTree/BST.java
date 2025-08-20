package DataStructures.Trees.BinarySearchTree;

class Node{
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    Node root;
    BST(){
        root = null;
    }

    // helper function for the main public insert function
    private Node insertRec(Node root, int key){
        if(root==null){
            return new Node(key);
        }
        if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if (key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    private boolean searchRec(Node root, int key){
        if(root==null){
            return false;
        }
        if(key == root.key){
            System.out.print("Key Found");
            return true;
        }else if(key < root.key){
            return searchRec(root.left, key);
        }else{
            return searchRec(root.right, key);
        }
    }

    public boolean search(int key){
        return searchRec(root, key);
    }

    private Node findSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

    private Node removeRec(Node root, int key){
        if(root==null){
            return root;
        }
        if(key < root.key){
            root.left = removeRec(root.left, key);
        }else if(key > root.key){
            root.right = removeRec(root.right, key);
        }else{
            // u found the node to be deleted

            // Case1 : Node with zero or one child
            if(root.left==null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case 2 : Node with 2 children
            Node successor = findSuccessor(root.right);
            root.key = successor.key;
            root.right = removeRec(root.right, successor.key);
        }
        return root;
    }

    void removeKey(int key){
        root = removeRec(root, key);
    }

    void inDFS(Node root){
        if(root==null){
            return ;
        }
        inDFS(root.left);
        System.out.print(root.key + " ");
        inDFS(root.right);
    }
}

class DriverCode{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(100);
        bst.insert(50);
        bst.insert(170);
        bst.insert(40);
        bst.insert(70);
        bst.insert(55);
        bst.insert(150);
        bst.insert(200);
        bst.insert(120);
        bst.insert(160);
        bst.inDFS(bst.root);
    }
}