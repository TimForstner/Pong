package pack;

import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {
	Timer move;

	public BallKollision() {

		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.bally + 70 >= Var.screenheight) { // kollision oben
					Var.balldiry = -1;
				}
				if (Var.bally <= 10) { 	// 
					Var.balldiry = 1;
				}
				if (Var.ballx + 20 >= Var.screenwidth) {	// Spieler mach einen Punkt

					Var.ballx = Var.screenwidth / 2 - 10;
					Var.bally = Var.screenheight / 2 - 18;

					Var.balldirx = -1;
					Var.playerPoints += 1;
				}
				if (Var.ballx <= 0) {		// Gegner macht einen Punkt

					Var.ballx = Var.screenwidth / 2 - 10;
					Var.bally = Var.screenheight / 2 - 15;

					Var.balldirx = -1;
					Var.gegnerPoints += 1;

				}
				// Ob ball spieler ber¸hrt
				if (Var.ballx < Var.x + 25 && Var.ballx > Var.x && Var.bally -20 <= Var.y + 150 && Var.bally > Var.y) {
					Var.balldirx = 2;
				}
				if (Var.ballx < Var.gegnerx && Var.ballx > Var.gegnerx -20 && Var.bally -20 <= Var.gegnery + 150 && Var.bally > Var.gegnery) {
					Var.balldirx = -2;
				}
				
			}
		}, 0, 4);
	}

}
