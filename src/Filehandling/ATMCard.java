package Filehandling;

import java.io.Serializable;

public class ATMCard implements Serializable {
    private int id;
    private int cvv;
    private transient int pin;
    public ATMCard(int id,int cvv,int pin){
        this.id=id;
        this.cvv=cvv;
        this.pin=pin;
    }
    public String toString(){
        return id+" "+cvv+" "+pin;
    }
}
