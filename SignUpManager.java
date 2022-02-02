package ProjelerdeSoyutlama;

public class SignUpManager {
    private IUserCheckService iUserCheckService;
  
    public SignUpManager(IUserCheckService iUserCheckService) {
        
        this.iUserCheckService = iUserCheckService;
    }
    public void signUp ( User user) {
        if(iUserCheckService.checkUser(user)){
            System.out.println("kullanıcı kayıt oldu.");
        }
        else {
            System.out.println("kullanıcı kayıt olamadı.");
        }
       
    }
    
}
