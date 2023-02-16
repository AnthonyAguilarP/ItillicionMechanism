package Itillar;

import misc.Control;

/**
 *
 * @author Anthony
 */
public class Itillicion {
    
    public static String a31(String text,int n){
        String a="";
        int j=0;
        for(int i=0; i<text.length();i++){
            if(j==n){
                a=a+text.charAt(i);
                j=-1;
            }
                j++;
        }
        return a;
    }
    
    public static String b64g(String text,int n){
        String mod="";
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='A' | text.charAt(i)=='b' | text.charAt(i)=='C' | text.charAt(i)=='d'){
                mod=mod+"0";
            }else if(text.charAt(i)=='a' | text.charAt(i)=='B' | text.charAt(i)=='c' | text.charAt(i)=='D'){
                mod=mod+"1";
            }
        }
        return a29b(mod,n);
    }
    public static String a29b(String text,int n){
        return a31(Control.toText(text),n);
    }
}
