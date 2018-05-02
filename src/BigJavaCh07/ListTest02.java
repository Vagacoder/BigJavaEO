package BigJavaCh07;

public class ListTest02 {
	
	public static void main(String[] args) {
		
		int[] prime5 = {2, 3, 5, 7, 11};
		int[] prime = new int[5];
		prime[0]=2;
		prime[1]=3;
		prime[2]=5;
		prime[3]=7;
		prime[4]=11;
		
		for (int i = 0; i <2 ; i++)
		{
			prime5[4-i] = prime5[i];
		}
		
		for (int i = 0; i < 5; i++)
		{
		prime[i]++;
		}
		
		
		System.out.println(prime5);
		
		
		
	}
	
}
