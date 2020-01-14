package geekForGeek.BinarySearchTree;

public class ArraytoBST {

	
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	int getNode(int[] arr,int start,int end){
		
		int middle=(start+end)/2;
		
		return middle;
		
		
	}
	
	
	Node constructBST(int[] arr,int start,int end){
		
		if(start>end){
			return null;
		}
		
		
		int middle=(start+end)/2;
		Node root=new Node(arr[middle]);
		
		
		root.left=constructBST(arr, start, middle-1);
		root.right=constructBST(arr, middle+1, end);
		
		return root;
		
		
	}
	
	void preOrder(Node root){
		if(root==null){
			return;
		}
		System.out.print(" "+root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	void construct(int[] arr){
		
		System.out.println("Length:"+arr.length);
	     Node root=constructBST(arr,0,arr.length-1);
		
		preOrder(root);
		
	}
	
	
	public static void main(String args[]){
		
		ArraytoBST obj=new ArraytoBST();
		
		int arr[]=new int[]{1, 2, 3, 4, 5, 6, 7};
		
		obj.construct(arr);
		
	}
	
	
	
}
