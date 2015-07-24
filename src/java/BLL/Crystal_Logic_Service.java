/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import user.LoginBean;
import user.LoginValidate;

/**
 *
 * @author Dilanka
 */
@WebService(serviceName = "Crystal_Logic_Service")
public class Crystal_Logic_Service {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Login")
    public List<String> Login(String UserName, String Passwrd) {
        
        LoginBean login = new LoginBean();
        LoginValidate validate = new LoginValidate();
        
        login.setUser(UserName);
        login.setPassword(Passwrd);
        
        List<String> UserInfo = validate.ValidatePassword();
        
        return UserInfo;
    }
}
