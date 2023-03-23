package ru.mirea.rudenok.hw;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

import java.util.Calendar;

public class MyTimeDialog{
    Calendar dateAndTime=Calendar.getInstance();

    public MyTimeDialog(MainActivity mainActivity) {
        TimePickerDialog.OnTimeSetListener t = new TimePickerDialog.OnTimeSetListener() {
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                dateAndTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
                dateAndTime.set(Calendar.MINUTE, minute);

            }
        };

        new TimePickerDialog(mainActivity, t, dateAndTime.get(Calendar.HOUR_OF_DAY), dateAndTime.get(Calendar.MINUTE), true).show();
    }


}
