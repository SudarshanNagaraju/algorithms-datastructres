package geekForGeek.BinarySearchTree;

import java.util.LinkedList;

public class SortedLLtoBST {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
			
		}
	}
	
	Node root=null;
	
	static Lnode head;
	
	
	static class Lnode{
		
		int data;
		Lnode next,prv;
		
		Lnode(int data){
			this.data=data;
			next=prv=null;
		}
		
	}
	
	Node createRecBST(int n){
		
		if(n<=0){
			return null;
		}
		
		
		Node left=createRecBST(n/2);
		
		Node root=new Node(head.data);
		
		
		root.left=left;
		head=head.next;
		
		root.right=createRecBST(n-n/2-1);
		
		return  root;
		
		
	}
	
	void inorder(Node root){
		if(root==null){
			return;
		}
		
		System.out.print(" "+root.data);
		inorder(root.left);
		inorder(root.right);
		
		
	}
	
	void push(int new_data) 
    {
        /* allocate node */
        Lnode new_node = new Lnode(new_data);
 
        /* since we are adding at the begining,
           prev is always NULL */
        new_node.prv = null;
 
        /* link the old list off the new node */
        new_node.next = head;
 
        /* change prev of head node to new node */
        if (head != null)
            head.prv = new_node;
 
        /* move the head to point to the new node */
        head = new_node;
    }
 
	
	
	void createBst(int count){
		
		
		
		Node root=createRecBST(count);
		
		System.out.println("Preorder:");
		
		inorder(root);
		
		
		
	}
	
	void printList(Lnode node) 
    {
        while (node != null) 
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	
	
	int count(Lnode head){
		int count=0;
		Lnode temp=head;
		while(temp!=null){
			
			temp=temp.next;
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("rawtypes")
		SortedLLtoBST ll = new SortedLLtoBST();
		
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		
		
		System.out.println("Linked list");
		
		ll.printList(head);
		
		int coun=ll.count(head);
		
		System.out.println();
		System.out.println("COUNT:"+coun);
		
		
		ll.createBst(coun);
		
		

	}

}
