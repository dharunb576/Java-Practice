import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

class Main{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
        }
    }

    static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" | ");
        inorder(root.right);
    }

    static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" | ");
        preOrder(root.left);
        preOrder(root.right);
    }


    static void postOrder(Node root){
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" | ");
    }


    static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> qu = new LinkedList<>();

        qu.add(root);
        while(!qu.isEmpty()){
            Node res = qu.remove();
            System.out.print(res.data+" | ");
            if(res.left != null){
                qu.add(res.left);
            }
            if(res.right != null){
                qu.add(res.right);
            }
        }
        
    }

    static Node insert(Node root, int d){
            if(root == null){
                return new Node(d);
            }
            if(d < root.data){
                root.left = insert(root.left,d);
            }
            else if(d > root.data){
                root.right = insert(root.right, d);
            }
            return root;
    }

    static boolean serach(Node root, int k){
        if(root == null) return false;
        if(root.data == k) return true;
        if(k < root.data){
            return serach(root.left, k);
        }
        else if(k > root.data){
            return serach(root.right, k);
        }
        return serach(root, k);
    }

    static int findMiniVal(Node root){
        if(root == null){
            System.out.println("Tree is Empty");
        }
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    static void findMaxVal(Node root){
        if(root == null){
            System.out.println("Tree is empty");
        }
        while(root.right != null){
            root = root.right;
        }
        System.out.println("Maxi Val : "+root.data);
    }

    static int height(Node root){
        if(root == null) return 0;

        return 1+Math.max((height(root.left)),height(root.right)); 
    }

    static int count(Node root){
        if(root == null) return 0;
        return 1+count(root.left)+count(root.right);
    }

    static int sum(Node root){
        if(root == null) return 0;
        
        return  root.data+sum(root.left)+sum(root.right);
    }

    static Node delete(Node root, int k){
        if(root == null) return null;
        if(k < root.data){
            root.left = delete(root.left, k);
        }
        else if(k > root.data){
            root.right = delete(root.right, k);
        }
        else{
            if(root.left == null && root.right ==null){
                return null;
            
            }
                if(root.left == null) return root.right;
                if(root.right == null) return root.left;

                int min = findMiniVal(root.right);
                root.data = min;
                root.right = delete(root.right, min);
        }
        return root;
    }

    public static void main(String[] args) {
        
        // Node root = new Node(10);
        // root.left = new Node(20);
        // root.right = new Node(30);
        // root.left.left = new Node(40);
        // root.left.right = new Node(50);
        // root.right.left = new Node(60);
        // root.right.right = new Node(70);


        // System.out.println();
        // System.out.println();
        // postOrder(root);
        
        // levelOrder(root);
        // System.out.println();
        
        Node root = null;
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 8);
        root = insert(root, 2);
        root = insert(root, 4);
        root = insert(root, 6);
        root = insert(root, 9);
        
        // System.out.println();
        // preOrder(root);
        // System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Deleting element : ");
        int a = sc.nextInt();
        
        // if(serach(root, a)){
            //     System.out.println(a+" is Present in tree");
            // }
            // else{
                //     System.out.println(a+" is not present");
                // }
                
                // findMiniVal(root);
                // findMaxVal(root);

                // System.out.println("Height of the Tree : "+height(root));
                
                // System.out.println("Count Of the Tree : "+count(root));
                
                // System.out.println("Sum Of the tree : "+sum(root));
                
                delete(root, a);
                inorder(root);
                System.out.println();
                sc.close();


        
    }
}