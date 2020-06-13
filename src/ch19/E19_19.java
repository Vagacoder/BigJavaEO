package ch19;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * E19.19 Write a function that returns a list of all positions of a given character 
 * in a string. Produce two versions—one with streams and one without. Which one 
 * is easier to implement?
 * 
 */
public class E19_19 {
    
    public static void main(String[] args){
        String a = "Hello world";

        Map<String, Long> table = Stream.of(a.split("")).collect(
            Collectors.groupingBy(s -> s, Collectors.counting())
            );
        System.out.println(table);

        Map<String, Integer> table1 = new HashMap<>();
        for(int i = 0; i < a.length(); i++){
            String ch = "" + a.charAt(i);
            Integer count = table1.get(ch);
            if(count != null){
                table1.put(ch, table1.get(ch)+1);
            }else{
                table1.put(ch, 1);
            }
        }
        System.out.println(table1);
    }
}