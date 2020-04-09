package edited;

    public class Rectangle extends Polygon {


        public Rectangle(double... sides) {
            super(sides);
        }

        @Override
        public Double calculatePerimeter() {
            Double p=2*(sidesList.get(0) + sidesList.get(1));
            return p;
        }

        @Override
        public Double calculateArea()
        {
            Double a=sidesList.get(0) * sidesList.get(1);
            return a;
        }

        public  boolean isSquare(){
            if(sidesList.get(0).equals(sidesList.get(1)))
                return true;
            else
                return false;
        }

    }

