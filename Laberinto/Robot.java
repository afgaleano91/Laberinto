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
		//TODO algoritmo de movimiento
	}
	
	public boolean verificarMovimiento(double distancia) {
		//TODO algoritmo de verificar si se puede mover a esa distancia
		return false;
	}
	
	public void girar(double grados) {
		//TODO algoritmo de girar
	}
}
