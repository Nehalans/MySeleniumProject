package Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class LoopVideoAnimation extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int FRAMES_PER_SECOND = 30;
    private static final int FRAME_DELAY = 1000 / FRAMES_PER_SECOND;
	private static final int NUMBER_OF_FRAMES = 0;

    private BufferedImage[] frames;
    private int currentFrameIndex = 0;

    public LoopVideoAnimation() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Load your images here into the "frames" array
        frames = new BufferedImage[NUMBER_OF_FRAMES];
        // ...

        // Start the animation loop
        startAnimationLoop();
    }

    private void startAnimationLoop() {
        while (true) {
            update();
            render();
            sleep(FRAME_DELAY);
        }
    }

    private void update() {
        // Update the frame index (you can add animation logic here)
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
    }

    private void render() {
        // Draw the current frame to the JFrame
        Graphics g = getGraphics();
        g.drawImage(frames[currentFrameIndex], 0, 0, null);
        g.dispose();
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoopVideoAnimation::new);
    }
}
