package geekForGeek.BinarySearchTree;


public class LeastCommonAncestorsinBST {

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
	
	
	Node lca(Node root,int n1,int n2){
		if(root==null){
			return  null;
		}
		
		if(n1< root.data && n2<root.data){
			return lca(root.left, n1, n2);
			
		}
		
		if(n1>root.data && n2>root.data){
			return lca(root.right, n1, n2);
		}
		
		return root;
		
	}
	
	
	int lcaMax(Node root,int key){
		
		
		Node check=root;
		int max=Integer.MIN_VALUE;
		while(check!=null){
			
			if(key<check.data){
				max=max>check.data?max:check.data;
				check=check.left;
				
			}else{
				
				max=max>check.data?max:check.data;
				check=check.right;
				
			}
			
			
		}
		
		return max>key?max:key;
		
	}
	
	
	int lcaUtil(Node root,int n1,int n2){
		Node res=lca(root, n1, n2);
		
		System.out.println("LCA"+res.data);
		
		return lcaMax(res,n1)>=lcaMax(res,n2) ? lcaMax(res,n1):lcaMax(res,n2);
		
	}
	
	void inOrder(Node root){
		if(root==null){
			return ;
		}
		inOrder(root.left);
		
		System.out.print(" "+root.data);
		inOrder(root.right);
		
		
	}
	
	
	public static void main(String[] args) {
		Node root=null;
		
		root=insert(root,18);
		root=insert(root,9);
		root=insert(root,6);
		root=insert(root,12);
		root=insert(root,1);
		root=insert(root,8);
		root=insert(root,10);
		root=insert(root,36);
		
		LeastCommonAncestorsinBST least=new LeastCommonAncestorsinBST();
		
		System.out.println("Inorder");
		least.inOrder(root);
		System.out.println();
		System.out.println("");
		int res=least.lcaUtil(root, 1, 10);
		System.out.println("MAX"+res);
		

	}

}
