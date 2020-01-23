import java.awt.Color;
import java.awt.Image;

public class Emerald extends Jewel {
	static Image emeraldImage;
	// I found the locations below by a little bit of guess and 
	// check to find a rectangle that bounded the image of the 
	// Emerald.
	static final int EM_X=945, EM_Y=535, EM_W = 120, EM_H=100;
	
	public Emerald(int r, int co) {
		super(Color.GREEN, getImage(), r, co);
	}

	private static Image getImage() {
		if(emeraldImage == null)
			emeraldImage= openImageFromSpriteSheet(EM_X, EM_Y, EM_W, EM_H);
		return emeraldImage;
	}

}
