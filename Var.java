package pack;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

public class Var {
	
	static JFrame frame;
	static int screenwidth = 800;
	static int screenheight = 600;
	
	static int x = 20;
	static int y = 185;
	static int gegnerx = 755;
	static int gegnery = 185;
	static int ballx = 200;
	static int bally = 245;
	
	static boolean moveup = false;
	static boolean movedown = false;
	
	static int balldirx = -1;
	static int balldiry = 1;
	
	static int playerPoints = 0;
	static int gegnerPoints = 0;
	
	static Font pixelfont;
	
	public Var() {
		
		try {
			pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("Coder's Crux.ttf")).deriveFont(125f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Coder's Crux.ttf")));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
