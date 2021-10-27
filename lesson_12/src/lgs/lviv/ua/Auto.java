package lgs.lviv.ua;

public class Auto {

	private int horses;
	private int yearOfIssue;
	private Engine engine;
	private Helm helm;
	public Auto(int horses, int yearOfIssue, Engine engine, Helm helm) {
		super();
		this.horses = horses;
		this.yearOfIssue = yearOfIssue;
		this.engine = engine;
		this.helm = helm;
	}

	public int getHorses() {
		return horses;
	}
	public void setHorses(int horses) {
		this.horses = horses;
	}
	public int getYearOfIssue() {
		return yearOfIssue;
	}
	public void setYearOfIssue(int yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	@Override
	public String toString() {
		return "Auto [horses=" + getHorses() + ", yearOfIssue=" + getYearOfIssue() + ", cylinders=" + engine.getCylinders() + ", helm diameter=" + helm.getDiameter() + ", helm material=" + helm.getMaterial()
				+ "]";
	}

	

	
}
