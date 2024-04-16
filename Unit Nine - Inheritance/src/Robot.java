public class Robot extends Steve{

    private int servoCount;

    public Robot(int x){
        System.out.println("You are a bot!");
    }

    public int getServoCount(){
        return servoCount;
    }

    public void setServoCount(int in){
        servoCount = in;
    }

}