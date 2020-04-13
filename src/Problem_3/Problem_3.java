package Problem_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_3 {

    private static String serialize(Node root) {
        if (root == null) return "";
        Queue<Node> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n == null) {
                sb.append(" null ");
            } else {
                sb.append(n.val).append(" ");
                q.add(n.left);
                q.add(n.right);

            }

        }
        return sb.toString();
    }

    private static Node deserialize(String data) {
        String[] separated = data.split(" ");
        Node root = new Node(Integer.parseInt(separated[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        for (int i = 1; i < separated.length; ) {
            Node p = q.poll();
            String val = separated[i++];
            if (val.equals("null")) {
                p.left = null;
            } else {
                p.left = new Node(Integer.parseInt(val));
                q.add(p.left);
            }
            val = separated[i++];
            if (val.equals("null")) {
                p.right = null;
            } else {
                p.right = new Node(Integer.parseInt(val));
                q.add(p.right);
            }
        }
        return root;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        String ser = serialize(root);
        Node n = deserialize("1 2 3 4 null 5 6");
        System.out.println(serialize(n));
    }
}
