package edited;
    public abstract class Shape {
        public abstract Double calculatePerimeter();
        public abstract Double calculateArea();

        public  void draw(Shape shape) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.println("the area of the shape is:" + calculateArea());
            System.out.println("the perimeter of the shape is:" + calculatePerimeter());
        }

        public  boolean equals(Shape shape){
            if(shape.calculatePerimeter().equals(calculatePerimeter()) && shape.calculateArea().equals(calculateArea()))
                return true;
            else
                return false;
        }
        public  String toString(){
            return null;
        }

    }

