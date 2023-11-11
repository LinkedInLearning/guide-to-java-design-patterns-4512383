package com.example;

public class BlueUserInterfaceFactory implements UserInterfaceFactory {


    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new BlueScrollBar();
    }
}
