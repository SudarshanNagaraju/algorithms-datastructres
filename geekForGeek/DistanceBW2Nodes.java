package geekForGeek;


public class DistanceBW2Nodes {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static int n1Dist=0;
	static int n2Dist=0;
	static int lcaDist=0;
	
	
	
	static void findLevel(Node root,int n1,int n2,int lca,int level){
		if(root==null){
			return;
		}
		if(root.data==n1){
			n1Dist=level;
		}
		if(root.data==n2){
			n2Dist=level;
		}
		if(root.data==lca){
			lcaDist=level;
		}
		//evel++;
		
		findLevel(root.left,n1,n2,lca,level+1);
		findLevel(root.right,n1,n2,lca,level+1);
		
		return;
		
	}
	
	
	
	Node findlca(Node root,int n1,int n2){
		if(root==null){
			return null;
		}
		
		
		if(root.data==n1 || root.data==n2){
			return root;
		}
		
		Node left_lca=findlca(root.left, n1, n2);
		Node right_lca=findlca(root.right, n1, n2);
		
		if (left_lca!=null && right_lca!=null)
            return root;
 
        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;		
	}
	
	int findDist(Node root){
		if(root==null){
			return 0;
		}
		
		int n1=4;
		int n2=5;
		
		
		Node lca=findlca(root,n1,n2);
		
		System.out.println("LCA"+lca.data);
		
		
		findLevel(root,n1,n2,lca.data,0);
		
		
		System.out.println("N1 Distance"+n1Dist);
		
		System.out.println("N2 Distance"+n2Dist);
		
		System.out.println("LCA Dist"+lcaDist);
		
		
		
		
		
		
		return n1Dist+n2Dist-2*lcaDist;
		
		
		
		
	}
	
	public static void main(String[] args) {

		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.left.left=new Node(8);
		root.right.right=new Node(7);
		
		DistanceBW2Nodes dist=new DistanceBW2Nodes();
		int dis=dist.findDist(root);
		
		
		System.out.println("Final Dist:"+dis);
		
		

	}

}
