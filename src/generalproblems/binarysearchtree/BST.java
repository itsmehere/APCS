package generalproblems.binarysearchtree;

public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left;
	private BST<T> right;  

	public BST(T datum) {
		this.datum = datum;
		left = null;
		right = null;
	}

	public T getDatum() {
		return datum;  // returns the datum of a node
	}
	public BST<T> getLeft() {
		return left;   // returns the left subtree
	}
	public BST<T> getRight() {
		return right;  // returns the right subtree
	}
	
	public void setLeft(BST<T> tree) {
		left = tree;
	}

	public void setRight(BST<T> tree) {
		right = tree;
	}
	
	public void insert(T datum) {
		if (datum.compareTo(this.datum) > 0) {
			if (this.right == null) {
				setRight(new BST<T>(datum)); 
			} else {
				right.insert(datum);
			}
		} else if (datum.compareTo(this.datum) < 0) {
			if (this.left == null) {
				setLeft(new BST<T>(datum));
			} else {
				left.insert(datum);
			}
		}
	}
	
	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = left.toString() + s;
		if (right != null)
			s = s + right.toString();
		return s;
	}
/*
 *  Version 1:
 *  
	public int depth() {
		if (getLeft() == null && getRight() == null) {
			return 1;
		} else if (getLeft() == null) {
			return 1 + getRight().depth();
		} else if (getRight() == null) {
			return 1 + getLeft().depth();
		} else {
			return 1 + Math.max(getLeft().depth(), getRight().depth());
		}
	}
*/
	
	public int depth() {
		int leftDepth = 0;
        int rightDepth = 0;
        if (getLeft() != null) {
            leftDepth = getLeft().depth();
        }
        if (getRight() != null) {
            rightDepth = getRight().depth();
        }
        return (1 + Math.max(leftDepth, rightDepth));
	}
}
