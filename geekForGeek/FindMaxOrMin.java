package geekForGeek;

public class FindMaxOrMin {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;
	
	void findMax(Node root){
		if(root==null){
			return;
		}
		
		if(root.data>max){
			max=root.data;
		}
		
		findMax(root.left);
		findMax(root.right);
		
		return;
		
	}
	
	void findMin(Node root){
		if(root==null){
			return;
		}
		
		if(root.data<min){
			min=root.data;
		}
		
		findMax(root.left);
		findMax(root.right);
		
		return;
	}
	
	static int sum=0;
	void sumOfLeftLeaf(Node root,boolean res){
		if(root==null){
			return;
		}
		
		if(root.left==null && root.right==null && res){
			sum=sum+root.data;
		}
		
		sumOfLeftLeaf(root.left, true);
		sumOfLeftLeaf(root.right, false);
		
		return;
		
		
	}
	
	public static void main(String[] args) {

		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.left.right=new Node(4);
		root.left.right.left=new Node(5);
		root.left.right.right=new Node(6);
		
		root.right.right=new Node(7);
		root.right.right.left=new Node(8);

		FindMaxOrMin maxorMIn=new FindMaxOrMin();
		
		maxorMIn.findMax(root);
		maxorMIn.findMin(root);
		
		System.out.println("MAX"+max);
		System.out.println("MAX"+min);
		
		
		maxorMIn.sumOfLeftLeaf(root,false);
		
		System.out.println("LEFT LEAF SUM"+sum);
		
	}

}
