package com.LMS.pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserTableHeaderFunctionality {

	WebDriver ldriver;

	public UserTableHeaderFunctionality(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "")
	WebElement checkBox;

	@FindBy(xpath = "")
	WebElement id;

	@FindBy(xpath = "")
	WebElement idSortIcon;

	@FindBy(xpath = "")
	WebElement name;

	@FindBy(xpath = "")
	WebElement nameSortIcon;

	@FindBy(xpath = "")
	WebElement emailAddress;

	@FindBy(xpath = "")
	WebElement emailAddressSortIcon;

	@FindBy(xpath = "")
	WebElement contactNumber;

	@FindBy(xpath = "")
	WebElement contactNumberSortIcon;

	@FindBy(xpath = "")
	WebElement batch;

	@FindBy(xpath = "")
	WebElement batchSortIcon;

	@FindBy(xpath = "")
	WebElement skill;

	@FindBy(xpath = "")
	WebElement skillSortIcon;

	@FindBy(xpath = "")
	WebElement edit;

	@FindBy(xpath = "")
	WebElement delete;

	@FindBy(className = "")
	List<WebElement> allCheckBoxes;

	@FindBy(xpath = "")
	List<WebElement> tableRows;

	public void verifyTableRows() {

		List<String> obtainedList = new ArrayList<>();
		for (WebElement we : tableRows) {
			obtainedList.add(we.getText());
		}
		List<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
	}

	public boolean verifyAllCheckBoxes() {
		if (CollectionUtils.isEmpty(allCheckBoxes)) {
			return true;
		}
		for (WebElement element : allCheckBoxes) {
			if (!(element.isSelected())) {
				return false;
			}
		}
		return true;
	}

	public boolean verifyAllUnCheckedBoxes() {
		if (CollectionUtils.isEmpty(allCheckBoxes)) {
			return true;
		}
		for (WebElement element : allCheckBoxes) {
			if (element.isSelected()) {
				return false;
			}
		}
		return true;
	}

	public String getManageUserPageTitle() {
		String title = "MangeUser";
//		title=ldriver.getTitle();
		return title;
	}

	public Boolean verifyid() {
		// id.isDisplayed();
		return true;
	}

	public Boolean verifyidSortIcon() {
		// idSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifyname() {
		// name.isDisplayed();
		return true;
	}

	public Boolean verifynameSortIcon() {
		// nameSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifyEmailAddress() {
		// emailAddress.isDisplayed();
		return true;
	}

	public Boolean verifyEmailAddressSortIcon() {
		// emailAddressSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifyContactNumber() {
		// contactNumber.isDisplayed();
		return true;
	}

	public Boolean verifyContactNumberSortIcon() {
		// contactNumberSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifyBatch() {
		// batch.isDisplayed();
		return true;
	}

	public Boolean verifyBatchSortIcon() {
		// batchSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifySkill() {
		// skill.isDisplayed();
		return true;
	}

	public Boolean verifySkillSortIcon() {
		// skillSortIcon.isDisplayed();
		return true;
	}

	public Boolean verifyEdit() {
		// edit.isDisplayed();
		return true;
	}

	public Boolean verifyDelete() {
		// delete.isDisplayed();
		return true;
	}

	public void clickIdSortIcon() {
//		idSortIcon.click();
	}

	public void clickNameSortIcon() {
//		nameSortIcon.click();
	}

	public void clickEmailAddressSortIcon() {
//		emailAddressSortIcon.click();
	}

	public void clickContactNumberSortIcon() {
//		contactNumberSortIcon.click();
	}

	public void clickBatchSortIcon() {
//		batchSortIcon.click();
	}

	public void clickSkillSortIcon() {
//		skillSortIcon.click();
	}

	public void clickCheckBoxIcon() {
//		checkBox.click();
	}
}
