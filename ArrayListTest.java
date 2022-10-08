//Filepath:\\wsl$\Ubuntu\home\karlbill\amazon\data-structure
//Data Structures: Interface Collection
//Lists, ArrayLists and Iterators

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListTest{
	
	public static void main(String[] args){
		//Creating the fruit vector
		String[] fruits = {"BANNANA","APPLE","ORANGE","LEMON","CRAMBERRY","PASSION FRUIT","GRAPE"};
		List<String> fruitList = new ArrayList<String>();

		//Adding itens to the list
		for(String fruit : fruits){
			fruitList.add(fruit);
		}	

		//Creating itens to be removed from the fruitList
		String[] removeFruit = {"BANNANA","ORANGE","PASSION FRUIT"};
		List<String> removeList = new ArrayList<String>();

		//Adding itens to be removed in the removeList
		for(int index = 0; index < removeFruit.length; index++){
			removeList.add(removeFruit[index]);
		}

		//Printing the list before calling the method
		System.out.println("List before method calling: ");
		for(String fruit : fruitList){
			System.out.printf("%s ", fruit);
		}

		//Calling the method removeItens
		removeItens(fruitList, removeList);
		
		System.out.println("");
		//Printing the list after calling the method
		System.out.println("List after method calling: ");
		for(String fruit : fruitList){
			System.out.printf("%s ", fruit);
		}
		System.out.println("");
	}

	public static void removeItens(Collection<String> meanList, Collection<String> removeList){
		Iterator<String> iterator = meanList.iterator();
		
		while(iterator.hasNext()){
			if(removeList.contains(iterator.next())){
				iterator.remove();
			}		
		}
	}
}