package pekan9_2511531010;

public class BTree_2511531010 {
	private Node_2511531010 root_1010;
    private Node_2511531010 currentNode_1010;

    public BTree_2511531010() {
        root_1010 = null;
    }
    public boolean search_1010(int data_1010) {
        return search_1010(root_1010, data_1010);
    }
    private boolean search_1010(Node_2511531010 node_1010, int data_1010) {
        if (node_1010.getData_1010() == data_1010)
            return true;
        if (node_1010.getLeft_1010() != null)
            if (search_1010(node_1010.getLeft_1010(), data_1010))
                return true;
        if (node_1010.getRight_1010() != null)
            if (search_1010(node_1010.getRight_1010(), data_1010))
                return true;
        return false;
    }
    public void printInorder_1010() {
        root_1010.printInorder_1010(root_1010);
    }
    public void printPreOrder_1010() {
        root_1010.printPreorder_1010(root_1010);
    }
    public void printPostOrder_1010() {
        root_1010.printPostorder_1010(root_1010);
    }
    public Node_2511531010 getRoot_1010() {
        return root_1010;
    }
    public boolean isEmpty_1010() {
        return root_1010 == null;
    }
    
    public int countNodes_1010() {
        return countNodes_1010(root_1010);
    }
    
    private int countNodes_1010(Node_2511531010 node_1010) {
        int count_1010 = 1;
        if (node_1010 == null) {
            return 0;
        } else {
            count_1010 += countNodes_1010(node_1010.getLeft_1010());
            count_1010 += countNodes_1010(node_1010.getRight_1010());
            return count_1010;
        }
    }

    public void print_1010() {
        root_1010.print_1010();
    }

    public Node_2511531010 getCurrent_1010() {
        return currentNode_1010;
    }

    public void setCurrent_1010(Node_2511531010 node_1010) {
        this.currentNode_1010 = node_1010;
    }

    public void setRoot_1010(Node_2511531010 root_1010) {
        this.root_1010 = root_1010;
    }
}