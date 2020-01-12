package ibank.remittance.utils;

/**
 * @author Maduranga
 */
public class LogUtil {

    public static void logAuditData(String userId, String function, String page,String ipAddress) {

        //new ContextBean().getUserAuthContextBean().logAuditData(userId, function, page, ipAddress);
    }

    public static void logEventData(String function, String page, String message, Exception e) {

        //new ContextBean().getUserAuthContextBean().logEventData(function, page, message, e);
    }
}

