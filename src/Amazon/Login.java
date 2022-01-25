package Amazon;

import java.util.HashMap;
import java.util.Map;

public class Login {
    Map<String,String> dic;
    Map<String,Boolean> status;

    public Login() {
        dic = new HashMap<>();
        status = new HashMap<>();
    }

    public String registered(String username, String password){
        if(dic.containsKey(username)) return "Unsuccessfully Registered";
        dic.put(username,password);
        return "Successfully Registered";
    }

    public String login(String username, String password){
        if(!dic.containsKey(username)) return "Unsuccessfully Login";
        if(!dic.get(username).equals(password)) return "Unsuccessfully Login";
        status.put(username,true);
        return "Successfully Login";
    }

    public String logout(String username){
        if(!dic.containsKey(username)) return "Unsuccessfully Logout";
        if(!status.containsKey(username) || !status.get(username)) return "Unsuccessfully Logout";
        status.put(username,false);
        return "Successfully Logout";
    }
}
