package ch02;

class Car{
    Car(int posx, int fuel, int costOfMile) {
        this.posx = posx;
        this.fuel = fuel;
        this.costOfMile = costOfMile;
    }
    private int posx;
    public int Getx(){
        return posx;
    }
    private int fuel;
    public int GetFuel(){
        return fuel;
    }
    public void AddFuel(int add){
        fuel+=add;
    }
    private int costOfMile;
    public int GetCost(){
        return costOfMile;
    }
    public boolean Drive(int miles){
        if (miles*costOfMile>fuel)
            return false;
        posx+=miles;
        fuel-=miles*costOfMile;
        return true;
    }
    public void PrintInfo(){
        System.out.println("posX: "+Getx()+" fuel: "+GetFuel()+" Cost: "+GetCost());
    }
}


public class prgm9 {
    public static void main(String []args){
        Car car=new Car(0,100,2);
        car.PrintInfo();
        car.Drive(44);
        car.PrintInfo();
        car.Drive(555);
        car.PrintInfo();
    }
}
