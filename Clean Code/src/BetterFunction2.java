public class BetterFunction2 {
    //Bad Example for writing method
    class Bad_Function{
        public void calculate_Many_Triangle(){
            double base = 10.0;
            double height = 1180.5;
            double area = (base * height) / 2;
            System.out.println("Area of Triangle is: " + area);
            double base1 = 20.0;
            double height1 = 110.5;
            double area1 = (base * height) / 2;
            System.out.println("Area of Triangle is: " + area1);
            double base2 = 270.0;
            double height2 = 11099.5;
            double area2 = (base * height) / 2;
            System.out.println("Area of Triangle is: " + area2);
        }
    }

    class Good_Function{
        public void calculate_Many_Triangle(){
            calculateTheInsideWithSomeVariables(87654,8);
            calculateTheInsideWithSomeVariables(95,849);
            calculateTheInsideWithSomeVariables(5,84);
        }
        public void calculateTheInsideWithSomeVariables(double base, double height) {
            double area = (base * height) / 2;
            System.out.println("Area of Triangle is: " + area);
        }
    }
}
