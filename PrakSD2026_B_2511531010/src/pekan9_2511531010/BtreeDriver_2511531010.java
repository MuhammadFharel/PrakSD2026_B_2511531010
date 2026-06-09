package pekan9_2511531010;

public class BtreeDriver_2511531010 {
	public static void main (String[] args) {
		// Membuat pohon
		BTree_2511531010 tree_1010 = new BTree_2511531010 ();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_1010.countNodes_1010());
		// menambahkan simpul data 1
		Node_2511531010 root_1010 = new Node_2511531010 (1);
		// menjadikan simpul 1 sebagai root
		tree_1010.setRoot_1010(root_1010);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_1010.countNodes_1010());
		Node_2511531010 node2_1010 = new Node_2511531010 (2);
		Node_2511531010 node3_1010 = new Node_2511531010 (3);
		Node_2511531010 node4_1010 = new Node_2511531010 (4);
		Node_2511531010 node5_1010 = new Node_2511531010 (5);
		Node_2511531010 node6_1010 = new Node_2511531010 (6);
		Node_2511531010 node7_1010 = new Node_2511531010 (7);
		Node_2511531010 node8_1010 = new Node_2511531010 (8);
		Node_2511531010 node9_1010 = new Node_2511531010 (9);
		root_1010.setLeft_1010(node2_1010);
        node2_1010.setLeft_1010(node4_1010);
        node2_1010.setRight_1010(node5_1010);
        node4_1010.setRight_1010(node8_1010);
        root_1010.setRight_1010(node3_1010);
        node3_1010.setLeft_1010(node6_1010);
        node3_1010.setRight_1010(node7_1010);
        node6_1010.setLeft_1010(node9_1010);
        
        // Set root
        tree_1010.setCurrent_1010(tree_1010.getRoot_1010());
        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree_1010.getCurrent_1010().getData_1010());
        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree_1010.countNodes_1010());
        System.out.println("InOrder: ");
        tree_1010.printInorder_1010();
        System.out.println("\nPreorder: ");
        tree_1010.printPreOrder_1010();
        System.out.println("\nPostorder : ");
        tree_1010.printPostOrder_1010();
        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
        tree_1010.print_1010();
	}
}
