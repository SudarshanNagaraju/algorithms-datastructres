package geekForGeek.BinarySearchTree;

public class KthLargestinBST {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	static int count=0; 
	static void kthLargest(Node root,int k){
		if(root==null){
			return;
		}
		
		kthLargest(root.right, k);
		
		count++;
		
		if(count==k){
			System.out.println(k+"th Largest is:"+root.data);
		}
		
		kthLargest(root.left, k);
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(50);
		root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(20);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        root.right.right=new Node(80);
        int k=5;
        
        kthLargest(root,k);
		
		
		

	}

}
