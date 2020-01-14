package geekForGeek.BinarySearchTree;

public class SumofAllGreaterKeys {

	
	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	void countNodes(Node root){
		
		if(root==null){
			return;
		}
		count++;
		countNodes(root.left);
		countNodes(root.right);
		
		return;
		
	}
	int index=0;
	void storeRevInorder(Node root,int[] arr){
		
		if(root==null){
			return;
		}
		
		storeRevInorder(root.right,arr);
		arr[index]=root.data;
		index++;
		storeRevInorder(root.left, arr);
		
		
	}
	
	int sumIndex=0;
	void converttoBT(Node root,int[] arr){
		if(root==null){
			return;
		}
		
		converttoBT(root.left,arr);
		root.data=arr[sumIndex];
		sumIndex++;
		converttoBT(root.right,arr);
		
	}
	
	
	int count=0;
	
	void sumOfgreaterKeys(Node root){
		
		countNodes(root);
		
		System.out.println("Count of Nodes"+count);
		
		int arr[]=new int[count];
		
		
		storeRevInorder(root,arr);
		
		
		int sum=0;
		
		int sumarr[]=new int[count];
		
		for(int i=0;i<arr.length;i++){
			sum=arr[i];
			for(int j=0;j<arr.length;j++){
			if(arr[i]<arr[j]){
			sum=sum+arr[j];
			}
			sumarr[i]=sum;
			}
		}
		
		System.out.println("Sum array");
		
		for(int i=0;i<sumarr.length;i++){
			System.out.print(" "+sumarr[i]);
		}
		
		converttoBT(root,sumarr);
		
		System.out.println();
		System.out.println("Inorder");
		
		inorder(root);
		
		
		
		
		
	}
	
	void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.right);
		System.out.print(" "+root.data);
		inorder(root.left);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root =new Node(5);
		root.left=new Node(2);
		root.right=new Node(13);
		SumofAllGreaterKeys greaterKeys=new SumofAllGreaterKeys();
		
		greaterKeys.sumOfgreaterKeys(root);
		
		

	}

}
