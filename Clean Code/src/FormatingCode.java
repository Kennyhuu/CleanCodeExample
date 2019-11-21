public class FormatingCode {
    //Bad Example for reading the Flow of Code
    class Bad_FormatingCode_Example {
        private String someString;
        public String getSomeString() {
            return someString;
        }
        public void someMehtodThree(){}
        public void setSomeString(String someString) {
            this.someString = someString;
        }
        public void someMethodOne() {
        }
        Bad_FormatingCode_Example(int i){}
        public int getSomeInt() {
            return someInt;
        }
        public void someMethodTwo() {
        }
        public void setSomeInt(int someInt) {
            this.someInt = someInt;
        }
        private int someInt;
        public double getSomedouble() {
            return somedouble;
        }
        public void setSomedouble(double somedouble) {
            this.somedouble = somedouble;
        }
        private double somedouble;
        public Bad_FormatingCode_Example() {
        }
    }

    class Good_FormatingCode_Example {
        //Parameter Section
        private String someString;
        private int someInt;
        private double somedouble;

        //Constructer Section
        public Good_FormatingCode_Example() {
        }
        public Good_FormatingCode_Example(int i){}

        //all important methods
        public void MethodOne() { }
        public void MethodTwo() { }
        public void MethodThree(){ }

        //other not so important Mehtod like Get and setter
        //for String
        public String getSomeString() {
            return someString;
        }
        public void setSomeString(String someString) {
            this.someString = someString;
        }
       //for Int
        public int getSomeInt() {
            return someInt;
        }
        public void setSomeInt(int someInt) {
            this.someInt = someInt;
        }
       //for double
        public double getSomedouble() {
            return somedouble;
        }
        public void setSomedouble(double somedouble) {
            this.somedouble = somedouble;
        }
    }
}
