import javax.swing.*;
public class MainFrame implements createTicketCounter {

    JFrame mainFrame;

    public MainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void createFrame() {
        this.mainFrame.setSize(800, 800);
        this.mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.mainFrame.setVisible(true);
    }

    @Override
    public void ticketCounter(String buttonTitle, int x, int y, int xPos, int yPos, String text) {

        JPanel panel = new JPanel();

        JButton button = new JButton();
        button.setName(buttonTitle);
        button.setText(text);
        button.setBounds(xPos, yPos, x, y);

        panel.add(button);
        this.mainFrame.add(panel);
    }
}
