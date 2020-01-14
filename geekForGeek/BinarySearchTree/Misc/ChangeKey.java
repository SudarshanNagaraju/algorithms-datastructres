package geekForGeek.BinarySearchTree.Misc;


public class ChangeKey {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	Node deleteRec(Node root,int key){
		if(root==null){
			return root;
		}
		
		if(key<root.data){
			deleteRec(root.left,key);
		}else if(key>root.data){
			deleteRec(root.right,key);
		}else{
			
			if(root.left==null){
				return root.right;
			}else if(root.right==null){
				return root.left;
			}
			
			root.data=minValue(root.right);
			
			root.right=deleteRec(root.right, root.data);
			
		}
		
		return root;
		
	}
	
	int minValue(Node root){
		int min=root.data;
		while(root.right!=null){
			root=root.right;
			min=root.data;
			
		}
		return min;
		
		
	}
	
	Node insert(Node root,int key){
		
		if(root==null){
			return new Node(key);
		}
		
		if(key<root.data){
			root.left=insert(root.left, key);
		}else{
			root.right=insert(root.right, key);
		}
		
		return root;
		
	}
	
	void replaceKey(Node root,int oldKey,int newKey){
		
		
		
		
		deleteRec(root,oldKey);
		
		insert(root,newKey);
		
		
		
	}
	
	void inOrder(Node root){
		if(root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
		
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(50);
		root.left=new Node(30);
		root.right=new Node(70);
		root.left.left=new Node(20);
		root.left.right=new Node(40);
		
		
		root.right.left=new Node(60);
		root.right.right=new Node(80);
		
		
		ChangeKey change=new ChangeKey();
		
		System.out.println(" INORDER BEFORE");
		
		change.inOrder(root);
		int oldkey=30;
		int newkey=10;
		change.replaceKey(root,oldkey,newkey);
		
        System.out.println(" INORDER AFTER");
		
		change.inOrder(root);
		

	}

}
