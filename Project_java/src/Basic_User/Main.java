package Basic_User;

import java.util.Scanner;

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
    public void paint() {
    	super.draw();
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.paint();
        int numArr[] = {0,1,2,3,4,5};
    }
}

