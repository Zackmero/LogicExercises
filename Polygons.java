package execises;

import javax.swing.JOptionPane;

/**
 *
 * @author Zacarias Mercado
 */
public class Polygons {

    public static void main(String[] args) {

        

        String polygonsOptions[] = {"Triangule", "Square", "Rectangule"};
        String selection = String.valueOf(JOptionPane.showOptionDialog(null, "Select one option", "Polygons", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, polygonsOptions, 1));



        switch (selection) {
            case "0":
                double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Set base of triangule: ", "Triangule", 3));
                double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Set height of triangule: ", "Triangule", 3));
                Polygon triangule = new Triangule(base, height);
                triangule.area();
                area(triangule);
                break;
            case "1":
                double side = Double.parseDouble(JOptionPane.showInputDialog(null, "Set side of square: ", "Square", 3));
                Polygon square = new Square(side);
                square.area();
                area(square);
                break;
            case "2":
                double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Set length of rectangule: ", "Rectangule", 3));
                double width = Double.parseDouble(JOptionPane.showInputDialog(null, "Set width of rectangule: ", "Rectangule", 3));
                Polygon rectangule = new Rectangule(length, width);
                rectangule.area();
                area(rectangule);
                break;
            default:
                break;
        }
    }

    private static void area(Polygon p) {
        p.printArea();
    }

}

interface Polygon {

    double area();

    void printArea();
}

class Triangule implements Polygon {

    private final double base;
    private final double height;

    public Triangule(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public void printArea() {
        JOptionPane.showMessageDialog(null, "Triangule's area is: " + area(), "Triangule", 1);
    }

}

class Square implements Polygon {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void printArea() {
        JOptionPane.showMessageDialog(null, "Square's area is: " + area(), "Square", 1);
    }

}

class Rectangule implements Polygon {

    private final double length;
    private final double width;

    public Rectangule(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void printArea() {
        JOptionPane.showMessageDialog(null, "Rectangule's area is: " + area(), "Rectangule", 1);
    }

}
