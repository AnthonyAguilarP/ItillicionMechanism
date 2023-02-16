package misc;


/**
 *
 * @author Anthony
 */
public class Control {

    public static String toBinary(String s){
        byte[] b=s.getBytes();
        StringBuilder sb=new StringBuilder();
        for(byte b2: b){
            int val=b2;
            for(int i=0;i<8;i++){
                sb.append((val & 128) == 0 ? 0 : 1);
                val <<=1;
            }
        }
        return sb.toString();
    }
    
    public static String toText(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=8){
            int val=Integer.parseInt(s.substring(i, i+8),2);
            sb.append((char)val);
        }
        return sb.toString();
    }
    
    public static String abc(){
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    }
}
