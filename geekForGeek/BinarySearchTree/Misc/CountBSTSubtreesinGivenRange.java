package geekForGeek.BinarySearchTree.Misc;

public class CountBSTSubtreesinGivenRange {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static int low =5;
	
	static int high=45;
	static int count=0;
	
	static boolean checkinRange(Node root){
		
		return (root.data>=low && root.data<=high);
	}
	
	
	static boolean  findSubtreeCount(Node root){
		if(root==null){
			return true;
		}
	boolean left=root.left!=null?findSubtreeCount(root.left):true;
	boolean right=root.right!=null?findSubtreeCount(root.right):true;
	
	if(left && right && checkinRange(root)){
	count++;
	
	return true;
	}
	 
	
	return false;
	}
	
	
	
	void findUtil(Node root){
		
		findSubtreeCount(root);
		
		System.out.println("Count:"+count);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(50);
		root.left.left=new Node(1);
		root.right.left=new Node(40);
		root.right.right=new Node(100);
		
		CountBSTSubtreesinGivenRange bstRange=new CountBSTSubtreesinGivenRange();
		bstRange.findUtil(root);
		
		

	}

}
