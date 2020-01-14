package geekForGeek;


public class ChildrenSumProp {

	
	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	int childSum(Node root){
		
		int left_data=0;
		int right_data=0;
		
		if((root==null) ||(root.left==null && root.right==null)){
		return 1;
		}else{
			
			if(root.left!=null)
				left_data=root.left.data;
			
			if(root.right!=null)
				right_data=root.right.data;
			
            if((root.data==left_data+right_data) && (childSum(root.left)!=0) && (childSum(root.right)!=0)){
            	return 1;
            }else{
            	return 0;
            }
		
		
		}
		
	}
	
	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		root.right.left=new Node(1);
		
		ChildrenSumProp sum=new ChildrenSumProp();
		
		int res=sum.childSum(root);
		
		if(res==1){
			System.out.println("CHILD SUM PROPERTY is Satisfied by Given Tree");
		}else{
			System.out.println("CHILD SUM PROPERTY is not Satisfied  by given Tree");
		}
		
		
		
		
		
		
		
		

	}

}
