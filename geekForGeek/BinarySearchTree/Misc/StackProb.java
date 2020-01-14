package geekForGeek.BinarySearchTree.Misc;

import java.util.ArrayList;
import java.util.Stack;

public class StackProb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Stack<ArrayList<String>> sta=new Stack<>();
		
		ArrayList<String> one=new ArrayList<>();
		
		one.add("START");
		one.add("cat");
		one.add("mouse");
		one.add("STOP");
		
		
		ArrayList<String> two=new ArrayList<>();
		
		one.add("START");
		one.add("dog");
		one.add("mooo");
		one.add("STOP");
		
		
		
		sta.push(one);
		sta.push(two);
		
		System.out.println("Hello");
		
		while(!sta.isEmpty()){
			
			ArrayList<String> list=sta.peek();
		
			//iterate arraylist
			for(int i=0;i<list.size();i++){
				System.out.print(" "+list.get(i));
				if(list.get(i).contains("END")){
			         sta.pop();
			         break;
				}
			}
			
			
		}
		

	}

}
