package geekForGeek;

import java.util.HashMap;

public class LeftView {

	static class  Node{
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
		return lh>rh?lh+1:rh+1;
		
	}
	
	void levelOrder(Node root,int level,HashMap<Integer, Boolean> visited,int height){
		if(root==null){
			return;
		}
		
		
		
		
		if(level==1 && visited.get(height)){
			//System.out.println("height:"+height+"VISITED:"+visited.get(height));
			System.out.print(" "+root.data);
			visited.put(height, false);
		}
		
		
		levelOrder(root.left, level-1,visited,height);
		levelOrder(root.right, level-1,visited,height);
		
		return;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Node root=new Node(1);
		root.left=new  Node(2);
		root.left.left=new  Node(4);
		root.left.right=new  Node(5);
		root.right=new  Node(3);
		root.right.right=new  Node(6);
		
		LeftView view =new LeftView();
		int hi=view.height(root);
		
		System.out.println("Height:"+hi);
		
		HashMap<Integer, Boolean> hashMap=new HashMap<Integer,Boolean>();
		
		for(int i=1;i<=hi;i++){
			hashMap=new HashMap<Integer,Boolean>();
			hashMap.put(i, true);
			view.levelOrder(root,i,hashMap,i);
		}
		
		

	}

}
