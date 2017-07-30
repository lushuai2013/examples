package com.lushuai.java.uri;
import java.net.*;

/**
 * Created by lushuai on 17-7-30.
 */

public class URIDemo{
    public static void main (String [] args) throws Exception {
        String uriStr="query://jeff@books.com:9000/public/manuals/appliances?stove#ge";
        URI uri = new URI (uriStr);

        System.out.println ("uriStr = " +uriStr);
        System.out.println ("Authority = " +uri.getAuthority ());
        System.out.println ("Fragment = " +uri.getFragment ());
        System.out.println ("Host = " +uri.getHost ());
        System.out.println ("Path = " +uri.getPath ());
        System.out.println ("Port = " +uri.getPort ());
        System.out.println ("Query = " +uri.getQuery ());
        System.out.println ("Scheme = " +uri.getScheme ());
        System.out.println ("Scheme-specific part = " + uri.getSchemeSpecificPart ());
        System.out.println ("User Info = " +uri.getUserInfo ());
        System.out.println ("URI is absolute: " +uri.isAbsolute ());
        System.out.println ("URI is opaque: " +uri.isOpaque ());

        /**
         * 输出结果如下：
         query://jeff@books.com:9000/public/manuals/appliances?stove#ge
         Authority = jeff@books.com:9000
         Fragment = ge
         Host = books.com
         Path = /public/manuals/appliances
         Port = 9000
         Query = stove
         Scheme = query
         Scheme-specific part = //jeff@books.com:9000/public/manuals/appliances?stove
         User Info = jeff
         URI is absolute: true
         URI is opaque: false
         */
    }
}
