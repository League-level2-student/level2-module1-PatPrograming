package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> name=new ArrayList<String>();
		name.add("Bob");
		name.add("Daniel");
		name.add("Amy");
		name.add("Katelyn");
		name.add("Ruffles");
		//   Don't forget to import the ArrayList (java.util) class
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < name.size(); i++){
			String s = name.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : name){
			System.out.println(s);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < name.size(); i++) {
			if (i%2==0) {
				System.out.println(name.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = name.size()-1; i >= 0; i--) {
			System.out.println(name.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < name.size(); i++) {
			if (name.get(i).contains("e")) {
				System.out.println(name.get(i));
			}
		}
	}
}
