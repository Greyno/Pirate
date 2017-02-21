package reynoldstitko.gillian;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by gillianreynolds-titko on 2/21/17.
 */
public class PirateLoopTest {

    PirateLoop pirateLoop;

    @Before
    public void setup(){
        pirateLoop = new PirateLoop();
    }

    @Test
    public void pirateCountTest(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(3);
        input.add(1);
        input.add(4);
        input.add(5);
        input.add(0);

        int expected = 6;
        int actual = pirateLoop.pirateCount(input);
        assertEquals("Expect the values to be equal", expected, actual);
    }


    @Test
    public void pirateCountTest2(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(0);
        int expected = 2;
        int actual = pirateLoop.pirateCount(input);
        assertEquals("Expect the values to be equal", expected, actual);
    }

    @Test
    public void pirateCountTest3(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);
        int expected = 2;
        int actual = pirateLoop.pirateCount(input);
        assertEquals("Expect the values to be equal", expected, actual);
    }

    @Test
    public void pirateCountTest4(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(0);
        input.add(1);
        int expected = 2;
        int actual = pirateLoop.pirateCount(input);
        assertEquals("Expect the values to be equal", expected, actual);
    }

    @Test
    public void pirateCountTest5(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        input.add(3);
        input.add(2);
        int expected = 2;
        int actual = pirateLoop.pirateCount(input);
        assertEquals("Expect the values to be equal", expected, actual);
    }


    @Test
    public void pirateCountTest6(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(2);
        input.add(4);
        input.add(4);
        input.add(0);
        int expected = 3;
        int actual = pirateLoop.pirateCount(input);
        assertEquals("Expect the values to be equal", expected, actual);
    }

}
