package geekForGeek.BinarySearchTree;

public class DeleteinBST {

	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	Node root;
	public DeleteinBST(){
		root=null;
	}
	
	
	void insert(int key){
		root= insertRec(root,key);
	}
	
	Node insertRec(Node root,int key){
		
		if(root==null){
			root=new Node(key);
			return root;
		}

		if(key<root.data){
			root.left=insertRec(root.left,key);
		}else if(key>root.data){
			root.right=insertRec(root.right,key);
		}
		
		return root;
		
		
	}
	
	void inOrder(){
		inOrderRec(root);
	}
	
	void inOrderRec(Node root){
		if(root!=null){
			inOrderRec(root.left);
			System.out.print(" "+root.data);
	        inOrderRec(root.right);	
		}
	}
	
	void deleteKey(int key){
            root=deleteRec(root,key);  		
	}
	
	
	public Node deleteRec(Node root,int key){
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
	
	public static void main(String[] args) {
		
		
		DeleteinBST tree=new DeleteinBST();
		
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
		
        System.out.println(" Inorder");
        
        tree.inOrder();
        
        
        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inOrder();
        
		
		

	}

}
