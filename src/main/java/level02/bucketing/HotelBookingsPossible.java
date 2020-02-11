package level02.bucketing;

import java.util.ArrayList;
import java.util.Comparator;

public class HotelBookingsPossible {

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        if (arrive == null || depart == null) {
            return false;
        }

        if (arrive.size() != depart.size()) {
            return false;
        }
        arrive.sort(Comparator.naturalOrder());
        depart.sort(Comparator.naturalOrder());
        //System.out.println(arrive);
        //System.out.println(depart);


        int i = 0;
        int j = 0;
        int roomsTaken = 0;
        while (i < arrive.size() && j < depart.size() && roomsTaken <= K) {
            if (arrive.get(i) < depart.get(j)) {
                i++;
                roomsTaken++;
            } else {
                j++;
                //releases the room here
                roomsTaken--;
            }
        }
        return !(roomsTaken > K);
    }
}
