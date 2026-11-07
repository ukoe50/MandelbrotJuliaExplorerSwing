/*
 * Created @Uwe Koehler , 04.03.2006
 */
package utils;

import java.util.StringTokenizer;

/**
 * Stellt Methoden zur Formatierung von Java-Datentypen zur Verf�gung
 */
public class TypeFormatter {
    
    /**
     * Double Rundung auf 1 Nachkommastelle 
     */
    public static String doubleAsString_1(double doubleVal){
        String retStr = String.valueOf(doubleVal);
        if (retStr.contains(".")){
            StringTokenizer tok = new StringTokenizer(retStr, ".", false);
            String sBefore = tok.nextToken();
            String sAfter = tok.nextToken();
            if (sAfter.length() > 1){
                int i1 = Integer.parseInt(sAfter.substring(0,1));
                int i2 = Integer.parseInt(sAfter.substring(1,2));
                if (sAfter.contains("E-")){
                    retStr = "0.0";  
                }
                else if (i1 == 9 && i2 >= 5){
                    sBefore = String.valueOf(Integer.parseInt(sBefore) + 1);
                    retStr = sBefore;
                }
                else if (i2 >= 5){
                    i1++;
                    retStr = sBefore + "." + i1;
                }
                else {
                    retStr = sBefore + "." + i1;  
                }
            }
        }
        return retStr;
    }

    /**
     * Double Rundung auf 2 Nachkommastellen
     */
    public static String doubleAsString_2(double doubleVal){
        String retStr = String.valueOf(doubleVal);
        if (retStr.contains(".")){
            StringTokenizer tok = new StringTokenizer(retStr, ".", false);
            String sBefore = tok.nextToken();
            String sAfter = tok.nextToken();
            if (sAfter.length() > 2){
                int i1 = Integer.parseInt(sAfter.substring(0,2));
                int i2 = Integer.parseInt(sAfter.substring(2,3));
                if (sAfter.contains("E-")){
                    retStr = "0.0";  
                }
                else if (i1 == 99 && i2 >= 5){
                    sBefore = String.valueOf(Integer.parseInt(sBefore) + 1);
                    retStr = sBefore;
                }
                else if (i2 >= 5){
                    retStr = sBefore + "." + ++i1;
                }
                else {
                    retStr = sBefore + "." + i1;  
                }
            }
        }
        return retStr;
    }
    
    /**
     * Returns a formatted double as String
     */
    public static String formatDouble(double d, int size){
        String s = ""+d;
        if (s.length() > size){
            s = s.substring(0,size);
        }
        return s;
    }
    
    
    /**
     * Checks if a string is a valid double
     */
    public static double stringAsDouble(String s) {
        double d;
        try {
            d = java.lang.Double.parseDouble(s);
        } catch (NumberFormatException nfe) {
            //System.out.println("nfe exception");
            d = 0.0;
        }
        //System.out.println(d);
        return d;
    }
    
    /**
     * Checks if a string is a valid integer
     */
    public static int stringAsInt(String s) {
        int i;
        try {
            i = java.lang.Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            //System.out.println("nfe exception");
            i = 0;
        }
        //System.out.println(d);
        return i;
    } 
    
    /**
     * Returns a formatted int as String
     */
    public static String formatInt(int i, int size){
        String s = ""+i;
        if (s.length() > size){
            s = s.substring(0,size);
        }
        return s;
    }
}
