import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BejeweledGrid {
	/**
	 * The 2D array of jewels
	 */
	private Jewel[][] jewels;
	/** Offsets for drawing the grid of Jewels*/
	public static final int OFFSET_X = 40, OFFSET_Y = 20; 
	private static final double NUM_TYPES = 7; 
	boolean firstClick = true;

	public BejeweledGrid() {
		jewels = new Jewel[8][8];
		this.refill();
	}

	/** directs each Jewel to draw itself.  The Jewel knows its row
	 * and column and can ask the grid for the offset info
	 * @param g Graphics context onto which the Jewels will draw themselves
	 */
	public void draw(Graphics g) {
		for (Jewel [] row : jewels) {
			for (Jewel j : row) {
				if (j != null) {
					j.draw(g);
				}
			}
		}
	}

	/** swaps the Jewels at the specified locations.  Also must
	 * tell the Jewels to set their rows and cols appropriately.
	 * @param r1 row of Jewel 1
	 * @param c1 col of Jewel 1
	 * @param r2 row of Jewel 2
	 * @param c2 col of Jewel 2
	 */
	public void swap(int r1, int c1, int r2, int c2) {
		Jewel first = jewels[r1][c1];
		Jewel second = jewels[r2][c2];

		if (firstClick = false) {
			first.move(r2, c2);
			second.move(r1, c1);
		}
		// more of course tell the Jewels they are changing locations
	}

	/**
	 * Creates an ArrayList<Jewel> of all Jewels that are part of a
	 * three-in-a-row.  The same Jewel may appear in the List more than
	 * once.
	 * @return
	 */
	public ArrayList<Jewel> _3InARow() {
		ArrayList<Jewel> list = _3InARowHor();
		list.addAll(_3InARowVert());
		return list;
	}

	/**
	 * 
	 * @return returns an ArrayList of Jewels that make up three or more in 
	 *         a row vertically or an empty list if fewer than 3 in a row exist
	 */
	private ArrayList<? extends Jewel> _3InARowVert() {

		return null;
	}
	/**  
	 * @return returns an ArrayList of Jewels that make up three or more in 
	 *         a row horizontally or an empty list if fewer than 3 in a row exist
	 */
	private ArrayList<Jewel> _3InARowHor() {
		
		return null;
	}
	/**
	 * This method drops all Jewels that should drop...
	 * Basically, any Jewel that has no Jewel below it needs to 
	 * be in a higher row.  Lots of ways to approach this.
	 */
	public void drop() {
		
	}

	/**
	 * Fill in any empty positions in the grid with randomly selected Jewel
	 */
	public void refill() {
		for (int r=0; r<jewels.length; r++) {
			for (int c=0; c<jewels[0].length; c++) {
				if (jewels[r][c] == null) {
					jewels[r][c] = this.randomJewel(r,c);
				}
			}
		}
	}

	/**
	 * Generates a random Jewel that will have its starting location
	 * at the specified row and col.
	 * @param r row where the Jewel will be placed
	 * @param c col where the Jewel will be placed
	 * @return random type of Jewel constructed at r,c
	 */
	private Jewel randomJewel(int r, int c) {
		int n = (int)(Math.random()*NUM_TYPES);
		if(n == 1){
			return new Emerald(r,c);
		}
		if(n == 2){
			return new Diamond(r,c);
		}
		if(n == 3) {
			return new Ruby(r,c);
		}
		if(n == 4) {
			return new Sapphire(r,c);
		}
		if(n == 5) {
			return new Topaz(r,c);
		}
		if(n == 6) {
			return new Rhombus(r,c);
		}
		return new Amethyst(r,c);
	}

	/**
	 * This method is called by the game when a click has been made 
	 * on the panel.  Must determine if the click makes sense (is it 
	 * a valid location, is there a Jewel at the location, can that 
	 * Jewel be clicked).  If it is the first click, then note it and
	 * the next click will attempt a move (maybe).
	 * @param me
	 */
	public void justClicked(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		if(x > 40 && y > 20 && x < 127*jewels[0].length && y < 114*jewels.length){
			firstClick = false;
		}

	}

}
