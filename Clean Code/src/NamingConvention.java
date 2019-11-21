public class NamingConvention {
//Bad Example Naming variables
    class Bad_Naming_Convention {
        private String name1;
        private String name2;

        public String getName1() {
            return name1;
        }
        public String getname2(){
            return  name2;
        }
        public String getName(){
            return name1 + " " + name2;
        }
    }

    class Good_Naming_Convention {
        private String firstName;
        private String lastname;

        public String getFirstName() {
            return firstName;
        }
        public String getLastname(){
            return  lastname;
        }
        public String getFullname(){
            return  firstName +" "+lastname;
        }
    }
}
