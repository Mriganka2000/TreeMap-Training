package com.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        
        map.put(2, "Ram");
        map.put(5, "Sam");
        map.put(1, "Hbd");
        map.put(3, "Dbc");
        map.put(8, "Sdc");
        map.put(6, "Fvc");
        map.put(9, "Edc");
        map.put(7, "Scd");
        map.put(4, "Fvb");
        
        NavigableMap<Integer, String> reverse = map.descendingMap();
        
        for (Map.Entry<Integer, String> item : reverse.entrySet()) {
        	System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
