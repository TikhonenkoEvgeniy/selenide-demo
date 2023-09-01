package org.example.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextField {
    private final SelenideElement el;

    public TextField(By by) {
        this.el = $(by);
    }

    public TextField setText(String text) {
        el.scrollTo().setValue(text);
        return this;
    }
}
