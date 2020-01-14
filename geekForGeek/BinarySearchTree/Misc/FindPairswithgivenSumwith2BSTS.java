package geekForGeek.BinarySearchTree.Misc;

import java.awt.List;
import java.util.Set;
import java.util.Vector;

public class FindPairswithgivenSumwith2BSTS {

	
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	Node inset(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		
		if(data<root.data){
			root.left=inset(root.left, data);
		}else if(data>root.data){
			root.right=inset(root.right, data);
		}
		
		return root;
		
	}
	
	
	void inOrder(Node root,Vector<Integer> arr1){
		if(root==null){
			return;
		}
		
		inOrder(root.left,arr1);
		arr1.add(root.data);
		inOrder(root.right,arr1);
	}
	
	void finPairs(Vector<Integer> arr1,Vector<Integer> arr2,int sum){
		
		
		int left=0;
		int right=arr2.size()-1;
		
		while(left<arr1.size() && right>=0){
			if(arr1.get(left)+arr2.get(right)==sum){
				System.out.print(" "+arr1.get(left)+" "+arr2.get(right));
				left++;
				right--;
			}else if(arr1.get(left)+arr2.get(right)<sum){
				left++;
			}else{
				right--;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		FindPairswithgivenSumwith2BSTS pairs=new FindPairswithgivenSumwith2BSTS();
		Node root=new Node(8);
		pairs.inset(root, 3);
		pairs.inset(root, 10);
		pairs.inset(root, 1);
		pairs.inset(root, 6);
		pairs.inset(root, 14);
		pairs.inset(root, 5);
		pairs.inset(root, 7);
		pairs.inset(root, 13);
		Node root1=new Node(5);
		pairs.inset(root1, 2);
		pairs.inset(root1, 18);
		pairs.inset(root1, 1);
		pairs.inset(root1, 3);
		pairs.inset(root1, 4);

		Vector<Integer> arr1=new Vector<Integer>();
		Vector<Integer> arr2=new Vector<Integer>();
		
		
		pairs.inOrder(root, arr1);
		pairs.inOrder(root1, arr2);
		
		int sum=10;
		pairs.finPairs(arr1,arr2,sum);
		
		
		
		
		

		
	}

}
