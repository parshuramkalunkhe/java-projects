package basics;

public class UnicodeSystem {
	public void unicodeSystem() {
		System.out.println("Unicode is a universal international standard character encoding that is capable of representing most of the world's written languages.");
		System.out.println();
		System.out.println("Why java uses Unicode System?");
		System.out.println("Before Unicode, there were many language standards:");
		System.out.println("\t ASCII (American Standard Code for Information Interchange) for the United States.");
		System.out.println("\t ISO 8859-1 for Western European Language.");
		System.out.println("\t KOI-8 for Russian.");
		System.out.println("\t GB18030 and BIG-5 for chinese, and so on.");
		System.out.println();
		System.out.println("This caused two problems :");
		System.out.println(" 1. A particular code value corresponds to different letters in the various language standards.");
		System.out.println(" 2. The encodings for languages with large character sets have variable length.Some common characters are encoded as single bytes, other require two or more byte.");
		System.out.println("Solution : ");
		System.out.println(" 1. To solve these problems, a new language standard was developed i.e. Unicode System.");
		System.out.println(" 2. In unicode, character holds 2 byte, so java also uses 2 byte for characters.");
		System.out.println(" 3. lowest value:\\u0000 , highest value:\\uFFFF");
	}
}
