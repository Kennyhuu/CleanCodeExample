public class BetterFunction {
    //Bad Example for writing a method
    class Bad_Funtion{
        public void  openBankAndRegisterUserAndGivePresent(){
            System.out.println("Do Create all Stuff at Ones");
            System.out.println("Do all Stuff to Open Bank");
            System.out.println("Create Account");
            System.out.println("InsertDataPorcess");
            System.out.println("Do all Stuff to Register User into Bank and put into Database");
            System.out.println("Do all Stuff to Give him a welcoming present");
            System.out.println("and more stuff is going");
        }
    }

     class Good_Function{
        public void  sigInProcess(){
            doOpenBank();
            doCreateAccount();
            doGivePresent();
            System.out.println("Welcome");
        }
        private void doCreateAccount() {
            System.out.println("Open Bank and create Account for new User");
        }
        private void doOpenBank() {
            System.out.println("Give him a welcoming present");
        }
        private void doGivePresent(){
            System.out.println("and more stuff is going");
        }
    }
}
