/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list;

    public static void main( String[] args ) {
        list = new List_inArraySlots();

        /*System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add("important");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added string: " + list);

        list.add(17);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added int: " + list);

        list.add(1.618);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added double: " + list);

        list.add(false);
        System.out.println( "number of element: " + list.size() );
        System.out.println( "added double: " + list);

        // Add enough elements that expansion is expected
        for( int elemIndex = list.size(); elemIndex < 15; elemIndex++ ) {

            if( list.size() == 10) System.out.println( "expansion expected");

            list.add(-elemIndex);
            System.out.println( "number of elements: " + list.size() );
            System.out.println( list + System.lineSeparator());

        }
        System.out.println("result of expanded list: "
             + list.size() + " elements:");
        System.out.println( list + System.lineSeparator()); */

        list.add(3.14);
        list.add("piazza");
        list.add(6.28);
        list.add("pi");
        list.add(256);
        list.add(Double.POSITIVE_INFINITY);
        list.add("tau");
        list.add("pizza");
        list.add(1e4);
        list.add(Double.NEGATIVE_INFINITY);

        System.out.println(Accumulator.catElementsStartingWith(list,"pi"));
    }
}
