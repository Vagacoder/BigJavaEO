package ch25;

import java.util.ArrayList;
import java.util.List;

/*
 * For E25.1, E25.2 
 */
public class Purse {
    
    private ArrayList<Coin> purse;

    public Purse(){
        this.purse = new ArrayList<>();
    }

    public void addCoint(Coin newCoin){
        this.purse.add(newCoin);
    }

    public List<Coin> showPurse(){
        return this.purse;
    }

}