package task2;

public class TrafficLightsTest {
    public static void main(String[] args) throws InterruptedException {
        final long worktime = 12000;
        long start = System.currentTimeMillis();
        long testTime = start;
        while (testTime - start < worktime) {
            long currentTime = System.currentTimeMillis();
            for (var trafficColor : TrafficLight.values()) {
                System.out.println(trafficColor);
                long colorCurrentTime = System.currentTimeMillis();
                Thread.sleep(1000);
                do  {
                    colorCurrentTime = System.currentTimeMillis();
                    System.out.print (".");
                    Thread.sleep(1000);
                }while(colorCurrentTime - currentTime < trafficColor.getDuration());
                System.out.println( );
                currentTime = System.currentTimeMillis();
            }

            testTime = System.currentTimeMillis();
        }
//to do Java FX app
    }
}
