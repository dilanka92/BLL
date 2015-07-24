package user;
import DLL.DLLService;
import DLL.DLLService_Service;
import java.util.List;

/**
 *
 * @author Dilanka
 */
public class LoginValidate {
    
    public List<String> ValidatePassword() {

        DLLService_Service service = new DLLService_Service();
        DLLService proxy = service.getDLLServicePort();

        LoginBean user = new LoginBean();
        List<String> UserInfo = proxy.login(user.getUser());
        
        if(user.getPassword().equals(UserInfo.get(0))){
            return UserInfo;
        }

        return null;
    }
}
