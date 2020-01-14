package geekForGeek;

public class InorderSuccessor {

	static class Node{
		int data;
		Node left,right,next;
		Node(int data){
			this.data=data;
		}
		
	}
	
	
	static Node next=null;
	void printSuccessfulNodes(Node root){
		
		if(root!=null){
			System.out.println(root.data);
			printSuccessfulNodes(root.right);
			System.out.println("after right traversal"+root.data);
			root.next=next;
			next=root;
			System.out.println("afte traversal"+root.data);
			printSuccessfulNodes(root.left);
			
			
		}
		
	}
	
	
	public static void main(String[] args) {

	    Node root=new Node(10);
	    root.left=new Node(8);
	    root.left.left=new Node(3);
	    root.right=new Node(12);
	    
	    InorderSuccessor order=new InorderSuccessor();
	    order.printSuccessfulNodes(root);
	    
	   /* Node ptr = root.left.left;
        while (ptr != null) 
        {
            // -1 is printed if there is no successor
            int print = ptr.next != null ? ptr.next.data : -1;
            System.out.println("Next of " + ptr.data + " is: " + print);
            ptr = ptr.next;
        }*/
	    
		
		
		
		
	}

}
