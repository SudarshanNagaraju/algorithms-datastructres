package geekForGeek.BinarySearchTree.Misc;

public class ShortestDistanceBetween2Nodes {

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
		}else{
			root.right=insert(root.right, key);
		}
	   return root;
	}
	
	
	Node lca(Node root,int n1,int n2){
		
		if(root==null){
			return null;
		}
		
		if(n1<root.data && n2<root.data){
			return lca(root.left, n1, n2);
		}
		if(n1>root.data && n2>root.data){
			return lca(root.right, n1, n2);
		}
		
		return root;
	}
	
	int findDist(Node keyNode,int n){
		
		if(keyNode.data==n){
			return 0;
		}
		
		
		
		if(n<keyNode.data)
			return 1+findDist(keyNode.left,n);
		
		return 1+findDist(keyNode.right, n);
		
		
		
	}
	
	
	void lcaUtil(Node root){
		
		
		int n1=3;
		int n2=9;
		System.out.println("DISTANCE:");
		System.out.print(findDist(lca(root, n1, n2),n1)+findDist(lca(root, n1, n2),n2));
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=null;
		
		root=insert(root,5);
		root=insert(root,2);
		root=insert(root,12);
		root=insert(root,1);
		root=insert(root,3);
		root=insert(root,9);
		root=insert(root,21);
		root=insert(root,19);
		root=insert(root,25);
		root=insert(root,5);
		
		
		ShortestDistanceBetween2Nodes distance=new ShortestDistanceBetween2Nodes();
		
		
		/*int dis=distance.findDist(root,1);
		System.out.println("DIS"+dis);*/
		distance.lcaUtil(root);
		
		
		

	}

}
