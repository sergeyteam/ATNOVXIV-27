package stringsEssue;

public class MyWork {
	
	private String str;
	int sum;
	
	public MyWork(String str){
		this.str = str;
	}
	
	public int total(String str) {
		return str.length();
	}
	
	public int countVowel(String str) {
		int howVOWEL = 0;
		char[]vowel = {'A','a','E','e','I','i','O','o','U','u','Y','y'};
		for (int i = 0; i < str.length(); i++) {
			for (int j : vowel) {
				if (str.charAt(i)==j) {
					howVOWEL++;
				}
			}
		}
		return howVOWEL;
	}
	
	public int countConsonant(String str){
		int howCONSONANT = 0;
		char[] consonant = {'B','b','C','c','D','d','F','f','G','g','H','h','J','j','K','k','L','l','M','m','N','n','P','p','Q','q','R','r','S','s','T','t','V','v','W','w','X','x','Z','z',};
		for (int i = 0; i < str.length(); i++) {
			for (int j : consonant) {
				if (str.charAt(i)==j) {
					howCONSONANT++;
				}
			}
		}
		return howCONSONANT ;
	}
	
	public int summing(String str) {
		sum = countVowel(str) + countConsonant(str);
		return sum;
	}
	
	public int AnotherChars(String str) {
		sum = total(str) - summing(str);
		return sum;
	}
	
	
}
