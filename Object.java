import java.util.Scanner;

public class Object {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        float radius = n.nextFloat();
        simplecircle circle1 = new simplecircle(radius);
        System.out.println("Area of circle of radius " + radius + " is " + circle1.get_area());
        n.close();
    }
}

class simplecircle { // Object - structure //
    double radius;

    simplecircle() { /* C-1 */
        // Constructer without argument //
        radius = 1;
    }

    simplecircle(double newradius) { /* C-2 */
        // Constructer with argument i.e "double newradius" //
        radius = newradius;
    }

    double get_area() {
        return Math.pow(radius, 2) * 3.14;
    }

    double get_perimeter() {
        return 2 * 3.14 * radius;
    }

}