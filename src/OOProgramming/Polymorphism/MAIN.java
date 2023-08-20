package OOProgramming.Polymorphism;

public class MAIN {
    public static void main(String[] args) {
        UIControl[] controls = { new TextBox(), new CheckBox() };
        for(var control : controls ){
            control.render();
        }
    }
}
