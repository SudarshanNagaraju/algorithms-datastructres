package geekForGeek;

public class Foldabletree {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	boolean isFoldable(Node root){
		if(root==null){
			return true;
		}
		
		return checkFoldable(root.left,root.right);
		
	}
	
	
	static boolean checkFoldable(Node node1,Node node2){
		if(node1==null && node2==null){
			return true;
		}
		
		/*if((node1==null && node2!=null) || (node1!=null && node2==null)  ){
			return false;
		}
		*/
		
		if((node1==null  ||  node2==null)  ){
			return false;
		}
		
		
		return (checkFoldable(node1.left,node2.right) && checkFoldable(node1.right,node2.left));
		
	}
	
	public static void main(String[] args) {

		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.right=new Node(5);
		root.right.left=new Node(4);
		
		Foldabletree fold=new Foldabletree();
		if(fold.isFoldable(root)){
			System.out.println("TREE is FOLDABLE");
		}else{
			System.out.println("TREE is NOT FOLDABLE");
		}
		
		
		
		
	}

}
