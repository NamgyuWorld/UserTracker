package com.namgyuworld.usertracker.network;

/**
 * Created by danielpark on 6/16/15.
 */
public class URLs {

    private static boolean isDebug;

    /**
     * Set debug mode or not
     * @param flag
     */
    public static void setDebug(boolean flag){
        isDebug = flag;
    }

    private static final String URL_HOST = "http://61.98.48.245:8080/spring/userTracker/trackingInfo";
    private static final String URL_DEV = "http://61.98.48.245:8080/spring/userTracker/trackingInfo";

    /**
     * Get url to send tracking data to Server
     * @return
     */
    public static String getURL(){
        if(isDebug)
            return URL_DEV;
        else
            return URL_HOST;
    }

}


