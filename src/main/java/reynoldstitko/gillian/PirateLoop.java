package reynoldstitko.gillian;

import java.util.ArrayList;

/**
 * Created by gillianreynolds-titko on 2/21/17.
 */
public class PirateLoop {

    public int pirateCount(ArrayList<Integer> piratesInRoom){

        //go to the first pirate (0)
        int pirateToMoveTo = 0;

        ArrayList<Integer> piratesISpokeTo = new ArrayList<>();

        while(!piratesISpokeTo.contains(pirateToMoveTo)){
            piratesISpokeTo.add(pirateToMoveTo);
            pirateToMoveTo = piratesInRoom.get(pirateToMoveTo);
        }

        //indexOf(Object o) returns the index of the first occurrence of the specified element
        // in this list, or -1 if this list does not contain the element.
        return piratesISpokeTo.size() - piratesISpokeTo.indexOf(pirateToMoveTo);
    }
}
