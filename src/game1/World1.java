package game1;

import general.ui.Button;
import general.ui.TGDComponent;
import general.utils.FontUtils;
import menus.MainMenu;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import java.util.*;

public class World1 extends BasicGameState {
	
	public static int ID=7;
	public static String name = "Bras de Fer";

    @Override
    public void init(final GameContainer container, final StateBasedGame game) throws SlickException {

    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
    	g.setColor(Color.green);
    	g.fillRect(50, 50, 50, 50);
    }


    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {

    }
    
    public static void reset() {
       
    }

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}


}
