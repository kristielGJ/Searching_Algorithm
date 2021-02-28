
package search;

import javax.swing.*;
import java.util.HashSet;

/**
 * Class of operations on ordered lists of strings.
 * You should fill in the bodies of these methods.
 */
public class Search {

    /**
     * Returns the index of the longest string in the list.
     * If there are several string of this length, the
     * indexed returned is the that of the first.
     *
     * @param a list of strings, in ascending order
     * @return position of an entry with the longest string in the list
     */
    public int longestWord(StringList a) {
        int longestPos = 0;

        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(longestPos).length() < a.get(i).length()) {
                longestPos = i;
            }
        }

        System.out.println("The Longest word: ");
        return longestPos;
    }

    /**
     * Returns the number of unique elements in the list
     *
     * @param a list of strings, in ascending order
     * @return number of unique elements in the list.
     */

    public int countUnique(StringList a) {
        HashSet<String> uniqueCount = new HashSet<String>();

        for( int i =0; i < a.size(); i++){
            uniqueCount.add(a.get(i));
        }

        System.out.println("Unique elements: ");
        return uniqueCount.size();
    }

    /**
     * Search for a string in an ordered collection
     *
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return position of an element equal to k, if any, otherwise -1
     */

    public int findElement(StringList a, String k) {
        int lVal = 0;
        int rVal = a.size() -1;
        int f = 0;
        int i = 0;
        int midVal = 0;

        while (lVal <= rVal && f != 1) {
            midVal = (lVal + rVal) / 2;
            if (a.get(midVal).equals(k)) {
                f = 1;
                i = midVal;
                break;
            } else {
                if (a.get(midVal).compareTo(k) >= 1) {
                    rVal = midVal - 1;
                } else {
                    lVal = midVal + 1;
                }
            }
        }

        if (lVal > rVal) {
            System.out.println("Not found");
            return -1;
        } else {
            System.out.println("The element was found");
            return lVal;
        }
    }



    /**
     * Position of a string in an ordered collection
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return number of strings in the collection a greater than or equal to k
     */


    public int countGreaterOrEqual(StringList a, String k) {
        int f ;
        int lVal = 0;
        int rVal = a.size() - 1;
        int midVal = 0;

        while (lVal <= rVal) {
            midVal = (lVal + rVal) / 2;
            f=k.compareTo(a.get(midVal));
            if(f<=0){
                rVal = midVal - 1;
            }
            else {
                lVal = midVal + 1;
            }
        }

        System.out.println("Equal or greater numbers: ");
        return a.size() - lVal;
    }

}