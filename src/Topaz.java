import java.awt.Color;
import java.awt.Image;

public class Topaz extends Jewel {
	static Image topazImage;
	// I found the locations below by a little bit of guess and 
	// check to find a rectangle that bounded the image of the 
	// Emerald.
	static final int EM_X=810, EM_Y=640, EM_W = 120, EM_H=100;
	
	public Topaz(int r, int co) {
		super(Color.YELLOW, getImage(), r, co);
	}

	private static Image getImage() {
		if(topazImage == null)
			topazImage= openImageFromSpriteSheet(EM_X, EM_Y, EM_W, EM_H);
		return topazImage;
	}

}
