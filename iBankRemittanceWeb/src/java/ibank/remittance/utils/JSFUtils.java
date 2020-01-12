package ibank.remittance.utils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Maduranga
 */
public class JSFUtils {

    public static void forceRedirect(String toPath) {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect(toPath);
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(JSFUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long getTimeDiff(String lastActionDateTime) {
        try {

            if (lastActionDateTime.isEmpty()) {
                return 0;
            }

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1 = null;
            Date d2 = null;
            d2 = format.parse(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            d1 = format.parse(lastActionDateTime);
            long diff = d2.getTime() - d1.getTime();
            return diff / (60 * 1000);
        } catch (ParseException ex) {
            ex.printStackTrace();
            Logger.getLogger(JSFUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
