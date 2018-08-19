package com.tokobuku.impl;

import com.tokobuku.common.People;

public class Man {

    private People human;
    private String address;

    public void setHuman(People human) {
        System.out.println("**** Setter human with parameter human is called ****");
        this.human = human;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Man{" +
                "human=" + human +
                ", address='" + address + '\'' +
                '}';
    }

    public void showHuman() {
        System.out.println(human);
    }

    public void startWalk() {
        human.walk();
    }

}
