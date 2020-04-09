package edited;

import java.util.ArrayList;

    public class Paint {
        private ArrayList<Shape> shapes;

        public Paint(){

            shapes=new ArrayList<Shape>();

        }
        public void addShape(Shape shape){
            shapes.add(shape);
        }
        public void drawAll(){
            for(Shape shape : shapes){
                shape.draw(shape);
            }
        }
        public void printAll(){
            for(Shape shape : shapes){
                System.out.println(shape.toString());
            }
        }

        public void describeEqualSides(){
            for(Shape shape : shapes){
                if(shape instanceof Triangle){
                    if(((Triangle) shape).isEquilateral())
                        System.out.println(shape.toString());
                }

                if(shape instanceof Rectangle){
                    if(((Rectangle) shape).isSquare())
                        System.out.println(shape.toString());
                }
            }
        }

    }

