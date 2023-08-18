package Slide23;

public class Ponto {
	double x1,y1;
	
	public Ponto(double x1, double y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public void distancia(double x2, double y2) {
		double dist =  Math.sqrt(Math.pow(this.x1-x2, 2) + Math.pow(this.y1-y2, 2));
		System.out.println("Distancia: " + dist);
	}

}
