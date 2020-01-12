 
package ibank.remittance.utils;

/**
 * @author Maduranga
 */

public class DateUtil {

    public static String getDateTime() {
        java.util.Date dt = new java.util.Date(); 
        java.text.SimpleDateFormat sdf
                = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        return sdf.format(dt); 
    } 

}
