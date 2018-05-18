package ch05;

public class R5_12 {

	public static void main(String[] args) {
		
		MeetingR5_12 meet1 = new MeetingR5_12(900, 1500);
		MeetingR5_12 meet2 = new MeetingR5_12(1100, 2200);
		
		System.out.println(meet1.checkMeedtings(meet2));

	}

}
