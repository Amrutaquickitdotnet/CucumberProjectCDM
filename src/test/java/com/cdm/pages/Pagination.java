package com.cdm.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.lang.*;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class Pagination extends CommonActions {

	public Pagination(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class='mat-table cdk-table mat-sort']")
	List<WebElement> tableList;

	@FindBy(xpath = "//tbody/tr")
	List<WebElement> allRowsInTable;

	@FindBy(xpath = "//button[@aria-label='Previous page']")
	WebElement previousButton;

	@FindBy(xpath = "//button[@aria-label='First page']")
	WebElement firstButton;

	@FindBy(xpath = "//button[@aria-label='Next page']")
	WebElement nextButton;

	@FindBy(xpath = "//mat-paginator//mat-select")
	WebElement paginationRecordDropdown;

	//
	@FindBy(xpath = "//div[@class='mat-paginator-range-label']")
	WebElement paginationRecordLabel;

	@FindBy(xpath = "//button[@aria-label='Last page']")
	WebElement paginationLastPageButton;

	public boolean nextPageClickAndCountOnLastPage(int rowPerPage) throws Exception {

		String displayedCountString = paginationRecordLabel.getText().split(" ")[4];

		int displayedCount = Integer.parseInt(displayedCountString);
		
		

		int pageMove =0;
		if(displayedCount% rowPerPage==0) {
			pageMove=displayedCount/rowPerPage;
		}else {
			pageMove=displayedCount/rowPerPage +1;
		}

		int lastPageRowCount = displayedCount % rowPerPage;
		if (displayedCount > rowPerPage && lastPageRowCount == 0) {
			lastPageRowCount = rowPerPage;
		}

		if (firstButton != null && firstButton.isEnabled()) {
			firstButton.click();
			Thread.sleep(2000);
		}

		for (int i = 1; i < pageMove; i++) {
			if (nextButton != null && nextButton.isEnabled()) {
				nextButton.click();
				Thread.sleep(2000);
			}
		}

		if (allRowsInTable.size() == lastPageRowCount) {
			return true;
		} else {
			return false;
		}

	}

	public boolean LastPageClickAndCount(int rowPerPage) throws Exception {

		String displayedCountString = paginationRecordLabel.getText().split(" ")[4];

		int displayedCount = Integer.parseInt(displayedCountString);
		int pageMove =0;
		if(displayedCount% rowPerPage==0) {
			pageMove=displayedCount/rowPerPage;
		}else {
			pageMove=displayedCount/rowPerPage +1;
		}

		//int pageMove = Math.ceilDivExact(displayedCount, rowPerPage);

		int lastPageRowCount = displayedCount % rowPerPage;
		if (displayedCount > rowPerPage && lastPageRowCount == 0) {
			lastPageRowCount = rowPerPage;
		}

		if (paginationLastPageButton != null && paginationLastPageButton.isEnabled()) {
			paginationLastPageButton.click();
			Thread.sleep(2000);
		}

		if (allRowsInTable.size() == lastPageRowCount) {
			return true;
		} else {
			return false;
		}

	}

	public void SelectPageMatOption(String value) {
		try {
			SelectMatOption(paginationRecordDropdown, value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
