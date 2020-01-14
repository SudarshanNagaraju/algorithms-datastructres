package geekForGeek;

public class DiffSumofOddEven {

	static class  Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	int evenArr[]=new int[120];
	int oddArr[]=new int[120];
	
	/*void findDiff(Node root,int level){
		if(root==null){
			return;	
		}
		level++;
		
		if(level%2==0){
			
		}else if(level%2!=0){
			
		}
		
		
		
	}*/
	
	
	int findDiff(Node root){
		if(root==null){
			return 0;
		}
		
		return root.data-findDiff(root.left)-findDiff(root.right);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Node root=new Node(5);
		root.left=new Node(2);
		root.right=new Node(6);
		root.left.left=new Node(1);
		root.left.right=new Node(4);
		root.left.right.left=new Node(3);
		root.right.right=new Node(8);
		root.right.right.left=new Node(7);
		root.right.right.right=new Node(9);
		
		DiffSumofOddEven diff=new DiffSumofOddEven();
		int res=diff.findDiff(root);

		System.out.println("RES:"+res);
		
		
	}

}
