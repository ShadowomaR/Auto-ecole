/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHADOW
 */
public class agenda {
    private int code_c,type,temp ;
    private String nom;
    public agenda(int code_c,String nom,String type,int temp){
        this.code_c=code_c;
        this.nom=nom;
    }
    public int getID(){
        return code_c;
    }
    public String getnom(){        
        return nom;
    }
    public int gettype(){
        return type;
    }
    public int gettemp(){
        return temp;
    }
}
