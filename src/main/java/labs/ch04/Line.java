package labs.ch04;

import labs.ch02.Point;

public class Line extends Shape{
    public Point from;
    public Point to;
    public Line(Point from,Point to) {
        super(new Point((from.GetX()+ to.GetX())/2,(from.GetY()+ to.GetY())/2 ));
    this.from=new Point(from.GetX(),from.GetY());
    this.to=new Point(to.GetX(), to.GetY());
    }

    @Override
    public Point getCenter() {
        return new Point(center.GetX(),center.GetY());
    }

    @Override
    public void moveBy(double dx,double dy){
        super.moveBy(dx,dy);
        from.ShiftPoint(dx,dy);
        to.ShiftPoint(dx,dy);
    }

    @Override
    public String toString() {
        return "Line{" +
                "from=" + from +
                ", to=" + to +
                ", center=" + center +
                '}';
    }

    @Override
    public Shape clone()  {
         return new Line(from,to);
    }
}
