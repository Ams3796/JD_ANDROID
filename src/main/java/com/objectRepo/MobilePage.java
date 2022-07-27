package com.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class MobilePage {

	AndroidDriver<WebElement> driver;

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

	@FindBy(id = "com.justdial.search:id/tvpdname")
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

	@FindBy(xpath = "(//android.widget.TextView[contains(@text,'White')])[2]")
	private WebElement detailspage_white_option;

	public WebElement getDetailspage_white_option() {
		return detailspage_white_option;
	}

	@FindBy(xpath = "(//android.widget.TextView[contains(@text,'128 GB')])[2]")
	private WebElement detailspage_onetwentyeightgb_storage;

	public WebElement getDetailspage_onetwentyeightgb_storage() {
		return detailspage_onetwentyeightgb_storage;
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.justdial.search:id/save']")
	private WebElement wishlist_icon;

	public WebElement getWishlist_icon() {
		return wishlist_icon;
	}

	@FindBy(id = "com.justdial.search:id/menu_more")
	private WebElement more_option;

	public WebElement getMore_option() {
		return more_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='My Wishlist']")
	private WebElement wishlist_option;

	public WebElement getWishlist_option() {
		return wishlist_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/tvHeader']")
	private WebElement wishlist_productname;

	public WebElement getWishlist_productname() {
		return wishlist_productname;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Sort By']")
	private WebElement sortby_option;

	public WebElement getSortby_option() {
		return sortby_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Filter']")
	private WebElement filter_option;

	public WebElement getFilter_option() {
		return filter_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Compare']")
	private WebElement compare_option;

	public WebElement getCompare_option() {
		return compare_option;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/mod_list_model']")
	private List<WebElement> resultspage_moblist_names;

	public List<WebElement> getResultspage_moblist_names() {
		return resultspage_moblist_names;
	}

	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.justdial.search:id/compare_lay']")
	private List<WebElement> verify_compare;

	public List<WebElement> getVerify_compare() {
		return verify_compare;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Compare products']")
	private WebElement compare_products_button;

	public WebElement getCompare_products_button() {
		return compare_products_button;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/product1Name']")
	private WebElement comparepage_prod1_name;

	public WebElement getComparepage_prod1_name() {
		return comparepage_prod1_name;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/product2Name']")
	private WebElement comaprepage_prod2_name;

	public WebElement getComaprepage_prod2_name() {
		return comaprepage_prod2_name;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/product3Name']")
	private WebElement comparepage_prod3_name;

	public WebElement getComparepage_prod3_name() {
		return comparepage_prod3_name;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='General']")
	private WebElement comparepage_general_section;

	public WebElement getComparepage_general_section() {
		return comparepage_general_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Color']")
	private WebElement comparepage_color_Section;

	public WebElement getComparepage_color_Section() {
		return comparepage_color_Section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Phone Type']")
	private WebElement comparepage_phonetype_section;

	public WebElement getComparepage_phonetype_section() {
		return comparepage_phonetype_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Display Features']")
	private WebElement comparepage_display_features_section;

	public WebElement getComparepage_display_features_section() {
		return comparepage_display_features_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='OS & Processor Features']")
	private WebElement comparepage_os_processor_features_section;

	public WebElement getComparepage_os_processor_features_section() {
		return comparepage_os_processor_features_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Operating System']")
	private WebElement comparepage_Operating_system_section;

	public WebElement getComparepage_Operating_system_section() {
		return comparepage_Operating_system_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Memory & Storage']")
	private WebElement comparepage_memory_storage_section;

	public WebElement getComparepage_memory_storage_section() {
		return comparepage_memory_storage_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Call Features']")
	private WebElement comparepage_call_features_section;

	public WebElement getComparepage_call_features_section() {
		return comparepage_call_features_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Video Calling']")
	private WebElement comparepage_videocalling_section;

	public WebElement getComparepage_videocalling_section() {
		return comparepage_videocalling_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Camera Features']")
	private WebElement comparepage_camera_features_section;

	public WebElement getComparepage_camera_features_section() {
		return comparepage_camera_features_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Primary Camera']")
	private WebElement comparepage_primarycamera_section;

	public WebElement getComparepage_primarycamera_section() {
		return comparepage_primarycamera_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Secondary Camera']")
	private WebElement comparepage_secondary_camera_section;

	public WebElement getComparepage_secondary_camera_section() {
		return comparepage_secondary_camera_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Battery Specifications']")
	private WebElement comparepage_battery_specifications_section;

	public WebElement getComparepage_battery_specifications_section() {
		return comparepage_battery_specifications_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Battery Type']")
	private WebElement comparepage_battery_type_section;

	public WebElement getComparepage_battery_type_section() {
		return comparepage_battery_type_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Dimensions & Weight']")
	private WebElement comparepage_dimension_weight_section;

	public WebElement getComparepage_dimension_weight_section() {
		return comparepage_dimension_weight_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Height']")
	private WebElement comparepage_height_section;

	public WebElement getComparepage_height_section() {
		return comparepage_height_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Width']")
	private WebElement comparepage_width_section;

	public WebElement getComparepage_width_section() {
		return comparepage_width_section;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Depth']")
	private WebElement comparepage_depth_section;

	public WebElement getComparepage_depth_section() {
		return comparepage_depth_section;
	}

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.justdial.search:id/compareProduct1close']")
	private WebElement compareproduct_close_button1;

	public WebElement getCompareproduct_close_button1() {
		return compareproduct_close_button1;
	}

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.justdial.search:id/compareProduct2close']")
	private WebElement compareproduct_close_button2;

	public WebElement getCompareproduct_close_button2() {
		return compareproduct_close_button2;
	}

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.justdial.search:id/compareProduct3close']")
	private WebElement compareproduct_close_button3;

	public WebElement getCompareproduct_close_button3() {
		return compareproduct_close_button3;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/tvVendorNameHI']")
	private WebElement detailspage_mobilestudio_link;

	public WebElement getDetailspage_mobilestudio_link() {
		return detailspage_mobilestudio_link;
	}

	@FindBy(id = "com.justdial.search:id/jd_logo")
	private WebElement jd_logo;

	public WebElement getJd_logo() {
		return jd_logo;
	}

	@FindBy(id = "com.justdial.search:id/comp_image")
	private WebElement mobstudio_comp_image;

	public WebElement getMobstudio_comp_image() {
		return mobstudio_comp_image;
	}

	@FindBy(id = "com.justdial.search:id/comp_name")
	private WebElement mobstudio_comp_name;

	public WebElement getMobstudio_comp_name() {
		return mobstudio_comp_name;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Products']")
	private WebElement products_tab;

	public WebElement getProducts_tab() {
		return products_tab;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='All']")
	private WebElement all_tab;

	public WebElement getAll_tab() {
		return all_tab;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Mobile Phone']")
	private WebElement mobile_phone_tab;

	public WebElement getMobile_phone_tab() {
		return mobile_phone_tab;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Electronic Tablet']")
	private WebElement electronic_tablet_tab;

	public WebElement getElectronic_tablet_tab() {
		return electronic_tablet_tab;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/txt_product_name']")
	private List<WebElement> mobilestudio_result_prodname;

	public List<WebElement> getMobilestudio_result_prodname() {
		return mobilestudio_result_prodname;
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.justdial.search:id/img_recently_product']")
	private List<WebElement> mobilestudio_result_image;

	public List<WebElement> getMobilestudio_result_image() {
		return mobilestudio_result_image;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='About us']")
	private WebElement about_us_tab;

	public WebElement getAbout_us_tab() {
		return about_us_tab;
	}

	@FindBy(id = "com.justdial.search:id/call_icon")
	private WebElement call_icon;

	public WebElement getCall_icon() {
		return call_icon;
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Photos']")
	private WebElement photos_text;

	public WebElement getPhotos_text() {
		return photos_text;
	}

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.justdial.search:id/detail_image_recycler']//android.widget.ImageView")
	private List<WebElement> product_related_photos;

	public List<WebElement> getProduct_related_photos() {
		return product_related_photos;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Rate this']")
	private WebElement ratethis_heading;

	public WebElement getRatethis_heading() {
		return ratethis_heading;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Address']")
	private WebElement address_heading;

	public WebElement getAddress_heading() {
		return address_heading;
	}
	
	@FindBy(id="com.justdial.search:id/address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id="com.justdial.search:id/report_an_error")
	private WebElement report_an_error_section;

	public WebElement getReport_an_error_section() {
		return report_an_error_section;
	}
	
	

}
