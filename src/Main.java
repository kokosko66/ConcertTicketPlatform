import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Concert Tickets");
        MainFrame obj = new MainFrame(f);
        obj.createFrame();
        obj.ticketCounter("Tickets", 50, 50, 150, 150, "+");
    }
}