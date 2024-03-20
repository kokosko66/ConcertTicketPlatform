import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Concert Tickets");
        MainFrame obj = new MainFrame(f);
        obj.createFrame();
        obj.counter(50, 50, 150, 150, "+", 50, 50, 300, 300, "-");
        obj.purchase(100, 100, 0, 600, "Purchase");
        obj.tickets();
    }
}