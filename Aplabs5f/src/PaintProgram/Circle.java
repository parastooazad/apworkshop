package PaintProgram;


    public class Circle {
        private  double radius;
        final float p= (float) 3.1 4;

        public Circle(int radius){
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }

        public double calculatePerimeter(){
            double perimeter= radius*2*3.4;
            return perimeter;
        }

        public double calculateArea(){
            double area=radius*radius*3.14;
            return area;
        }
        public void draw(){
            System.out.println("the shape is a circle and the perimeter is : " + calculatePerimeter() + "and the area is : " + calculateArea() );
        }
        public String toString(){
            return "a circle and the radius is  " + radius;

        }
        public boolean equals(Circle circle) {
            if (circle == this)
                return true;
            if (Math.abs(radius - circle.radius) < 0.0001)
                return true;
            return false;

        }
    }


