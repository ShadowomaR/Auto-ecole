
public class examen {
    private int code;
    private String nom,prenom,etat,statu,obs,date_i,tel;
    
    public examen(int code,String nom,String prenom,String date_i,String etat,String statu,String obs,String tel){
        this.code=code;
        this.nom=nom;
        this.prenom=prenom;
        this.date_i=date_i;
        this.obs=obs;
        this.statu=statu;
        this.etat=etat;
        this.tel=tel;
    }
    public int getcode(){ return code;}
    public String getprenom(){ return prenom;}
    public String getnom(){ return nom;}
    public String getdate(){ return date_i;}
    public String gettel(){ return tel;}
    public String getstatu(){ return statu;}
    public String getetat(){ return etat;}
    public String getobs(){ return obs;}
}
