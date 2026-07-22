package gcr_codebase.BST;

public class BSTSearch {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static boolean search(Node root, int target) {
        Node current = root;

        while (current != null) {

            if (target == current.value) {
                return true;
            }

            if (target < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void main(String[] args) {

        Node root = null;

        int[] usernames = {50, 30, 70, 20, 40, 60, 80};

        for (int username : usernames) {
            root = insert(root, username);
        }

        int target1 = 60;
        int target2 = 90;

        System.out.println(
            target1 + " exists in BST: " + search(root, target1)
        );

        System.out.println(
            target2 + " exists in BST: " + search(root, target2)
        );
    }
}
