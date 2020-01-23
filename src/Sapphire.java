import java.awt.Color;
import java.awt.Image;

public class Sapphire extends Jewel {
	static Image sapphireImage;
	// I found the locations below by a little bit of guess and 
	// check to find a rectangle that bounded the image of the 
	// Emerald.
	static final int EM_X=680, EM_Y=300, EM_W = 120, EM_H=100;
	
	public Sapphire(int r, int co) {
		super(Color.BLUE, getImage(), r, co);
	}

	private static Image getImage() {
		if(sapphireImage == null)
			sapphireImage= openImageFromSpriteSheet(EM_X, EM_Y, EM_W, EM_H);
		return sapphireImage;
	}

}
