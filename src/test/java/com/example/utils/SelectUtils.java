package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SelectUtils {
    private WebDriver driver;

    public SelectUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void selectByVisibleText(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public String getSelectedOptionText(WebElement element) {
        Select select = new Select(element);
        WebElement selectedOption = select.getFirstSelectedOption();
        return selectedOption.getText();
    }

    public List<String> getAllOptionsText(WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        List<String> optionTexts = new ArrayList<>();
        for (WebElement option : options) {
            optionTexts.add(option.getText());
        }
        return optionTexts;
    }
}
