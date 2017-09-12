package com.android.zzw.generalaffairs.Bean;

import android.widget.TextView;

/**
 * Created by zzw on 2017/9/10.
 */

public class mainRecyclerview {
    private String time;
    private int content;
    public mainRecyclerview(String t, int c){
        this.time=t;
        this.content=c;
    }


    public void setContent(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
