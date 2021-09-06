


package com.qualcomm.snapdeagonproject;

import javax.jws.WebService;
import javax.xml.ws.WebServiceClient;
import java.util.regex.PatternSyntaxException;

@WebServiceClient
@WebService
public class L2_Switch {

    public static void main (String [] args){
        int number = 29;
        String size;
        switch (number){
            case 29:
                size ="Small";
                System.out.println(size);
                break;
            case 42:
                size ="Medium";
                System.out.println(size);
                break;
            case 44:
                size="Large";
                System.out.println(size);
                break;
            case 48:
                size="Extra Large";
                System.out.println(size);
                break;
            default:
                size = "Unknown";
                System.out.println(size);
        }
    }



}
