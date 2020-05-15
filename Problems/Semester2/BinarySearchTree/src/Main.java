
public class Main {

	public static void main(String[] args) {
		BST<Integer> bsti = new BST<Integer>(15);
		bsti.insert(10);
		bsti.insert(12);
		// If printed in order, the below line should produce 7, 12, 19
		System.out.println("BST: " + bsti);
		System.out.println("Depth of BST: " + bsti.depth());
	}

}
