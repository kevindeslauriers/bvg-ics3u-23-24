package lesson6;

public class BayviewGlenPools {
    public static void main(String[] args) {
        int length = 20;
        int shallowLength = 5;
        int transition = 7;
        int shallowHeight = 3;
        int deepHeight = 8;
        int width = 8;

        int linerCost = 2;

        int shallowSideWallArea = shallowHeight * shallowLength;
        int shallowVolume = shallowSideWallArea * width;

        int transitionHeight = deepHeight - shallowHeight;
        double transitionBaseLength = Math.sqrt(transition * transition - transitionHeight * transitionHeight);
        double transitionSideWallArea = 0.5 * transitionBaseLength * transitionHeight;
        double transitionVolume = (transitionSideWallArea + (shallowHeight * transitionBaseLength)) * width;

        double deepEndSideArea = deepHeight * (length - shallowLength - transitionBaseLength);
        double deepEndVolume = deepEndSideArea * width;

        


    }
}
