$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFile/TicketBook.feature");
formatter.feature({
  "line": 1,
  "name": "Flight Booking validation in ClearTrip",
  "description": "",
  "id": "flight-booking-validation-in-cleartrip",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Validation of flight booking in ClearTrip portal",
  "description": "",
  "id": "flight-booking-validation-in-cleartrip;validation-of-flight-booking-in-cleartrip-portal",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@ClearTrip_TC01"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User select Round Trip radio button in Search Flight screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter Departure city in \"\u003cDeparture City\u003e\" and Destination place in \"\u003cDestination City\u003e\" textfield",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User select Departure Date as \"\u003cDepartureDate\u003e\" and Return Date as \"\u003cReturnDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Search Flight button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User select Non Stop flights and click on Book button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter below Passenger Details",
  "rows": [
    {
      "cells": [
        "Column",
        "Values"
      ],
      "line": 14
    },
    {
      "cells": [
        "Mobile",
        "9415333777"
      ],
      "line": 15
    },
    {
      "cells": [
        "EmailAddress",
        "dummymail@yopmail.com"
      ],
      "line": 16
    },
    {
      "cells": [
        "FirstName",
        "john"
      ],
      "line": 17
    },
    {
      "cells": [
        "LastName",
        "Carter"
      ],
      "line": 18
    },
    {
      "cells": [
        "Title",
        "Mr"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User validate Payment Screen",
  "keyword": "And "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "flight-booking-validation-in-cleartrip;validation-of-flight-booking-in-cleartrip-portal;",
  "rows": [
    {
      "cells": [
        "Departure City",
        "Destination City",
        "DepartureDate",
        "ReturnDate"
      ],
      "line": 22,
      "id": "flight-booking-validation-in-cleartrip;validation-of-flight-booking-in-cleartrip-portal;;1"
    },
    {
      "cells": [
        "Bangalore",
        "New Delhi",
        "18",
        "24"
      ],
      "line": 23,
      "id": "flight-booking-validation-in-cleartrip;validation-of-flight-booking-in-cleartrip-portal;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7616399200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User login to the application url \"https://www.cleartrip.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.cleartrip.com/",
      "offset": 35
    }
  ],
  "location": "TicketBookStep.user_login_to_the_application_url(String)"
});
formatter.result({
  "duration": 5992885400,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Validation of flight booking in ClearTrip portal",
  "description": "",
  "id": "flight-booking-validation-in-cleartrip;validation-of-flight-booking-in-cleartrip-portal;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@ClearTrip_TC01"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User select Round Trip radio button in Search Flight screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter Departure city in \"Bangalore\" and Destination place in \"New Delhi\" textfield",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User select Departure Date as \"18\" and Return Date as \"24\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Search Flight button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User select Non Stop flights and click on Book button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter below Passenger Details",
  "rows": [
    {
      "cells": [
        "Column",
        "Values"
      ],
      "line": 14
    },
    {
      "cells": [
        "Mobile",
        "9415333777"
      ],
      "line": 15
    },
    {
      "cells": [
        "EmailAddress",
        "dummymail@yopmail.com"
      ],
      "line": 16
    },
    {
      "cells": [
        "FirstName",
        "john"
      ],
      "line": 17
    },
    {
      "cells": [
        "LastName",
        "Carter"
      ],
      "line": 18
    },
    {
      "cells": [
        "Title",
        "Mr"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User validate Payment Screen",
  "keyword": "And "
});
formatter.match({
  "location": "TicketBookStep.selectRadioButton()"
});
formatter.result({
  "duration": 153201600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bangalore",
      "offset": 30
    },
    {
      "val": "New Delhi",
      "offset": 67
    }
  ],
  "location": "TicketBookStep.cityEntering(String,String)"
});
formatter.result({
  "duration": 18584108200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 31
    },
    {
      "val": "24",
      "offset": 55
    }
  ],
  "location": "TicketBookStep.travelDate(String,String)"
});
formatter.result({
  "duration": 1252906400,
  "status": "passed"
});
formatter.match({
  "location": "TicketBookStep.flightBookButton()"
});
formatter.result({
  "duration": 13442517700,
  "status": "passed"
});
formatter.match({
  "location": "TicketBookStep.user_select_Non_Stop_flights_and_click_on_Book_button()"
});
formatter.result({
  "duration": 23181171100,
  "status": "passed"
});
formatter.match({
  "location": "TicketBookStep.user_enter_below_Passenger_Details(DataTable)"
});
formatter.result({
  "duration": 18266159300,
  "status": "passed"
});
formatter.match({
  "location": "TicketBookStep.validatePaymentScreen()"
});
formatter.result({
  "duration": 69933800,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //h6[text()\u003d\u0027Enter your credit card details\u00270] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//h6[text()\u003d\u0027Enter your credit card details\u00270]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d86.0.4240.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027LAPTOP-T2PRLN5Q\u0027, ip: \u0027192.168.29.154\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Tushar\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:52703}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 4088e2c4b5442a92ab1ca06b1c0b88c3\n*** Element info: {Using\u003dxpath, value\u003d//h6[text()\u003d\u0027Enter your credit card details\u00270]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:396)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat com.automation.Pages.PassengerDetails.paymentScreenValidation(PassengerDetails.java:98)\r\n\tat com.automation.StepDef.TicketBookStep.validatePaymentScreen(TicketBookStep.java:82)\r\n\tat ✽.And User validate Payment Screen(FeatureFile/TicketBook.feature:20)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 883961500,
  "status": "passed"
});
});