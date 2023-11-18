package binarySearch;

/**
 * Project : algorithm3
 * Created by OKESTRO
 * Developer : th.eom
 * Date Time : 2023/11/18 9:20 PM
 * Summary :
 **/
public class Tree {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void makeTree(int[] a) {
        root = makeTreeR(a, 0, a.length - 1);
    }

    public Node makeTreeR(int[] a, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(a[mid]);
        node.left = makeTreeR(a, start, mid - 1);
        node.right = makeTreeR(a, mid + 1, end);

        return node;
    }

    public void searchBTree(Node n, int find) {
        if (find < n.data) {
            System.out.println(" Data is samller than " + n.data);
            searchBTree(n.left, find);
        } else if (find > n.data) {
            System.out.println(" Data is bigger than " + n.data);
            searchBTree(n.right, find);
        } else {
            System.out.println("data Found");
        }
    }
}


