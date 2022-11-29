package first;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public Triangle() {
		
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public double findArea() {
		double semiP = (sideA + sideB + sideC) / 2;
		double areaABC = Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
		return areaABC;
	}

	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}
	
}
