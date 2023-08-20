package OOProgramming.Inheritance;

public class UIControl {
    boolean isEnabled = true;

    void enable(){
        isEnabled = true;
    }
    void disable(){
        isEnabled = false;
    }
    void display(){
        System.out.println(isEnabled);
    }
}
