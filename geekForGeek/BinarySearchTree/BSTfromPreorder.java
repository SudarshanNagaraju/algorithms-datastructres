package geekForGeek.BinarySearchTree;

import geekForGeek.Preorder;

public class BSTfromPreorder {

	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int index=0;
	
	Node createTree(int[] pre,int strt,int end){
		
		if(index>end || end<strt){
			return null;
		}
		
		Node root=new Node(pre[index]);
		
		index++;
		
		if(strt==end){
			return root;
		}
		
		int i=0;
		for(i=0;i<pre.length;i++){
			if(pre[i]>root.data){
				break;
			}
		}
		
		root.left=createTree(pre, strt, i-1);
		root.right=createTree(pre, i+1, end);
		
		return root;
		
		
		
		
	}
	
	
	void preOrder(Node root){
		if(root!=null){
			System.out.print(" "+root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	
	public static void main(String[] args) {
		BSTfromPreorder inorder=new BSTfromPreorder();
		int pre[]=new int[]{2, 1, 4, 3};
		Node root=inorder.createTree(pre, 0, pre.length);
		
		inorder.preOrder(root);
		

	}

}
