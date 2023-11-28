public class clearscreen {
    public static void main(String[] args) throws InterruptedException {
        clearScreen();
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            Thread.sleep(500);
            clearScreen();
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
}
