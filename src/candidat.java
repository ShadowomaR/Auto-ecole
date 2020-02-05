/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

        
public class candidat {
    
    private int code;
    private String nom,prenom,lieu,groupage,tél,adress,genre ,type,etat;
    private Date date_n,date_i;

    public candidat(int code, String nom, String prenom , Date date_n , String lieu , String groupage ,String genre, String tél,String adress,Date date_i,String type,String etat)
    {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.date_n = date_n;
        this.lieu = lieu;
        this.groupage = groupage;
        this.tél= tél;
        this.date_i=date_i;
        this.adress=adress;
        this.type=type;
        this.genre=genre;
    }
    public int getCode(){
        return code;
    }
    public String getNOM(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getGroupage(){
        return groupage;
    }
    public String getLieu(){
        return lieu;
    }
    public String getTél(){
        return tél;
    }
    public Date getDate_n (){
        return date_n;
    }
    public Date getDate_i (){
        return date_i;
    }
    public String getadress (){
        return adress;
    }
    public String getgenre (){
        return genre;
    }
    public String gettype (){
        return type;
    }
    public String getetat (){
        return etat;
    }
}
