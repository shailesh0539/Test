package com.dfg;

public class ActivityShoppe2 {
//	package shoppe.tests;
//
//	import org.testng.annotations.Test;
//
//	import controllers.Constants;
//	import listeners.Reporter;
//	import pageObjects.initializePageObjects.PageFactoryInitializer;
//	import utils.ExplicitWaiting;
//
//	public class ActivityShoppe extends PageFactoryInitializer{
//		
//		private ActivityShoppe()
//		{
//			
//		}
//
//		@Test(priority = 1, description = "Activity Creation")
//		public void activityAdmin() throws Exception {
//			Reporter.info("Login to application as Admin " + Constants.get("adminEmail"));
//			loginPage().userLogin(Constants.get("adminEmail"), Constants.get("adminPassword"));
//			Reporter.info("Verify admin is able to click on workdesk");
//			createPOPage().navigateToMenu("workdesk");
//			activityPage().navigateToLeftMenu("Activity");	
//			ExplicitWaiting.waitForSeconds(5);
//			Reporter.info("Verify From and To date with system date");
//			activityPage().verifyDateFromUI();
//			activityPage().setFromDate(-8);
//			Reporter.info("Verify selected category is getting displayed on activity page");
//			activityPage().verifyRefreshBtn();
//			activityPage().selectDropDown("Event Category", "QR Code Scan");
//			activityPage().verifyEventCategoryFromUI("QR Code Scan");
//			activityPage().selectDropDown("Event Category", "RSVP");
//			activityPage().verifyEventCategoryFromUI("RSVP");
//			activityPage().selectDropDown("Event Category", "QR Code Scan");
//			Reporter.info("Verify All options from Event Type Dropdown is getting displayed as expected");
//			activityPage().verifyEventTypesDropdownOptionsOnUI();
//			Reporter.info("Verify selected Event Type is getting displayed on activity page");
//			activityPage().verifyEventType();
//			Reporter.info("Verify user is able to export the data");
//			activityPage().selectDropDown("Event Category", "All");
//			activityPage().selectDropDown("Event Types", "All");
//			
//			Reporter.info("Verify user is navigate to view export page using view export link.");
//			activityPage().verifyExportPopup();
//			activityPage().navigateToViewExport("View export Link");
//			activityPage().verifyViewExportFile();
//			
//			Reporter.info("Verify user is navigate to view export page using view export button");
//			activityPage().navigateToViewExport("View export button");
//			activityPage().verifyViewExportFile();
//			
//			Reporter.info("Verify user is navigate to view export page using view export menu");
//			
//			
//		}
//		
//		
//		
//	}

}
