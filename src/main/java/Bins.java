import java.util.HashMap;
import java.util.Map;



public class Bins {
    private int startingSumDice;
    private int endingSumDice;
    private Map<Integer, Integer> frequencies;

    public Bins(int startingSumDice, int endingSumDice){
        this.startingSumDice = startingSumDice;
        this.endingSumDice = endingSumDice;
        this.frequencies = new HashMap<Integer, Integer>();
    }

    public void fillBins(Dice dice, int numOfRolls){
        for(int y = 0; y < numOfRolls; y++){
            Integer net = dice.tossAndSum();
            if(frequencies.containsKey(net)){
                Integer value = frequencies.get(net);
                value++;
                frequencies.put(net, value);
            }
            frequencies.put(net, 1);
        }
    }

    public Integer getBin(int binNum){
        Integer binCont = null;
        for(Map.Entry<Integer, Integer> entry : frequencies.entrySet()){
            if(frequencies.containsKey(binNum)){
                binCont = frequencies.get(binNum);
            }
            System.out.println("Bins don't contain that number.");
        }
        return binCont;
    }

}
