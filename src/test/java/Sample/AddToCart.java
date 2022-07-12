package Sample;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLib.BaseClass;
import com.genericLib.DriverUtils;
import com.genericLib.ReadData_PropertyFile;
import com.objectRepo.SearchProductPage;

public class AddToCart extends BaseClass {
	
	DriverUtils utils = new DriverUtils();
	ReadData_PropertyFile prop = new ReadData_PropertyFile();
	SearchProductPage spp;

	@Test
	public void searchProduct() throws IOException, InterruptedException {
		spp = PageFactory.initElements(driver, SearchProductPage.class);

		Thread.sleep(5000);
		utils.swipeByPercentage(driver, 0.5, 0.7, 0.5, 0.3);
		spp.getShopping_button().click();
		spp.getSearch_bar().click();
		spp.getProd_searchbar().sendKeys(prop.readProp("SearchProduct"));
		driver.hideKeyboard();
		List<WebElement> prod_names = spp.getProd_auto_suggestions();
		System.out.println("Product Suggestions Count : " + prod_names.size());

		for (WebElement prod_name : prod_names) 
		{
			String text = prod_name.getText();
			System.out.println(text);
		}

		spp.getProd_first_suggestion().click();

		for (int i = 1; i <= 3; i++) 
		{
			WebElement prod_name = driver.findElementByXPath("(//android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.justdial.search:id/mod_list_model'])["+i+"]");
			System.out.println("Product " + i + " : " + prod_name.getText());
		}
		spp.getPlp().click();
		String prod_name = spp.getPdp_prod_name().getText();
		System.out.println("Product name : " + prod_name);
		spp.getAdd_to_cart_button().click();
		String cart_icon = spp.getCart_icon_count().getText();
		System.out.println("Cart Count : "+cart_icon);
		spp.getCart_icon_count().click();
		String prod_name1=spp.getProdname_in_cart().getText();
		Assert.assertEquals(prod_name, prod_name1);
		String amount = spp.getTotal_amount().getText();
		System.out.println("Total Amount is : "+amount);
		spp.getPlace_order_button().click();
		spp.getSelect_this_address().click();
		String address = spp.getLocation_address().getText();
		System.out.println("Address : " + address);
		Assert.assertTrue(spp.getSummary_prodname().isDisplayed());
		spp.getProceed_for_payment().click();
		boolean jdpay_display = spp.getJd_pay().isDisplayed();
		System.out.println("Pay displayed is : " + jdpay_display);
		
		

}
}
