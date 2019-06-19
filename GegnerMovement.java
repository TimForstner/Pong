package pack;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {
	Timer move;

	public GegnerMovement() {
		System.out.println("Gegner start");
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if (Var.ballx >= Var.screenwidth - 520) {		// Gegner bewegt sich wenn der Ball von seiner H‰lfte 520px entfernt ist
				
					if (Var.bally == Var.gegnery) {
						
					} else if (Var.bally > Var.gegnery + 75) {

						if (Var.gegnery <= Var.screenheight - 200) { 
							Var.gegnery += 2;
//							Gegner DOWN
						}
					} else if (Var.gegnery < Var.gegnery + 75) {

						if (Var.gegnery >= 20) {
							Var.gegnery -= 2;
//							Gegner UP
							
						}
					}
				}
			}

		}, 0, 5);
	}

}
