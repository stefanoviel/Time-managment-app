package it.unitn.lingprogmod1.viel.timeApp;

import java.util.ArrayList;

public class Applications extends ArrayList<App> {

    float average_time(){
        float sum = 0;
        for (int i = 0; i < this.size(); i++) {
            sum += this.get(i).time_today;
        }
        return  sum/this.size();
    }



}
