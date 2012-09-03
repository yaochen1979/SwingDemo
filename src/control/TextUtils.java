/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOME
 */
public class TextUtils {
    
    public static byte[] stringToBinary(String inputText){
        
        byte[] showBinary = null;
        try {
            showBinary = inputText.getBytes("UTF-8");
            //System.out.println(Arrays.toString(showBinary));
            Logger.getLogger(TextUtils.class.getName()).log(Level.INFO, Arrays.toString(showBinary));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TextUtils.class.getName()).log(Level.INFO, "LOG TEST", ex);
        }
        
        return showBinary;
    }
    
    public static String binaryToString(byte[] inputBinary){
                
        String outputString = null;
        try {
            outputString = new String(inputBinary, "UTF-8");
            //System.out.println(outputString);
            Logger.getLogger(TextUtils.class.getName()).log(Level.INFO, outputString);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TextUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outputString;
    }
    
}
