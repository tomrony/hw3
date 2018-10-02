package hw3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class frame extends JFrame implements ActionListener {
		Color color = Color.RED;
		JButton R;
		JButton G;
		JButton B;
		Container container;	

		public frame() {
			container = getContentPane();
			setTitle("Change Circle Color");
			setLayout(new FlowLayout());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			R = new JButton("Red");
			G = new JButton("Green");
			B = new JButton("Blue");
			this.add(R);
			this.add(G);
			this.add(B);
			R.addActionListener(this);
			G.addActionListener(this);
			B.addActionListener(this);
			setSize(1000, 1000);
			setVisible(true);
		}
		public void paint(Graphics p) {
			super.paint(p);
			paintIcon(p);
		}
		public void paintIcon(Graphics g) {
			g.setColor(color);
			g.fillOval(300, 300, 400, 400);
		}
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == R) {
				color = Color.RED;
			} else if (e.getSource() == G) {
				color = Color.GREEN;
			} else if (e.getSource() == B) {
				color = Color.BLUE;
			}
			repaint();
		}

		public static void main(String[] args) {
			new frame();

		}

		

}
