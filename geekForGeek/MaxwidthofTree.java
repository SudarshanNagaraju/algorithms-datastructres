package geekForGeek;


public class MaxwidthofTree {
	
	static class Node{
	      int data;
	      Node left,right;
	      Node(int data){
	    	  this.data=data;
	    	  left=right=null;
	      }
		
	}
	
	
	
	int maxofArray(int[] nodes,int level){
		int max=nodes[1];
		System.out.println("level"+level);
		for(int i=1;i<level;i++){
			
			System.out.println(nodes[i]);
			/*if(max<nodes[i]){
			max=nodes[i];
			}
			*/
		}
		return max;
	}
	
	void maxWidth(Node root,int[] nodes,int level){
		if(root==null){
			return ;
		}else{
		
		nodes[level]=nodes[level]+1;
		level++;
		
		maxWidth(root.left,nodes,level);
		maxWidth(root.right, nodes, level);
		
		return ;
				
		}	
		
	}
	
	int getHeight(Node root){
		if(root==null){
			return 0;
		}
		
		int lh=getHeight(root.left);
		int rh=getHeight(root.right);
		
		return lh>=rh?lh+1:rh+1;
		
		
	}
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(7);
        
        
        
        MaxwidthofTree  maxwidth=new MaxwidthofTree();
        
        int arr[]=new int[100];
        int level=1;
        
        maxwidth.maxWidth(root,arr,level);
        
        
        int height=maxwidth.getHeight(root);
        
        System.out.println("Height:"+height);
        
        int max=arr[1];
		for(int i=1;i<4;i++){
			
			System.out.println(arr[i]);
			if(max<arr[i]){
			max=arr[i];
			}
			
		}
        
        System.out.println("MAX WIDTH:"+max);
        
        

	}

}
