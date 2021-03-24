Feature: Shop on DemoWorkShop

Scenario Outline: Shop a book on DemoWorkShop
Given User logs into the site
Then User clicks login button and Signin message is displayed
Then login with "<Username>" and "<Password>" credentials
Then Clear the shopping cart
Then Select Books from Categories and select a book from the list
Then Get the total price of the order and checkout
Then Select country from the dropdown
Then Enter "<City>" "<Address1>" "<Zip>" and "<PhoneNumber>" values
Then click on Continue in Shipping Address column
Then Select the shipping method as Next Day Air and click on Continue
Then click on Confirm order and get the details 
Then Logout from the application












   Examples:
   | Username                  |       Password|City	  |Address1	  |Zip		|PhoneNumber |
   | sanjanabilla95@gmail.com  |       123456  |Hyderabad |Madhapur	  |500043   |9999999999  |