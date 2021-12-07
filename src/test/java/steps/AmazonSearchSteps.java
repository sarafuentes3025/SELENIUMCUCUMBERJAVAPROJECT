package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {

  AmazonSearchPage amazon = new AmazonSearchPage();

  @Given(("^the user navigates to www.amazon.com$"))
  public void navigateToAmazon() {
    amazon.navigateToAmazon();
  }

  @And("^searches for (.+)$")
  public void enterSearchCriteria(String criteria) {
    amazon.enterSearchCriteria(criteria);
    amazon.clickSearch();
  }

  @And("^navigates to the page number (.+)$")
  public void navigateToSecondPAge(String pageNumber) {
    amazon.goToPage2(pageNumber);
  }

  @And("^selects the third item$")
  public void selectsThirdItem() {
    amazon.pick3rdItem();
  }

  @Then("^the user is able to add it to the cart$")
  public void itemCanBeAddedToTheCart() {
    amazon.addToCart();
    Assert.assertEquals("Added to Cart", amazon.addedToCartMessage());
  }
}
