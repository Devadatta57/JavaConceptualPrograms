package Serialisation;

import java.io.Serializable;

public class Atmcard implements Serializable {
    private int cardno;
    private int cvv;
    private transient int pin;
    public Atmcard(int cardno,int cvv,int pin){
        this.cardno=cardno;
        this.cvv=cvv;
        this.pin=pin;
    }
    public String toString(){
        return cardno+" "+cvv+" "+pin;
    }

}
