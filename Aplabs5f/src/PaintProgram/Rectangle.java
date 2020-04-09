package PaintProgram;

import java.util.ArrayList;

    public class Rectangle {
        private ArrayList<Double> sides;

        public Rectangle(double side1,double side2,double side3,double side4){
            sides=new ArrayList<Double>();
            sides.add(side1);
            sides.add(side2);
            sides.add(side3);
            sides.add(side4);
        }

        public ArrayList<Double> getSides() {
            return sides;
        }
        public  boolean isSquare(){
            if(sides.get(0).equals(sides.get(1)))
                return true;
            else
                return false;
        }

        public Double calculatePerimeter(){
            Double perimeter = 2*(sides.get(0) + sides.get(1));
            return perimeter;
        }

        public Double calculateArea(){
            Double s = sides.get(0) * sides.get(1);
            return s;
        }
        public void draw(){
            System.out.println("the shape is a rectangle and the perimeter is : " + calculatePerimeter() + "and the area is : " + calculateArea() );
        }
        public String toString(){
            return "a rectangle and the sides are : side1 " + sides.get(0) + " side2 : " + sides.get(1) + " side3 : " + sides.get(2) + " side4 : " + sides.get(3);

        }
        public boolean equals(Rectangle rectangle) {
            if (rectangle == this)
                return true;
            if (rectangle.calculateArea().equals(calculateArea()) && rectangle.calculatePerimeter().equals(calculatePerimeter()))
                return true;
            return false;

        }

    }


