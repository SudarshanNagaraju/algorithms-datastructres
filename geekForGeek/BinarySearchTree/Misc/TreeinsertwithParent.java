package geekForGeek.BinarySearchTree.Misc;

public class TreeinsertwithParent {

	static class Node{
		int data;
		Node left,right,parent;
		
		Node(int data){
			this.data=data;
			left=right=parent=null;
		}
		
	}
	
	static Node insert(Node root,int key){
		if(root==null){
			return new Node(key);
		}
		
		if(key<root.data){
			Node leftChild=insert(root.left, key);
			root.left=leftChild;
			leftChild.parent=root;
		}
		if(key>root.data){
			root.right=insert(root.right, key);
			root.right.parent=root;
			/*Node rightChild=insert(root.right, key);
			root.right=rightChild;
			rightChild.parent=root;*/
			
		}
		
		return root;
		
		
		
	}
	
	void inOrder(Node root){
		if(root==null){
			return;
		}
	   inOrder(root.left);
	   System.out.print(" "+root.data);
	   if(root.parent!=null){
		   System.out.println("Parent:"+root.parent.data);
	   }else{
		   System.out.println("Parent:NULL");
	   }
	   inOrder(root.right);
		
	}
	
	public static void main(String[] args) {
		
		
		Node root=null;
		root = insert(root, 50);
		root =insert(root, 30);
		root =insert(root, 20);
		root =insert(root, 40);
		root =insert(root, 70);
		root =insert(root, 60);
		root =insert(root, 80);
	 
		
		TreeinsertwithParent parent=new TreeinsertwithParent();
		parent.inOrder(root);

	}

}
