package geekForGeek;


public class NodesAtDistanceFromLeafNode {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	
	void storeNodes(Node root,int k,boolean[] visited,int[] arr,int level){
		if(root==null){
			return;
		}
		
		arr[level]=root.data;
		visited[level]=false;
		level++;
		
		if(root.left==null && root.right==null && level-k-1>=0 && visited[level-k-1]==false ){
			System.out.print(" "+arr[level-k-1]);
			visited[level-k-1]=true;
		}
		
		storeNodes(root.left, k, visited, arr, level);
		storeNodes(root.right, k, visited, arr, level);
		
		
		return;
		
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
		
		NodesAtDistanceFromLeafNode dist=new NodesAtDistanceFromLeafNode();
		int arr[]=new int[20];
		boolean visited[]=new boolean[20];
		dist.storeNodes(root, 3, visited, arr, 0);
		
		
		
		
		

	}

}
