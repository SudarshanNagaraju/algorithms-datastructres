package geekForGeek;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightNodeofGIvenKey {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	Node nextRight(Node root,int res,int level){
		if(root==null){
			return null;
		}
		
		Queue<Node> qNode=new LinkedList<Node>();
		Queue<Integer> qLevel=new LinkedList<Integer>();
		
		qNode.add(root);
		qLevel.add(level);
		
		while(!qNode.isEmpty()){
			
			
			Node local=qNode.peek();
			int lev=qLevel.peek();
			qNode.remove();
			qLevel.remove();
			
			if(local.data==res){
				
				if(qNode.peek()!=null && lev!=qLevel.peek()){
					return null;
				}
				return qNode.peek();
			}
			
			if(local.left!=null){
				qNode.add(local.left);
				qLevel.add(lev+1);
			}
			if(local.right!=null){
				qNode.add(local.right);
				qLevel.add(lev+1);
			}
			
			
			
			
		}
		
		return null;
		
		
		
		
	}
	
	void test(Node root, int k) 
    {
        Node nr = nextRight(root, k,0);
        if (nr != null)
            System.out.println("Next Right of " + k + " is " + nr.data);
        else
            System.out.println("No next right node found for " + k);
    }
	
	
	public static void main(String[] args) {

		Node root = new Node(10);
        
        root.left = new Node(2);
        root.right = new Node(6);
        root.right.right = new Node(5);
        root.left.left = new Node(8);
        root.left.right = new Node(4);
  
        
        NextRightNodeofGIvenKey tree=new NextRightNodeofGIvenKey();
        
        tree.test(root, 10);
        
        tree.test(root, 2);
        tree.test(root, 6);
        tree.test(root, 5);
        tree.test(root, 8);
        tree.test(root, 4);
		
		
		
	}

}
