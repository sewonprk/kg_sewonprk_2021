import java.util.*;


public class Main {

	public static void main(String[] args) {
		//1st command line argument should seed in as s1
		String s1 = args[0];
		//2nd command line argument should seed in as s2
		String s2 = args[1];
		System.out.println(isOneToOne(s1, s2));
	}
	
	/*
	 * Method that determines whether two strings are one-to-one
	 * 
	 * @params: two strings 
	 * returns: boolean, true if s1 can be mapped to s2, false otherwise
	 */
	static boolean isOneToOne(String s1, String s2) {
		Set<Character> s1Set = new HashSet<>();
		Set<Character> s2Set = new HashSet<>();
		
		for (char c : s1.toCharArray()) {
			s1Set.add(c);
		}
		
		for (char c : s2.toCharArray()) {
			s2Set.add(c);
		}
		
		return s1Set.size() >= s2Set.size();
	}
}
