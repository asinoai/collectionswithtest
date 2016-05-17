package aron.sinoai.collectionswithtest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 */
public class LoopsTest {

    @Test
    public void forTest() {

        final List<Integer> list = Arrays.asList(1, 75, 25);
        final int[] array = new int[] {1, 75, 25, 100};

        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(list.get(i), new Integer(array[i]));
        }
    }

    @Test
    public void forEachTest() {

        final Iterable<Integer> list = Arrays.asList(1, 75, 25);

        boolean found = false;

        for (final Integer item : list) {
            if (item.equals(75)) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found);
    }

    @Test
    public void forEachArrayTest() {

        final int[] list = {1, 75, 25};

        boolean found = false;

        for (final int item : list) {
            if (item == 75) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found);
    }

    @Test
    public void whileTest() {

        final List<Integer> list = Arrays.asList(1, 75, 25);
        final int[] array = new int[] {1, 75, 25, 100};


        int i = 0;
        while (i < list.size()) {
            Assert.assertEquals(list.get(i), new Integer(array[i]));
            i++;
        }
    }

    @Test
    public void whileNonArrayTest() {

        final Iterable<Integer> list = Arrays.asList(1, 75, 25);

        boolean found = false;
        final Iterator<Integer> iterator = list.iterator();

        while ( !found && iterator.hasNext() ) {
            Integer item = iterator.next();
            found = (item.equals(75));
        }

        Assert.assertTrue(found);
    }

    @Test
    public void doWhileTest() {

        final List<Integer> list = Arrays.asList(1, 75, 25);
        final int[] array = new int[] {1, 75, 25, 100};


        int i = 0;
        do  {
            Assert.assertEquals(list.get(i), new Integer(array[i]));
            i++;
        } while (i < list.size());
    }

}
