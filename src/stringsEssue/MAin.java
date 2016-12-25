package stringsEssue;

public class MAin {

	public static void main(String[] args) {
		
		String text = "Returning to the same studios in Copenhagen in 1985, MetallicA recorded their third album Master Of Puppets, mixing in LA with Michael Wagner and releasing in early 1986. They quickly secured a tour with Ozzy Osbourne, and that stint (plus a top 30 album chart position) saw their fan base and name take a quantum leap. What had once seemed so unlikely was now closer than ever to coming true: world domination.";

		MyWork mw = new MyWork(text);
		System.out.println(mw.total(text));
		System.out.println(mw.countVowel(text));
		System.out.println(mw.countConsonant(text));
		System.out.println(mw.summing(text));
		System.out.println(mw.AnotherChars(text));;
	}

}
