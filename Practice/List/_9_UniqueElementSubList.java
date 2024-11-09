package list;

import java.util.*;

public class _9_UniqueElementSubList {

    public static List<String> findLongestUniqueSublist(List<String> list) {        
        Set<String> set = new HashSet<>();

        List<String> longestSublist = new ArrayList<>();
        
        List<String> tempSublist = new ArrayList<>();

        for (String element : list) {
            if (!set.contains(element)) {
                tempSublist.add(element);
                set.add(element);
            } else {
                if (tempSublist.size() > longestSublist.size()) {
                    longestSublist = new ArrayList<>(tempSublist);
                }
                while (!tempSublist.isEmpty() && !tempSublist.get(0).equals(element)) {
                    set.remove(tempSublist.get(0));
                    tempSublist.remove(0);
                }
                tempSublist.remove(0); 
                tempSublist.add(element);
            }
        }

        if (tempSublist.size() > longestSublist.size()) {
            longestSublist = tempSublist;
        }

        return longestSublist;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "mango", "banana", "apple");
        List<String> longestUniqueSublist = findLongestUniqueSublist(list);
        System.out.println("Longest sublist with unique elements: \n" + longestUniqueSublist);
    }

}
