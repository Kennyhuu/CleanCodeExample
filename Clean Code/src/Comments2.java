import static java.lang.Math.abs;

public class Comments2 {
    // Example When not use Comment
    class Bad_Naming_Comment{
        //calculates square root of given number
        //using Newton-Raphson method
        public void abc(int a){
            double r = a / 2;
            while ( abs( r - (a/r) ) > t ) {
                r = 0.5 * ( r + (a/r) );
            }
            System.out.println( "r = " + r );
        }
    }

    class Good_Naming_Comment{
        public void squareRoot(int num){
            double root = num/ 2;
            while ( abs(root - (num/ root) ) > t ) {
                r = 0.5 * (root + (num/ root));
            }
            System.out.println( " root = " + root );
        }
    }
}
