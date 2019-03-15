/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */

public class Accumulator {

    /**
      @return the concatenation of all the Strings
      in the \list that begin with \prefix,
      each followed by a space.
     */
    static String catElementsStartingWith(
        List_inArraySlots list
      , String prefix
      ) {
        String result = "";
        for(int element = 0; element < list.size(); element++){
          if(list.get(element) instanceof String){
            if( ((String) list.get(element)).startsWith(prefix)){
              result += list.get(element);
              result += ", ";
            }
          }
        }
        return result;
    }
}
