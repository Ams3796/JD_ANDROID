package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class MobileWishListPage {

	AndroidDriver<WebElement> driver;

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.justdial.search:id/promo_banner_image']")
	private WebElement promo_banner_image;

	public WebElement getPromo_banner_image() {
		return promo_banner_image;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Mobile']")
	private WebElement mobile_option;

	public WebElement getMobile_option() {
		return mobile_option;
	}

	@FindBy(xpath = "(//android.widget.FrameLayout//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@resource-id='com.justdial.search:id/coordinatorLayout']//android.widget.ImageView)[5]")
	private WebElement apple_mobiles_option;

	public WebElement getApple_mobiles_option() {
		return apple_mobiles_option;
	}

	@FindBy(xpath = "//android.view.ViewGroup//android.widget.RelativeLayout[@resource-id='com.justdial.search:id/mod_list_mainlay']")
	private WebElement first_result;

	public WebElement getFirst_result() {
		return first_result;
	}
	
	@FindBy(id="com.justdial.search:id/tvpdname")
	private WebElement detailspage_prodname;
	
	

	public WebElement getDetailspage_prodname() {
		return detailspage_prodname;
	}

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Color')]")
	private WebElement color_option;

	public WebElement getColor_option() {
		return color_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='White']")
	private WebElement white_color_option;

	public WebElement getWhite_color_option() {
		return white_color_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='128 GB']")
	private WebElement one_twenty_eight_storage_option;
	
	public WebElement getOne_twenty_eight_storage_option() {
		return one_twenty_eight_storage_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Apply']")
	private WebElement apply_button;

	public WebElement getApply_button() {
		return apply_button;
	}
	
	@FindBy(xpath="(//android.widget.TextView[contains(@text,'White')])[2]")
	private WebElement detailspage_white_option;

	public WebElement getDetailspage_white_option() {
		return detailspage_white_option;
	}
	
	@FindBy(xpath="(//android.widget.TextView[contains(@text,'128 GB')])[2]")
	private WebElement detailspage_onetwentyeightgb_storage;

	public WebElement getDetailspage_onetwentyeightgb_storage() {
		return detailspage_onetwentyeightgb_storage;
	}
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id='com.justdial.search:id/save']")
	private WebElement wishlist_icon;

	public WebElement getWishlist_icon() {
		return wishlist_icon;
	}
	
	@FindBy(id="com.justdial.search:id/menu_more")
	private WebElement more_option;

	public WebElement getMore_option() {
		return more_option;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='My Wishlist']")
	private WebElement wishlist_option;

	public WebElement getWishlist_option() {
		return wishlist_option;
	}
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.justdial.search:id/tvHeader']")
	private WebElement wishlist_productname;

	public WebElement getWishlist_productname() {
		return wishlist_productname;
	}
	
	
	
	

}
