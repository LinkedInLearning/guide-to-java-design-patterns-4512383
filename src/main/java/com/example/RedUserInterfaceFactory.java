package com.example;

public class RedUserInterfaceFactory implements UserInterfaceFactory {


    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new RedScrollBar();
    }
}
