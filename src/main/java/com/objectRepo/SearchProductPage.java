package com.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericLib.DriverUtils;
import com.genericLib.ReadData_PropertyFile;

import io.appium.java_client.android.AndroidDriver;

public class SearchProductPage {

	AndroidDriver<WebElement> driver;
	ReadData_PropertyFile prop = new ReadData_PropertyFile();
	DriverUtils utils = new DriverUtils();

	public SearchProductPage() {
		PageFactory.initElements(driver, SearchProductPage.class);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='SHOPPING']")
	private WebElement shopping_button;

	public WebElement getShopping_button() {
		return shopping_button;
	}

	@FindBy(id = "com.justdial.search:id/search_icon_home")
	private WebElement search_bar;

	public WebElement getSearch_bar() {
		return search_bar;
	}

	@FindBy(xpath = "//android.widget.MultiAutoCompleteTextView[@text='Search Products']")
	private WebElement prod_searchbar;

	public WebElement getProd_searchbar() {
		return prod_searchbar;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.justdial.search:id/displayTxt']")
	private List<WebElement> prod_auto_suggestions;

	public List<WebElement> getProd_auto_suggestions() {
		return prod_auto_suggestions;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.justdial.search:id/displayTxt']")
	private WebElement prod_first_suggestion;

	public WebElement getProd_first_suggestion() {
		return prod_first_suggestion;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.justdial.search:id/mod_list_model']")
	private WebElement plp;

	public WebElement getPlp() {
		return plp;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/tvpdname']")
	private WebElement pdp_prod_name;

	public WebElement getPdp_prod_name() {
		return pdp_prod_name;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='BUY NOW']")
	private WebElement buynow_button;

	public WebElement getBuynow_button() {
		return buynow_button;
	}

//	@FindBy(id="com.justdial.search:id/add_address_text_view")
//	private WebElement add_new_address_button;
//	
//
//	public WebElement getAdd_new_address_button() {
//		return add_new_address_button;
//	}

	@FindBy(xpath = "//android.widget.TextView[@text='SELECT THIS']")
	private WebElement select_this_address;

	public WebElement getSelect_this_address() {
		return select_this_address;
	}

	@FindBy(id = "com.justdial.search:id/txt_address")
	private WebElement location_address;

	public WebElement getLocation_address() {
		return location_address;
	}

	@FindBy(id = "com.justdial.search:id/txt_order_product_name")
	private WebElement summary_prodname;

	public WebElement getSummary_prodname() {
		return summary_prodname;
	}

	@FindBy(id = "com.justdial.search:id/txt_proceed_payment")
	private WebElement proceed_for_payment;

	public WebElement getProceed_for_payment() {
		return proceed_for_payment;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Pay']")
	private WebElement jd_pay;

	public WebElement getJd_pay() {
		return jd_pay;
	}

}
