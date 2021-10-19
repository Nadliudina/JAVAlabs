package labs.ch04;

import labs.ch02.Point;

public class Circle extends Shape {
    public double radius;
    public Circle(Point center,double radius) {
        super(center);
        this.radius=radius;
    }

    @Override
    public Point getCenter() {
        return new Point(center.GetX(),center.GetY());
    }

    @Override
    public String toString(){
        return "Circle{" +
                "center=" + center +  ", radius=" + radius +
                '}';
    }

    @Override
    public Shape clone()  {
       return new Circle(getCenter(),radius);
    }
}
