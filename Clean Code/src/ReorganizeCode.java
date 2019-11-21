public class ReorganizeCode {
    // Example for Code with many works
    class Bad_Reorganize_Code{
        // How many Geometric Figure???
        public void  calculat_Area_Of_Many_Geometric_Figure(){
            double radius = 2;
            double base = 4;
            double areaCircle = Math.PI * (radius * radius);
            double circumference= Math.PI * 2*radius;
            double height = 5;
            double area = (base* height)/2;
            double side = 3;
            double areaSquare = side*side;
            System.out.println("The area of circle is: " + areaCircle);
            System.out.println( "The circumference of the circle is:"+circumference) ;
            System.out.println("Area of Square is: "+areaSquare);
            System.out.println("Area of Triangle is: " + area);
        }
    }
    class Good_Reorganize_Code{
        public void calculate_All_Area_Figure(){
            doCircle(2);
            doSquare(3);
            doTriangle(4,5);
        }

        private void doTriangle(double base,double height) {
            double area = (base* height)/2;
            System.out.println("Area of Triangle is: " + area);
        }

        private void doSquare(double side) {
            //Area of Square = side*side
            double area = side*side;
            System.out.println("Area of Square is: "+area);
        }

        private void doCircle(double radius) {
            //Area = PI*radius*radius
            double area = Math.PI * (radius * radius);
            System.out.println("The area of circle is: " + area);
            //Circumference = 2*PI*radius
            double circumference= Math.PI * 2*radius;
            System.out.println( "The circumference of the circle is:"+circumference) ;
        }
    }
}
