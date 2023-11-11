package com.example;

public class UserInterface {

    private Button button;
    private ScrollBar scrollBar;

    public UserInterface(Button button, ScrollBar scrollBar) {
        this.button = button;
        this.scrollBar = scrollBar;
    }

    public Button getButton() {
        return button;
    }

    public ScrollBar getScrollBar() {
        return scrollBar;
    }
    @Override
    public String toString() {
        return "UserInterface{" +
                "button=" + button.getColor() +
                ", scrollBar=" + scrollBar.getColor() +
                '}';
    }
}
