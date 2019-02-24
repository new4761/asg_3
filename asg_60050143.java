import java.awt.*;
import javax.swing.*;
import java.util.Random;

class asg_60050143 extends asg_3 {

	asg_60050143(Graphics g) {

		drawMeteor(g);

	}

	public void drawMeteor(Graphics g) {
		int x = 0, y = 0;
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(150, 86, 36));
		g2.translate(circleMove, circleMove);
		// g2.rotate(10, x, y);
		g2.fillOval(x, y, 110, 80);

	}

}