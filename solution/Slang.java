class Slang {

	public String consonant = "bcdfghjklmpqrstvwxz";

	public Slang() {
		
	}

	public String convert(String text) {
		String result = "";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 5) {
				char[] letters = words[i].toCharArray();
				int center = Math.round(letters.length / 2);
				result += words[i].substring(center, words[i].length());
				result += words[i].substring(0, center);
			} else {
				result += words[i];
			}
			if (i + 1 < words.length) {
				result += " ";
			}
		}
		return result;
	}
	
	public static String convertJoin(String entree) {
		String[] parts = entree.split(" ");
		for (int i = 0; i < parts.length; i++){
			if (parts[i].length() >= 6){
				String first = parts[i].substring(0, parts[i].length() / 2);  
				String second = parts[i].substring(parts[i].length() / 2);
				parts[i] = second + first;
			}

		}
		return String.join(" ", parts);
	}

	public String convertHard(String text) {
		String result = "";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 5) {
				char[] letters = words[i].toCharArray();
				int consonantPosition = -1;
				int center = Math.round(letters.length / 2);
				int left = center;
				int right = center;
				for (int j = 0; left > 0 && right < letters.length && consonantPosition == -1; j++) {
					if (consonant.indexOf(letters[left]) != -1) {
						consonantPosition = left;
					} else if (consonant.indexOf(letters[right]) != -1) {
						consonantPosition = right;
					}
					left -= j;
					right += j;
				}
				if (consonantPosition != -1) {
					result += words[i].substring(consonantPosition, words[i].length());
					result += words[i].substring(0, consonantPosition);
				} else {
					result += words[i];
				}
			} else {
				result += words[i];
			}
			if (i + 1 < words.length) {
				result += " ";
			}
		}
		return result;
	}
}
