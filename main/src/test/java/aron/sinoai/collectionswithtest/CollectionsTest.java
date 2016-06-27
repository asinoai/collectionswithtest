package aron.sinoai.collectionswithtest;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 */
public class CollectionsTest {

    @Test
    public void basicArrayListTest() {
        final List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.addAll(Arrays.asList(1, 25, 75));

        Assert.assertEquals(new Integer(1), list.get(0));
        Assert.assertEquals(new Integer(3), list.get(1));
        Assert.assertEquals(new Integer(1), list.get(2));
        Assert.assertEquals(new Integer(25), list.get(3));
        Assert.assertEquals(new Integer(75), list.get(4));
    }

    @Test
    public void basicLinkedListTest() {
        final List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(3);
        list.add(0, 100);

        Assert.assertEquals(new Integer(100), list.get(0));
        Assert.assertEquals(new Integer(1), list.get(1));
        Assert.assertEquals(new Integer(3), list.get(2));
    }

    @Test
    public void basicHashSetTest() {
        final Set<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(1, 3));
        set.add(1);

        Assert.assertTrue(set.contains(1));
        Assert.assertTrue(set.contains(3));
        Assert.assertEquals(set.size(), 2);
    }

    @Test
    public void basicTreeSetTest() {
        final Set<Integer> set = new TreeSet<>();

        set.addAll(Arrays.asList(7, 2, 3, 9));

        final Iterator<Integer> iterator = set.iterator();

        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(new Integer(2), iterator.next());
        Assert.assertEquals(new Integer(3), iterator.next());
        Assert.assertEquals(new Integer(7), iterator.next());
        Assert.assertEquals(new Integer(9), iterator.next());
    }

    @Test
    public void basicHashMapTest() {
        final Map<String, Integer> map = new HashMap<>();

        map.put("monday", 1);
        map.put("tuesday", 2);
        map.put("friday", -5);
        final Integer oldFridayNumber = map.put("friday", 5);

        Assert.assertEquals(new Integer(1), map.get("monday"));
        Assert.assertEquals(new Integer(2), map.get("tuesday"));
        Assert.assertEquals(new Integer(5), map.get("friday"));
        Assert.assertEquals(new Integer(-5), oldFridayNumber);
        Assert.assertEquals(map.size(), 3);
    }

    @Test
    public void basicTreeMapTest() {
        final Map<String, Integer> map = new TreeMap<>();

        map.put("monday", 1);
        map.put("tuesday", 2);
        map.put("friday", -5);
        final Integer oldFridayNumber = map.put("friday", 5);

        Assert.assertEquals(new Integer(1), map.get("monday"));
        Assert.assertEquals(new Integer(2), map.get("tuesday"));
        Assert.assertEquals(new Integer(5), map.get("friday"));
        Assert.assertEquals(new Integer(-5), oldFridayNumber);
        Assert.assertEquals(map.size(), 3);
    }

    @Test
    public void customArrayListTest() {
        final List<Fruit> list = new ArrayList<>();

        Fruit alma = new Fruit("alma", 1.5);
        list.add(alma);
        list.add(new Fruit("korte", 2.0));
        list.addAll(Arrays.asList(new Fruit("alma", 1.5), new Fruit("korte", 2.0), null));

        Assert.assertEquals(new Fruit("alma", 1.5), list.get(0));


        Assert.assertTrue(list.contains(new Fruit("alma", 1.5)));
    }

    @Test
    public void customHashSetTest() {
        final Set<Fruit> set = new HashSet<>();

        set.addAll(Arrays.asList(new Fruit("alma", 1.5), new Fruit("korte", 2.0)));
        set.add(new Fruit("alma", 1.5));

        Assert.assertTrue(set.contains(new Fruit("alma", 1.5)));
        Assert.assertEquals(2, set.size());

    }

    @Test
    public void customHashMapTest() {
        final Map<Fruit, Integer> map = new HashMap<>();

        map.put(new Fruit("alma", 1.5), 1);
        map.put(new Fruit("alma", 2.0), 2);
        map.put(new Fruit("korte", 2.0), -5);
        final Integer oldFridayNumber = map.put(new Fruit("korte", 2.0), 5);

        Assert.assertEquals(new Integer(1), map.get(new Fruit("alma", 1.5)));
        Assert.assertEquals(new Integer(2), map.get(new Fruit("alma", 2.0)));
        Assert.assertEquals(new Integer(5), map.get(new Fruit("korte", 2.0)));
        Assert.assertEquals(new Integer(-5), oldFridayNumber);
        Assert.assertEquals(map.size(), 3);
    }

}