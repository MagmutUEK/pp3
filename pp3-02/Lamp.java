public class Lamp
{
    boolean isOn;
    
    void flipTheSwitch(){
        isOn = !isOn;
    }
    
    void status(){
        System.out.println("Lamp turned on: " + isOn);
    }
}
