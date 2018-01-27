package game2;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Cloud {
	private int posx;
	private int posy;

	private Image cloud;
	private String urlCloud = "images/TetrisPolyBridge/cloud.png";
	
	public Cloud() throws SlickException{
    	cloud = new Image(urlCloud);
    	
    	posx = 0;
    	posy = 100;
	}
	
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		posx += 1;
	}
	
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		g.drawImage(cloud,(float) posx,(float) posy);
	}
}
