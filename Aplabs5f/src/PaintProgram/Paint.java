package PaintProgram;


import java.util.ArrayList;

    public class Paint {
        private ArrayList<Circle> circles;
        private ArrayList<Triangle> triangles;
        private ArrayList<Rectangle> rectangles;

        public Paint(){
            circles=new ArrayList<Circle>();
            triangles=new ArrayList<Triangle>();
            rectangles=new ArrayList<Rectangle>();

        }

        public void addCircle(Circle circle){
            circles.add(circle);
        }
        public void addRectangle(Rectangle rectangle){
            rectangles.add(rectangle);
        }
        public void addTriangle(Triangle triangle){
            triangles.add(triangle);
        }
        public void drawAll(){
            for(Circle circle : circles){
                circle.draw();
            }
            for (Triangle triangle : triangles){
                triangle.draw();
            }
            for (Rectangle rectangle : rectangles){
                rectangle.draw();
            }
        }

        public void printAll(){
            for(Circle circle : circles){
                System.out.println(circle.toString());
            }
            for (Triangle triangle : triangles){
                System.out.println(triangle.toString());
            }
            for (Rectangle rectangle : rectangles){
                System.out.println(rectangle.toString());
            }
        }

    }

