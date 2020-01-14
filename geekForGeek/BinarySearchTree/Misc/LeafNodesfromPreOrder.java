package geekForGeek.BinarySearchTree.Misc;

import java.util.Stack;

public class LeafNodesfromPreOrder {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static int[] sort(int[] inOrder){
		int temp=0;
		for(int i=0;i<inOrder.length;i++){
			for(int j=0;j<inOrder.length;j++){
				if(inOrder[i]<inOrder[j]){
			    temp=inOrder[i];
				inOrder[i]=inOrder[j];
				inOrder[j]=temp;
				}
			}
		}
		
		return inOrder;
		
	}
	void leafNodeUtil(int[] preOrder){
		
		int[] inorder=new int[preOrder.length];
		
		for(int i=0;i<preOrder.length;i++){
			inorder[i]=preOrder[i];
		}
		
		inorder=sort(inorder);
		System.out.println("INORDER");
		for(int i=0;i<preOrder.length;i++){
			System.out.print(" "+inorder[i]);
		}
		System.out.println();
		
		System.out.println("Leaf Nodes");
		findLeaf(inorder, preOrder, 0, preOrder.length-1, 0, preOrder.length);
		/*int temp=0;
		for(int i=0;i<inorder.length;i++){
			for(int j=0;j<preOrder.length;j++){
				if(i==j && inorder[i]==preOrder[j]){
			    System.out.print(" "+inorder[i]);
				}
			}
		}*/
		
		
	}
	
	
	void findLeaf(int[] inorder,int[] preorder,int start,int end,int index,int n){
		if(start>end || start<0 || end>=n){
			return;
		}
	}
	
	//using stack
	
	void stackUtil(int[] preorder){
		
		Stack<Integer> stac=new Stack<Integer>();
		for(int i=0,j=1;j<preorder.length;i++,j++){
			boolean found =false;
			
			if(preorder[i]>preorder[j]){
				stac.add(preorder[i]);
				//System.out.print(" "+stac.peek());
		}else{
				while(!stac.isEmpty()){
					if(preorder[j]>stac.peek()){
						found=true;
						stac.pop();
					}else{
						break;
					}
				}
			}
			
			if(found){
				System.out.print(" "+preorder[i]);
			}
			
			
		}
		
		System.out.print(" "+preorder[preorder.length-1]);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] preOrder={890, 325, 290, 530, 965};
		LeafNodesfromPreOrder leafNode=new LeafNodesfromPreOrder();
		
		leafNode.stackUtil(preOrder);
		//leafNode.leafNodeUtil(preOrder);
		
		

	}

}
