import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.*;

class asg_3 extends JPanel {
    public static void main(String[] args) {
        asg_3 m = new asg_3();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("ASG_3");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        // DrawPoly(g2, new int[][] { { 30, 30 }, { 213, 572 }, { 132, 312 } },
        // Color.black); draw poly
        // midpointCircle(g, g2, addP(200, 200), 30, Color.black);
        asg_60050165 j = new asg_60050165(g); // Draw Work From 600165
        //asg_60050143 n = new asg_60050143(g); // Draw Work From 600143

    }

    public Color set_CG(int num) { // setColorGroup
        Color num_Color;
        switch (num) {
        case 1:
            num_Color = (new Color(252, 23, 2)); // color 1 skyred 1
            break;
        case 2:
            num_Color = (new Color(252, 44, 25));// color 2 skyred 2
            break;
        case 3:
            num_Color = (new Color(252, 60, 42));// color 3 skyred 3
            break;
        case 4:
            num_Color = (new Color(252, 78, 63));// color 4 skyred 4
            break;
        case 5:
            num_Color = (new Color(252, 90, 75));// color 5 skyred 5
            break;
        case 6:
            num_Color = (new Color(252, 104, 90));// color 6 skyred 6
            break;
        case 7:
            num_Color = (new Color(252, 115, 103));// color 7 skyred 7
            break;
        case 8:
            num_Color = (new Color(252, 127, 116));// color 8 skyred 8
            break;
        case 9:
            num_Color = (new Color(252, 141, 131));// color 9 skyred 9
            break;
        case 10:
            num_Color = (new Color(252, 164, 156));// color 10 skyred 10
            break;
        case 11:
            num_Color = (new Color(252, 187, 181));// color 11 skyred 11
            break;
        case 12:
            num_Color = (new Color(249, 241, 214));// color 12 skyyellow 12
            break;
        case 13:
            num_Color = (new Color(249, 238, 202));// color 13 skyyellow 13
            break;
		case 14:
            num_Color = (new Color(249, 234, 182));// color 14 skyyellow 14
            break;
		case 15:
            num_Color = (new Color(249, 229, 162));// color 15 skyyellow 15
            break;
		case 16:
            num_Color = (new Color(249, 225, 147));// color 16 skyyellow 16
            break;
		case 17:
            num_Color = (new Color(249, 222, 132));// color 17 skyyellow 17
            break;
		case 18:
            num_Color = (new Color(249, 218, 117));// color 18 skyyellow 18
            break;
		case 19:
            num_Color = (new Color(249, 213, 94));// color 19 skyyellow 19
            break;
		case 20:
            num_Color = (new Color(249, 207, 69));// color 20 skyyellow 20
            break;
		case 21:
            num_Color = (new Color(249, 202, 47));// color 21 skyyellow 21
            break;
		case 22:
            num_Color = (new Color(249, 195, 17));// color 22 skyyellow 22
            break;
        default:
            num_Color = (new Color(255, 255, 255)); // white color
        }

        return num_Color;
    }

    // draw dot
    public void plot(Graphics g, Color c, int x, int y) {
        g.setColor(c);
        g.fillRect(x, y, 1, 1);

    }

    // draw dot with size
    public void plot(Graphics g, Color c, int x, int y, int sizeX, int sizeY) {
        g.setColor(c);
        g.fillRect(x, y, sizeX, sizeY);

    }

    public Point addP(int x, int y) {
        return new Point(x, y);
    }

    public void DrawPoly(Graphics2D g2, int[][] p, Color color) {

        Polygon poly = new Polygon();

        for (int[] i : p) {
            poly.addPoint(i[0], i[1]);
        }
        g2.setColor(color);
        g2.drawPolygon(poly);
        g2.fillPolygon(poly);
    }

    public void midpointCircle(Graphics g, Graphics2D g2, Point M, int r, Color color) {
        int x = 0;
        int y = r;
        int Dx = 2 * x, Dy = 2 * y, D = 1 - r;
        g2.setStroke(new BasicStroke(10));
        while (x <= y) {
            //
            //
            plot(g, color, M.x + x, M.y + y);
            plot(g, color, M.x + x, M.y - y);
            plot(g, color, M.x - x, M.y + y);
            plot(g, color, M.x - x, M.y - y);

            plot(g, color, M.x + y, M.y + x);
            plot(g, color, M.x + y, M.y - x);
            plot(g, color, M.x - y, M.y + x);
            plot(g, color, M.x - y, M.y - x);

            g2.setColor(color);
            g2.setStroke(new BasicStroke(10));
            g2.drawLine(M.x, M.y, M.x + x, M.y + y);
            g2.drawLine(M.x, M.y, M.x - x, M.y + y);
            g2.drawLine(M.x, M.y, M.x + x, M.y - y);
            g2.drawLine(M.x, M.y, M.x - x, M.y - y);

            g2.drawLine(M.x, M.y, M.x + y, M.y + x);
            g2.drawLine(M.x, M.y, M.x + y, M.y - x);
            g2.drawLine(M.x, M.y, M.x - y, M.y + x);
            g2.drawLine(M.x, M.y, M.x - y, M.y - x);

            x++;
            Dx += 2;
            D += Dx + 1;

            if (D >= 0) {
                y--;
                Dy -= 2;
                D -= Dy;
            }
        }
    }

}
