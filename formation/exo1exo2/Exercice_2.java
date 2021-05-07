package fr.formation.exo1exo2;

public class Exercice_2 {
	
/* ----- FUNCTIONS ----- */

	public static boolean checkIfStringContains(String str, String test) {
		// ALERTE : méthode un peu pétée, avec excès de conditions dans les if()
		boolean bool = false;
		char[] tabStr = str.toCharArray();
		char[] tabTest = test.toCharArray();

		if (str.indexOf(tabTest[0]) != -1 && str.indexOf(tabTest[0]) + tabTest.length <= tabStr.length) {	
			int index = str.indexOf(tabTest[0]);

			for (int i = 0; i <= tabStr.length - (tabTest.length); i++) {
				boolean testOk = false;
				
				for (int j = 0; j < tabTest.length; j++) {
					if ( index < tabStr.length && index != -1 && tabTest[j] == tabStr[index] && index + tabTest.length <= tabStr.length) {
						testOk = true;
					}else { testOk = false;}
					index += 1;
				}
				if (testOk) {
					return bool = true;
				} else {
					index = str.indexOf(tabTest[0], index+1);
				}
			}
		}	
		return bool;
	}
	
	public static boolean isAPalindrome(String str) {
//		String[] tabStr = str.split("");
//		String reverse = "";
//		boolean bool = false;
//		
//		for (int i = tabStr.length-1; i >= 0; i--) {
//			reverse += tabStr[i];
//		}
//		
//		if(str.equalsIgnoreCase(reverse)) {
//			bool = true;
//		}
//		
//		return bool;
		
		String reverse = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		boolean response = Boolean.valueOf(str.equalsIgnoreCase(reverse));
		return response;
		
	}
	
	
/* ----- MAIN ----- */
	public static void main(String[] args) {
		String str = "abcdeabcf";
		String test = "bcfd";
		System.out.println("'"+str+"' contient '"+test+"' : "+checkIfStringContains(str, test));
		
		System.out.println("'kayak' est un palindrome : " +isAPalindrome("Kayak"));
		System.out.println("'sommes' est un palindrome : " +isAPalindrome("sommes"));

	}

}
