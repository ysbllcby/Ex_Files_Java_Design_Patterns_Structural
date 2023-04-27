import java.awt.Color;
import java.awt.Graphics;

public class GreenSquare extends Square {

  public void draw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    super.draw(graphics);
  }

}
