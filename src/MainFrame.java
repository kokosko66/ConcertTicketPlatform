import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

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
    public void counter(int x, int y, int xPos, int yPos, String text, int x1, int y1, int xPos1, int yPos1, String text1) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel label;
        final int[] ticketsCount = {0};

        label = new JLabel(String.valueOf(ticketsCount[0]));

        JButton add = new JButton(text);
        JButton subtract = new JButton(text1);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticketsCount[0]++;
                label.setText(String.valueOf(ticketsCount[0]));
            }
        });

        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticketsCount[0]--;
                if (ticketsCount[0] < 0) {
                    System.out.println("This value cannot be negative");
                } else {
                    label.setText(String.valueOf(ticketsCount[0]));
                }
            }
        });

        panel.add(add);
        panel.add(subtract);
        panel.add(label);
        this.mainFrame.add(panel, BorderLayout.NORTH);
    }

    @Override
    public void purchase(int x, int y, int xPos, int yPos, String text) {
        JPanel purchasePanel = new JPanel();
        purchasePanel.setBounds(xPos, yPos, x ,y);

        JButton purchaseButton  = new JButton();
        purchaseButton.setText(text);
        purchaseButton.setSize(50, 50);

        purchasePanel.add(purchaseButton);
        this.mainFrame.add(purchasePanel);
    }

    @Override
    public void tickets() {
        try {
            ImageIcon ticketsImages = new ImageIcon(Objects.requireNonNull(resizeImage("/Users/rosenraikov/Documents/dev/zadachi daskalo/regex/src/download.jpeg", 450, 200)));
            JLabel ticketsLabel = new JLabel(ticketsImages);

            ticketsLabel.setBounds(400, 500, 250, 250);


            this.mainFrame.add(ticketsLabel);
        }catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    private Image resizeImage(String imagePath, int width, int height) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(imagePath));

            return originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            e.fillInStackTrace();
            return null;
        }
    }
}
