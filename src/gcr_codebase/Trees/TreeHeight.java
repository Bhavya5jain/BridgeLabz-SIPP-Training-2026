package gcr_codebase.Trees;

public class TreeHeight {

    public static int height(Node node) {

        if (node == null) {
            return -1;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }


    public static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }

    public static void main(String[] args) {


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        int threshold = 2;

        int h = height(root);

        System.out.println("Tree Height: " + h);

        if (isTooDeep(root, threshold)) {
            System.out.println("Tree exceeds the threshold.");
        } else {
            System.out.println("Tree is within the threshold.");
        }
    }
}
