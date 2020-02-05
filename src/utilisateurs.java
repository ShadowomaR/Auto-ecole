/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHADOW
 */
public class utilisateurs {
    private int id ;
    private String nom,prenom,email,nom_utilitateur,type,pwd;
    private String photo;
    public utilisateurs(int id,String nom,String prenom,String nom_utilitateur,String email,String type,String pwd,String photo){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.nom_utilitateur=nom_utilitateur;
        this.type=type;
        this.pwd=pwd;
        this.photo=photo;
    }
    public int getID(){
        return id;
    }
    public String getnom(){
        return nom+" "+prenom;
    }
    public String getpwd(){
        return pwd;
    }
    public String getemail(){
        return email;
    }
    public String getnom_utilisateur(){
        return nom_utilitateur;
    }
    public String gettype(){
        return type;
    }
    public String getphoto(){
        return photo;
    }
}
