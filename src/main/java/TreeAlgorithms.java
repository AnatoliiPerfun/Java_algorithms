public class TreeAlgorithms {

    public static void main(String[] args) {
        Node rootNode = new Node();
        rootNode.data = 5;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(2);
        tree.insert(6);
        tree.insert(4);

        System.out.println(tree.contains(1));
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(3));
        System.out.println(tree.contains(4));
        System.out.println(tree.contains(5));
    }
}
