package geekForGeek;

import java.util.Queue;

public class CompleteBinaryTree {

	
	static class Node{
		int data;
		Node left,right;
		
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	
	static boolean isCompleteBT(Node root){
		if(root==null){
			return true;
		}else{
		
		boolean flag=false;
		
		Queue<Node> queue=new java.util.LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			Node node=queue.remove();
			
			if(node.left!=null){
				
				
			if(flag==true){
					return false;
				}
				
				queue.add(node.left);
			}else{
				flag=true;
			}
			
			
			if(node.right!=null){
				
				
				if(flag==true){
						return false;
					}
					
					queue.add(node.right);
				}else{
					flag=true;
				}
				
			
		}
		return true;
		
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
         
        if(isCompleteBT(root) == true)
            System.out.println("Complete Binary Tree");
        else
            System.out.println("NOT Complete Binary Tree");
     }
 
		


}
