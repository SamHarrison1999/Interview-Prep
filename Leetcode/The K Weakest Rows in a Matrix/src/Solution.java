import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> weakestRowsList = new ArrayList();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int row = 0; row < mat.length; row ++) {
            int numberOfSoldiers = 0;

            for (int column = 0; column < mat[row].length; column ++) {
                if (mat[row][column] == 1) {
                    numberOfSoldiers++;
                }

            }
            // Add row and number of soldiers to tree map
            map.put(row, numberOfSoldiers);
        }

        // Sort treeMap by value
        Map sortedMap = valueSort(map);

        // Get entry set of the TreeMap using entrySet method
        Set<Map.Entry<Integer, Integer> > entrySet = sortedMap.entrySet();

        // Convert entrySet to Array using toArray method
        Map.Entry<Integer, Integer>[] entryArray = entrySet.toArray(new Map.Entry[entrySet.size()]);

        // Add lowest k rows to list from sorted map
        for (int i = 0; i < k; i++)
        {
            weakestRowsList.add(entryArray[i].getKey());
        }

        // Convert Integer list to int array
        int[] weakestRows = weakestRowsList.stream().mapToInt(Integer::intValue).toArray();

        return weakestRows;
    }

    public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map) {
        // Static Method with return type Map and
        // extending comparator class which compares values
        // associated with two keys
        Comparator<K> valueComparator = new Comparator<K>() {

            // return comparison results of values of two keys
            public int compare(K k1, K k2)
            {
                int comp = map.get(k1).compareTo(
                        map.get(k2));
                if (comp == 0)
                    return 1;
                else
                    return comp;
            }

        };

        // SortedMap created using the comparator
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);

        sorted.putAll(map);

        return sorted;
    }
}