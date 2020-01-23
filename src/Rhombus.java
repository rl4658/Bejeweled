import java.awt.Color;
import java.awt.Image;

public class Rhombus extends Jewel {
	static Image rhombusImage;
	// I found the locations below by a little bit of guess and 
	// check to find a rectangle that bounded the image of the 
	// Emerald.
	static final int EM_X=685, EM_Y=425, EM_W = 120, EM_H=100;
	
	public Rhombus(int r, int co) {
		super(Color.ORANGE, getImage(), r, co);
	}

	private static Image getImage() {
		if(rhombusImage == null)
			rhombusImage= openImageFromSpriteSheet(EM_X, EM_Y, EM_W, EM_H);
		return rhombusImage;
	}

}
