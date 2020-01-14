package geekForGeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

import geekForGeek.MaxsumofLeaf.Node;

public class VerticalSum {

	
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
		
	}
	
	void vertSum(Node root,HashMap<Integer, Integer> hM,int hd){
		if(root==null){
			return;
		}else{
			
			
			
			vertSum(root.left,hM,hd-1);
			 int prevSum = (hM.get(hd) == null) ? 0 : hM.get(hd);
		        hM.put(hd, prevSum + root.data);
			vertSum(root.right,hM,hd+1);
			
			return;
			
			
		}
	}
	
	public static void main(String[] args) {
	
		Node root=new Node(1);
		
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		HashMap<Integer, Integer> hamap=new HashMap<Integer, Integer>();
		
		VerticalSum ver=new VerticalSum();
		ver.vertSum(root, hamap, 0);
		
	
		
		
	        System.out.println(hamap.entrySet());
		
		
		

	}

}
