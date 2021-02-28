
package search;

import java.io.IOException;

/**
 * Test program for the Search class.
 */
public class SearchTest {
    
    /**
     * Test program for the Search class.
     * Put whatever tests you like in the body of the method.
     * @param args the command line arguments
     * @throws IOException of error reading the input
     */
    public static void main(String[] args) throws IOException {
        // Don't change this line
        final Search search = new Search();
        
        // You can set this to any of the text files in the data folder
        final FileStrings strings = new FileStrings("data/small.txt");
        
        // add your tests here
        System.out.println(search.longestWord(strings));
        System.out.println(search.countUnique(strings));
        System.out.println(search.findElement(strings, "the"));
        System.out.println(search.countGreaterOrEqual(strings, "its"));
    }
    
}
