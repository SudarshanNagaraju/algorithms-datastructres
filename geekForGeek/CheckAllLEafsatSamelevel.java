package geekForGeek;

public class CheckAllLEafsatSamelevel {

	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	/*int leafLevel=0;
	static boolean checkLevelFlag=true;
	void atSameLevel(Node root,int level){
		if(root==null){
			return;
		}
		level++;
		if(root.left==null && root.right==null){
			
			//System.out.println("Leaf level"+leafLevel+"level"+level+"root data"+root.data);
			
			if(leafLevel==0){
				leafLevel=level;
			} else if(leafLevel>0 && leafLevel!=level){
				checkLevelFlag=false;
			}
		}
		atSameLevel(root.left,level);
		atSameLevel(root.right,level);
		
		return;
		
	}
	*/
	static int deepLevel=0;
	static Node deepNode=null;
	void deepestOddLevel(Node root,int level){
		if(root==null){
			return;
		}
		level++;
		if(root.left==null && root.right==null){
			
			
			if(level>deepLevel && level%2!=0){
				deepLevel=level;
				deepNode=new Node(root.data);
			} 
		}
		deepestOddLevel(root.left,level);
		deepestOddLevel(root.right,level);
		
		return;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Node root=new Node(12);
		root.left=new Node(5);
		root.right=new Node(7);
		root.left.left=new Node(3);
		root.left.left.right=new Node(88);
		root.left.left.right.right=new Node(888);
		root.left.left.right.right.left=new Node(8880);
		root.left.left.right.right.left.right=new Node(999);
		root.right.right=new Node(1);
		
		CheckAllLEafsatSamelevel check=new CheckAllLEafsatSamelevel();
		//check.atSameLevel(root,0);
		
		
		
		//System.out.println("res:"+checkLevelFlag);
		check.deepestOddLevel(root, 0);
		
		System.out.println("Deep Odd Level:"+deepLevel);
		if(deepNode!=null){
		System.out.println("Deep Odd Node Data:"+deepNode.data);
		}
		
		

	}

}
