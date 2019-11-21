public class NestedCode3 {
    //Example for nested Code
    class Bad_Nested_Code {
        public String getLaserSwordOrigin() {
            String s = "";
            if (getLaserSwordColor() == "blue") {
                s = "Im owned by Luke Skywalker.";
            } else if (getLaserSwordColor() == "green") {
                s = "Im owned by Yoda.";
            } else if (getLaserSwordColor() == "red") {
                s = "Im owned by Lukes pa.";
            } else {
                s = "Im made in China";
            }
            return s;
        }
    }

     class Good_Netsted_Code{
         public String getLaserSwordOrigin() {
             String laserSwordColor = getLaserSwordColor();

             if (laserSwordColor == "blue") {
                 return "Im owned by Luke Skywalker.";
             }
             if (laserSwordColor == "green") {
                 return "Im owned by Yoda.";
             }
             if (laserSwordColor == "red") {
                 return "Im owned by Lukes pa.";
             }
             return "Im made in China";
         }
     }
}
