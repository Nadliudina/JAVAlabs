package labs.ch04;

import labs.ch02.Point;

/**
 * __1__
 * __2__
 * __3__
 * __9__
 * класс LabeledPoint
 * getLabel
 * toString
 * equals
 * hashCode
 */
public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " label = " + label.toString();
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other) && (label == ((LabeledPoint) other).label);
    }

    @Override
    public int hashCode() {
        int h = 0;
        for (char c : label.toCharArray())
            h += c;
        return super.hashCode() + h;
    }
}
