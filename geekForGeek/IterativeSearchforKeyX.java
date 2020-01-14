package geekForGeek;

import java.util.Queue;
import java.util.Stack;

import geekForGeek.MaxpathSum.Node;

public class IterativeSearchforKeyX {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
			
		}
	}
	
    boolean searchX(Node root,int x){
    	
    if(root==null){
    	return false;
    }
    
    Stack<Node> q=null;
    
    //com.sixdee.fw.util.Queue<Node > q=new com.sixdee.fw.util.Queue<Node>();
    
      q.push(root);
    
    while(q.empty()==false){
    	
    	Node res=q.peek();
    	
    	System.out.println("res"+res.data);
    	
    	
    	if(res.data==x){
    		return true;
    	}
    	
    	q.pop();
    	
    	
    	System.out.println("size"+q.size());
    	
    	
    	if(root.left!=null){
    		q.push(root.left);
    	}
    	
    	if(root.right!=null){
    		q.push(root.right);
    	}
    	
    	System.out.println("res"+q.size());
    	
    }
    
    return false;
    
    	
    }
	
	
	public static void main(String[] args) {
		
		
		
		Node root=new Node(10);
		root.left=new Node(2);
		root.right=new Node(10);
		/*
		root.left.left=new Node(20);
		root.left.right=new Node(1);
		
		
		root.right.right=new Node(25);
		root.right.right.right=new Node(4);
		root.right.right.left=new Node(3);*/
		
		IterativeSearchforKeyX sear=new IterativeSearchforKeyX();
		
		
		boolean res=sear.searchX(root,20);
		
		System.out.println(res);

	}

}
