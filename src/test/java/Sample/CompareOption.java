package Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLib.BaseClass;
import com.genericLib.DriverUtils;
import com.objectRepo.HomePage;
import com.objectRepo.MobilePage;
import com.objectRepo.SearchProductPage;

public class CompareOption extends BaseClass {

	SearchProductPage sp;
	MobilePage mob;
	HomePage hp;
	DriverUtils utils = new DriverUtils();

	@Test

	public void compare() throws InterruptedException {
		sp = PageFactory.initElements(driver, SearchProductPage.class);
		mob = PageFactory.initElements(driver, MobilePage.class);
		hp = PageFactory.initElements(driver, HomePage.class);

		Thread.sleep(5000);
		utils.swipeByPercentage(driver, 0.5, 0.7, 0.5, 0.3);
		hp.getShopping_option().click();
		mob.getMobile_option().click();
		mob.getApple_mobiles_option().click();
		Assert.assertTrue(mob.getSortby_option().isDisplayed());
		Assert.assertTrue(mob.getFilter_option().isDisplayed());
		Assert.assertTrue(mob.getCompare_option().isDisplayed());

		List<String> l = new ArrayList<String>();
		System.out.println(mob.getResultspage_moblist_names().size());
		for (WebElement moblist : mob.getResultspage_moblist_names()) {
			String name = moblist.getText();
			System.out.println(name);
			l.add(name);
		}

		mob.getCompare_option().click();
		for (WebElement compare : mob.getVerify_compare()) {
			Assert.assertTrue(compare.isDisplayed());
		}

		for (WebElement name : mob.getResultspage_moblist_names()) {
			name.click();
			utils.swipeByPercentage(driver, 0.5, 0.5, 0.5, 0.3);
		}

		mob.getCompare_products_button().click();
		String prod1 = mob.getComparepage_prod1_name().getText();
		String prod2 = mob.getComaprepage_prod2_name().getText();
		String prod3 = mob.getComparepage_prod3_name().getText();
		List<String> l1 = new ArrayList<String>();
		l1.add(prod1);
		l1.add(prod2);
		l1.add(prod3);

		Collections.sort(l);
		Collections.sort(l1);

		Assert.assertEquals(l, l1);
		System.out.println("Added products available in Compare page");

		Assert.assertTrue(mob.getComparepage_general_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_color_Section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_phonetype_section().isDisplayed());
		utils.swipeByPercentage(driver, 0.5, 0.9, 0.5, 0.1);
		Thread.sleep(3000);
		Assert.assertTrue(mob.getComparepage_display_features_section().isDisplayed());
		utils.swipeByPercentage(driver, 0.5, 0.95, 0.5, 0.05);
		Thread.sleep(3000);
		Assert.assertTrue(mob.getComparepage_os_processor_features_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_Operating_system_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_memory_storage_section().isDisplayed());
		utils.swipeByPercentage(driver, 0.5, 0.9, 0.5, 0.4);
		Assert.assertTrue(mob.getComparepage_call_features_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_videocalling_section().isDisplayed());
		utils.swipeByPercentage(driver, 0.5, 0.9, 0.5, 0.3);
		Thread.sleep(3000);
		Assert.assertTrue(mob.getComparepage_camera_features_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_primarycamera_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_secondary_camera_section().isDisplayed());
		for (int i = 1; i <= 4; i++) {
			utils.swipeByPercentage(driver, 0.5, 0.9, 0.5, 0.2);
		}
		Thread.sleep(3000);
		Assert.assertTrue(mob.getComparepage_battery_specifications_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_battery_type_section().isDisplayed());
		Thread.sleep(3000);
		for (int i = 1; i <= 5; i++) {
			utils.swipeByPercentage(driver, 0.5, 0.9, 0.5, 0.1);
		}
		Assert.assertTrue(mob.getComparepage_dimension_weight_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_height_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_width_section().isDisplayed());
		Assert.assertTrue(mob.getComparepage_depth_section().isDisplayed());
		System.out.println("Compare page verified");
		utils.backNavigation(driver);

		for (int i = 1; i <= 3; i++) {
			mob.getCompareproduct_close_button1().click();
		}

		mob.getCompare_option().click();
		utils.swipeByPercentage(driver, 0.5, 0.2, 0.5, 0.9);
		mob.getFirst_result().click();
		mob.getDetailspage_mobilestudio_link().click();

		Assert.assertTrue(mob.getJd_logo().isDisplayed());
		Assert.assertTrue(mob.getMobstudio_comp_image().isDisplayed());
		Assert.assertTrue(mob.getMobstudio_comp_name().isDisplayed());
		System.out.println("Company Name and Image displayed");
		Assert.assertTrue(mob.getCall_icon().isDisplayed());
		Assert.assertTrue(mob.getProducts_tab().isDisplayed());
		Assert.assertTrue(mob.getAll_tab().isDisplayed());

		for (WebElement image : mob.getMobilestudio_result_image()) {
			image.isDisplayed();
		}
		System.out.println("Products image displyed");
		for (WebElement name : mob.getMobilestudio_result_prodname()) {
			String text = name.getText();
			System.out.println(text);
		}
		System.out.println("Products name displayed");
		System.out.println("Products tab verified");
		mob.getElectronic_tablet_tab().click();
		Thread.sleep(3000);
		mob.getMobile_phone_tab().click();
		Thread.sleep(3000);
		mob.getAbout_us_tab().click();
		Assert.assertTrue(mob.getPhotos_text().isDisplayed());
		utils.swipeByPercentage(driver, 0.9, 0.45, 0.1, 0.45);
		utils.swipeByPercentage(driver, 0.1, 0.45, 0.9, 0.45);
		System.out.println("Photos section displayed");
		Assert.assertTrue(mob.getRatethis_heading().isDisplayed());
		System.out.println("Rate this heading displayed");
		Assert.assertTrue(mob.getAddress_heading().isDisplayed());
		String address = mob.getAddress().getText();
		System.out.println("Address is : " + address);
		utils.swipeByPercentage(driver, 0.5, 0.85, 0.5, 0.01);
		Assert.assertTrue(mob.getReport_an_error_section().isDisplayed());
		System.out.println("Report an error section displayed");

	}

}
