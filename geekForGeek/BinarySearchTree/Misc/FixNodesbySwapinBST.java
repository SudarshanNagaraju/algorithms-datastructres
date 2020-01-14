package geekForGeek.BinarySearchTree.Misc;

public class FixNodesbySwapinBST {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	void inOrder(Node root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
		
	}
	
	Node first,middle,last,sec=null;
	void swapNodes(Node root){
		if(root==null){
			return;
		}
		
		swapNodes(root.left);
		
		
		if(last!=null && root.data<last.data){
			
			if(first==null){
				first=last;
				middle=root;		
			}else{
				sec=root;
			}
			
			
			
		}
		if(last!=null){
		System.out.print(" "+root.data+"last "+last.data);
		}
		last=root;
		
		
		swapNodes(root.right);
		
		return;
		
	}
	
	void swapNodesUtil(Node root){
		
		
		FixNodesbySwapinBST obj=new FixNodesbySwapinBST();
		/*System.out.println("Inorder Before Swap:");
		System.out.println();
		obj.inOrder(root);*/
		
		obj.swapNodes(root);
		
		if(sec==null){
			int temp=first.data;
			first.data=middle.data;
			middle.data=temp;
		}else{
			int temp=first.data;
			first.data=sec.data;
			sec.data=temp;
		}
		System.out.println();
		
		System.out.println("Inorder after Swap:");
		System.out.println();
		obj.inOrder(root);
		
	}
	
	public static void main(String[] args) {


		Node root=new Node(6);
		root.left=new Node(10);
		root.right=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right.left=new Node(7);
		root.right.right=new Node(12);
		
		FixNodesbySwapinBST fixNodes=new FixNodesbySwapinBST();
		fixNodes.swapNodesUtil(root);
		
		

	}

}
