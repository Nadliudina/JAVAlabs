package labs.ch02;

/**
 * класс Point:
 *  GetX()
 *  GetY()
 *  GetPointWithShift получить новый объект этого класса со смещением на указанную величину
 *  GetPointWithScale получить новый объект этого класса со смещением в указанную величину
 *  ShiftPoint смещением на указанную величину
 *  ScalePoint смещением в указанную величину
 *  toString
 *  equals
 *  hashCode
 */
public class Point {
    protected double x, y;
    private static int gid = 0;
    public final int id;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        id = gid;
        gid++;
    }

    public double GetX() {
        return x;
    }

    public double GetY() {
        return y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    /**
     *  получить новый объект этого класса со смещением на указанную величину
     * @param x1
     * @param y1
     * @return
     */
    public Point GetPointWithShift(double x1, double y1) {
        return new Point(x += x1, y += y1);
    }

    /**
     * получить новый объект этого класса со смещением в указанную величину
     * @param x1
     * @param y1
     * @return
     */
    public Point GetPointWithScale(double x1, double y1) {
        return new Point(x *= x1, y *= y1);
    }

    /**
     * смещение на указанную величину
     * @param x1
     * @param y1
     */
    public void ShiftPoint(double x1, double y1) {
        x += x1;
        y += y1;
    }

    /**
     * смещением в указанную величину
     * @param x1
     * @param y1
     */
    public void ScalePoint(double x1, double y1) {
        x *= x1;
        y *= y1;
    }

    @Override
    public String toString() {
        return "Point(" + id + "): x = " + x + " y = " + y;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Point) {
            Point otherPoint = (Point) other;
            if (otherPoint.id == id)
                return true;
            if (otherPoint.x == x && otherPoint.y == y)
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (id + x * 10 + y * 100 + id * x * y);
    }
}
