package geekForGeek;


public class ExtractLeaftoDLL {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	static Node prev;
    static Node head;
	Node extract(Node root){
		
		if(root==null){
			return null;
		}
		
		if(root.left==null && root.right==null){
			if(head==null){
				prev=root;
				head=prev;
			}else{
			
			prev.right=root;
			root.left=prev;
			prev=root;
			}
			return null;
			//System.out.println(root.data+"prv"+prev.data);
		}
		
		root.left=extract(root.left);
		root.right=extract(root.right);
		
		return root;
		
	}
	
	
	void printList(Node node) 
    {
        while (node != null) 
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
	
	void inorder(Node res) 
    {
        if (res == null)
            return;
        inorder(res.left);
        System.out.print(res.data + " ");
        inorder(res.right);
    }
  
	
	public static void main(String[] args) {
		
		Node root =new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.right.right=new Node(6);
		root.right.right.left=new Node(9);
		root.right.right.right=new Node(10);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.left.left=new Node(7);
		root.left.left.right=new Node(8);
		
		ExtractLeaftoDLL extLeaf=new ExtractLeaftoDLL();
		
		System.out.println("Before INORDER");
		extLeaf.inorder(root);
		extLeaf.extract(root);
		System.out.println();
		System.out.println("EXTRACTED LEAF NODES");
		extLeaf.printList(head);
		System.out.println("after INORDER");
		extLeaf.inorder(root);
		
		
		
		
		
		

	}

}
