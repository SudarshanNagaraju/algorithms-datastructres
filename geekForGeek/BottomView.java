package geekForGeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BottomView {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	int height(Node root){
		if(root==null){
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		
		return lh>rh? lh+1:rh+1;
	}
	
	
	
	void topView(Node root,int level,HashMap<Integer, Integer> arr,int hd){
		if(root==null || level<=0){
			return;
		}
		
		if(level==1){
			if(arr.get(hd)==null){
			arr.put(hd, root.data);
		}
			
		}
		
		
		
		topView(root.left,level-1,arr,hd-1);
		topView(root.right,level-1,arr,hd+1);
		
		return;
		
		
	}
	
	
	void view(Node root,int level,HashMap<Integer, Integer> arr,int hd){
		if(root==null || level<=0){
			return;
		}
		
		if(level==1){
			//System.out.println(" "+hd+" "+root.data);
			
			arr.put(hd, root.data);
		}
		
		
		
		view(root.left,level-1,arr,hd-1);
		view(root.right,level-1,arr,hd+1);
		
		return;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(22);
		root.right.left=new Node(4);
		root.right.right=new Node(25);
		root.left.left=new Node(5);
		root.left.right=new Node(3);
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(14);
		
		
		BottomView bottom=new BottomView();
		
		int height=bottom.height(root);
		HashMap<Integer, Integer> arr=new HashMap<Integer,Integer>();
		
		for(int i=1;i<=height;i++){
		bottom.view(root,i,arr,0);
		}
	
		Map<Integer, Integer> copy = new TreeMap<Integer, Integer>(arr);
		
		System.out.println(" Bottom View");
		for(Entry<Integer, Integer> key:copy.entrySet()){
			System.out.print(" "+key.getValue());
		}
		
		arr=new HashMap<Integer,Integer>();
		
		for(int i=1;i<=height;i++){
			bottom.topView(root,i,arr,0);
		}
		System.out.println();
		System.out.println(" Top View");
		copy=new TreeMap<Integer, Integer>(arr);
		for(Entry<Integer, Integer> key:copy.entrySet()){
			System.out.print(" "+key.getValue());
		}
		//treemap to sort keys in ascending order
		
		
		

	}

}
