package geekForGeek;

import geekForGeek.SumTree.Node;

public class Ancestors {

	static class Node{
		int data;
		Node left,right;
		Node (int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	
	static void printArr(int[] arr,int len){
		
		for(int i=len-1;i>=0;i--){
		System.out.print(" "+arr[i]);
		}
		
	}
	
	 void printAncestor(Node root,int res,int[] arr,int len){
		
		if(root==null){
			return;
		}else{
			if(root.data==res){
				printArr(arr,len);
			}
			arr[len]=root.data;
			len++;
			
			printAncestor(root.left,res,arr,len);
			printAncestor(root.right,res,arr,len);
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);
        
        int[] arr=new int[10];
        
        Ancestors ans=new Ancestors();
        ans.printAncestor(root,7,arr,0);

	}

}
