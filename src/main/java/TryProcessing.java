import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    public static final int WHITE = 255;

    public int x = 0;

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ellipse(0, HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(0, 2 * HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(0, 3 * HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(0, 4 * HEIGHT/5, DIAMETER, DIAMETER);
      }

    @Override
    public void draw() {
        getFrame();
    }

    private void getFrame() {
        x++;
        ellipse(x,HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(2 * x,2 * HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(3 * x,3 * HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(4 * x,4 * HEIGHT/5, DIAMETER, DIAMETER);
        }

}
