package ch02;

class Point{
    private double x,y;
    public Point(double x1,double y1){
        x=x1;
        y=y1;
    }
    public double GetX(){
        return x;
    }
    public double GetY(){
        return y;
    }
    /** https://youtube.com */
    public Point TransAccessor(double x1,double y1){
        return new Point(x+=x1,y+=y1);
    }
    public Point ScaleAccessor(double x1,double y1){
        return new Point(x*=x1,y*=y1);
    }
    public void TransMutator(double x1,double y1){
        x+=x1;y+=y1;
    }
    public void ScaleMutator(double x1,double y1){
        x*=x1;y*=y1;
    }
}

public class prgm5 {

    public static void main(String[] args){
        Point p=new Point(3,5);
        p.ScaleMutator(4,6);;
        Point p1=p.ScaleAccessor(1,1);
        Point p2=p.TransAccessor(1,1);
        p.TransMutator(8,8);
        Point p3=new Point(3,4).TransAccessor(1,3).ScaleAccessor(0.5,0.5);
        System.out.println(p3.GetX());
        System.out.println(p3.GetY());
    }
}
