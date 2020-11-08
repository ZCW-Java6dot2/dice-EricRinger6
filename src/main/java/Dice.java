import java.util.ArrayList;


public class Dice {

    private int numOfDice;

    public Dice(int numberOfDice){
        this.numOfDice = numberOfDice;
    }
    public Integer tossAndSum() {
        int sum = 0;
        for(int i = 0; i < numOfDice; i++){
            sum += (int)(Math.random() * 6) + 1;
        }
        return sum;
    }

    public ArrayList<Integer> getDiceValue(){
        ArrayList<Integer> diceValues = new ArrayList<Integer>();
        for(int x = 0; x < numOfDice; x++){
            int values = (int)(Math.random() * 6) + 1;
            diceValues.add(values);
        }
        return diceValues;
    }

    public int getNumOfDice(){
        return this.numOfDice;
    }

    public void setNumOfDice(int numOfDice){
        this.numOfDice = numOfDice;
    }
}
