package geekForGeek;

public class CousinsorNot {

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
	
	int cousinLevel=0;
	int cousinParent=0;
	
	
	void cousinsorNot(Node root,int level,int cousin1,int cousin2,Node parent){
		
		if(root==null){
			return;
		}
		
		/*System.out.println();
		System.out.println("root data"+root.data);
		if(parent!=null)
		System.out.println("parent data"+parent.data);
		
		System.out.println("level"+level);*/
		
		if(cousinLevel==0 && (root.data==cousin1|| root.data==cousin2)){
			cousinLevel=level;
			cousinParent=parent.data;
			
			/*System.out.println("cousinLevel"+cousinLevel);
			System.out.println("cousinParent"+cousinParent);*/
		}else if(root.data==cousin1|| root.data==cousin2){
			if(cousinLevel==level){
			/*System.out.println("cousinLevel true"+cousinLevel);
			System.out.println("cousinParent true"+cousinParent);*/
			if(cousinParent!=parent.data){
				System.out.println("BOTH ARE COUSINS");
			}else{
				System.out.println("BOTH ARE NOT COUSINS");
			}
			}else{
				System.out.println("BOTH ARE NOT COUSINS");
			}
			
		}
		
		cousinsorNot( root.left, level+1,cousin1, cousin2,root);
		cousinsorNot( root.right, level+1,cousin1, cousin2,root);
		return;
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(6);
		root.left=new Node(3);
		root.right=new Node(5);
		root.left.left=new Node(7);
		root.left.right=new Node(8);
		root.right.left=new Node(1);
		root.right.right=new Node(3);
		
		CousinsorNot cousins=new CousinsorNot();
		int height=cousins.height(root);
		
		//for(int i=1;i<=height;i++){
			cousins.cousinsorNot(root,1,7,5,null);
			
		//}
		
		
		
		

	}

}
