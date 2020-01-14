package geekForGeek.BinarySearchTree.Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class COuntPairswhoseSumequaltoX {

	
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
			
			root.right=insert(root.right,key);
		}
		
		return root;
		
		
	}
	
	
	
	void inorder(Node root,List<Integer> list){
		
		if(root==null){
			return;
		}
		
		inorder(root.left, list);
		list.add(root.data);
		System.out.print(" "+root.data);
		inorder(root.right, list);
		
		
	}
	
	static int count=0;
	void finPairs(List<Integer> list1,List<Integer> list2,int x){
		
        for(int i=0;i<list1.size();i++){
        	for(int j=0;j<list2.size();j++){
        if(list1.get(i)+list2.get(j)==x){
        	count++;
        	System.out.println();
        	System.out.println("PAIRS("+list1.get(i)+","+list2.get(j)+")");
        }
        		
        		
        	}
        }
	}
	
	int sum=16;
	void iterativeInorder(Node root1,Node root2){
		if(root1==null ||  root2==null){
			return;
		}
		
		
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		
		Node top1;
		Node top2;
		
		while(true){
			
			while(root1!=null){
				s1.push(root1);
				root1=root1.left;
			}
			
			while(root2!=null){
				s2.push(root2);
				root2=root2.right;
			}
			
			
		if(s1.isEmpty() || s2.isEmpty()){
			break;
		}
		
		top1=s1.peek();
		top2=s2.peek();
		
		if(top1.data+top2.data==sum){
			s1.pop();
			s2.pop();
			count++;
			System.out.println("("+top1.data+","+top2.data+")");
			root1=top1.right;
			root2=top2.left;
			
		}else if(top1.data+top2.data<sum){
			s1.pop();
			root1=top1.right;
			
		}else{
			s2.pop();
			root2=top2.left;
		}
		
		
			
			
			
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Node root1=null;
		
		root1=insert(root1,5);
		insert(root1,3);
		insert(root1,7);
		insert(root1,2);
		insert(root1,4);
		insert(root1,6);
		insert(root1,8);
		
		
        Node root2=null;
		
		root2=insert(root2,10);
		insert(root2,6);
		insert(root2,15);
		insert(root2,3);
		insert(root2,8);
		insert(root2,11);
		insert(root2,18);  
		
		
		java.util.List<Integer> list1=new ArrayList<Integer>();
		java.util.List<Integer> list2=new ArrayList<Integer>();
		
		COuntPairswhoseSumequaltoX pairs=new COuntPairswhoseSumequaltoX();
		
		System.out.println("INORDER LIST1");
		pairs.inorder(root1, list1);
		System.out.println();
		System.out.println("INORDER LIST2");
		pairs.inorder(root2, list2);
		
		
		//pairs.finPairs(list1,list2,16);
		
		pairs.iterativeInorder(root1, root2);
		
		System.out.println("COUNT"+count);
		/*for(int i=0;i<list1.size();i++){
			System.out.println(" "+list1.get(i)+" "+list2.get(i));
		}
		*/
		
		
		
		
		
		
		
		
		

	}

}
