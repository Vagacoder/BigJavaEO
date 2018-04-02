package BigJavaCh05;

public class MeetingR5_12 {
	
	private int start, end, s, e;
	
	public MeetingR5_12(int start, int end) {
		
		this.start = start;
		this.end = end;

	}

	public String checkMeedtings(MeetingR5_12 meet2) {
		
		if (this.start > meet2.start) {s = this.start;}
		else {s = meet2.start;}
		if (this.end < meet2.end) {e = this.end;}
		else {e = meet2.end;}
		if (s < e) {return "Overlapping.";}
		else {return "Not overlapping.";}
	}
}
