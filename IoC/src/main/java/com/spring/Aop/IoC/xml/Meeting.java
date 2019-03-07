package com.spring.Aop.IoC.xml;

import java.util.List;

public class Meeting {
    private String theme;
    private List<Boss> Bosses;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBosses() {
        return Bosses;
    }

    public void setBosses(List<Boss> bosses) {
        Bosses = bosses;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", Bosses=" + Bosses +
                '}';
    }
}
