//Sample of List declaration

import com.karlbill.datastructures.List;
import com.karlbill.datastructures.EmptyListException;

public class ListTest{
	
	public static void main(String[] args){
		List<Integer> list = new List<Integer>();
		
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(10);
		list.print();
		list.insertAtBack(1);
		list.print();
		list.insertAtBack(5);
		list.print();

		try{
			int removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();

			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();

		}catch(EmptyListException emptyListException){
			emptyListException.printStackTrace();
		}
	}
}