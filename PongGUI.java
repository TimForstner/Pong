package pack;

import javax.swing.JFrame;

public class PongGUI {

	public PongGUI() {
		
		System.out.println("PongGUI starting");
		Var.frame = new JFrame();
		Var.frame.setSize(Var.screenwidth, Var.screenheight);
		Var.frame.setTitle("Pong");
		Var.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.frame.setLayout(null);
		Var.frame.setResizable(false);
		Var.frame.setLocationRelativeTo(null);
		Var.frame.addKeyListener(new KeyHandler());
		Var.frame.requestFocus();
		
		
		Draw label = new Draw();
		label.setVisible(true);
		label.setBounds(0, 0, Var.screenwidth, Var.screenheight);
		Var.frame.add(label);
		
		Var.frame.setVisible(true);
		
		
		
	}

}
