package Itillar;

import Dal.Storage;

/**
 *
 * @author Anthony
 */
public class llicion extends Iti{
    
    private boolean destructor=true;
    
    private int n=4;

    public llicion() {
    }

    public llicion(String key, String text) {
        super(key, text);
    }

    public boolean isDestructor() {
        return destructor;
    }

    public void setDestructor(boolean destructor) {
        this.destructor = destructor;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if(n<4)this.n=4;
        else this.n = n;
    }
    
    public void preItillar(int level){
        if(level==1)setCode(PreItillicion.password(n, getText()));
        else if(level==2)setCode(PreItillicion.passwor(n, getText()));
        else if(level==3)setCode(PreItillicion.passwo(n, getText()));
        Storage.Data(this);
        if(destructor)Destructor();
    }
    
    public String Itillar(int level){
        String text="";
        try{
        switch (level) {
            case 1 -> text=Itillicion.a31(Storage.readData(this),n);
            case 2 -> text=Itillicion.a29b(Storage.readData(this), n);
            case 3 -> text=Itillicion.b64g(Storage.readData(this), n);
            default -> text="";
        }
        }catch(Exception e){
            
        }
        BBDD=text;
        return text;    
    }
    
    private String BBDD="";

    public String getBBDD() {
        return BBDD;
    }
    
    private void setCode(String code){
        this.code=code;
    }
    
    public void Destructor(){
        setText("");
        setKey("");
    }
}
