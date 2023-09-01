package org.example.elements;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Label {
    private final SelenideElement el;

    public Label(By by) {
        this.el = $(by);
    }

    public Label checkText(String text) {
        Assertions.assertEquals(text, el.scrollTo().getText());
        return this;
    }
}
