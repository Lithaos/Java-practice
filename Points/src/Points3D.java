
public class Points3D extends Points2D{
	int z;

	public Points3D() {
		super();
		this.z = 0;
	}
	public Points3D(int z) {
		super();
		this.z = z;
	}
	@Override
	public void print() {
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("Z = " + z);
	}
}
