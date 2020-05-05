package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		

		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(28,"Dennis", 1234));
		userList.add(new User(20,"Markus", 23456));
		userList.add(new User(19,"Claudia", 9854));
		userList.add(new User(55,"Günther", 89524));
		
		//Anonym
//		Collections.sort(userList, new Comparator<User>() {
//			@Override
//			public int compare(User o1, User o2) {
//				return o1.getAge()-o2.getAge();
//			}
//		});
		
		
		Collections.sort(userList, new UserIntComparator());	
		System.out.println(userList);
	
		int index = Collections.binarySearch(userList, new User(20, "empty", 0), new UserIntComparator());
		
		System.out.println(index);

		Application.print(userList, 0);
		
	}
	
	
	public static void print(List<User> list, int index) {
		if(index>= list.size()) {
			return;
		}
		System.out.println(list.get(index));
		index++;
		print(list,index);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
