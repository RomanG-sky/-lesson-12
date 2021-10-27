package lgs.lviv.ua;

public class Helm {

	private int  diameter;
	private String material;
	public Helm(int diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
