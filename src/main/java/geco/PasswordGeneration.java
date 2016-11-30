package geco;

import com.sun.javafx.binding.StringFormatter;

/**
 * Created by MONTASSER on 30/11/2016.
 */
public class PasswordGeneration {

    String  getRandomPassword(String pass){
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        pass = "";
        for(int x=0;x<8;x++)
        {
            int i = (int)Math.floor(Math.random() * 62);
            pass += chars.charAt(i);
        }
        System.out.println(pass);
        return pass;
    }
}
