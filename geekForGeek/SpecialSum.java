package geekForGeek;

public class SpecialSum {

	//Given a binary tree, where every node value is a Digit from 1-9 .Find the sum of all the numbers which are formed from root to leaf paths.
	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	static int listVal[]=new int[20];
	static int len=0;
	static void sum(int[] arr,int level){
		
		String sum="";
		for(int i=0;i<level;i++)
		{
			sum=sum+arr[i];
		}
		//System.out.println("SUM:"+sum);
		if(sum!=null && !"".equalsIgnoreCase(sum)){
			listVal[len]=Integer.valueOf(sum);
			len++;
		}
		
	}
	
	
	void findSpecialSum(Node root,int[] arr,int level){
		
		if(root==null){
			return;
		}else{
			
			arr[level]=root.data;
			level++;
			if(root.left==null && root.right==null){
				sum(arr,level);
			}
			
			findSpecialSum(root.left, arr, level);
			findSpecialSum(root.right, arr, level);
			
			return;
			
		}
		
	}
	
	int height(Node root){
		if(root==null){
			return 0;
		}
		 int lh=height(root.left);
		 int rh=height(root.right);
		 
		 return lh>rh?lh+1:rh+1;
		
	}
	
	public static void main(String[] args) {
		
		
		Node root=new Node(6);
		root.left=new Node(3);
		root.right=new Node(5);
		root.right.right = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.left.right.right = new Node(4);
        root.left.right.left = new Node(7);
        
        SpecialSum sum=new SpecialSum();
        int arr[]=new int[20];
		sum.findSpecialSum(root,arr,0);
		
		int lev=sum.height(root);
		
		int finalSUm=0;
		for(int i=0;i<lev;i++){
			finalSUm=finalSUm+listVal[i];
		}
		System.out.println("FINAL SUM"+finalSUm);
		
		

	}

}
