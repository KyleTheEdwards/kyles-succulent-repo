/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

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
    private Element[] elements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    /*public List_inArraySlots() {
      intElements = new int[INITIAL_CAPACITY];
      doubleElements = new double[INITIAL_CAPACITY];
      stringElements = new String[INITIAL_CAPACITY];
      typeOfElements = new int[INITIAL_CAPACITY];
    }*/

    public List_inArraySlots(){
      elements = new Element[INITIAL_CAPACITY];
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
    /*public String toString() {

      String retString = "[";

      for (int element = 0; element < filledElements; element++){
        if(typeOfElements[element] == 0){
          retString += Integer.toString(intElements[element]);
        } else if (typeOfElements[element] == 1){
          retString += Double.toString(doubleElements[element]);
        } else if (typeOfElements[element] == 2){
          retString += stringElements[element];
        }
        retString += ", ";
      }

      return retString + "]";
    }*/

    public String toString() {

      String retString = "[";

      for (int element = 0; element < filledElements; element++){
        switch(elements[element].getType()){
          case 0:
          retString += Integer.toString(elements[element].i);
          break;

          case 1:
          retString += Double.toString(elements[element].d);
          break;

          case 2:
          retString += elements[element].str;
        }

        retString += ", ";
      }

      return retString + "]";

    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
      /*public boolean add( int type, int intValue, double doubleValue, String stringValue) {

        if(typeOfElements.length <= filledElements){
          expand();
        }

        if(type == 0){
          intElements[filledElements] = intValue;
        } else if (type == 1){
          doubleElements[filledElements] = doubleValue;
        } else if (type == 2){
          stringElements[filledElements] = stringValue;
        }

        typeOfElements[filledElements] = type;

        filledElements++;

        return true;
      }*/

    public boolean add(int type, int intValue, double doubleValue, String stringValue){

      if (elements.length <= filledElements){
        expand();
      }

      Element toAdd = new Element(type);

      toAdd.i = intValue;
      toAdd.d = doubleValue;
      toAdd.str = stringValue;

      elements[filledElements] = toAdd;

      filledElements++;

      return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
      /*private void expand() {
        System.out.println( "expand... (for debugging)");
           // S.O.P. rules for debugging:
              // Working methods should be silent. But during
              // development, the programmer must verify that
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // 

        int newLength = intElements.length * 2;

        int[] newIntElements = new int[newLength];
        double[] newDoubleElements = new double[newLength];
        String[] newStringElements = new String[newLength];
        int[] newTypeOfElements = new int[newLength];

        for(int element = 0; element < newLength/2; element++){
          newIntElements[element] = intElements[element];
          newDoubleElements[element] = doubleElements[element];
          newStringElements[element] = stringElements[element];
          newTypeOfElements[element] = typeOfElements[element];
        }

        intElements = newIntElements;
        doubleElements = newDoubleElements;
        stringElements = newStringElements;
        typeOfElements = newTypeOfElements;

      }*/

    private void expand(){

      Element[] newElements = new Element[elements.length * 2];

      for(int element = 0; element < filledElements; element++){
        newElements[element] = elements[element];
      }

      elements = newElements;
    }

    public Element get(int index){
      return elements[index];
    }
}
