package fr.formation.exo1exo2;

public class Exercice_1 {
	
/* ----- FUNCTIONS ----- */	
	public static void displayLetters(String str) {
//		String[] tabStr = str.split("");
//		for (int i = 0; i < tabStr.length; i++) {
//			System.out.println(tabStr[i]);
//		}
		
		char[] tabChar = str.toCharArray();
		for(char c: tabChar) {
		    System.out.println(c);
		}
		
	}
	
	public static void displayLettersReverse(String str) {
		String[] tabStr = str.split("");
		for (int i = tabStr.length-1; i >= 0; i--) {
			System.out.println(tabStr[i]);
		}
	}

	public static String displayLettersReverse_ToString(String str) {
		String[] tabStr = str.split("");
		String newLine = System.getProperty("line.separator");
		String res = "";
		for (int i = tabStr.length-1; i >= 0; i--) {
			res += tabStr[i] + newLine;
		}
		return res;
	}

/* ----- MAIN ----- */
	public static void main(String[] args) {
		String str = "FORMATION-JAVA";
		
		displayLetters(str);
		
	//	displayLettersReverse(str);
		
		System.out.println("\""+ str +"\" contient "+ str.split("").length +" caractères");

		System.out.println(displayLettersReverse_ToString(str));

	
	}
	


}
