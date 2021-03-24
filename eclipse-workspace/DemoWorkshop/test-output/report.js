$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:\\Users\\Administrator\\eclipse-workspace\\DemoWorkshop\\src\\main\\java\\Feature\\bookshop.feature");
formatter.feature({
  "name": "Shop on DemoWorkShop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Shop a book on DemoWorkShop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User logs into the site",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks login button and Signin message is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "login with \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\" credentials",
  "keyword": "Then "
});
formatter.step({
  "name": "Clear the shopping cart",
  "keyword": "Then "
});
formatter.step({
  "name": "Select Books from Categories and select a book from the list",
  "keyword": "Then "
});
formatter.step({
  "name": "Get the total price of the order and checkout",
  "keyword": "Then "
});
formatter.step({
  "name": "Select country from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cCity\u003e\" \"\u003cAddress1\u003e\" \"\u003cZip\u003e\" and \"\u003cPhoneNumber\u003e\" values",
  "keyword": "Then "
});
formatter.step({
  "name": "click on Continue in Shipping Address column",
  "keyword": "Then "
});
formatter.step({
  "name": "Select the shipping method as Next Day Air and click on Continue",
  "keyword": "Then "
});
formatter.step({
  "name": "click on Confirm order and get the details",
  "keyword": "Then "
});
formatter.step({
  "name": "Logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "City",
        "Address1",
        "Zip",
        "PhoneNumber"
      ]
    },
    {
      "cells": [
        "sanjanabilla95@gmail.com",
        "123456",
        "Hyderabad",
        "Madhapur",
        "500043",
        "9999999999"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Shop a book on DemoWorkShop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User logs into the site",
  "keyword": "Given "
});
formatter.match({
  "location": "BookDemoShop.user_logs_into_the_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login button and Signin message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.user_clicks_login_button_and_Signin_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login with \"sanjanabilla95@gmail.com\" and \"123456\" credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.login_with_the_user_credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clear the shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.Clear_the_shopping_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Books from Categories and select a book from the list",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.Select_Books_from_Categories_and_select_book_from_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the total price of the order and checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.Get_the_total_price_of_order_and_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select country from the dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.Select_country_from_the_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"Hyderabad\" \"Madhapur\" \"500043\" and \"9999999999\" values",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.fill_City_Address1_Zip_PhoneNumber_values(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Continue in Shipping Address column",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.click_on_Continue_in_Shipping_Address_column()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the shipping method as Next Day Air and click on Continue",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.Select_the_shipping_method_as_Next_Day_Air_and_click_on_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Confirm order and get the details",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.click_on_Confirm_order_and_get_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "BookDemoShop.Logout_from_application()"
});
formatter.result({
  "status": "passed"
});
});