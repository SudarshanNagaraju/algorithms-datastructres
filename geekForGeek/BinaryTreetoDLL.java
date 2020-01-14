package geekForGeek;

public class BinaryTreetoDLL {

	
    static class Node{
    	int data;
    	Node left,right;
    	Node(int data){
    		this.data=data;
    		left=right=null;
    	}
    }
    
    static Node prev=null;
    static Node head;
    
    void treeToDLL(Node trre){
    	
    	
    	if(trre==null){
    		return;
    	}
    	
    	 
    	 treeToDLL(trre.left);
    	 
    	 if(prev==null){
    		 head=trre;
    	 }else{
    		 trre.left=prev;
    		 prev.right=trre;
    		 
    	 }
    	 prev=trre;
    	 
    	 treeToDLL(trre.right);
    	 
    	 
    	
    }
    
    void printList(Node node)
    {
        while (node != null) 
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
    
    
	public static void main(String[] args) {
		
		Node trre=new Node(10);
		trre.left=new Node(12);
		trre.right=new Node(15);
		trre.left.left=new Node(25);
		trre.left.right=new Node(30);
		trre.right.left=new Node(36);
		
		
		BinaryTreetoDLL dll=new BinaryTreetoDLL();
		
		dll.treeToDLL(trre);
		
		dll.printList(head);
		
		

	}

}
