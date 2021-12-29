package zad3;
//2. Interface with abstract methods
//each method describes a service to implemented by subscriber
//Note: all such methods must be void
public interface AlarmListener {
void alarmActionPerformed(AlarmEvent args);
}
