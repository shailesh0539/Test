package com.dfg;

public class ActivityPage1 {
//	package pageObjects.pages;
//
//	import java.text.DateFormat;
//	import java.text.SimpleDateFormat;
//	import java.util.ArrayList;
//	import java.util.Arrays;
//	import java.util.Date;
//	import java.util.List;
//	import java.util.Random;
//	import org.apache.commons.collections4.CollectionUtils;
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.Keys;
//	import org.openqa.selenium.WebElement;
//	import org.testng.Assert;
//	import org.testng.asserts.SoftAssert;
//	import listeners.Reporter;
//	import pageObjects.initializePageObjects.PageFactoryInitializer;
//	import utils.DateAndTime;
//	import utils.Element;
//	import utils.ExplicitWaiting;
//
//	public class ActivityPage extends PageFactoryInitializer {
//
//		String systemDate, eventTypeName, ID;
//
//		private By leftMenuOption = By.xpath("//div[@class='left-menu']//a");
//		private By toDateLink = By.xpath("//*[text()='To']//following::input[@placeholder='Please Select']");
//		private By fromDateLink = By.xpath("//*[contains(text(),'From')]/../span/input[@placeholder='Please Select']");
//		private By dateInput = By.xpath("//*[@class='rc-calendar-input ']");
//		private By dateInputClearBtn = By.xpath("//*[@class='rc-calendar-clear-btn']");
//		private By refreshBtn = By.xpath(
//				"//button[ normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'))='refresh']");
//		private By eventCategoryDropdown = By
//				.xpath("(//input[contains(@class,'form-control current-value icon icon-triangle')])[1]");
//		private By eventTypesDropdown = By
//				.xpath("(//input[contains(@class,'form-control current-value icon icon-triangle')])[2]");
//		private By eventCategoryList = By.xpath("//tbody//tr//td[3]");
//		private By forwardArrow = By.xpath("//span[contains(@class,'ribbon-icon-forwardpage clicker')]");
//		private By alertMsg = By.xpath("//div[@class='alert-wrapper']");
//		private By eventTypeDropdownList = By.xpath("//div[contains(@class,'option-item text-body3')]");
//		private By eventTypeListOptions = By.xpath("(//div[@class='options']/div)[1]//following-sibling::div");
//		private By eventTypeList = By.xpath("//tbody//tr//td[4]");
//		private By pagination = By.xpath("//*[contains(@class,'text-body3 turnpage-item')]");
//		private By exportBtn = By.xpath(
//				"//span[ normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'))='export']");
//		private By exportPopup = By.xpath(
//				"//div[ normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'))='export started']");
//		private By exportID = By.xpath("//div[@class='title text-h4']");
//		private By okBtn = By.xpath(
//				"//span[ normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'))='ok']");
//		private By viewExportLink = By.xpath(
//				"(//a[normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'))='view exports'])[2]");
//		private By viewExportBtn = By.xpath(
//				"(//div[normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'))='view exports'])");
//		private By viewExportPageEle = By.xpath("//div[text()='View Exports']");
//		private By exportIdOnViewExort = By.xpath("//tbody//tr//td[2]");
//		private By backBtn = By.xpath("//div[text()='< Back']");
//		private By fileStatus = By.xpath("//div[text()='< Back']");
//		private By activityPage = By.xpath("//div[contains(text(),'Activity')]");
//
//		/**
//		 * @param menuName
//		 * @throws Exception This function redirects user to the inventory pages based
//		 *                   on the required option
//		 */
//
//		public void navigateToLeftMenu(String menuName) throws Exception {
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			for (WebElement leftMenu : Element.getElementList(leftMenuOption)) {
//				if (leftMenu.getText().trim().equalsIgnoreCase(menuName)) {
//					log.info("Clicked on " + leftMenu.getText().trim());
//					Element.clickUsingWebElement(leftMenu, menuName);
//					Reporter.pass("User is on " + leftMenu.getText().trim());
//					break;
//				}
//			}
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			ExplicitWaiting.waitForSeconds(10);
//		}
//
//		/**
//		 * @throws Exception Verify the date of UI with system date
//		 */
//		public void verifyDateFromUI() throws Exception {
//
//			DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
//			String toDate = Element.getAttributeValue(toDateLink);
//			Date to = formatter.parse(toDate);
//			systemDate = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
//			Date systemDate1 = formatter.parse(systemDate);
//			if (to.equals(systemDate1)) {
//				Reporter.pass("To Date match with system date");
//			} else {
//				Reporter.fail("To Date not match with system date");
//				Assert.fail("To Date not match with system date");
//			}
//
//		}
//
//		/**
//		 * @param days
//		 * @throws Exception This method set date by passing number of days
//		 */
//		public void setFromDate(int days) throws Exception {
//			String Date = DateAndTime.getDate("MM/dd/yyyy", days);
//			Element.clickUsingBy(fromDateLink, "From date");
//			Element.isVisible(dateInput, "Date Input");
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			Element.clickUsingBy(dateInputClearBtn, "Clear");
//			Element.clickUsingBy(fromDateLink, "From date");
//			Element.enterText(dateInput, Date, "From date");
//			Element.enterText(dateInput, Keys.ENTER, "Enter");
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			ExplicitWaiting.waitForSeconds(5);
//			Reporter.pass("From Date Saved Successfully");
//		}
//
//		/**
//		 * This method is click on refresh button
//		 */
//		public void verifyRefreshBtn() {
//			if (Element.isVisible(refreshBtn, "refresh Btn")) {
//				Element.clickUsingBy(refreshBtn, "refresh Btn");
//				ExplicitWaiting.waitForPageLoaded(getWebDriver());
//				Reporter.info("Refresh button visible and clicked");
//			}
//
//		}
//
//		/**
//		 * This method is used to select DropDown by passing parameter
//		 * 
//		 * @param DropDownName
//		 * @param optionName
//		 */
//
//		public void selectDropDown(String DropDownName, String optionName) {
//			if (DropDownName.equalsIgnoreCase("Event Category")) {
//				Element.clickUsingBy(eventCategoryDropdown, "Event Category Drop Down");
//			} else {
//				Element.clickUsingBy(eventTypesDropdown, "Event Types Drop Down");
//			}
//			ExplicitWaiting.waitForSeconds(5);
//			WebElement option = getWebDriver().findElement(By.xpath("//div[text()='" + optionName + "']"));
//			ExplicitWaiting.explicitWaitVisibilityOfElement(option, 5);
//			String Option = option.getText().trim();
//			Element.clickUsingWebElement(option, optionName);
//			Reporter.info("Selected option : " + Option);
//			ExplicitWaiting.waitForSeconds(5);
//		}
//
//		/**
//		 * @param category
//		 * @throws Exception This method verify event category from UI
//		 */
//		public void verifyEventCategoryFromUI(String category) throws Exception {
//			List<String> categoryList = new ArrayList<>();
//			List<String> categoryList1 = new ArrayList<>();
//			if (category.equalsIgnoreCase("QR Code Scan")) {
//				categoryList1.add("QR Code Scan");
//
//			} else if (category.equalsIgnoreCase("RSVP")) {
//				categoryList1.add("RSVP");
//			} else {
//				categoryList1.add("QR Code Scan");
//				categoryList1.add("RSVP");
//			}
//			boolean flag = false;
//			if (Element.getElementList(eventCategoryList).size() > 0) {
//				do {
//					for (int i = 0; i < Element.getElementList(eventCategoryList).size(); i++) {
//						String temp = Element.getElementList(eventCategoryList).get(i).getText().trim();
//						if (!categoryList.contains(temp)) {
//							categoryList.add(temp);
//						}
//					}
//					Element.clickUsingBy(forwardArrow, "Right Arrow");
//					ExplicitWaiting.waitForSeconds(5);
//					try {
//						if (ExplicitWaiting.checkIfElementVisibleInstant(getWebDriver(), Element.getElement(alertMsg))) {
//							flag = true;
//							log.info("Alert msg = You're on last page");
//							break;
//						}
//					} catch (Exception e) {
//					}
//					ExplicitWaiting.waitForSeconds(5);
//				} while (flag = true);
//
//				if (CollectionUtils.isEqualCollection(categoryList, categoryList1)) {
//					Reporter.pass("Event category is displayed for selected category " + category);
//				} else {
//					Reporter.fail("Event category is not displayed for selected category");
//				}
//			} else {
//				Reporter.info("No records available for " + category);
//			}
//			ExplicitWaiting.waitForSeconds(5);
//		}
//
//		public void verifyEventTypesDropdownOptionsOnUI() throws Exception {
//
//			ExplicitWaiting.waitForSeconds(5);
//			ArrayList<String> ExpectedDropdownTypeList = new ArrayList<>();
//			ArrayList<String> ActualDropdownTypeList = new ArrayList<>();
//
//			ExpectedDropdownTypeList.addAll(Arrays.asList("All", "Buyer Scanning Buyer", "Buyer Scanning Admin",
//					"Buyer Scanning Brand", "Buyer Scanning Rep", "Buyer Scanning Receptionist", "Vendor Scanning Vendor",
//					"Vendor Scanning Buyer", "Vendor Scanning Rep", "Vendor Scanning Admin", "Vendor Scanning Receptionist",
//					"Buyer Fav Brand", "Admin Scanning User", "Rep Scanning User", "Receptionist Scanning User"));
//			Element.clickUsingBy(eventTypesDropdown, "Event Types Drop Down");
//
//			ExplicitWaiting.waitForSeconds(5);
//			if (Element.getElementList(eventTypeDropdownList).size() > 0) {
//				for (int i = 0; i < Element.getElementList(eventTypeDropdownList).size(); i++) {
//					String temp = Element.getElementList(eventTypeDropdownList).get(i).getText().trim();
//					if (ActualDropdownTypeList.contains(temp)) {
//						Reporter.fail("The Event Type " + temp + " is found duplicate in the drop-down list");
//					}
//					ActualDropdownTypeList.add(temp);
//
//				}
//				ExplicitWaiting.waitForSeconds(5);
//			} else {
//				Reporter.info("Dropdwon List is not available");
//			}
//
//			if (CollectionUtils.isEqualCollection(ExpectedDropdownTypeList, ActualDropdownTypeList)) {
//				Reporter.pass("Event Type dropdown options are correct as Expected");
//			} else {
//				Reporter.fail("Event Type dropdown options are not correct as Expected");
//				Reporter.fail("Expected " + ExpectedDropdownTypeList + "\nActual " + ActualDropdownTypeList);
//
//			}
//			Element.clickUsingBy(eventTypesDropdown, "Event Types Drop Down");
//			ExplicitWaiting.waitForSeconds(5);
//
//		}
//
//		public void verifyEventType() throws Exception {
//
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			List<String> typeList = new ArrayList<>();
//			Element.clickUsingBy(eventTypesDropdown, "Event Types Drop Down");
//
//			List<WebElement> list = new ArrayList<WebElement>();
//			list.addAll(Element.getElementList(eventTypeListOptions));
//
//			Random r = new Random();
//			int randomNumber = r.nextInt(list.size());
//			WebElement option = list.get(randomNumber);
//			eventTypeName = option.getText();
//
//			if (Element.isVisibleWebElement(option, "dropdown option")) {
//				Element.clickUsingWebElement(option, "dropdown option");
//				ExplicitWaiting.waitForPageLoaded(getWebDriver());
//				Reporter.info("Selected option : " + eventTypeName);
//			} else {
//				Reporter.fail("Event type option not selected");
//			}
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			ExplicitWaiting.waitForSeconds(5);
//			if (Element.getElementList(eventTypeList).size() > 0) {
//				for (int j = 1; j <= Element.getElementList(pagination).size(); j++) {
//					for (int i = 0; i < Element.getElementList(eventTypeList).size(); i++) {
//						String temp = Element.getElementList(eventTypeList).get(i).getText().trim();
//						if (!typeList.contains(temp)) {
//							typeList.add(temp);
//						}
//					}
//					Element.clickUsingBy(forwardArrow, "forwardArrow");
//					ExplicitWaiting.waitForSeconds(5);
//				}
//				if (typeList.get(0).equals(eventTypeName)) {
//					Reporter.pass("Event type is displayed correct for " + eventTypeName);
//				} else {
//					Reporter.fail("Event type is not correct displayed correct for " + eventTypeName);
//
//				}
//			} else {
//				Reporter.info("No records available for " + eventTypeName);
//			}
//
//		}
//
//		public void verifyExportPopup() throws Exception {
//			SoftAssert softAssert = new SoftAssert();
//			if (Element.isVisible(exportBtn, "export Btn")) {
//				Element.clickUsingBy(exportBtn, "export Btn");
//				ExplicitWaiting.waitForSeconds(5);
//				if (Element.isVisible(exportPopup, "export Popup")) {
//					ID = Element.getText(exportID).substring(26);
//					Reporter.pass("Export started and id is " + ID);
//					// Element.clickUsingBy(okBtn, "OK Button");
//				} else {
//					Reporter.fail("Export not started");
//					softAssert.fail("Export not started");
//				}
//			} else {
//				Reporter.fail("Export button is not visible");
//				softAssert.fail("Export button is not visible");
//			}
//			ExplicitWaiting.waitForSeconds(5);
//			softAssert.assertAll();
//		}
//
//		public void navigateToViewExport(String method) throws Exception {
//			SoftAssert softAssert = new SoftAssert();
//			if (method.equalsIgnoreCase("View Export Link")) {
//
//				if (Element.isVisible(viewExportLink, "view Export Link")) {
//					Reporter.pass("View export link is visible");
//
//					Element.clickUsingBy(viewExportLink, "view Export Link");
//					ExplicitWaiting.waitForPageLoaded(getWebDriver());
//					ExplicitWaiting.waitForSeconds(5);
//				} else {
//					Reporter.fail("View export link is not visible on Exort POpup");
//					softAssert.fail("View export link is not visible on Exort POpup");
//				}
//
//			} else if (method.equalsIgnoreCase("View Export button")) {
//
//				if (Element.isVisible(viewExportBtn, "view Export button")) {
//					Reporter.pass("View export button is visible");
//
//					Element.clickUsingBy(viewExportBtn, "view Export button");
//					ExplicitWaiting.waitForPageLoaded(getWebDriver());
//					ExplicitWaiting.waitForSeconds(5);
//				} else {
//					Reporter.fail("View export button is not visible on activity page");
//					softAssert.fail("View export button is not visible on activity page");
//				}
//
//			}
//
//			ExplicitWaiting.waitForSeconds(5);
//
//		}
//
//		public void verifyViewExportFile() throws Exception {
//			SoftAssert softAssert = new SoftAssert();
//			getWebDriver().navigate().refresh();
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			ExplicitWaiting.waitForSeconds(5);
//			if (Element.isVisible(viewExportPageEle, "viewExport Page Ele")) {
//				Reporter.pass("Successfully redirect to view export page");
//			} else {
//				Reporter.fail("View export is not visible");
//				softAssert.fail("View export is not visible");
//			}
//			getWebDriver().navigate().refresh();
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			ExplicitWaiting.waitForSeconds(5);
//			String exportIDOnView = Element.getText(exportIdOnViewExort);
//			String status = Element.getText(fileStatus);
//			if (ID.equals(exportIDOnView)) {
//				Reporter.pass("Export file present on view export page and status is " + status);
//			} else {
//				Reporter.fail("Export file is not present on view export page");
//				Reporter.fail("Export file is ID when created " + ID + " ID on View export page " + exportIDOnView);
//				softAssert.fail("Export file is not present on view export page");
//			}
//			ExplicitWaiting.waitForSeconds(5);
//			Element.clickUsingBy(backBtn, "back button");
//			ExplicitWaiting.waitForPageLoaded(getWebDriver());
//			ExplicitWaiting.waitForSeconds(5);
//			try {
//				Element.clickUsingBy(okBtn, "OK Button");
//			} catch (Exception e) {
//			}
//			verifyActivityPage();
//			softAssert.assertAll();
//		}
//
//		public void verifyActivityPage() throws Exception {
//			SoftAssert softAssert = new SoftAssert();
//			if (Element.isVisible(activityPage, "Activity page")) {
//				Reporter.pass("Successfully redirect to activity page after clicked on back button");
//			} else {
//				Reporter.fail("User is not redirect to activity page after clicked on back button");
//				softAssert.fail("User is not redirect to activity page after clicked on back button");
//			}
//			ExplicitWaiting.waitForSeconds(5);
//			softAssert.assertAll();
//		}
//
//	}

}
