package geekForGeek.BinarySearchTree.Misc;

import java.util.ArrayList;
import java.util.Iterator;

import sun.org.mozilla.javascript.internal.ast.ArrayLiteral;

public class MergeTwoTrees {
	

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int arr[]=new int[100];
	void getTrees(Node root,ArrayList<Integer> arr1){
		if(root==null){
			return;
		}
		
		getTrees(root.left,arr1);
		
		arr1.add(root.data);
			
		
		getTrees(root.right,arr1);
		
		
		
	}
	
	ArrayList<Integer> mergeArraysinAscending(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
		
		
		if(arr1.size()==0 || arr2.size()==0){
			return arr1.size()==0? arr2:arr1;
		}
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		
		
		
		int i=0;
		int j=0;
		/*for(i=0;i<arr1.size();i++){
			
			for(j=0;j<arr2.size();j++){
				if(arr1.get(i)<arr2.get(j)){
					arr.add(arr1.get(i));
				}else{
					arr.add(arr2.get(j));
				}
			}
		}*/
		
		while(i<arr1.size() && j<arr2.size()){
			if(arr1.get(i)<arr2.get(j)){
				arr.add(arr1.get(i));
				i++;
			}else{
				arr.add(arr2.get(j));
				j++;
				
			}
		}
		
		while(i<arr1.size()){
			arr.add(arr1.get(i));
			i++;
		}
		
		while(j<arr2.size()){
			arr.add(arr2.get(j));
			j++;
		}
		
		
		
		
		return arr;
		
	}
	
	Node createBst(ArrayList<Integer> arr,int start,int end){
		
		if(start>end){
			return null;
		}
		int mid=(start+end)/2;
		
		Node root=new Node(arr.get(mid));
		
		root.left=createBst(arr, start, mid-1);
		
		root.right=createBst(arr, mid+1, end);
		
		return root;
	}
	
	
	void inorder(Node root){
		if(root==null){
			return;
		}
		
		inorder(root.left);
		System.out.print(" "+root.data);
		inorder(root.right);
		
	}
	
	void mergeTreeUtil(Node root1,Node root2){
		
		
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		
		getTrees(root1,arr1);
		getTrees(root2,arr2);
		
		MergeTwoTrees  obj=new MergeTwoTrees();
		
		ArrayList<Integer> arr=obj.mergeArraysinAscending(arr1,arr2);
		System.out.println("Merged Array");
		System.out.println();
		
		for(int k=0;k<arr.size();k++){
			System.out.print(" "+arr.get(k));
		}
		
		Node root=obj.createBst(arr,0,arr.size()-1);
		
		System.out.println();
		
		
		System.out.println("Inorder::");
		System.out.println();
		
		obj.inorder(root);
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Node root=new Node(100);
		root.left=new Node(50);
		root.right=new Node(300);
		root.left.left=new Node(20);
		root.left.right=new Node(70);
		
		
		Node root1=new Node(80);
		root1.left=new Node(40);
		root1.right=new Node(120); 
		
		MergeTwoTrees merge=new MergeTwoTrees();
		
		merge.mergeTreeUtil(root,root1);
		
		
		
		
		

	}

}
