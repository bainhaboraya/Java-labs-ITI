import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class MarqueeApp extends JFrame implements Runnable {
    private Thread th;
    private JLabel marqueeLabel;

    public MarqueeApp() {
        this.setTitle("Marquee Application");
        marqueeLabel = new JLabel();
        marqueeLabel.setHorizontalAlignment(JLabel.CENTER);
        marqueeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        this.add(marqueeLabel, BorderLayout.CENTER);
        th = new Thread(this);
        th.start();
    }

    public static void main(String[] args) {
        MarqueeApp app = new MarqueeApp();
        app.setBounds(50, 50, 600, 80);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void run() {
        String marqueeText = "HIIIIIIIIIIIIIII i'm bainh.";
        int x = getWidth();
        while (true) {
            marqueeLabel.setText(marqueeText);
            marqueeLabel.setLocation(x, 0);
            x--;

            if (x + marqueeLabel.getWidth() <= 0) {
                x = getWidth();
            }

            try {
                Thread.sleep(4); // Adjust the delay to control the scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
