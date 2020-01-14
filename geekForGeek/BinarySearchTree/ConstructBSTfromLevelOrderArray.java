package geekForGeek.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;



public class ConstructBSTfromLevelOrderArray {

	static class Node{
		int min,max;
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	Node constructBST(int[] arr){
		
		if(arr.length<=0){
			return null;
		}
		
		Queue<Node> q=new LinkedList<Node>();
		
		Node root=new Node(arr[0]);
		q.add(root);
		int i=1;
		
		root.min=Integer.MIN_VALUE;
		root.max=Integer.MAX_VALUE;
		
		while(i<arr.length){
			
			Node temp=q.poll();
			//System.out.print(" temp:["+temp.data+"]arr:["+arr[i]+"]");
			
			if(arr[i]<temp.data && arr[i]>root.min){
			
			temp.left=new Node(arr[i++]);
			root.min=temp.min;
			root.max=temp.data;
			q.add(temp.left);
			} 
			
			if(arr[i]>temp.data && arr[i]<root.max){
				temp.right=new Node(arr[i++]);
				root.min=temp.data;
				root.max=temp.max;
				q.add(temp.right);
			}
			
			
		}
		
		return root;
		
		
		
		
	}
	
	
	void inOrder(Node root){
		if(root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
		
	}
	
	public static void main(String[] args) {

		
		
		int arr[]=new int[]{7, 4, 12, 3, 6, 8, 1, 5, 10};
		ConstructBSTfromLevelOrderArray lev=new ConstructBSTfromLevelOrderArray();
		Node root=lev.constructBST(arr);
		
		lev.inOrder(root);
		
		
		
		
	}

}
