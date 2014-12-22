package com.junya.toolboxtest;

import java.util.ArrayList;
import java.util.List;

public class TimeTableManager {
    private static TimeTableManager thisInstance = new TimeTableManager();
    private static String[] TimeArray = {"Google", "Yahoo", "Apple", "Microsoft", "Sony", "Intel","Asus"};
    private List<TimeTable> times;

    private TimeTableManager() {
    }

    public static TimeTableManager getInstance() {
        return thisInstance;
    }

    public List<TimeTable> getTimes() {
        if (times == null) {
            times = new ArrayList<TimeTable>();

            for (String time : TimeArray) {
                TimeTable timetable = new TimeTable();
                timetable.name = time;
                times.add(timetable);
            }
        }

        return times;
    }
}
