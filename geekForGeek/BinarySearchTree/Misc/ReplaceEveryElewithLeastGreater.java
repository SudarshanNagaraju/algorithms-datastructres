package geekForGeek.BinarySearchTree.Misc;

import geekForGeek.BinarySearchTree.Misc.FindClosestElementBST.Node;

import java.util.Arrays;

public class ReplaceEveryElewithLeastGreater {

	
	
	int key = -1;
	void findCLosest(Node root,int k ,int mindiff){
		if(root==null){
			return;
		}
		
		
		/*if(root.data==key){
			key=root.data;
			return;
		}*/
		
		if(mindiff>Math.abs((root.data-k))){
			mindiff=Math.abs(root.data-k);
			key=root.data;
		}
		
		if(k<root.data){
			findCLosest(root.left, k, mindiff);
		}else{
			findCLosest(root.right, k, mindiff);
		}
		
		
		
	}
	
	
	
	int findUtil(Node root,int k){
		
		
		findCLosest(root,k ,Integer.MAX_VALUE);
		return key;
	}
	
	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	Node insert(Node root,int k){
		if(root==null){
			return new Node(k);
		}
		
		if(k<root.data){
		root.left=insert(root.left, k);
		}else{
			root.right=insert(root.right, k);
		}
		return root;
	}
	
	public static void main(String[] args) {
		
		int[] arr={1, 8, 7, 6, 3, 22, 23, 92, 
		         4};
		
		
		ReplaceEveryElewithLeastGreater replace=new ReplaceEveryElewithLeastGreater();
		Node root=new Node(6);
		
		replace.insert(root,1);
		replace.insert(root,8);
		replace.insert(root,7);
		replace.insert(root,3);
		replace.insert(root,22);
		replace.insert(root,23);
		replace.insert(root,92);
		replace.insert(root,4);
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++){
			
				arr[i]=replace.findUtil(root,arr[i]);
			
		}
		
		
		
		
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		
		

	}

}
