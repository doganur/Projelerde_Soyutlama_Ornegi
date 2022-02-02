package ProjelerdeSoyutlama;

public class Main {
    public static void main(String[] args) {
    
    SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckServices());
    signUpManager.signUp(new User(1,"doğa", 17));
    }
    

}
