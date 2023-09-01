package org.example.pages;

import org.example.elements.Button;
import org.example.elements.Label;
import org.example.elements.TextArea;
import org.example.elements.TextField;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    private final TextField fieldFullName = new TextField(By.id("userName"));
    private final TextField fieldEmail = new TextField(By.id("userEmail"));
    private final TextArea areaCurrentAddress = new TextArea(By.id("currentAddress"));
    private final TextArea areaPermanentAddress = new TextArea(By.id("permanentAddress"));
    private final Button btnSubmit = new Button(By.id("submit"));
    private final Label lblFullName = new Label(By.cssSelector("p#name"));
    private final Label lblEmail = new Label(By.cssSelector("p#email"));
    private final Label lblCurrentAddress = new Label(By.cssSelector("p#currentAddress"));
    private final Label lblPermanentAddress = new Label(By.cssSelector("p#permanentAddress"));

    public TextBoxPage openPage() {
        open("https://demoqa.com/text-box");
        return this;
    }

    public TextBoxPage fillFieldFullName(String text) {
        fieldFullName.setText(text);
        return this;
    }

    public TextBoxPage fillFieldEmail(String text) {
        fieldEmail.setText(text);
        return this;
    }

    public TextBoxPage fillAreaCurrentAddress(String text) {
        areaCurrentAddress.setText(text);
        return this;
    }

    public TextBoxPage fillAreaPermanentAddress(String text) {
        areaPermanentAddress.setText(text);
        return this;
    }

    public TextBoxPage clickSubmit() {
        btnSubmit.click();
        return this;
    }

    public TextBoxPage checkLabelFullName(String text) {
        lblFullName.checkText(text);
        return this;
    }

    public TextBoxPage checkLabelEmail(String text) {
        lblEmail.checkText(text);
        return this;
    }

    public TextBoxPage checkLabelCurrentAddress(String text) {
        lblCurrentAddress.checkText(text);
        return this;
    }

    public TextBoxPage checkLabelPermanentAddress(String text) {
        lblPermanentAddress.checkText(text);
        return this;
    }
}
