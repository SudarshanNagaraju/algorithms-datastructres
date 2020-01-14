package geekForGeek;


public class DeepestLeftLeafNode {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static Node leafNode=null;
	static int level=0;
	void findLeaf(Node root,int lev,boolean left){
		if(root==null){
			return;
		}
		
		lev++;
		if(left!=false && root.left==null && root.right==null && lev>level){
			leafNode=new Node(root.data);
			level=lev;
		}
		
		findLeaf(root.left,lev,true);
		findLeaf(root.right,lev,false);
		
		return;
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
        
        
        DeepestLeftLeafNode leafNo=new DeepestLeftLeafNode();
        
        leafNo.findLeaf(root,0,false);
        
        System.out.println("Level:"+level+"Node:"+leafNode.data);
		
		
		
	}

}
