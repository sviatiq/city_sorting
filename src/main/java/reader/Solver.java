package reader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solver {

    public static List<String> solve(List<String> availableCities) {
         class SolverClass{
             public List<String> sortWords(List list, char letter) {
                 List temp = new ArrayList();

                 for (int i = 0; i < list.size(); i++) {
                     if (letter == list.get(i).toString().toLowerCase().charAt(0)) {
                         String firstWord = list.get(i).toString();
                         List newList = new ArrayList(list);
                         newList.remove(i);
                         newList = sortWords(newList, firstWord.charAt(firstWord.length() - 1));

                         if (temp.size() - 1 < newList.size()) {
                             temp = new ArrayList(newList);
                             temp.add(0, firstWord);
                         }
                     }
                 }
                 return temp;
             }
        }
        SolverClass sc = new SolverClass();

        List temp = new ArrayList();

        for (int i = 0; i < availableCities.size(); i++) {
            String firstWord = availableCities.get(i);
            List newList = new ArrayList(availableCities);
            newList.remove(i);
            newList = sc.sortWords(newList, firstWord.toLowerCase().charAt(firstWord.length() - 1));

            if (temp.size()-1 < newList.size()) {
                temp = new ArrayList(newList);
                temp.add(0, firstWord);
            }
        }
        return temp;
    }


}
