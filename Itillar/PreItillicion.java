package Itillar;

import java.util.Random;
import misc.Control;

/**
 *
 * @author Anthony
 */
public class PreItillicion {
    
    public static String randomString(int n){
        String charSet=Control.abc();
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int randomIndex=random.nextInt(charSet.length());
            sb.append(charSet.charAt(randomIndex));
        }
        return sb.toString();
    }
    
    public static String password(int n,String text){
        String s="";
        for(int i=0;i<text.length();i++){
            s=s+randomString(n)+text.charAt(i);
        }
        return s;
    }
    
    public static String passwor(int n,String text){
        return Control.toBinary(password(n,text));
    }
    
    public static String passwo(int n,String text){
        String actual=passwor(n,text),mod="";
        Random random = new Random();
        for(int i=0;i<actual.length();i++){
            if(actual.charAt(i)=='0'){
                mod=mod+"AbCd".charAt(random.nextInt("AbCd".length()));
            }else if(actual.charAt(i)=='1'){
                mod=mod+"aBcD".charAt(random.nextInt("aBcD".length()));
            }
        }
        return mod;
    }
}
