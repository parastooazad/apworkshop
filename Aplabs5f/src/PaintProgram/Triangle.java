package PaintProgram;


import java.util.ArrayList;

    public class Triangle {
        private ArrayList<Double> sides;

        public Triangle(double side1,double side2,double side3){
            sides=new ArrayList<Double>();
            sides.add(side1);
            sides.add(side2);
            sides.add(side3);
        }

        public ArrayList<Double> getSides() {
            return sides;
        }

        public boolean isEquilateral(){
            if(sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2)))
                return true;
            else
                return false;
        }
        public Double calculatePerimeter(){
            Double perimeter=(sides.get(0) + sides.get(1) + sides.get(2));
            return perimeter;
        }

        public Double calculateArea(){
            Double s=calculatePerimeter()/2;
            Double area=Math.sqrt(s*(s-sides.get(0))*(sides.get(1))*sides.get(2));
            return area;
        }
        public void draw(){
            System.out.println("the shape is a triangle and the perimeter is : " + calculatePerimeter() + " and the area is : " + calculateArea() );
        }
        public String toString(){
            return "a triangle and the sides are : side1 " + sides.get(0) + " side2 : " + sides.get(1) + " side3 : " + sides.get(2);

        }
        public boolean equals(Triangle triangle) {
            if (triangle == this)
                return true;
            if (triangle.calculateArea().equals(calculateArea()) && triangle.calculatePerimeter().equals(calculatePerimeter()))
                return true;
            return false;

        }

    }

}
