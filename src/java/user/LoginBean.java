/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;


public class LoginBean {
    
    private static String User,Pass;
    
    public String getUser()
    {
        return User;
    }
    public void setUser(String User)
    {
        this.User=User;
    }
    
    
    public String getPassword()
    {
        return Pass;
    }
    public void setPassword(String pass)
    {
        this.Pass=pass;
    }
    
}
