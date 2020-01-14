package geekForGeek.BinarySearchTree.Misc;

public class ImportantFindPairwithGivenSum {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
			
		}
	}
	
	
	boolean findTargetSum(int[] arr,int target){
		if(arr.length==0 && arr.length==1){
			return false;
		}
		
		int left=0;
		int right=arr.length-1-1;
		
		while(left<right){
			
		if(arr[left]+arr[right]==target){
			return true;
		}else if(arr[left]+arr[right]<target){
			left++;
		}else{
			right--;
		}
		}
		return false;
		
		
	}
	int index=0;
	void putinArray(Node root,int[] arr){
		if(root==null){
			return;
		}
		
		putinArray(root.left,arr);
		arr[index]=root.data;
		index++;
		
		putinArray(root.right,arr);
	}
	
	public static void main(String[] args) {
		
		
		
		Node root=new Node(15);
		root.left=new Node(10);
		root.right=new Node(20);
		root.left.left=new Node(8);
		root.left.right=new Node(12);
		root.right.left=new Node(16);
		root.right.right=new Node(25);
		
		
		int target=322;
		
		ImportantFindPairwithGivenSum pairSum=new ImportantFindPairwithGivenSum();
		int arr[]=new int[8];
		
		pairSum.putinArray(root,arr);
		
		/*for(int i=0;i<arr.length-1;i++){
			System.out.print(" "+arr[i]);
		}*/
		
		if(pairSum.findTargetSum(arr,target)){
			System.out.println("present");
		}else{
			System.out.println("Not present");
		}

	}

}
