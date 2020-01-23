import java.awt.Color;
import java.awt.Image;

public class Diamond extends Jewel {
	static Image diamondImage;
	// I found the locations below by a little bit of guess and 
	// check to find a rectangle that bounded the image of the 
	// Emerald.
	static final int EM_X=1070, EM_Y=875, EM_W = 120, EM_H=100;
	
	public Diamond(int r, int co) {
		super(Color.WHITE, getImage(), r, co);
	}

	private static Image getImage() {
		if(diamondImage == null)
			diamondImage= openImageFromSpriteSheet(EM_X, EM_Y, EM_W, EM_H);
		return diamondImage;
	}

}
