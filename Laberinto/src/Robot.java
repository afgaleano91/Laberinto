import java.awt.Point;

public class Robot {
	private Point ubicacion;
	private double direccion;
	
	public Point getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getDireccion() {
		return direccion;
	}

	public void setDireccion(double direccion) {
		this.direccion = direccion;
	}

	public void mover(double distancia) {
		double a = Math.cos(direccion)*distancia;
		double b = Math.sin(direccion)*distancia;
		if(verificarMovimiento(ubicacion.x+(int)(a), ubicacion.y+(int)(b))) {
			ubicacion.move(ubicacion.x+(int)(a), ubicacion.y+(int)(b));
		}
	}
	
	public boolean verificarMovimiento(int x, int y) {
		//TODO algoritmo de verificar si se puede mover a esa distancia
		return true;
	}
	
	public void girar(double grados) {
		//TODO algoritmo de girar
		direccion += grados;
	}
}
