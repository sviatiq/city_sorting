package reader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solver {

    public static List<String> solve(List<String> availableCities) {
         class SolverClass{
             public List<String> sortWords(List list, char letter) {
                 List temp = new ArrayList();
                 List newList = new ArrayList(list);
                 List ret;

                 for (int i = 0; i < list.size(); i++) {
                     if (letter == '\0' || letter == list.get(i).toString().toLowerCase().charAt(0)) {
                         String firstWord = list.get(i).toString();

                         newList.remove(i);

                         ret = sortWords(newList, firstWord.toLowerCase().charAt(firstWord.length() - 1));

                         if (temp.size()-1 < ret.size()) {
                             temp = ret;
                             temp.add(0, firstWord);
                         }

                         newList.add(i, firstWord);
                     }
                 }
                 return temp;
             }
        }
        SolverClass sc = new SolverClass();

        return sc.sortWords(availableCities, '\0');
    }


}
