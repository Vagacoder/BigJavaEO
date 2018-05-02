package BigJavaCh04;

public class E4_17miliTime {
	
	private int time;
		
	public E4_17miliTime(int milTime) {
		
		time = milTime%100 + milTime/100*60;
		
		}
	
	public int readTime() {
		
		return time;
	}

}
