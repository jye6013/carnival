package whackAMoleKevinSteph;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

import foodJoannaAnnie.AnnieInstructionInterface;
import guiTeacher.GUIApplication;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import mainMenuAreejVickie.GuiLoadingVickie;

public class KevinStephInstructions implements AnnieInstructionInterface {

	@Override
	public Color getBackgroundColor() {
		return new Color(255, 255, 200);
	}

	@Override
	public String getGameName() {
		return "Whack-A-Mole";
	}

	@Override
	public Color getButtonColor() {
		return new Color(255, 211, 0);
	}

	@Override
	public String getInstructions() {
		String s = "WHACK AS MANY MOLES AS YOU CAN UNDER THE TIME LIMIT."
				+ "THERE ARE 3 DIFFICULTIES: EASY, CASUAL, AND DIFFICULT. "
				+ "THE HARDER THE DIFFICULTY, THE MORE TICKETS YOU EARN."
				+ "EASY STARTS OFF WITH 20 SECONDS WHILE THE OTHER DIFFICULTIES HAVE 5 SECONDS LESS THAN THE LAST"
				+ " AND THE MOLES WILL MOVE FASTER. CLICKING ON THE WRONG HOLE WILL ALSO RESULT IN A 1 SECOND PENALTY."  
				+ "\n" + "NOW GO WHACK SOME MOLES AND ENJOY THE GAME!!";
		return s;
	}

	@Override
	public boolean hasBackImage() {
		return false;
	}

	@Override
	public String getBackImageLocation() {
		return null;
	}

	@Override
	public int getNumButtons() {
		return 3;
	}

	@Override
	public Button getButton(int i) {
		Button button = null;
		if (i == 1) {
			button = new Button(1000,40,180,60,"EASY",Color.GREEN, new Action() {

				public void act() {
					JFrame mainPane = GUIApplication.mainFrame;
					GuiLoadingVickie.loading.setScreen(new WAMEasyKevin(GuiLoadingVickie.loading.getWidth(), GuiLoadingVickie.loading.getHeight()));
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					Image image = toolkit.getImage("wam/mallet.png");
					Cursor c = toolkit.createCustomCursor(image , new Point(mainPane.getX(), 
					           mainPane.getY()), "img");	
					mainPane.setCursor (c);
					GUIApplication.enableCursorChange = false;
				}
				
			});
		}
		else if (i ==2) {
			button = new Button(1000,120,180,60,"CASUAL",Color.ORANGE, new Action() {

				public void act() {
					JFrame mainPane = GUIApplication.mainFrame;
					GuiLoadingVickie.loading.setScreen(new WAMCasualKevin(GuiLoadingVickie.loading.getWidth(), GuiLoadingVickie.loading.getHeight()));
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					Image image = toolkit.getImage("wam/mallet.png");
					Cursor c = toolkit.createCustomCursor(image , new Point(mainPane.getX(), 
					           mainPane.getY()), "img");	
					mainPane.setCursor (c);
					GUIApplication.enableCursorChange = false;
				}
				
			});
			
		}
		else if (i ==3) {
			button = new Button(1000,200,180,60,"DIFFICULT",Color.RED, new Action() {

				public void act() {
					JFrame mainPane = GUIApplication.mainFrame;
					GuiLoadingVickie.loading.setScreen(new WAMHardKevin(GuiLoadingVickie.loading.getWidth(), GuiLoadingVickie.loading.getHeight()));
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					Image image = toolkit.getImage("wam/mallet.png");
					Cursor c = toolkit.createCustomCursor(image , new Point(mainPane.getX(), 
					           mainPane.getY()), "img");	
					mainPane.setCursor (c);
					GUIApplication.enableCursorChange = false;
				}
			});
		}
		return button;
	}

	@Override
	public void playButtonAct() {
		
	}

	@Override
	public Color getTitleColor() {
		return new Color(255, 211, 0);
	}

}
