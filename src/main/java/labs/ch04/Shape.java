package labs.ch04;

import labs.ch02.Point;

/**
 * класс Shape
 * void moveBy(double dx,double dy) передвигает center
 * public abstract Point getCenter() аксессор center
 */
public abstract class Shape implements Cloneable {
    public Point center;
    public void moveBy(double dx,double dy){
        center.ShiftPoint(dx,dy);
    }
    public abstract Point getCenter();
    public Shape(Point center){
        this.center=new Point(center.GetX(), center.GetY());
    }

    @Override
    public String toString() {
        return "Shape{" +
                "center=" + center +
                '}';
    }

}
