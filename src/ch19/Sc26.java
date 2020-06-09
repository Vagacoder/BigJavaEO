package ch19;

import java.util.Optional;
import java.util.stream.Stream;

/*
 * SC 26  Set word to the first word in the list wordList containing the letter 
 * a, or to the empty string if there is no match.
 * 
 * SC 27 Repeat Self Check 26 using ifPresent.
 * 
 * SC 28 Repeat Self Check 26 using isPresent.
 * 
 */
public class Sc26 {
   
    public static void main(String[] args){

        String[] s = {"this", "may", "be", "a", "good", "chance", "to", "do", "it"};
        
        // * SC 26
        System.out.println("SC 26");
        System.out.println(Stream.of(s)
                        .filter(w -> w.contains("a"))
                        .findFirst()
                        .orElse("Not found!")
                        );
        System.out.println(Stream.of(s)
                        .filter(w -> w.contains("f"))
                        .findFirst()
                        .orElse("Not found!")
                        );

        // * SC 27
        System.out.println("\nSC 27");
        Optional<String> result = Stream.of(s).filter(w -> w.contains("a")).findFirst();
        result.ifPresent(w -> System.out.println(w));
        result = Stream.of(s).filter(w -> w.contains("f")).findFirst();
        result.ifPresent(w -> System.out.println(w));

        // * SC 28
        System.out.println("\nSC 28");
        result = Stream.of(s).filter(w -> w.contains("a")).findFirst();
        if(result.isPresent()){
            System.out.println(result.get());
        }else{
            System.out.println("Not found!");
        }

        result = Stream.of(s).filter(w -> w.contains("f")).findFirst();
        if(result.isPresent()){
            System.out.println(result.get());
        }else{
            System.out.println("Not found!");
        }
    }
}