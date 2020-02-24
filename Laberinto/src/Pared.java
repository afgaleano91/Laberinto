import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Pared{
	Point pi,pf; 
	
	public Pared(Point pi, Point pf) {
		this.pi = pi;
		this.pf = pf;
	}
	
	public boolean pasoRestringido(Point p1, Point p2) {
		Line2D.Double trayecto = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		Line2D.Double pared = new Line2D.Double(pi.getX(), pi.getY(), pf.getX(), pf.getY());
		return pared.intersectsLine(trayecto);
	}
}
