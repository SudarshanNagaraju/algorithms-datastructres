package geekForGeek.BinarySearchTree.Misc;

public class SumofKsmallestElements {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static Node insert(Node root,int key){
		
		if(root==null){
			return new Node(key);
		}
		
		if(key<root.data){
		root.left=insert(root.left, key);
		}
		if(key>root.data){
			root.right=insert(root.right, key);
		}
		
		return root;
		
		
		
	}
	int count=0;
	int sum =0;
	void inOrder(Node root,int k){
		if(root==null){
			return ;
		}
		inOrder(root.left,k);
		count++;
		sum=sum+root.data;
		if( count==k ){
			System.out.print("Sum:"+sum);
		}
		inOrder(root.right,k);
		
		
	}
	
	
	Node deleteLeafNodes(Node root){
		if(root==null){
			return null;
		}
		
		
		root.left=deleteLeafNodes(root.left);
		if(root.left==null && root.right==null){
			return null;
		}
		root.right=deleteLeafNodes(root.right);
		
		
		return root;
		
	}
	
	
	
	void inOrde(Node root){
		if(root==null){
			return;
		}
		inOrde(root.left);
		//if(root.left==null && root.right==null){
		System.out.print(" "+root.data);
		//}
		inOrde(root.right);
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=null;
		SumofKsmallestElements sumk=new SumofKsmallestElements();
		
		/*root = insert(root, 20);
	    root = insert(root, 8);
	    root = insert(root, 4);
	    root = insert(root, 12);
	    root = insert(root, 10);
	    root = insert(root, 14);
	    root = insert(root, 22);*/
		
		root = insert(root, 20);
	    insert(root, 10);
	    insert(root, 5);
	    insert(root, 15);
	    insert(root, 30);
	    insert(root, 25);
	    insert(root, 35);
	    //System.out.println("INORDER");
	    //sumk.inOrder(root,3);
	    System.out.println("Inorder");
	    sumk.inOrde(root);
	    
	    root=sumk.deleteLeafNodes(root);
	    System.out.println();
	    System.out.println("after Inorder");
	    sumk.inOrde(root);
	    

	}

}
