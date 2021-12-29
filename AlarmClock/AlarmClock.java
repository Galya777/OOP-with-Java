package zad3;

import java.time.LocalDateTime;

//3. Describes the event source i.e. the callback
public class AlarmClock {
    private AlarmListener alarm; //reference to service provider (the subscriber)
    private int nrings; //number of rings
    private final long INTERVAL=2;
    private long currentTime;
    private long ringAfter;

    public AlarmClock(int nrings,long currentTime, long ringAfter ) {
      setNrings(nrings);
      this.currentTime= currentTime;
        this.ringAfter= ringAfter;
    }

    public int getNrings() {
        return nrings;
    }

    public void setNrings(int nrings) {
        this.nrings = nrings>0?nrings:1;
    }

    public long getRingAfter() {
        return ringAfter;
    }

    public void setRingAfter(long ringAfter) {
        this.ringAfter = ringAfter;
    }

    //used by the subscriber to subscribe for the Alarm event
    public void addAlarmListener(AlarmListener alarm){
        this.alarm=alarm;
    }
    public void onAlarm(AlarmEvent  e)
    {
        if (alarm != null)//Obligatory
        { //Someone subscribed for the Alarm event
            //Invoke  the event handler.
            alarm.alarmActionPerformed(e);
        }
    }
    // event handling method
    public void start() {
        LocalDateTime dt= LocalDateTime.now();
        int newTime;
        int passedSeconds=0;
        var seconds= dt.getSecond();
        System.out.printf("Wait to ring %d%n", ringAfter);
        while(System.currentTimeMillis()-currentTime<ringAfter);
        var number2Ring=nrings;
        for (; ; ) {
            newTime= (int) (LocalDateTime.now().getSecond()/INTERVAL);
            if(newTime>passedSeconds) {


                number2Ring--;
                if (number2Ring < 0) {
                    break;
                } else {
                    AlarmEvent e = new AlarmEvent(number2Ring);
                    onAlarm(e);
                }
            }
            passedSeconds=newTime;
        }
    }

}
