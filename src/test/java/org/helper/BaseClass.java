package org.helper;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseClass {
	
	
	



		public static WebDriver driver;
		public static Actions a;
		public static Alert ar;
		public static JavascriptExecutor js;
		public static Select s;
		public static Robot r;
		public static LinkedList<Integer> li;

		public static void openChromeBrowser() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		public static void openEdgeBrowser() {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		public static void launchUrl(String url) {
			driver.get(url);

		}

		public static void toFillTextBox(WebElement element1, String keys) {
			element1.sendKeys(keys);

		}

		public static void closeCurrentTab() {

			driver.close();

		}

		public static void closeBrowser() {
			driver.quit();
		}

		public static void fetchTitle() {
			String titleName = driver.getTitle();
			System.out.println(titleName);
		}

		public static void getUrl() {

			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}

		public static void maxWindow() {

			driver.manage().window().maximize();
		}

		public static void toReload() {
			driver.navigate().refresh();

		}

		public static void holdExecution(int millis) throws InterruptedException {
			Thread.sleep(millis);
		}

		public static String fillTextBox(WebElement element, String keys) {
			element.sendKeys(keys);
			return keys;
		}

		public static void toClick(WebElement element) {
			element.click();

		}

		public static void moveToElement(WebElement target) {
			a = new Actions(driver);
			a.moveToElement(target).perform();

		}

		public static void dragAndDrop(WebElement source, WebElement target) {
			a = new Actions(driver);
			a.dragAndDrop(source, target).perform();

		}

		public static void handleSimpleAlert() {
			ar = driver.switchTo().alert();
			ar.accept();

		}

		public static void toDismissAlert() {
			ar = driver.switchTo().alert();
			ar.dismiss();
		}

		public static void hndlePromptAlert(String alertKeys) {

			ar = driver.switchTo().alert();

			ar.sendKeys(alertKeys);

		}

		public static void confirm() {
			ar = driver.switchTo().alert();
			String text = ar.getText();
			System.out.println(text);

		}

		public static void toScrollup(WebElement webref) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollInToView(false)", webref);

		}

		public static void toScollDown(WebElement webref) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollInToView(true)", webref);

		}

		public static void toHighlight(WebElement webref) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribut('style', 'background: yellow')", webref);
		}

		public static void toUrl(String url) {

			driver.navigate().to(url);

		}

		public static void forward() {

			driver.navigate().forward();

		}

		public static void backward() {

			driver.navigate().back();

		}

		public static void selectByVisibleText(WebElement element, String text) {

			s = new Select(element);
			s.selectByVisibleText(text);
		}

		public static void selectByValue(WebElement element, String value) {

			s = new Select(element);
			s.selectByValue(value);
		}

		public static void selectIndex(WebElement element, int index) {

			s = new Select(element);
			s.selectByIndex(index);
		}

		public static void deselctByIndex(WebElement element, int index) {

			s = new Select(element);
			s.deselectByIndex(index);
		}

		public static void deSelectByVisibleText(WebElement element, String text) {

			s = new Select(element);
			s.deselectByVisibleText(text);
		}

		public static void selectByValue(WebElement element) {

			s = new Select(element);
			s.deselectAll();
		}

		public static void fetchParentId() {
			String parentId = driver.getWindowHandle();
			System.out.println(parentId);

		}

		public static void fetchAllWindowId() {

			Set<String> allWinId = driver.getWindowHandles();
			System.out.println(allWinId);
		}

		public static void WindowsSwitch(String url) {

			driver.switchTo().window(url);

		}

		public static void switchFrameIndex(int index) {
			driver.switchTo().frame(index);

		}

		public static void switchFrameName(String nameOrId) {
			driver.switchTo().frame(nameOrId);
		}

		public static void switchFrameElement(WebElement frameElement) {

			driver.switchTo().frame(frameElement);

		}

		public static void toEnter() throws AWTException {

			r = new Robot();

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		public static void toCopy() throws AWTException {
			r = new Robot();

			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		}

		public static void toPaste() throws AWTException {

			r = new Robot();

			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		}

		public static void toAddDissimilarDatatype(int num) {

			LinkedList<Integer> li = new LinkedList<Integer>();
			li.add(num);
		}

		public static void toSelectDropdown(WebElement element, int index) {

			Select s = new Select(element);

			s.selectByIndex(index);

		}

		public static void toGetAttributeValue(WebElement element) {
			element.getAttribute("value");

		}

		public static void toPrint(String output) {
			
			System.out.println(output);

		}
		
		public static void toTakeScreenshot(String imgname) throws IOException {
         TakesScreenshot ts = (TakesScreenshot)driver;
         File src = ts.getScreenshotAs(OutputType.FILE);
         File des = new File("C:\\jdk\\New folder\\CucumberAutomation\\FailedTestCases"+ imgname+".png");
         FileUtils.copyFile(src, des);
			
			
			
		}

		public static void toUpdateExcel(int rownum, int coloumn, String value) throws IOException {

			File f = new File("C:\\jdk\\New folder\\CucumberAutomation\\DataMaintainance\\DataMaintainance Excel.xlsx");

			FileInputStream fin = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fin);

			Sheet sheet = book.getSheetAt(0);

			Row row = sheet.getRow(rownum);
			Cell createCell = row.createCell(coloumn);
			createCell.setCellValue(value);

			FileOutputStream file = new FileOutputStream(f);

			book.write(file);

		}
		public static String toReadExcelFile(int r0, int c0) throws IOException {

			File f = new File("C:\\jdk\\New folder\\CucumberAutomation\\DataMaintainance\\DataMaintainance Excel.xlsx");

			FileInputStream fin = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fin);

			Sheet sheet = book.getSheetAt(0);

			Row rn = sheet.getRow(r0);

			Cell cn = rn.getCell(c0);

			int cellType = cn.getCellType();

			String input;
			if (cellType == 1) {

				input = cn.getStringCellValue();

			} else if (DateUtil.isCellDateFormatted(cn)) {

				Date dateinput = cn.getDateCellValue();
				SimpleDateFormat date = new SimpleDateFormat("mmmm dd, yyyy");
				input = date.format(dateinput);

			}

			else {
				double numberinput = cn.getNumericCellValue();

				long l = (long) numberinput;

				input = String.valueOf(l);

			}

			return input;

		}


	
	}





