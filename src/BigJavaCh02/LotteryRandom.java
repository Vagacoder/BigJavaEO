
package BigJavaCh02;

import java.util.*;

public class LotteryRandom {

	public int random49() {
		
		int lotteryNumber = new Random().nextInt(49) + 1;
		
		return lotteryNumber;
		
	} 
}
