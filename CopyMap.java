package com.example;
import java.util.HashMap;
import java.util.Map;

public class CopyMap {
    public static void main(String[] args) {
        
        Map<String, String> sourceMap = new HashMap<>();
        sourceMap.put("India", "Delhi");
        sourceMap.put("United States", "Washington D.C.");
        sourceMap.put("United Kingdom", "London");
        Map<String, String> targetMap = new HashMap<>();
        targetMap.put("Zimbabwe", "Harare");
        targetMap.put("Norway", "Oslo");

       
        targetMap.putAll(sourceMap);

   
        if (targetMap.isEmpty()) {
            System.out.println("The target map is empty.");
        } else {
            System.out.println("The target map contains key-value mappings:");
            for (Map.Entry<String, String> entry : targetMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

     
        String key = "United Kingdom";
        if (targetMap.containsKey(key)) {
            System.out.println("The key '" + key + "' exists in the target map.");
        } else {
            System.out.println("The key '" + key + "' does not exist in the target map.");
        }
    }
}