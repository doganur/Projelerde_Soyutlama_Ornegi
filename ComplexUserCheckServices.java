package ProjelerdeSoyutlama;

public class ComplexUserCheckServices implements IUserCheckService{

    @Override
    public boolean checkUser(User user) {

        if(user.getAge() >= 18 && user.getName().startsWith("mu")) {
           return true;
       }
       return false;
   
   }
  
}
