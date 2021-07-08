public class Simulation {
    public static void main(String[] args) {
        Dice dice = new Dice(1000000);
        System.out.println(dice.tossAndSum());
    }


}
