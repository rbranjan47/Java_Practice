package extraConcept;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class colorClass extends JFrame {
	// constructor
	colorClass() {
		super("color");

		// color class
		Color c = Color.yellow;

		// panel creation
		JPanel p = new JPanel();
		p.setBackground(c);

		setSize(200, 200);
		add(p);
		show();
	}

	public static void main(String[] args) {
		colorClass c = new colorClass();
	}
}
