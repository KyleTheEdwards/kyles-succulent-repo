public class List_inArraySlots {

    /*
    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    */

    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
    */
    
    private int filledElements;
    private Object[] elements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */

    public List_inArraySlots(){
      elements = new Object[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
      return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */

    public String toString() {

      String retString = "[";

      for (int element = 0; element < filledElements; element++){
        retString += elements[element].toString();
        retString += ", ";
      }

      return retString + "]";

    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */

    public boolean add(Object value){

      if (elements.length <= filledElements) expand();

      elements[filledElements] = value;

      filledElements++;

      return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */

    private void expand(){

      Object[] newElements = new Object[elements.length * 2];

      for(int element = 0; element < filledElements; element++){
        newElements[element] = elements[element];
      }

      elements = newElements;
    }

    public Object get(int index){
      return elements[index];
    }
}
