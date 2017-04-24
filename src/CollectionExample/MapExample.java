package CollectionExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		List<String> students = new ArrayList<>(); //studentList
		students.add("Raju");
		students.add("Steve");
		students.add("John");
		
		//System.out.println(students);
		List<String> teachers = new ArrayList<>(); //studentList
		teachers.add("Crawford");
		//System.out.println(teachers);
		
		
		Map<String,List<String>> stJosephSchool = new Hashtable<>(); //HashMap
		stJosephSchool.put("studentKey", students);
		stJosephSchool.put("teacherKey", teachers);
		//stJosephSchool.put(null, null);
		
		System.out.println(stJosephSchool);
		printAllDetails(stJosephSchool);
		
	}
	
	public static void printAllDetails(Map<String,List<String>> schoolDetails){
		
		List<String> studentList = schoolDetails.get("studentKey");
		for(String stud : studentList){
			System.out.println(stud);
		}
	}

}