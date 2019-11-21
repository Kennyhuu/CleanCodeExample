public class NamingConvention2 {
    //Bad Example for giving method name, which dont know what it does
    class Bad_Naming_Convention {
        public boolean check() {
            if (a < max) {
                System.out.println("True");
                return true;
            } else {
                System.out.println("False");
                return false;
            }
        }
    }
    class Good_Naming_Convention {
        int userAge;
        int maxAge;
        public boolean isAgeOfUserAcceptable() {
            if (userAge < maxAge) {
                return true;
            } else {
                return false;
            }
        }
    }
}
