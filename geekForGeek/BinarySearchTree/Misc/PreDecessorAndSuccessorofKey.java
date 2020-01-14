package geekForGeek.BinarySearchTree.Misc;

public class PreDecessorAndSuccessorofKey {

	
	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	static int pre=0;
	static int suc=0;
	void findPreandSuc(Node root,int key){
		if(root==null){
			return;
		}
		
		findPreandSuc(root.left,key);
		if(root.data<key){
			pre=root.data;
		}else if(root.data>key && suc==0){
			suc=root.data;
		}
		findPreandSuc(root.right, key);
		
		return;
		
		
	}
	
	static int count=0;
	void countinRange(Node root,int min,int max){
		if(root==null){
			return;
		}
		
		countinRange(root.left, min, max);
		
		if(root.data>=min && root.data<=max){
			count++;
		}
		
		countinRange(root.right, min, max);
		
		return;
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(50);
		root.left=new Node(30);
		root.right=new Node(70);
		root.left.left=new Node(20);
		root.left.right=new Node(40);
		
		root.right.left=new Node(60);
		root.right.right=new Node(80);
		
		int key=100;
		
		PreDecessorAndSuccessorofKey obj=new PreDecessorAndSuccessorofKey();
		obj.findPreandSuc(root, key);
		if(pre==0){
			System.out.println("No Predecessor");
		}else{
		System.out.println("Pre:"+pre);
		}
		if(suc==0){
			System.out.println("No Sucessor");
		}else{
		System.out.println("Suc:"+suc);
		}
		
		
		obj.countinRange(root, 80, 120);
		System.out.println("Count:"+count);
		

	}

}
