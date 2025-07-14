package LevelOrder;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    class Node {
        int data;
        Node left, right;
        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node root;
    Queue<Node> queue = new LinkedList<>();

    public void insert(int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;
            queue.add(root);
            return;
        }

        while (!queue.isEmpty()) {
            Node temp = queue.peek();

            if (temp.left == null) {
                temp.left = newNode;
                queue.add(newNode);
                return;
            } else if (temp.right == null) {
                temp.right = newNode;
                queue.add(newNode);
                queue.poll(); // both children filled, remove parent
                return;
            } else {
                queue.poll(); // skip fully filled nodes
            }
        }
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.data + " ");
            if (n.left != null) q.add(n.left);
            if (n.right != null) q.add(n.right);
        }
        System.out.println();
    }
}
