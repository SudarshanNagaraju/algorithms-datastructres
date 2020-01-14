package geekForGeek;

import geekForGeek.SizeofTree.Node;

public class RoottoLeafSum {

	
	static class Node
	{
		int data;
		Node right,left;
		
		Node(int data){
			this.data=data;
			right=left=null;
		}
	}
	
	boolean rootToLeafSum(Node root,int sum){
		if (root == null)
            return (sum == 0);
        else
        {
            boolean ans = false;
  
            /* otherwise check both subtrees */
            int subsum = sum - root.data;
            if (subsum == 0 && root.left == null && root.right == null)
                return true;
            if (root.left != null)
                ans = ans || rootToLeafSum(root.left, subsum);
            if (root.right != null)
                ans = ans || rootToLeafSum(root.right, subsum);
            return ans;
        }
		
		
	}
	
	
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(2);
		root.right.left=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		RoottoLeafSum size=new RoottoLeafSum();
		
	   boolean ret=size.rootToLeafSum(root,21);
		
		System.out.println("Result:"+ret);

	}

}
