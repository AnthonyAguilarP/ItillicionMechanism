package Itillar;

import java.io.File;

/**
 *
 * @author Anthony
 */
public class Iti {
    
    private String key,text,rute="";
    String code;

    public Iti() {
    }

    public Iti(String key, String text) {
        this.key = key;
        this.text = text;
    }

    public String getRute() {
        if("".equals(rute))return rute;
        return rute+File.separator;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public String getCode() {
        return code;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
