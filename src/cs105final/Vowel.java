package cs105final;

public class Vowel {

	public int[] VowelCount(String phase, String... vowels) {

		int[] count = new int[vowels.length];

		for (int i = 0; i < vowels.length; i++) {

			String vowel = vowels[i];

			for (int j = 0; j < phase.length(); j++) {
				String ch = String.valueOf(phase.charAt(j));

				if (vowel.equals(ch)) {
					count[i]++;
				}
			}
		}
		return count;
	}

}
