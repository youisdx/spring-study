package com.spring.IoC.xml;

import java.util.List;

public class Boss {
    private String name;
    private String company;
    private Car car;
    private List<String> Hobbies;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Car getCar() {
        return car;
    }

    public List<String> getHobbies() {
        return Hobbies;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", car=" + car +
                ", Hobbies=" + Hobbies +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setHobbies(List<String> hobbies) {
        Hobbies = hobbies;
    }
}
