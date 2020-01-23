import java.awt.*;
//import java.awt.Graphics;
import java.awt.event.*;
//import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BejeweledGame {

	private JFrame frame = new JFrame("Bejeweled");
	private JPanel panel;
	private final Dimension DIM = new Dimension(800,600);
	private BejeweledGrid grid = new BejeweledGrid();
	
	public static void main(String[] args) {
		new BejeweledGame().start();
	}

	private void start() {
		panel = new JPanel() {
			@Override 
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				grid.draw(g);
			}
		};
		panel.setBackground(Color.BLACK);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				clickedAt(me);
			}
		});
		panel.setPreferredSize(DIM);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	protected void clickedAt(MouseEvent me) {
		System.out.println("You just clicked "+me);	
		grid.justClicked(me);
		panel.repaint();
	}

}
