package geekForGeek.BinarySearchTree.Misc;

public class TripletAddstoZero {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	//converting BST to DLL
	static Node head;
	Node prev=null;
	void converttoDLL(Node root){
		
		if(root==null){
			return ;
		}
		
		
		converttoDLL(root.left);
		
		if(prev==null){
			head=root;
			
		}else{
			
			prev.left=prev;
			prev.right=root;
			
		}
		
		prev=root;
		
		converttoDLL(root.right);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Node root=new Node(6);
		root.left=new Node(-13);
		root.left.left=new Node(-8);
		root.right=new Node(14);
		root.right.left=new Node(13);
		root.right.right=new Node(15);
		root.right.left.left=new Node(7);
		
		TripletAddstoZero triplet=new TripletAddstoZero();
		
		
		triplet.converttoDLL(root);
		
		
		/*while(head!=null){
			System.out.print(" "+head.data);
			head=head.right;
		}*/
		
		for(;head!=null;head=head.right){
			Node next=null;
			Node prev=null;
			//System.out.println("HEAD DATA:"+head.data);
			
			prev=head.right;
			while(prev!=null){
				next=prev.right;
			while(next!=null){
		     int sum=prev.data+next.data;
		     //System.out.println("SUM"+sum);
		     if(sum+head.data==0){
		    	 System.out.print("SUCCESS"+sum+"Elements:["+head.data+"]["+next.data+"]["+prev.data+"]");
		    	 System.out.println();
		     }
			next=next.right;
			}
			prev=prev.right;
			
			}
			
		}
		
		
		
		

	}

}
