package geekForGeek.BinarySearchTree.Misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class PrintCommonNodesin2BST {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	Node insert(Node root,int key){
		if(root==null){
			root=new Node(key);
			return root;
		}
		
		if(key<root.data){
			root.left=insert(root.left, key);
		}else{
			root.right=insert(root.right, key);
		}
		
		return root;
		
	}
	
	
	void inOrder(Node root,Set<Integer> set){
		if(root==null){
			return;
		}
		
		inOrder(root.left,set);
		//System.out.print(" "+root.data);
		set.add(root.data);
		inOrder(root.right,set);
	}
	
	
	void printCommon(Node root,Set<Integer> hashSet){
		if(root==null){
			return;
		}
		
		printCommon(root.left, hashSet);
		if(hashSet.contains(root.data)){
			System.out.print(" "+root.data);
		}
        printCommon(root.right, hashSet);		
		
	}
	
	public static void main(String[] args) {
		
		
		PrintCommonNodesin2BST common=new PrintCommonNodesin2BST();
		
		Node root=new Node(5);
		common.insert(root,1);
		common.insert(root,10);
		common.insert(root,0);
		common.insert(root,4);
		common.insert(root,7);
		common.insert(root,9);

		//System.out.println("INORDER ROOT1");
		
		Set<Integer> hashSet=new HashSet<Integer>();
		
		common.inOrder(root,hashSet);
		
		System.out.println();
		//System.out.println("INORDER ROOT2");
		
		Node root1=new Node(10);
		common.insert(root1,7);
		common.insert(root1,20);
		common.insert(root1,4);
		common.insert(root1,9);
		
		common.printCommon(root1,hashSet);
		
		//common.inOrder(root1);
		
		
		
		
		
		

	}

}
