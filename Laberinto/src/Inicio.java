import java.awt.Point;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.setUbicacion(new Point(0, 0));
		r.setDireccion(Math.PI);
		r.mover(10);
		System.out.println(r.getUbicacion());
		
	}

}
