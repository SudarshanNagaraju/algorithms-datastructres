package geekForGeek;

public class RightViewofBinaryTree {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
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
	
	Node prv=null;
	
	void levelOrder(Node root,int level){
		if(root ==null){
			return;
		}
		if(level==1){
		//System.out.print(" "+root.data);
		prv=new Node(root.data);
		}
		
		levelOrder(root.left,level-1);
		levelOrder(root.right,level-1);
		
		return;
		
		
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		root.right.right.right=new Node(8);
		
		RightViewofBinaryTree rightVIew=new RightViewofBinaryTree();
		
		int height=rightVIew.height(root);
		
		System.out.println("H:"+height);
		
		for(int i=1;i<=height;i++){
			
			rightVIew.levelOrder(root,i);
			System.out.println(rightVIew.prv.data);
		}
		

	}

}
