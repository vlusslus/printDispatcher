package com.company;

import javax.print.Doc;

/**
 * Created by vlusslus on 25.10.2017.
 */
public class Document implements Comparable{

    private int id;
    private int duration;
    private String type;
    private String paper;

    public Document(int duration) {
        this.id = duration;
        this.duration = duration * 1000;
        this.type = "Обычный документ";
        this.paper = "Обычная бумага";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }

    public String getPaper() {
        return paper;
    }
}
