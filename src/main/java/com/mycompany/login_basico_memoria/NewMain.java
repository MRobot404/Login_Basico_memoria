package com.mycompany.login_basico_memoria;
import java.util.ArrayList;
// @author Fsociety
public class NewMain {
public static ArrayList<Usuario>usuarios;
    public static void main(String[] args) {
    usuarios=new ArrayList<>();   
     login log=new login();
     log.setVisible(true);
    }
    
}
