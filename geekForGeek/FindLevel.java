package geekForGeek;

import geekForGeek.Ancestors.Node;

public class FindLevel {

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
	
void printAncestor(Node root,int level,int len){
		
		if(root==null){
			return;
		}else{
			++len;
			if(len==level){
				System.out.print(" "+root.data);
			}
			
			printAncestor(root.left,level,len);
			printAncestor(root.right,level,len);
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);
        
        
        FindLevel ans=new FindLevel();
        ans.printAncestor(root,1,0);

	}

}
