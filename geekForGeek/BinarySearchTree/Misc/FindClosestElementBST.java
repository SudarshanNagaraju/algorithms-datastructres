package geekForGeek.BinarySearchTree.Misc;

public class FindClosestElementBST {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int key = -1;
	void findCLosest(Node root,int k ,int mindiff){
		if(root==null){
			return;
		}
		
		
		if(root.data==key){
			key=root.data;
			return;
		}
		
		if(mindiff>Math.abs((root.data-k))){
			mindiff=Math.abs(root.data-k);
			key=root.data;
		}
		
		if(k<root.data){
			findCLosest(root.left, k, mindiff);
		}else{
			findCLosest(root.right, k, mindiff);
		}
		
		
		
	}
	
	
	int maxDiff(Node root, int k)
	{
	    // Initialize minimum difference
	 
	    // Find value of min_diff_key (Closest key
	    // in tree with k)
	    findCLosest(root,18,Integer.MAX_VALUE);
	 
	    return key;
	}
	 
	
	public static void main(String[] args) {
		
		Node root=new Node(9);
		root.left=new Node(4);
		root.right=new Node(17);
		root.left.left=new Node(3);
		root.left.right=new Node(6);
		root.right.right=new Node(22);
		root.right.right.left=new Node(20);
		
		FindClosestElementBST closest=new FindClosestElementBST();
		
		
		System.out.println("Key"+closest.maxDiff(root,18));
		
		
		
		

	}

}
