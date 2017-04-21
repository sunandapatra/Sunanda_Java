package CollectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListExample {

	public static void main(String[] args) {
		//List<Person> names = new ArrayList<>();
//		names.add("ONE");
//		names.add("TWO");
//		names.add("THREE");
		/*names.add(new Person());
		
		for(int i = 0 ; i < names.size(); i++){
			System.out.println(names.get(i));
		}
		
		for(Person p : names){
			p.isRich();
		}*/
		
		List<String> names = new ArrayList<>();
		names.add("ONE");
		names.add("TWO");
		names.add("THREE");
		names.add("ONE");
		
		System.out.println(names);
		
		
		/*Set<String> namesSet = new HashSet<>();
		namesSet.add("ONE");
		namesSet.add("TWO");
		namesSet.add("THREE");
		namesSet.add("ONE");
		
		System.out.println(namesSet);*/
		
		Iterator<String> iter = names.iterator();
		
		while(iter.hasNext()){
			String name = iter.next();
			if(name.equals("THREE")) {
				iter.remove();
			}
		}
		System.out.println(names);
		names.add(2,"TWOHALF");
		System.out.println(names);
		
	}

}