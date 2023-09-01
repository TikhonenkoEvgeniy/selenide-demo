package org.example.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextArea {
    private final SelenideElement el;

    public TextArea(By by) {
        this.el = $(by);
    }

    public TextArea setText(String text) {
        el.scrollTo().setValue(text);
        return this;
    }
}
