import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class BallMover extends JFrame implements Runnable {
    private JLabel ballLabel;
    private Thread ballThread;
    private int x = 200;
    private int y = 0;
    private int xDirection = 10;
    private int yDirection = 10;

    public BallMover() {
        ballLabel = new JLabel();
        this.setTitle("Ball Mover");
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ballLabel.setBounds(x, y, 50, 50);
        ballLabel.setIcon(new ImageIcon("ball.png"));
        this.add(ballLabel);
        ballThread = new Thread(this);
        ballThread.start();
    }

    
    public void run() {
        while (true) {
            x += xDirection;
            y += yDirection;
            ballLabel.setBounds(x, y, 50, 50);
            if (x <= 0 || x >= this.getWidth() - ballLabel.getWidth()) {
                xDirection *= -1;
            }
            if (y <= 0 || y >= this.getHeight() - ballLabel.getHeight()) {
                yDirection *= -1;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BallMover ballMover = new BallMover();
    }
}