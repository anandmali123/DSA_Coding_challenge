class GfG {
    Node flatten(Node root) {
        // Your code here
        Node temp = root;
        Node b = temp;
        ArrayList<Integer> ans = new ArrayList<>();
        while (temp != null) {
            while (b != null) {
                ans.add(b.data);
                b = b.bottom;
            }
            temp = temp.next;
            b = temp;
        }
        Collections.sort(ans);
        Node node = new Node(ans.get(0));
        Node head = node;
        for (int i = 1; i < ans.size(); i++) {
            Node t = new Node(ans.get(i));
            node.bottom = t;
            node = node.bottom;
        }
        return head;
    }

}