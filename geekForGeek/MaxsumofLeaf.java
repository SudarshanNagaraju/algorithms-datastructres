package geekForGeek;

public class MaxsumofLeaf {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static int max=0;
	static int[] dest = null;
	static int len=0;
	static void putMax(int[] sumArr,int level){
		int sum=0;
		for(int i=0;i<level;i++){
			sum=sum+sumArr[i];
		}
		if(sum>max){
			max=sum;
			dest = new int[level];
			System.arraycopy( sumArr, 0, dest, 0, level );
			len=level;
		}
	}
	
	
	void findMaxSum(Node root,int[] arr,int level){
		if(root==null){
			return;
		}else{
			arr[level]=root.data;
			level++;
			if(root.left==null && root.right==null){
				putMax(arr,level);
			}
			
			findMaxSum(root.left,arr,level);
			findMaxSum(root.right, arr, level);
			
			return;
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Node root=new Node(10);
		
		root.left=new Node(2);
		root.right=new Node(7);
		root.left.left=new Node(8);
		root.left.right=new Node(-4);

		MaxsumofLeaf sum=new  MaxsumofLeaf();
		int arr[]=new int[10];
		sum.findMaxSum(root,arr,0);
		
		System.out.println("MAX SUM:"+max);
		System.out.print("MAX SUM PATH:");
		for(int j=0;j<len;j++){
			System.out.print(" "+dest[j]);
		}
		
		
		
	}

}
