package com.company;

import java.util.Random;

public class DateInterval {
    private Date start;
    private Date finish;
    private static  Random rnd = new Random(System.currentTimeMillis());
    private int days=0;


    public DateInterval(Date start, Date finish) {
        this.start = start;
        this.finish = finish;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }


    public int getDays(){
        int min = 1;
        int max = 100;
        if (days == 0) {
            days =min+rnd.nextInt(max-min+1);

        }
        return days;
    }

    @Override
    public String toString() {
        return "["+ start+';' + finish +']';
    }
}
