
public class Points2D extends Main{
	public int x;
	public int y;
	public Points2D(){
		x=0;
		y=0;
	}
	public Points2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
	
}
