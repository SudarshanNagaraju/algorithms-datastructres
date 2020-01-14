package geekForGeek;

public class DiameterOfTree {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int diameter(Node root){
		
		if(root==null){
			return 0;
		}else{
			
			
			int lh=height(root.left);
			int rh=height(root.right);
			
			int ld=diameter(root.left);
			int rd=diameter(root.right);
			
			return(Math.max(lh+rh+1, Math.max(ld, rd)));
			
		}
		
	}
	
	static int height(Node root){
		
		if(root==null){
			return 0;
		}else{
			
			return (1+Math.max(height(root.left), height(root.right)));
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		Node  root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        DiameterOfTree tree=new DiameterOfTree();
 
        System.out.println("The diameter of given binary tree is : "
                           + tree.diameter(root));

	}

}
