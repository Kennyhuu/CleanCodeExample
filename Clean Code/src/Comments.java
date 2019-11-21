public class Comments {
    //Example When not to Comment
    class whenNotCommentExample{
        //this is the constructor
        public whenNotCommentExample(){}
        //this is also a constructor
        public whenNotCommentExample(int i){}
        //this is a boolean method
        public boolean check(){return true;}
        // this is a set method
        public void set(){}
        //this is a get method, which give the String "String" back
        public String getString(){
            String string = "im String";
            return string;
        }

    }
    //Example for Comment by using Bad Naming
    class BadCodeNaming {
        //This is a function which send mails
        //to all people who name is Paul
        public void email() {
            System.out.println("All Pauls get an Email");
        }
        //This function describe the
        //the meaning of life
        //or its end life
        public void life(){
            System.out.println("Life is Life");
        }
    }
}
