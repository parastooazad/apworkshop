package edited;

import java.util.ArrayList;

    public abstract class Polygon extends Shape{
        protected ArrayList <Double> sidesList;

        public Polygon(double...sides){
            sidesList=new ArrayList<Double>();

            for(Double side:sides){
                sidesList.add(side);
            }
        }

        @Override
        public String toString() {
            if (sidesList.size() == 4)
                return " side1 : " + sidesList.get(0) + " side2 " + sidesList.get(1) + " side3 " + sidesList.get(2) + " side4 " + sidesList.get(3);

            else
                return " side1 : " + sidesList.get(0) + " side2 " + sidesList.get(1) + " side3 " + sidesList.get(2);
        }

    }


