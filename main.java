import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /**
     * Takes two lists of indices and matches each one from list 1 to the closest index in list 2 and calculates their
     * distances.
     *
     * Example:
     * Text =       "War and peace, peace and war. War, War, War. Give Peace a chance, we all want peace."
     * Indices =     0    1    2      3    4   5    6    7    8    9    10   11  12    13  14  15   16
     *
     * list war = [0,5,6,7,8]
     * list peace = [2,3,10,16]
     * returns [[0,2,2],[5,3,2],[6,10,4],[7,16,9]]
     *
     * @param l1 List 1
     * @param l2 List 2
     * @return a list of matched indices
     */
    public static ArrayList<ArrayList<Integer>> matchProximity(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<ArrayList<Integer>> matchedProximity = new ArrayList<>();

        for (int i : l1) {
            int closest;
            int distance;

            if (!l2.isEmpty()) {
                closest = l2.getFirst();
                distance = Math.abs(i - closest);
            } else {
                break;
            }

            for (int i2 : l2) {
                if (Math.abs(i - i2) < distance ) {
                    closest = i2;
                    distance = Math.abs(i - closest);
                }
            }
            matchedProximity.add(new ArrayList<>(Arrays.asList(i, closest, distance)));
            l2.remove(Integer.valueOf(closest));
        }

        return matchedProximity;
    }
}
