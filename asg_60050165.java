import java.awt.*;
import javax.swing.*;

class asg_60050165 extends Assignment3 {
	asg_60050165(Graphics g) {
		// plot(g,Color.BLACK,0,0,600,600);
		skyred_layer1_color1(g);
		skyred_layer2_color2(g);
		skyred_layer3_color2(g);
		skyred_layer4_color3(g);
		skyred_layer5_color3(g);
		skyred_layer6_color4(g);
		skyred_layer7_color4(g);
		skyred_layer8_color5(g);
		skyred_layer9_color5(g);
		skyred_layer10_color6(g);
		skyred_layer11_color6(g);
		skyred_layer12_color7(g);
		skyred_layer13_color7(g);
		skyred_layer14_color8(g);
		skyred_layer15_color8(g);
		skyred_layer16_color9(g);
		skyred_layer17_color9(g);
		skyred_layer18_color10(g);
		skyred_layer19_color10(g);
		skyred_layer20_color11(g);
		skyyellow_layer21_color12(g);
		skyyellow_layer22_color13(g);
		skyyellow_layer23_color13(g);
		skyyellow_layer24_color14(g);
		skyyellow_layer25_color14(g);
		skyyellow_layer26_color15(g);
		skyyellow_layer27_color15(g);
		skyyellow_layer28_color16(g);
		skyyellow_layer29_color16(g);
		skyyellow_layer30_color17(g);
		skyyellow_layer31_color17(g);
		skyyellow_layer32_color18(g);
		skyyellow_layer33_color18(g);
		skyyellow_layer34_color19(g);
		skyyellow_layer35_color19(g);
		skyyellow_layer36_color20(g);
		skyyellow_layer37_color20(g);
		skyyellow_layer38_color21(g);
		skyyellow_layer39_color21(g);
		skyyellow_layer40_color22(g);
		base_layer1_color23_24(g);
		monument(g);
		cloud_color26(g);

	}// consutor

	private void skyred_layer1_color1(Graphics g) { // draw skyred_layer1
		int color = 1;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 0 }, { 60, 0 }, { 0, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 0 }, { 160, 0 }, { 140, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 160, 0 }, { 250, 0 }, { 205, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 0 }, { 310, 0 }, { 240, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 310, 0 }, { 400, 0 }, { 380, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 0 }, { 450, 0 }, { 425, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 0 }, { 530, 0 }, { 510, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 530, 0 }, { 600, 0 }, { 600, 30 } }, set_CG(color));
	}// skyred_layer1_color1

	private void skyred_layer2_color2(Graphics g) { // draw skyred_layer2
		int color = 2;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 30 }, { 140, 30 }, { 60, 0 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 140, 30 }, { 205, 30 }, { 160, 0 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 205, 30 }, { 240, 30 }, { 250, 0 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 240, 30 }, { 380, 30 }, { 310, 0 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 380, 30 }, { 425, 30 }, { 400, 0 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 425, 30 }, { 510, 30 }, { 450, 0 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 510, 30 }, { 600, 30 }, { 528, 0 } }, set_CG(color));
	}// skyred_layer2_color2

	private void skyred_layer3_color2(Graphics g) { // draw skyred_layer3
		int color = 2;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 30 }, { 140, 30 }, { 80, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 140, 30 }, { 205, 30 }, { 205, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 205, 30 }, { 240, 30 }, { 230, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 240, 30 }, { 380, 30 }, { 280, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 380, 30 }, { 425, 30 }, { 420, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 425, 30 }, { 510, 30 }, { 450, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 510, 30 }, { 600, 30 }, { 600, 60 } }, set_CG(color));
	}// skyred_layer3_color2

	private void skyred_layer4_color3(Graphics g) { // draw skyred_layer4
		int color = 3;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 60 }, { 80, 60 }, { 0, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 80, 60 }, { 205, 60 }, { 142, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 205, 60 }, { 230, 60 }, { 205, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 230, 60 }, { 280, 60 }, { 240, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 280, 60 }, { 420, 60 }, { 380, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 420, 60 }, { 450, 60 }, { 425, 30 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 60 }, { 600, 60 }, { 510, 30 } }, set_CG(color));
	}// skyred_layer4_color3

	private void skyred_layer5_color3(Graphics g) { // draw skyred_layer5
		int color = 3;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 60 }, { 80, 60 }, { 50, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 80, 60 }, { 205, 60 }, { 100, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 205, 60 }, { 230, 60 }, { 230, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 230, 60 }, { 280, 60 }, { 280, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 280, 60 }, { 420, 60 }, { 320, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 420, 60 }, { 450, 60 }, { 450, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 60 }, { 600, 60 }, { 530, 90 } }, set_CG(color));
	}// skyred_layer5_color3

	private void skyred_layer6_color4(Graphics g) { // draw skyred_layer6
		int color = 4;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 90 }, { 50, 90 }, { 0, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 50, 90 }, { 100, 90 }, { 80, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 100, 90 }, { 229, 90 }, { 204, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 229, 90 }, { 280, 90 }, { 230, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 280, 90 }, { 320, 90 }, { 280, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 320, 90 }, { 450, 90 }, { 420, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 90 }, { 530, 90 }, { 450, 60 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 530, 90 }, { 600, 90 }, { 600, 60 } }, set_CG(color));
	}// skyred_layer6_color4

	private void skyred_layer7_color4(Graphics g) { // draw skyred_layer7
		int color = 4;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 90 }, { 50, 90 }, { 0, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 50, 90 }, { 100, 90 }, { 50, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 100, 90 }, { 229, 90 }, { 100, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 229, 90 }, { 280, 90 }, { 200, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 280, 90 }, { 320, 90 }, { 300, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 320, 90 }, { 450, 90 }, { 380, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 90 }, { 530, 90 }, { 510, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 530, 90 }, { 600, 90 }, { 550, 120 } }, set_CG(color));
	}// skyred_layer7_color4

	private void skyred_layer8_color5(Graphics g) { // draw skyred_layer8
		int color = 5;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 120 }, { 50, 120 }, { 50, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 50, 120 }, { 100, 120 }, { 100, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 100, 120 }, { 200, 120 }, { 228, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 200, 120 }, { 300, 120 }, { 280, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 300, 120 }, { 380, 120 }, { 320, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 380, 120 }, { 510, 120 }, { 450, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 510, 120 }, { 550, 120 }, { 530, 90 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 120 }, { 600, 120 }, { 600, 90 } }, set_CG(color));
	}// skyred_layer8_color5

	private void skyred_layer9_color5(Graphics g) { // draw skyred_layer9
		int color = 5;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 120 }, { 50, 120 }, { 10, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 50, 120 }, { 100, 120 }, { 40, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 100, 120 }, { 200, 120 }, { 150, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 200, 120 }, { 300, 120 }, { 170, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 300, 120 }, { 380, 120 }, { 360, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 380, 120 }, { 510, 120 }, { 490, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 510, 120 }, { 550, 120 }, { 550, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 120 }, { 600, 120 }, { 580, 150 } }, set_CG(color));
	}// skyred_layer9_color5

	private void skyred_layer10_color6(Graphics g) { // draw skyred_layer10
		int color = 6;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 150 }, { 10, 150 }, { 0, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 10, 150 }, { 40, 150 }, { 50, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 40, 150 }, { 150, 150 }, { 100, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 150 }, { 170, 150 }, { 200, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 170, 150 }, { 360, 150 }, { 300, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 360, 150 }, { 490, 150 }, { 380, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 490, 150 }, { 550, 150 }, { 510, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 150 }, { 580, 150 }, { 550, 120 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 580, 150 }, { 600, 150 }, { 600, 120 } }, set_CG(color));
	}// skyred_layer10_color6

	private void skyred_layer11_color6(Graphics g) { // draw skyred_layer11
		int color = 6;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 150 }, { 10, 150 }, { 0, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 10, 150 }, { 40, 150 }, { 20, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 40, 150 }, { 150, 150 }, { 100, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 150 }, { 170, 150 }, { 120, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 170, 150 }, { 360, 150 }, { 220, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 360, 150 }, { 490, 150 }, { 360, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 490, 150 }, { 550, 150 }, { 540, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 150 }, { 580, 150 }, { 560, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 580, 150 }, { 600, 150 }, { 580, 180 } }, set_CG(color));
	}// skyred_layer11_color6

	private void skyred_layer12_color7(Graphics g) { // draw skyred_layer12
		int color = 7;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 180 }, { 20, 180 }, { 10, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 20, 180 }, { 100, 180 }, { 40, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 100, 180 }, { 120, 180 }, { 150, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 120, 180 }, { 220, 180 }, { 170, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 220, 180 }, { 360, 180 }, { 360, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 360, 180 }, { 540, 180 }, { 490, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 540, 180 }, { 560, 180 }, { 550, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 560, 180 }, { 580, 180 }, { 580, 150 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 580, 180 }, { 600, 180 }, { 600, 150 } }, set_CG(color));
	}// skyred_layer12_color7

	private void skyred_layer13_color7(Graphics g) { // draw skyred_layer13
		int color = 7;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 180 }, { 20, 180 }, { 20, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 20, 180 }, { 100, 180 }, { 80, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 100, 180 }, { 120, 180 }, { 80, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 120, 180 }, { 220, 180 }, { 230, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 220, 180 }, { 360, 180 }, { 290, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 360, 180 }, { 540, 180 }, { 350, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 540, 180 }, { 560, 180 }, { 500, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 560, 180 }, { 580, 180 }, { 500, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 580, 180 }, { 600, 180 }, { 500, 210 } }, set_CG(color));
	}// skyred_layer13_color7

	private void skyred_layer14_color8(Graphics g) { // draw skyred_layer14
		int color = 8;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 210 }, { 20, 210 }, { 0, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 20, 210 }, { 80, 210 }, { 20, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 80, 210 }, { 230, 210 }, { 120, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 230, 210 }, { 290, 210 }, { 220, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 290, 210 }, { 350, 210 }, { 360, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 210 }, { 500, 210 }, { 540, 180 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 210 }, { 600, 210 }, { 600, 180 } }, set_CG(color));
	}// skyred_layer14_color8

	private void skyred_layer15_color8(Graphics g) { // draw skyred_layer15
		int color = 8;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 210 }, { 20, 210 }, { 0, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 20, 210 }, { 80, 210 }, { 50, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 80, 210 }, { 230, 210 }, { 120, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 230, 210 }, { 290, 210 }, { 300, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 290, 210 }, { 350, 210 }, { 320, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 210 }, { 500, 210 }, { 400, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 210 }, { 600, 210 }, { 480, 240 } }, set_CG(color));
	}// skyred_layer15_color8

	private void skyred_layer16_color9(Graphics g) { // draw skyred_layer16
		int color = 9;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 240 }, { 50, 240 }, { 21, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 50, 240 }, { 120, 240 }, { 80, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 120, 240 }, { 300, 240 }, { 230, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 300, 240 }, { 320, 240 }, { 290, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 320, 240 }, { 400, 240 }, { 350, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 240 }, { 480, 240 }, { 500, 210 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 480, 240 }, { 600, 240 }, { 600, 210 } }, set_CG(color));
	}// skyred_layer16_color9

	private void skyred_layer17_color9(Graphics g) { // draw skyred_layer17
		int color = 9;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 240 }, { 50, 240 }, { 40, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 50, 240 }, { 120, 240 }, { 150, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 120, 240 }, { 300, 240 }, { 150, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 300, 240 }, { 320, 240 }, { 350, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 320, 240 }, { 400, 240 }, { 350, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 240 }, { 480, 240 }, { 400, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 480, 240 }, { 600, 240 }, { 600, 270 } }, set_CG(color));
	}// skyred_layer17_color9

	private void skyred_layer18_color10(Graphics g) { // draw skyred_layer18
		int color = 10;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 270 }, { 40, 270 }, { 0, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 40, 270 }, { 150, 270 }, { 50, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 270 }, { 350, 270 }, { 300, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 270 }, { 400, 270 }, { 400, 240 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 270 }, { 600, 270 }, { 480, 240 } }, set_CG(color));
	}// skyred_layer18_color10

	private void skyred_layer19_color10(Graphics g) { // draw skyred_layer19
		int color = 10;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 270 }, { 40, 270 }, { 0, 300 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 40, 270 }, { 150, 270 }, { 50, 300 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 270 }, { 350, 270 }, { 300, 300 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 270 }, { 400, 270 }, { 400, 300 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 270 }, { 600, 270 }, { 480, 300 } }, set_CG(color));
	}// skyred_layer19_color10

	private void skyred_layer20_color11(Graphics g) { // draw skyred_layer20
		int color = 11;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 300 }, { 50, 300 }, { 40, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 50, 300 }, { 300, 300 }, { 150, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 300, 300 }, { 400, 300 }, { 350, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 300 }, { 490, 300 }, { 400, 270 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 484, 300 }, { 600, 300 }, { 600, 270 } }, set_CG(color));
	}// skyred_layer20_color11

	private void skyyellow_layer21_color12(Graphics g) { // draw skyyellow_layer21_color12
		int color = 12;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 300 }, { 50, 300 }, { 40, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 50, 300 }, { 300, 300 }, { 150, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 300, 300 }, { 400, 300 }, { 350, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 300 }, { 490, 300 }, { 400, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 484, 300 }, { 600, 300 }, { 600, 330 } }, set_CG(color));
	}// skyyellow_layer21_color12

	private void skyyellow_layer22_color13(Graphics g) { // draw skyyellow_layer22_color13
		int color = 13;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 330 }, { 40, 330 }, { 0, 300 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 40, 330 }, { 150, 330 }, { 45, 300 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 330 }, { 350, 330 }, { 300, 300 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 330 }, { 400, 330 }, { 400, 300 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 330 }, { 600, 330 }, { 500, 300 } }, set_CG(color));
	}// skyyellow_layer22_color13

	private void skyyellow_layer23_color13(Graphics g) { // draw skyyellow_layer23_color13
		int color = 13;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 330 }, { 40, 330 }, { 30, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 40, 330 }, { 150, 330 }, { 80, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 330 }, { 350, 330 }, { 200, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 330 }, { 400, 330 }, { 350, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 400, 330 }, { 600, 330 }, { 500, 360 } }, set_CG(color));
	}// skyyellow_layer23_color13

	private void skyyellow_layer24_color14(Graphics g) { // draw skyyellow_layer24_color14
		int color = 14;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 360 }, { 30, 360 }, { 0, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 30, 360 }, { 80, 360 }, { 40, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 80, 360 }, { 200, 360 }, { 150, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 200, 360 }, { 350, 360 }, { 350, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 360 }, { 500, 360 }, { 400, 330 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 360 }, { 600, 360 }, { 600, 330 } }, set_CG(color));
	}// skyyellow_layer24_color14

	private void skyyellow_layer25_color14(Graphics g) { // draw skyyellow_layer25_color14
		int color = 14;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 360 }, { 30, 360 }, { 25, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 30, 360 }, { 80, 360 }, { 60, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 80, 360 }, { 200, 360 }, { 250, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 200, 360 }, { 350, 360 }, { 250, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 360 }, { 500, 360 }, { 450, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 360 }, { 600, 360 }, { 500, 390 } }, set_CG(color));
	}// skyyellow_layer25_color14

	private void skyyellow_layer26_color15(Graphics g) { // draw skyyellow_layer26_color15
		int color = 15;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 390 }, { 25, 390 }, { 0, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 25, 390 }, { 60, 390 }, { 30, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 390 }, { 250, 390 }, { 80, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 390 }, { 450, 390 }, { 350, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 390 }, { 500, 390 }, { 500, 360 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 390 }, { 600, 390 }, { 600, 360 } }, set_CG(color));
	}// skyyellow_layer26_color15

	private void skyyellow_layer27_color15(Graphics g) { // draw skyyellow_layer27_color15
		int color = 15;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 390 }, { 25, 390 }, { 15, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 25, 390 }, { 60, 390 }, { 15, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 390 }, { 250, 390 }, { 155, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 390 }, { 450, 390 }, { 350, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 390 }, { 500, 390 }, { 475, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 390 }, { 600, 390 }, { 550, 420 } }, set_CG(color));
	}// skyyellow_layer27_color15

	private void skyyellow_layer28_color16(Graphics g) { // draw skyyellow_layer28_color16
		int color = 16;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 420 }, { 20, 420 }, { 0, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 18, 420 }, { 150, 420 }, { 60, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 420 }, { 350, 420 }, { 250, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 420 }, { 475, 420 }, { 450, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 475, 420 }, { 550, 420 }, { 500, 390 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 420 }, { 600, 420 }, { 600, 390 } }, set_CG(color));
	}// skyyellow_layer28_color16

	private void skyyellow_layer29_color16(Graphics g) { // draw skyyellow_layer29_color16
		int color = 16;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 420 }, { 20, 420 }, { 0, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 18, 420 }, { 150, 420 }, { 60, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 420 }, { 350, 420 }, { 250, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 420 }, { 475, 420 }, { 450, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 475, 420 }, { 550, 420 }, { 500, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 420 }, { 600, 420 }, { 600, 450 } }, set_CG(color));
	}// skyyellow_layer29_color16

	private void skyyellow_layer30_color17(Graphics g) { // draw skyyellow_layer30_color17
		int color = 17;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 450 }, { 60, 450 }, { 20, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 450 }, { 250, 450 }, { 150, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 450 }, { 450, 450 }, { 350, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 450 }, { 500, 450 }, { 475, 420 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 450 }, { 600, 450 }, { 550, 420 } }, set_CG(color));
	}// skyyellow_layer30_color17

	private void skyyellow_layer31_color17(Graphics g) { // draw skyyellow_layer31_color17
		int color = 17;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 450 }, { 60, 450 }, { 20, 480 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 450 }, { 250, 450 }, { 150, 480 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 450 }, { 450, 450 }, { 350, 480 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 450 }, { 500, 450 }, { 475, 480 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 450 }, { 600, 450 }, { 550, 480 } }, set_CG(color));
	}// skyyellow_layer31_color17

	private void skyyellow_layer32_color18(Graphics g) { // draw skyyellow_layer32_color18
		int color = 18;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 480 }, { 20, 480 }, { 0, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 18, 480 }, { 150, 480 }, { 60, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 480 }, { 350, 480 }, { 250, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 480 }, { 475, 480 }, { 450, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 475, 480 }, { 550, 480 }, { 500, 450 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 480 }, { 600, 480 }, { 600, 450 } }, set_CG(color));
	}// skyyellow_layer32_color18

	private void skyyellow_layer33_color18(Graphics g) { // draw skyyellow_layer33_color18
		int color = 18;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 480 }, { 20, 480 }, { 0, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 18, 480 }, { 150, 480 }, { 60, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 480 }, { 350, 480 }, { 250, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 480 }, { 475, 480 }, { 450, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 475, 480 }, { 550, 480 }, { 500, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 480 }, { 600, 480 }, { 600, 510 } }, set_CG(color));
	}// skyyellow_layer33_color18

	private void skyyellow_layer34_color19(Graphics g) { // draw skyyellow_layer34_color19
		int color = 19;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 510 }, { 60, 510 }, { 20, 480 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 510 }, { 250, 510 }, { 150, 480 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 510 }, { 450, 510 }, { 350, 480 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 510 }, { 500, 510 }, { 475, 480 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 510 }, { 600, 510 }, { 550, 480 } }, set_CG(color));
	}// skyyellow_layer34_color19

	private void skyyellow_layer35_color19(Graphics g) { // draw skyyellow_layer35_color19
		int color = 19;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 510 }, { 60, 510 }, { 20, 540 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 510 }, { 250, 510 }, { 150, 540 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 510 }, { 450, 510 }, { 350, 540 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 510 }, { 500, 510 }, { 475, 540 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 510 }, { 600, 510 }, { 550, 540 } }, set_CG(color));
	}// skyyellow_layer35_color19

	private void skyyellow_layer36_color20(Graphics g) { // draw skyyellow_layer36_color20
		int color = 20;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 540 }, { 20, 540 }, { 0, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 18, 540 }, { 150, 540 }, { 60, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 540 }, { 350, 540 }, { 250, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 540 }, { 475, 540 }, { 450, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 475, 540 }, { 550, 540 }, { 500, 510 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 540 }, { 600, 540 }, { 600, 510 } }, set_CG(color));
	}// skyyellow_layer36_color20

	private void skyyellow_layer37_color20(Graphics g) { // draw skyyellow_layer37_color20
		int color = 20;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 540 }, { 20, 540 }, { 0, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 18, 540 }, { 150, 540 }, { 60, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 540 }, { 350, 540 }, { 250, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 540 }, { 475, 540 }, { 450, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 475, 540 }, { 550, 540 }, { 500, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 540 }, { 600, 540 }, { 600, 570 } }, set_CG(color));
	}// skyyellow_layer37_color20

	private void skyyellow_layer38_color21(Graphics g) { // draw skyyellow_layer38_color21
		int color = 21;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 570 }, { 60, 570 }, { 20, 540 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 570 }, { 250, 570 }, { 150, 540 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 570 }, { 450, 570 }, { 350, 540 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 570 }, { 500, 570 }, { 475, 540 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 570 }, { 600, 570 }, { 550, 540 } }, set_CG(color));
	}// skyyellow_layer38_color21

	private void skyyellow_layer39_color21(Graphics g) { // draw skyyellow_layer39_color21
		int color = 21;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 570 }, { 60, 570 }, { 20, 600 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 60, 570 }, { 250, 570 }, { 150, 600 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 250, 570 }, { 450, 570 }, { 350, 600 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 450, 570 }, { 500, 570 }, { 475, 600 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 500, 570 }, { 600, 570 }, { 550, 600 } }, set_CG(color));
	}// skyyellow_layer39_color21

	private void skyyellow_layer40_color22(Graphics g) { // draw skyyellow_layer40_color22
		int color = 22;
		Graphics2D g2 = (Graphics2D) g;
		DrawPoly(g2, new int[][] { { 0, 600 }, { 20, 600 }, { 0, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 18, 600 }, { 150, 600 }, { 60, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 150, 600 }, { 350, 600 }, { 250, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 350, 600 }, { 475, 600 }, { 450, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 475, 600 }, { 550, 600 }, { 500, 570 } }, set_CG(color));
		DrawPoly(g2, new int[][] { { 550, 600 }, { 600, 600 }, { 600, 570 } }, set_CG(color));
	}// skyyellow_layer40_color22

	private void base_layer1_color23_24(Graphics g) { // draw and fillcolor base_layer1
		int color = 23;
		fillcolorX(g, set_CG(color), 200, 510, 400, 510, 600);
		fillcolorX(g, set_CG(24), 200, 510, 400, 510, 520);
	}// base_layer1_color23_24

	private void monument(Graphics g) { // draw monument
		fillcolorX(g, set_CG(0), 340, 120, 350, 120, 508);
		fillcolorX(g, set_CG(0), 250, 220, 340, 120, 508);
		// paint base1
		fillcolorX(g, set_CG(1), 250, 220, 340, 120, 508);
		fillcolorX(g, set_CG(0), 250, 260, 340, 200, 508);
		fillcolorX(g, set_CG(25), 250, 300, 340, 240, 508);
		fillcolorX(g, set_CG(0), 250, 400, 340, 350, 508);
		fillcolorX(g, set_CG(1), 250, 450, 340, 400, 508);
		// paint base2
		fillcolorX(g, set_CG(1), 340, 120, 350, 120, 200);
		fillcolorX(g, set_CG(25), 340, 350, 350, 350, 240);
		fillcolorX(g, set_CG(1), 340, 400, 350, 400, 508);
	}// monument

	private void cloud_color26(Graphics g) { // draw cloud
		int color = 26;
		Graphics2D g2 = (Graphics2D) g;
		// cloud left
		midpointCircle(g, g2, addP(50, 50), 20, set_CG(color));
		midpointCircle(g, g2, addP(80, 30), 20, set_CG(color));
		midpointCircle(g, g2, addP(110, 30), 20, set_CG(color));
		midpointCircle(g, g2, addP(140, 30), 20, set_CG(color));
		midpointCircle(g, g2, addP(170, 50), 20, set_CG(color));
		midpointCircle(g, g2, addP(80, 50), 20, set_CG(color));
		midpointCircle(g, g2, addP(110, 50), 20, set_CG(color));
		midpointCircle(g, g2, addP(140, 50), 20, set_CG(color));
		// cloud right
		midpointCircle(g, g2, addP(550, 50), 20, set_CG(color));
		midpointCircle(g, g2, addP(520, 30), 20, set_CG(color));
		midpointCircle(g, g2, addP(490, 30), 20, set_CG(color));
		midpointCircle(g, g2, addP(460, 30), 20, set_CG(color));
		midpointCircle(g, g2, addP(430, 50), 20, set_CG(color));
		midpointCircle(g, g2, addP(520, 50), 20, set_CG(color));
		midpointCircle(g, g2, addP(490, 50), 20, set_CG(color));
		midpointCircle(g, g2, addP(460, 50), 20, set_CG(color));

	}

}// class