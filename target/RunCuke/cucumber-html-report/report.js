$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TestCase1.feature");
formatter.feature({
  "name": "Acceptance testing to validate the errors on the Contact Page",
  "description": "\tIn order to validate that the errors are properly validated\n\twe will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test-Case1"
    }
  ]
});
formatter.scenario({
  "name": "Validate Errors on the Contact page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test-Case1"
    },
    {
      "name": "@TestCase1-Error-Validations"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the HomePage the Jupiter Planit Testing \"https://jupiter.cloud.planittesting.com/#/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase1Steps.i_am_on_the_HomePage_the_Jupiter_Planit_Testing(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Contact link",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase1Steps.click_on_Contact_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the resulting page I click on the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase1Steps.on_the_resulting_page_I_click_on_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to validate the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase1Steps.i_should_be_able_to_validate_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I populate the mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "TestCase1Steps.i_populate_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message should be gone",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase1Steps.the_error_message_should_be_gone()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"forename-err\"]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SMITAPC\u0027, ip: \u0027192.168.1.111\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\Smita\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53457}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 1ed09ae60abe372e2106253f72f4cb29\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"forename-err\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.isSelected(Unknown Source)\r\n\tat pages.actions.ContactPageActions.verifyErrorMessage(ContactPageActions.java:50)\r\n\tat steps.TestCase1Steps.the_error_message_should_be_gone(TestCase1Steps.java:77)\r\n\tat ✽.the error message should be gone(file:src/test/resources/features/TestCase1.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TestCase2.feature");
formatter.feature({
  "name": "Acceptance testing to validate the successful submission message",
  "description": "\tIn order to validate that the submission message is displayed after populating the mandatory fields\n\twe will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test-Case2"
    }
  ]
});
formatter.scenario({
  "name": "Validate if the Submission message is displayed as expected",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test-Case2"
    },
    {
      "name": "@TestCase2-Submission-Message-Validation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the HomePage as \"https://jupiter.cloud.planittesting.com/#/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase2Steps.i_am_on_the_HomePage_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Contact page",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase2Steps.i_click_on_the_Contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the subsequent page I populate the mandatory fields",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase2Steps.on_the_subsequent_page_I_populate_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase2Steps.i_click_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "so I will validate the submission message",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase2Steps.so_I_will_validate_the_submission_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TestCase3.feature");
formatter.feature({
  "name": "Acceptance testing to validate the errors on populating the mandatory fields with the invalid data",
  "description": "\tIn order to validate the errors are displayed after populating the mandatory fields with invalid data\n\twe will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test-Case3"
    }
  ]
});
formatter.scenario({
  "name": "Validate if the Errors are displayed on giving invalid test data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test-Case3"
    },
    {
      "name": "@TestCase3-Errors-With-Invalid-Data"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am logged on the HomePage as \"https://jupiter.cloud.planittesting.com/#/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase3Steps.i_am_logged_on_the_HomePage_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Contact page menu in the HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase3Steps.i_click_on_the_Contact_page_menu_in_the_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the subsequent page I populate the mandatory fields with invalid data",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase3Steps.on_the_subsequent_page_I_populate_the_mandatory_fields_with_invalid_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "so I will validate the errors displayed",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase3Steps.so_I_will_validate_the_errors_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TestCase4.feature");
formatter.feature({
  "name": "Acceptance testing to verify the items in the Cart after shopping for the same",
  "description": "\tIn order to verify the items are present in the Cart after shopping is done from the Shop page\n\twe will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test-Case4"
    }
  ]
});
formatter.scenario({
  "name": "Verify if all the selected items are present in the cart after choosing them from the Shop page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test-Case4"
    },
    {
      "name": "@TestCase4-Items-verification-in-the-cart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am able to open the home page \"https://jupiter.cloud.planittesting.com/#/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase4Steps.i_am_able_to_open_the_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Shop page menu in the HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase4Steps.i_click_on_the_Shop_page_menu_in_the_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on the following page I click for two times on Funny Cow",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase4Steps.on_the_following_page_I_click_for_two_times_on_Funny_Cow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Fluffy Bunny for one time",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase4Steps.i_click_on_the_Fluffy_Bunny_for_one_time()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the cart menu",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase4Steps.i_click_on_the_cart_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "so I verify if the items are present on the cart",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase4Steps.so_I_verify_if_the_items_are_present_on_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});