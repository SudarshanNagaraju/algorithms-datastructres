package geekForGeek;

public class MinimumHeightOfTree {

	public static class Node{
		int data;
		Node left,right;
	    Node(int data){
	    	this.data=data;
	    	left=right=null;
	    }
	}
	
	
	static int minLevel=0;
	
	void minHeight(Node root,int level){
		if(root==null){
			return;
		}
		
		
		if(root.left==null && root.right==null && minLevel==0){
			minLevel=level;
		}else if(root.left==null && root.right==null && level<minLevel){
			minLevel=level;
		}
		
		minHeight(root.left,level+1);
		minHeight(root.right,level+1);
		
		return;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(1);
		
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.right.left=new Node(3);
		root.right.right=new Node(3);
		
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		MinimumHeightOfTree minHeight=new MinimumHeightOfTree();
		
		minHeight.minHeight(root,0);
		
		System.out.println("Level"+minLevel);
		
		

	}

}
