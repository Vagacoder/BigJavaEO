package bigjava;

/*
 * E26.4 Write a web application that allows a user to specify six lottery numbers. 
 * Generate your own combination on the server, and then print out the user’s and 
 * the server’s combinations together with a count of matches.
 * 
 * E26.5 Add error checking to Exercise E26.4. If the lottery numbers are not 
 * within the cor­rect range, or if there are duplicates, show an appropriate 
 * message and allow the user to fix the error.
 * 

 */
import java.util.Random;

public class LotteryBean {

    private final int N = 6;
    private int[] numbers;
    private int[] inputs;

    public LotteryBean(){
        this.numbers = new int[N];
        this.inputs = new int[N];
        reset();
    }
    
    private void reset(){
        Random r = new Random();
        for(int i = 0; i < N; i++){
            this.numbers[i] = r.nextInt(10);
            this.inputs[i] = -1;
        }
    }

    public int getNumber1(){
        return this.inputs[1];
    }

    public int getNumber2(){
        return this.inputs[2];
    }

    public int getNumber3(){
        return this.inputs[3];
    }

    public int getNumber4(){
        return this.inputs[4];
    }

    public int getNumber5(){
        return this.inputs[5];
    }

    public int getNumber6(){
        return this.inputs[6];
    }

    public void setNumber1(int number){
        this.inputs[1] = number;
    }

    public void setNumber2(int number){
        this.inputs[2] = number;
    }

    public void setNumber3(int number){
        this.inputs[3] = number;
    }

    public void setNumber4(int number){
        this.inputs[4] = number;
    }

    public void setNumber5(int number){
        this.inputs[5] = number;
    }

    public void setNumber6(int number){
        this.inputs[6] = number;
    }

    public String checkNumbers(){
        for(int i = 0; i< N; i++){
            if(inputs[i] < 0 || inputs[i] > 9){
                return "error";
            }else {
                return "result";
            }
        }
    }

    public int getLottery1(){
        return this.numbers[1];
    }
    public int getLottery2(){
        return this.numbers[2];
    }
    public int getLottery3(){
        return this.numbers[3];
    }
    public int getLottery4(){
        return this.numbers[4];
    }
    public int getLottery5(){
        return this.numbers[5];
    }
    public int getLottery6(){
        return this.numbers[6];
    }
}