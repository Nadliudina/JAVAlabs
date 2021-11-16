package labs.ch02;

/**
 * класс Car:
 * Getx()
 * GetFuel()
 * AddFuel заправить
 * GetCost
 * Drive перемещает автомобиль , расходуя топливо
 * toString
 */
public class Car {
    public Car(int posx, int fuel, int costOfMile) {
        this.posx = posx;
        if (fuel < 0)
            fuel *= -1;
        this.fuel = fuel;
        if (costOfMile < 0)
            costOfMile *= -1;
        this.costOfMile = costOfMile;
        id = gid;
        gid++;
    }

    private int posx;
    private static int gid = 0;
    public final int id;

    public int Getx() {
        return posx;
    }

    private int fuel;

    public int GetFuel() {
        return fuel;
    }

    public boolean AddFuel(int add) {
        if (add < 0 && add < fuel * -1)
            return false;
        fuel += add;
        return true;
    }

    private int costOfMile;

    public int GetCost() {
        return costOfMile;
    }

    /**
     *  перемещает автомобиль , расходуя топливо
     * @param miles
     * @return успешно?
     */
    public boolean Drive(int miles) {
        if (miles * costOfMile > fuel || miles * costOfMile < -fuel)
            return false;
        posx += miles;
        if (miles > 0)
            fuel -= miles * costOfMile;
        else
            fuel += miles * costOfMile;
        return true;
    }

    public String toString() {
        return ("Car(" + id + ") posX: " + Getx() + " fuel: " + GetFuel() + " Cost: " + GetCost());
    }
}
