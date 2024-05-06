/**
 * FrogSimulation
 */
public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int g, int h){
        goalDistance = g;
        maxHops = h;
    }

    public int hopDistance(){
        return (int)(Math.random() *11) - 5;
    }

    public boolean simulate(){
        int dist = 0;

        for (int i = 0; i < maxHops; i++) {
            dist += hopDistance();
            if (dist < 0)
                return false;
            else if (dist >= goalDistance)
                return true;
        }

        return false;
    }

    public double runSimulations(int num){
        int numWins = 0;

        for (int i = 0; i < num; i++) {
            if (simulate())
                numWins++;
        }

        return (double) numWins / num;
    }
    
}