import java.awt.Graphics;
import java.awt.Point;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class TankMine extends Mine {
	
	private final int DISAPPEAR_TIME = 5000;
	private static final int MINE_WIDTH = 20, MINE_HEIGHT = 20;
	
	public TankMine(GamePlay game, Point coordinates){
		super(game, coordinates);
		setTimer(DISAPPEAR_TIME);
		game.add(explode());
	}

	@Override
	public void drawMine(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(getImage(), mine_coordinates.x, mine_coordinates.y, MINE_WIDTH, MINE_HEIGHT, gameplay);
		
	}

	@Override
	public JLabel explode() {
		// TODO Auto-generated method stub
		ImageIcon icon = new ImageIcon(("gif_image.gif"));
		JLabel jlabel = new JLabel(icon);
		return jlabel;
		
	}
	public static int getWidth(){
		return MINE_WIDTH;
	}
	
	public static int getHeight(){
		return MINE_HEIGHT;
	}
	

}
