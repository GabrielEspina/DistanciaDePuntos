package ar.edu.ub.p3.plano.modelo;


public class Punto {
	private double x;
	private double y;
	
	
	public Punto(double x, double y) {
		setX(x);
		setY(y);
	}
	
	public Punto() {
		// TODO Auto-generated constructor stub
	}

	public double calcularDistancia(Punto punto) {
		
		double resultado = 0;
		double catetoA = punto.getX() - getX();
		double catetoB = punto.getY() - getY();
		
		resultado = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
		
		resultado = Math.sqrt(resultado);
		
		return resultado;
		
	}
	
	
	public double getX() {
		return x;
	}
	private void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	private void setY(double y) {
		this.y = y;
	}
}
