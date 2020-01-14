package geekForGeek.BinarySearchTree;

import com.sun.org.apache.bcel.internal.generic.StoreInstruction;

public class BTtoBST {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int cnt=0;
	void count(Node root){
		
		if(root==null){
			return ;
		}
		
		cnt++;
		count(root.left);
		count(root.right);
		
		return;
		
	}
	
	int index=0;
	void storeInorder(Node root,int[] arr){
		
		if(root==null){
			return;
		}
		
		storeInorder(root.left,arr);
		arr[index]=root.data;
		index++;
		storeInorder(root.right,arr);
		
		return;
		
	}
	
	void quickSort(int[] arr){
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
	}
	
	void binaryTreetoBST(Node root){
		
		if(root==null){
			return;
		}
		
		count(root);
		
		System.out.println("Count"+cnt);
		
		int arr[]=new int[cnt];
		
		storeInorder(root,arr);
		
		System.out.println("Inorder:");
		
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		
		
		quickSort(arr);
		System.out.println();
		System.out.println("after sort:");
		System.out.println();
		
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("Before");
		printInorder(root);
		
		System.out.println("arr before BST");
		
		
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		
		arrtoBST(root,arr);
		
		System.out.println("Final Inorder");
		printInorder(root);
		
	}
	
	int ind=0;
	void arrtoBST(Node root,int[] arr){
		if(root==null){
			return;
		}
		
		arrtoBST(root.left, arr);
		root.data=arr[ind];
		ind++;
		/*System.out.print(" "+root.data);
		System.out.print("changed");
		System.out.print(" "+root.data);*/
		arrtoBST(root.right, arr);
		
		
	}
	
	
	static void printInorder(Node root){
		if(root==null){
			return;
		}
			printInorder(root.left);
			System.out.print(" "+root.data);
			printInorder(root.right);
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(30);
		root.left.left=new Node(20);
		root.right=new Node(15);
		root.right.right=new Node(5);
		
		BTtoBST tree=new BTtoBST();
		
		tree.binaryTreetoBST(root);
		
		
		
		
		

	}

}
