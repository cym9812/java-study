package study;

import java.net.*;
/**
 * Usage: java DNSLookUp <IP name>
 * i.e. java DNSLookUp www.wiley.com
 */
public class iplookup {
    public static void main (String[] args){
        InetAddress hostAddress;
        try {
            hostAddress = InetAddress.getByName ("www.ietf.org");
            System.out.println (hostAddress.getHostAddress());
        }
        catch (UnknownHostException uhe) {
            System.err.println ("Unknown host: " + args[0]);
        }
    }
}
