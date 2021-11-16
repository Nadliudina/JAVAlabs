package labs.ch04;

import labs.ch02.Point;

/**
 * __4__
 * __5__
 * __9__
 *
 */
public class Rectangle extends Shape{
    public Point topLeft;
    public double width;
    public double height;
    public Rectangle(Point topLeft,double width,double height) {
        super(new Point(topLeft.GetX()+width/2,topLeft.GetY()-height/2));
        this.width=width;
        this.height=height;
        this.topLeft=new Point(topLeft.GetX(),topLeft.GetY());
    }

    @Override
    public Point getCenter() {
        return new Point(center.GetX(),center.GetY());
    }

    @Override
    public void moveBy(double dx,double dy){
        super.moveBy(dx,dy);
        topLeft.ShiftPoint(dx,dy);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", width=" + width +
                ", height=" + height +
                ", center=" + center +
                '}';
    }

    @Override
    public Shape clone() {
        return new Rectangle(topLeft,width,height);
    }
}
