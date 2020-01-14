package geekForGeek.BinarySearchTree;

import java.util.Stack;

public class BSTfromInorderCase2 {

	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	Node createTree(int[] pre){
			
			
		Stack<Node> sta=new Stack<Node>();	
		
		Node root=new Node(pre[0]);
		
		sta.push(root);
		
		for(int i=1;i<pre.length;i++){
			Node temp=null;
			
			System.out.println("peek"+sta.peek().data);
		while(sta.isEmpty()==false && pre[i]>sta.peek().data){
			temp=sta.pop();
		}
		
		if(temp!=null){
			System.out.println("pop"+temp.data);
			temp.right=new Node(pre[i]);
			sta.push(temp.right);
		
		}else{
			temp=sta.peek();
			temp.left=new Node(pre[i]);
			sta.push(temp.left);
			
			
		}
			
		}
		return root;
	}
	
	
	void preOrder(Node root){
		if(root!=null){
			System.out.print(" "+root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	
	
	public static void main(String args[]){
		
		int pre[]=new int[]{10,5,1,7,30,40};
		
		BSTfromInorderCase2 ca=new BSTfromInorderCase2();
		Node root=ca.createTree(pre);
		
		ca.preOrder(root);
		
		
		
		
	}
	
}
