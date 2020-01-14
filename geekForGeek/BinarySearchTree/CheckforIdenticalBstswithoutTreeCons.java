package geekForGeek.BinarySearchTree;

public class CheckforIdenticalBstswithoutTreeCons {

	
	
	static boolean checkForIdentical(int[] a,int[] b,int n,int i1,int k1,int min,int max){
		
		int i,j;
		for(i=i1;i<n;i++){
			if(a[i]>min && a[i]<max){
				break;
			}
		}
		
		
		for(j=i1;j<n;j++){
			if(b[j]>min && b[j]<max){
				break;
			}
		}
		
		
		if(i==n && j==n){
			return true;
		}
		
		
		if (((i==n)^(j==n)) || a[i]!=b[j])
		       return false;
		
		
		return (checkForIdentical(a,b,n,i1+1,k1+1,min,a[i]) && checkForIdentical(a,b,n,i1+1,k1+1,a[i],max));
		
		
	}
	
	
	static void check(int[] arr1,int[] arr2){
		
		int n=arr1.length;
		boolean res=checkForIdentical(arr1,arr2,n,0,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println("Res:"+res);
	}
	
	public static void main(String[] args) {
		
	//	int arr1[]=new int[]{8, 3, 6, 1, 4, 7, 10, 14, 13};
		
		//int arr2[]=new int[]{8, 10, 14, 3, 6, 4, 1, 7, 13};
		
		
         int arr1[]=new int[]{2,4,3,1};
		
		int arr2[]=new int[]{2,1,4,3};
		
		
		CheckforIdenticalBstswithoutTreeCons.check(arr1,arr2);
		

	}

}
