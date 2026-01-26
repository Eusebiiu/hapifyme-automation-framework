package com.hapifyme.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.hapifyme.utils.ConfigManager;
import io.qameta.allure.restassured.AllureRestAssured;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public static RequestSpecification requestSpec;

    @BeforeSuite
    public void globalSetup() {
        // Configurarea Allure pentru Selenide
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false));

        // Configurare Headless pentru GitHub Actions
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";

        // Configurare API cu filtru Allure
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(ConfigManager.BASE_URL)
                .setContentType(ContentType.JSON)
                .addFilter(new AllureRestAssured()) // Logare apeluri API în raport
                .build();
    }
}