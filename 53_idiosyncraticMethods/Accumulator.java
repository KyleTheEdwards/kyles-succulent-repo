/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */

/*
Java protects a programmer against applying a method to elements in list when some elements of the list might omit support for a particular operation.

This protection is implemented by the Java compiler. The following attempt to violate the restriction is expected to result in the error "cannot find symbol".

for(int element = 0; element < list.size(); element++){
  if(list.get(element) instanceof String){
    if( list.get(element).startsWith(prefix)){
      result += list.get(element);
      result += ", ";
    }
  }
}

Accumulator.java:29: error: cannot find symbol
            if( list.get(element).startsWith(prefix)){
                                 ^
  symbol:   method startsWith(String)
  location: class Object

*/

/*
A programmer should expect to be able to work around the stumbling block because the JVM knows the type of an element.

Java's ____________ operator identifies the type of an element to the Java compiler 
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
            if( ((String)list.get(element)).startsWith(prefix)){
              result += list.get(element);
              result += ", ";
            }
          }
        }
        return result;
    }
}
