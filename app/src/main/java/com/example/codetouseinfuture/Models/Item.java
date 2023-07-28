package com.example.codetouseinfuture.Models;

public class Item {
    private int backgroundColor;
    private String text;
    private int textColor;

    public Item(String text, int textColor) {
        this.text = text;
        this.textColor = textColor;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public String getText() {
        return text;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
