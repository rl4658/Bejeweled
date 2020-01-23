import java.awt.Color;
import java.awt.Image;

public class Amethyst extends Jewel {
	static Image amethystImage;
	// I found the locations below by a little bit of guess and 
	// check to find a rectangle that bounded the image of the 
	// Emerald.
	static final int EM_X=820, EM_Y=190, EM_W = 120, EM_H=100;
	
	public Amethyst(int r, int co) {
		super(Color.MAGENTA, getImage(), r, co);
	}

	private static Image getImage() {
		if(amethystImage == null)
			amethystImage= openImageFromSpriteSheet(EM_X, EM_Y, EM_W, EM_H);
		return amethystImage;
	}

}
