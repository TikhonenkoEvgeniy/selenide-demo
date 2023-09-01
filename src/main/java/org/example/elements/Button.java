package org.example.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Button {
    private final SelenideElement el;

    public Button(By by) {
        this.el = $(by);
    }

    public Button click() {
        el.scrollTo().click();
        return this;
    }
}
