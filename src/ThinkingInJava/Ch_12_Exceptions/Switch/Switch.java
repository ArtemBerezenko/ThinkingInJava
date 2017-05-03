package ThinkingInJava.Ch_12_Exceptions.Switch;

/**
 * Created by Home on 15.02.2017.
 */
public class Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() { state = true;
        System.out.println(this); }
    public void off() {
        state = false;
        System.out.println(this);
    }
    public String toString() { return state ? "on" : "off";}
}
