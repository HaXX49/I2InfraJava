package vue.ihm;

import javax.swing.JPanel;

public class AuthenticationPanel extends JPanel {

    /**
     * Class constant
     */
    public static final int DEFAULT_WIDTH = 700;
    public static final int DEFAULT_HEIGHT = 500;

    private int width;
    private int height;

    /**
     * Constructor
     * @param width
     * @param height
     */
    public AuthenticationPanel(int width, int height) {
        this.width = width;
        this.height = height;
    }
}