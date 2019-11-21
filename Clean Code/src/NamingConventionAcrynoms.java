public class NamingConventionAcrynoms {
    //Bad Example using Acronyms as name
    class Bad_Naming_Convention_1 {
        public void calArOfTri() {
            double base = 20.0;
            double height = 110.5;
            double area = (base * height) / 2;
        }
    }
// Bad Example Using own Style of Naming
    class Bad_Naming_Convention_2 {
        public void gettingNumberOfTheInsideWithSomeVariables() {
            double base = 20.0;
            double height = 110.5;
            double area = (base * height) / 2;
        }
    }

    class Good_Naming_Convention {
        public void calculateTheAreaOfTriangle() {
            double base = 20.0;
            double height = 110.5;
            double area = (base * height) / 2;
            System.out.println("Area of Triangle is: " + area);
        }
    }
}
