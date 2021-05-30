public class NameExperiments {
	public static String getFirstName(String name) {
		int spaceIndex = name.indexOf(" "); 
		String firstName = name.substring(0, spaceIndex);
		return firstName;
	}

	public static String getLastName(String name) {
		int spaceIndex = name.indexOf(" ");
		String lastName = name.substring(spaceIndex + 1);
		return lastName;
	}

	public static int countVowels(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			String letter = name.substring(i, i + 1);
			if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String fullName = "Katherine Johnson";
		System.out.println(NameExperiments.getFirstName(fullName));
		System.out.println(NameExperiments.getLastName(fullName));	
		System.out.println(NameExperiments.countVowels(fullName));
	}


}
