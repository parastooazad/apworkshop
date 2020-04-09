package edited;

    public class Triangle extends Polygon {

        public Triangle(double...sides){
            super(sides);

        }

        public boolean isEquilateral(){

            if(sidesList.get(0).equals(sidesList.get(1)) && sidesList.get(1).equals(sidesList.get(2)))
                return true;
            else
                return false;
        }

        @Override
        public Double calculatePerimeter() {
            Double perimeter=(sidesList.get(0) + sidesList.get(1) + sidesList.get(2));
            return perimeter;
        }

        @Override
        public Double calculateArea() {
            Double s=calculatePerimeter()/2;
            Double area=Math.sqrt(s*((s-sidesList.get(0)))*(s-sidesList.get(1))*(s-sidesList.get(2)));
            return area;
        }
    }

