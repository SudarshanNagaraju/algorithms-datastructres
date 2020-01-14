package geekForGeek;

public class MaxpathSum {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
			
		}
	}
	
	class Res{
		int val1=Integer.MIN_VALUE;
		
	}
	
	int findMaxUtil(Node root,Res val){
		if(root==null){
			return 0;
		}
		
		int l=findMaxUtil(root.left, val);
		int r=findMaxUtil(root.right, val);
		
       int max_Single=Math.max(Math.max(l, r)+root.data,root.data);
       
       int find_max=Math.max(max_Single, l+r+root.data);
       
       val.val1=Math.max(val.val1, find_max);
       
       return max_Single;
		
		
		
		
	}
	
	
	int findMax(Node root){
		Res res=new Res();
		res.val1=Integer.MIN_VALUE;
	 findMaxUtil(root,res);
	 return res.val1;
		
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(2);
		root.right=new Node(10);
		
		root.left.left=new Node(20);
		root.left.right=new Node(1);
		
		
		root.right.right=new Node(-25);
		root.right.right.right=new Node(4);
		root.right.right.left=new Node(3);
		
		MaxpathSum pathSum=new MaxpathSum();
		
		
		int res=pathSum.findMax(root);
		
		System.out.println("MAX PATH SUM:"+res);
		
		
		
		
		
		
		
		
		
		

	}

}
