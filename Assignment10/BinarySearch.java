package Assignment10;

public class BinarySearch {
	static Search root;

	Search sortedArrayToBST(int arr[], int start, int end) {

		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		Search node = new Search(arr[mid]);

		node.left = sortedArrayToBST(arr, start, mid - 1);

		node.right = sortedArrayToBST(arr, mid + 1, end);

		return node;
	}

	void preOrder(Search node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void main(String[] args) {
		BinarySearch tree = new BinarySearch();
		int arr[] = new int[] { 1,2, 3, 4, 5, 6, 7 };
		System.out.println("Inorder traversal of constructed BST");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		int n = arr.length;
		root = tree.sortedArrayToBST(arr, 0, n - 1);
		System.out.println();
		System.out.println("Preorder traversal of constructed BST");
		tree.preOrder(root);
	}
}
