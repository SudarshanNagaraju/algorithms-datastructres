package geekForGeek;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;

public class DiagonalTree {

	static class Node{
        int data;
        Node left;
        Node right;
         
        //constructor
        Node(int data)
        {
            this.data=data;
            left = null;
            right =null;
        }
    }
	
	
	
	
	static void createDiagonalVectort(Node root,Integer d,HashMap<Integer, Vector<Integer>> diMap){
		if(root==null){
			return;
		}
		
		Vector<Integer> vec=diMap.get(d);
		
		
		if(vec==null){
			vec= new Vector<Integer>();
			vec.add(root.data);
		}else{
			vec.add(root.data);
		}
		
		diMap.put(d, vec);
		
		createDiagonalVectort(root.left,d+1,diMap);
		createDiagonalVectort(root.right,d,diMap);
		
		
	}
	
	static void diagonalPrint(Node root){
		
		
		HashMap<Integer, Vector<Integer>> diMap=new HashMap<>();
		
		createDiagonalVectort(root,0,diMap);
		
		for(Entry<Integer, Vector<Integer>> entry:diMap.entrySet()){
			System.out.println("Key"+entry.getKey());
			System.out.println("Value"+entry.getValue());
			int sum=0;
			for(int i=0;i<entry.getValue().size();i++){
				sum=sum+entry.getValue().get(i);
			}
			System.out.println("Sum"+sum);
			
		}
		
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(9);
        root.left.right = new Node(6);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(7);
        root.left.right.left = new Node(11);
        root.left.left.right = new Node(10);
         
        diagonalPrint(root);
		
		
		
	}
	
	
}
