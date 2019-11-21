import static jdk.nashorn.tools.Shell.SUCCESS;

public class NestedCode {
    //Example for Nested Code
    class Bad_Nested_Code{
        public void nestCode(){
            if(user_result == SUCCESS){
                if(permissin_result !=SUCCESS){
                    reply.WriteErroe("error reading permissions");
                }
                reply.WriteErrors("");
            }else{
                reply.writeErrors(user_result);
            }
            reply.Done();
        }
    }

    class Good_Nested_Code{
        // Using Early Returns to avoid nested Code
        public void nestCode(){
            if(user_result !=SUCCESS){
                reply.WriteErrors(user_result);
                reply.Done;
                return;
            }

            if (permission_result != SUCCESS) {
                reply.WriteErrors(permission_result);
                reply.Done();
                return;
            }
            reply.WriterErrors("");
            reply.Done;
            }
        }
}
