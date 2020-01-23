import java.awt.Color;
import java.awt.Image;

public class Ruby extends Jewel {
	static Image rubyImage;
	// I found the locations below by a little bit of guess and 
	// check to find a rectangle that bounded the image of the 
	// Emerald.
	static final int EM_X=690, EM_Y=190, EM_W = 120, EM_H=100;
	
	public Ruby(int r, int co) {
		super(Color.RED, getImage(), r, co);
	}

	private static Image getImage() {
		if(rubyImage == null)
			rubyImage= openImageFromSpriteSheet(EM_X, EM_Y, EM_W, EM_H);
		return rubyImage;
	}

}