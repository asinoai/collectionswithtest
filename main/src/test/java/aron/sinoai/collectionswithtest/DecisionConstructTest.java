package aron.sinoai.collectionswithtest;

import org.junit.Assert;
import org.junit.Test;

/**
 */
public class DecisionConstructTest {


    @Test
    public void basicIfTest() {

        Assert.assertEquals(15, maximum(1, 15));

    }

    private int maximum(final int a, final int b) {
        final int result;

        if (a > b ) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

    @Test
    public void basicSwitchIntegerTest() {

        Assert.assertEquals("monday", weekday(1));
        Assert.assertEquals("friday", weekday(5));
        Assert.assertEquals("unknown", weekday(2));


    }

    private String weekday(final int weekday) {
        final String result;

        switch (weekday) {
            case 1 : {
                result = "monday";
                break;
            }

            case 5 : {
                result = "friday";
                break;
            }

            default : {
                result = "unknown";
            }
        }

        return result;
    }

    @Test
    public void basicSwitchStringTest() {

        Assert.assertEquals(1, dayOfWeek("monday"));
        Assert.assertEquals(5, dayOfWeek("friday"));
        Assert.assertEquals(-1, dayOfWeek("tuesday"));

    }

    private int dayOfWeek(final String day) {
        final int result;

        switch (day) {
            case "monday" : {
                result = 1;
                break;
            }

            case "friday" : {
                result = 5;
                break;
            }

            default : {
                result = -1;
            }
        }

        return result;


    }

    @Test
    public void basicEnumStringTest() {

        Assert.assertEquals("monday", dayOfWeekWithEnum(WeekDays.MONDAY));
        Assert.assertEquals("friday", dayOfWeekWithEnum(WeekDays.FRIDAY));

    }

    public enum WeekDays {
        MONDAY,
        FRIDAY
    }

    private String dayOfWeekWithEnum(final WeekDays day) {
        final String result;

        switch (day) {
            case MONDAY : {
                result = "monday";
                break;
            }

            case FRIDAY : {
                result = "friday";
                break;
            }

            default : {
                result = null;
            }
        }

        return result;


    }

}
