package level.tile;

import  graphics.Screen;
import  graphics.Sprite;

public class NoCollTileV extends Tile {

	public NoCollTileV(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen){	
			//renderize aqui !
		screen.renderTile(x << 4, y << 4, this, 1);		
		
	}

}