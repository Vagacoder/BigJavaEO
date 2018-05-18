package others;

public class Test02 {
	
	public static void main(String[] args) {
	
	double price = 3.99;
	String note = "This is an on-sale item for this week.";
	System.out.println("Price is: ");
	System.out.println(price);
	System.out.println(note);
	
	int length_note = note.length();
	System.out.println(length_note);
	String bigNote = note.toUpperCase();
	System.out.println(bigNote);
	String smallNote = note.toLowerCase();
	System.out.println(smallNote);
	String river = "Mississippi";
	String riverNew = river.replace("s", "5");
	System.out.println(riverNew);
	int r_num = "Miss".length();
	System.out.println(r_num);
	String helloLarge = "hello world".toUpperCase();
	System.out.println(helloLarge);
	System.out.println("Hello, world!".toUpperCase());
	}

}
