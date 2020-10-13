package com.example.homework3;

public class MainPresenter {

    public static final MainPresenter instence = new MainPresenter();

    private int counter;

    private MainPresenter() {
        counter = 0;
    }

    public void incrementCounter(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static MainPresenter getInstance(){
        return instence;
    }
}
