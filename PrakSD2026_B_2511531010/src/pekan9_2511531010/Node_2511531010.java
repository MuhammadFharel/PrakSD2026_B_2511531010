package pekan9_2511531010;

public class Node_2511531010 {
    int data_1010;
    Node_2511531010 left_1010;
    Node_2511531010 right_1010;
    public Node_2511531010(int data_1010) {
        this.data_1010 = data_1010;
        left_1010 = null;
        right_1010 = null;
    }
    public void setLeft_1010(Node_2511531010 node_1010) {
        if (left_1010 == null)
            left_1010 = node_1010;
    }
    public void setRight_1010(Node_2511531010 node_1010) {
        if (right_1010 == null)
            right_1010 = node_1010;
    }
    public Node_2511531010 getLeft_1010() {
        return left_1010;
    }
    public Node_2511531010 getRight_1010() {
        return right_1010;
    }
    public int getData_1010() {
        return data_1010;
    }
    public void setData_1010(int data_1010) {
        this.data_1010 = data_1010;
    }
    
    void printPreorder_1010(Node_2511531010 node_1010) {
        if (node_1010 == null)
            return;
        System.out.print(node_1010.data_1010 + " ");
        printPreorder_1010(node_1010.left_1010);
        printPreorder_1010(node_1010.right_1010);
    }
    void printPostorder_1010(Node_2511531010 node_1010) {
        if (node_1010 == null)
            return;
        printPostorder_1010(node_1010.left_1010);
        printPostorder_1010(node_1010.right_1010);
        System.out.print(node_1010.data_1010 + " ");
    }
    void printInorder_1010(Node_2511531010 node_1010) {
        if (node_1010 == null)
            return;
        printInorder_1010(node_1010.left_1010);
        System.out.print(node_1010.data_1010 + " ");
        printInorder_1010(node_1010.right_1010);
    }
    public String print_1010() {
        return this.print_1010("", true, "");
    }
    public String print_1010(String prefix_1010, boolean isTail_1010, String sb_1010) {
        if (right_1010 != null) {
        	right_1010.print_1010(prefix_1010 + (isTail_1010 ? "|   " : "    "), false, sb_1010);
        }
        System.out.println(prefix_1010 + (isTail_1010 ? "\\-- " : "/-- ")+ data_1010);
        if (left_1010 != null) {
            left_1010.print_1010(prefix_1010 + (isTail_1010 ? "    " : "|   "), true, sb_1010);
        }
        return sb_1010;
    }
}