package geekForGeek;

import geekForGeek.ChildrenSumProp.Node;


public class CountLeafNodes {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int countLeaf(Node root){
		
		if(root==null){
			return 0;
		}else{
			
			
			
			int left=countLeaf(root.left);
			int right=countLeaf(root.right);
			if(left==0 && right==0){
				return 1;
			}else{
			return left+right;
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {

		
		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		//root.right.left=new Node(1);
		
		CountLeafNodes leaf=new CountLeafNodes();
		
		int totalLeaf=leaf.countLeaf(root);
		System.out.println("Leaf:"+totalLeaf);
		
	}

}
