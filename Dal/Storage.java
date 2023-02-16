package Dal;

import Itillar.Iti;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Storage {
    
    public static void Data(Iti i){
        try{
            FileWriter fw=new FileWriter(i.getRute()+i.getKey()+".txt");
            fw.write(i.getCode());
            fw.close();
        }catch(Exception e){
            
        }
    }
    
    public static String readData(Iti i){
        String s="";
        File f=new File(i.getRute()+i.getKey()+".txt");
        try{
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                s=s+sc.nextLine();
            }
        }catch(Exception e){
            
        }
        return s;
    }
}

