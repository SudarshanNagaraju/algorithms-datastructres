package geekForGeek;

import java.util.ArrayList;

import geekForGeek.CountLeafNodes.Node;

public class RoottoLeafPath {

	static class Node{
		int data;
		Node left ,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	
	static void printList(int[] list,int len){
		
		for(int i=0;i<len;i++){
			System.out.print(list[i]+" ");
		}
		
	}
	
	
	void leafPath(Node root,int[] list,int len){
		
		if(root==null){
			return;
		}
		list[len]=root.data;
		len++;
		
		if(root.left==null && root.right==null){
			printList(list,len);
			System.out.println("");
			
		}else{
		
		leafPath(root.left,list,len);
		leafPath(root.right,list,len);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		root.right.left=new Node(1);

		
		int list[] = new int[1000]; 
		
		RoottoLeafPath path=new RoottoLeafPath();
		
		path.leafPath(root,list,0);
		
		
		
	}

}
