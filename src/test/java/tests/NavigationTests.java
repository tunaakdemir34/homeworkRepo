package tests;


import org.openqa.selenium.WebDriver;
import utilities.StringUtility;
import utilities.getDriver;


public class NavigationTests {

    public static void main(String[] args) throws Exception{

        StringUtility passOrFail = new StringUtility();

        WebDriver driverc =   getDriver.createDriver("chrome");

        driverc.get("http://google.com");

        Thread.sleep(3000);//for demo, wait 3 seconds
        String titleGoogle = driverc.getTitle();//returns <title>Some title</title> text

        driverc.get("http://etsy.com");//to open a website

        Thread.sleep(3000);//for demo, wait 3 seconds

        String titleEtsy = driverc.getTitle();//returns <title>Some title</title> text

        driverc.navigate().back();

        Thread.sleep(3000);//for demo, wait 3 seconds

        String titleGoogleBack = driverc.getTitle();

        //checking if page title is equals to Google

        passOrFail.verifyEquals(titleGoogleBack,titleGoogle);
        //move forward in the browser history

        driverc.navigate().forward();

        Thread.sleep(3000);//for demo, wait 3 seconds

        String titleEtsyBack = driverc.getTitle();

        passOrFail.verifyEquals(titleEtsy,titleEtsyBack);

        driverc.close();//to close browser
        //browser cannot close itself


    //ChromeDriver extends RemoteWebDriver --> implements WebDriver

        WebDriver driverf =   getDriver.createDriver("firefox");
        driverf.get("http://google.com");//to open a website

        Thread.sleep(3000);//for demo, wait 3 seconds

         String titleGooglef = driverf.getTitle();//returns <title>Some title</title> text

        driverf.get("http://etsy.com");//to open a website

        Thread.sleep(3000);//for demo, wait 3 seconds

        String titleEtsyf = driverf.getTitle();//returns <title>Some title</title> text

        //comeback to google
        driverf.navigate().back();

        Thread.sleep(3000);//for demo, wait 3 seconds

         String titleGoogleBackf = driverf.getTitle();

        //checking if page title is equals to Google

        passOrFail.verifyEquals(titleGoogleBackf,titleGooglef);

        //move forward in the browser history

        driverf.navigate().forward();
        Thread.sleep(3000);//for demo, wait 3 seconds

        String titleEtsyBackf = driverf.getTitle();

        passOrFail.verifyEquals(titleEtsyf,titleEtsyBackf);

    //System.out.println("Title: "+driver.getTitle());
    //driver.getTitle() - returns page title of the page that is currently opened
    //to get URL
    //System.out.println("URL: "+ driver.getCurrentUrl());
    //driver.navigate().refresh();//to reload page
    // Thread.sleep(3000);//for demo, wait 3 seconds
    //driver.navigate().to() = driver.get()
    //must be at the end

        driverf.close();//to close browser
    //browser cannot close itself

        WebDriver drivere =   getDriver.createDriver("edge");

        drivere.get("http://google.com");

        Thread.sleep(3000);//for demo, wait 3 seconds
        String titleGooglee = drivere.getTitle();//returns <title>Some title</title> text

        drivere.get("http://etsy.com");//to open a website

        Thread.sleep(3000);//for demo, wait 3 seconds

        String titleEtsye = drivere.getTitle();//returns <title>Some title</title> text

        drivere.navigate().back();

        Thread.sleep(3000);//for demo, wait 3 seconds

        String titleGoogleBacke = drivere.getTitle();

        //checking if page title is equals to Google

        passOrFail.verifyEquals(titleGoogleBacke,titleGooglee);
        //move forward in the browser history

        drivere.navigate().forward();

        Thread.sleep(3000);//for demo, wait 3 seconds

        String titleEtsyBacke = drivere.getTitle();

        passOrFail.verifyEquals(titleEtsye,titleEtsyBacke);

        drivere.close();//to close browser
        //browser cannot close itself

    }

    /**
     * Check if to strings are same. If print TEST PASSED! message.
     * Otherwise, print TEST FAILED message
     * @param arg1
     * @param arg2
     */

}


