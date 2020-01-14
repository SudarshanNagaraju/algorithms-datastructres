package geekForGeek.BinarySearchTree;

public class BSTNodeHasSingleChildorNot {

	
	
	static boolean treeHasSingleChild(int[] pre){
		int nextDiff,lastDiff;
		
		for(int i=0;i<pre.length-1;i++){
			nextDiff=pre[i]-pre[i+1];
			lastDiff=pre[i]-pre[pre.length-1];
			if(nextDiff*lastDiff<0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		int pre[]=new int[]{8,3,5,7,6};
		
		if(treeHasSingleChild(pre)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		

	}

}
