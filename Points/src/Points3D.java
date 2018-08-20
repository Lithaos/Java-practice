
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
	public void print() {
		System.out.println("Z = " + z);
	}
}
