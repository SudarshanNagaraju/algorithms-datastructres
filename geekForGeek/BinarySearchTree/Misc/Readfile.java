/*package geekForGeek.BinarySearchTree.Misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Readfile {
	
	
	static List<List<String>> mainList=new ArrayList<List<String>>();
	try{
		File blackListFile = new File("");
	FileReader fileReader = new FileReader(blackListFile);
	
	BufferedReader br=new BufferedReader(fileReader);
	String currentLine=br.readLine();
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	static void createSubList(String currentLine){
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
			
			
			List<String> list=new ArrayList<String>();
			while(currentLine!=null){
				
				
				if(currentLine.contains("START")){
					createSubList(currentLine);
				}
				list.add(currentLine);
				
				currentLine=br.readLine();
				
				
			}
			mainList.add(list);
			
		
		

	}

	
}
*/