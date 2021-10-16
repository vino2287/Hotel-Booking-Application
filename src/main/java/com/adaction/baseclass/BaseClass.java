package com.adaction.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
			} else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void currentUrl() {
		try {
			System.out.println(driver.getCurrentUrl());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void forward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void backward() {
		driver.navigate().back();

	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void close() {
		driver.close();

	}

	public static void quite() {
		driver.quit();
	}

	public static void getTitle() {
		try {
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void enabled(WebElement element) {
		try {
			System.out.println(element.isEnabled());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void displayed(WebElement element) {
		try {
			System.out.println(element.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selected(WebElement element) {
		try {
			System.out.println(element.isSelected());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void screenshot(String path) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File destinateFile = new File(path);
			FileUtils.copyDirectory(sourceFile, destinateFile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		}

	}

	public static void selection(WebElement element, String Option, String value) {
		Select sc = new Select(element);

		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				sc.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibleText")) {
				sc.selectByVisibleText(value);
			} else {
				System.out.println("Invalid option");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void inputValueElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void simpleAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void confirmAlert(String ok, String cancel) {
		try {
			if (ok.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();

			} else if (cancel.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void promptAlert(String ok, String value, String cancel) {
		try {
			if (ok.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().accept();

			} else if (cancel.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().accept();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actionMethod(WebElement Element) {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(Element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void moveToElement(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void drogDrop(WebElement Element, WebElement Element1) {
		try {
			Actions ad = new Actions(driver);
			ad.dragAndDrop(Element, Element1).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void robotClass() throws AWTException {
		try {
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void pageUp(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void pageDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frameMethod(String option, String value, WebElement element) {
		try {
			if (option.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				driver.switchTo().frame(index);
			} else if (option.equalsIgnoreCase("byElement")) {
				driver.switchTo().frame(element);

			} else if (option.equalsIgnoreCase("byString")) {
				driver.switchTo().frame(value);
			} else {
				System.out.println("Invalid selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public void elementClear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void windowHandles() {
		Set<String> element = driver.getWindowHandles();

		for (String st : element) {
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
		}
	}

}
