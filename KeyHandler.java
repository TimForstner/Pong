package pack;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	
	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = false;
			System.out.println("STOP UP");
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = false; 
			System.out.println("STOP DOWN");
		}

	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = true;
			System.out.println("UP");
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = true;
			System.out.println("DOWN");
		}
	}

	
}
