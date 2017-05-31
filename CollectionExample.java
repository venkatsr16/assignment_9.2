import java.io.*;
import java.util.*;

public class CollectionExample {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(4);
		list.add(6);
		list.add(3);
			
		/*ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		System.out.println("Before removing duplicates: "+list);

		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.addAll(list);
		
		list.clear();
	
		list.addAll(hashset);
	
		System.out.println("After removing duplicates: "+ list);
		
	}
}