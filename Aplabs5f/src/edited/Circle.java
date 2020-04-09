package edited;


    public class Circle extends Shape {
        private int radius;


        public Circle(int radius)
        {
            this.radius=radius;
        }

        public int getRadius() {

            return radius;
        }

        @Override
        public Double calculatePerimeter() {
            Double p=2*radius*3.14;
            return p;
        }

        @Override
        public Double calculateArea() {
            Double a=radius*radius*3.14;
            return a;
        }

        @Override
        public String toString() {
            return "the shape is Circle and it's radius is " + radius;
        }
    }

