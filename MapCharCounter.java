package mapcharcounter;

import java.util.HashMap;
import java.util.Map;

public class MapCharCounter {

    public static void main(String[] args) {
        Map<Character, Integer> karakterEloszlas = new HashMap();
        String word = "aalma";
       
        for (int i = 0; i < word.length(); i++) {
            Character key = word.charAt(i);
            
          if (karakterEloszlas.containsKey(key)){
             int temp = karakterEloszlas.get(key);
              temp ++;
              karakterEloszlas.put(key, temp);}
              
              else{
                    karakterEloszlas.put(key, i);
                      }
          }
         System.out.println(karakterEloszlas);
        }
       
    }


