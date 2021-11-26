package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {

  @Given("^I am on the Google search page$")
  public void navigateToGoogle(){
  }
  @When("^I enter a search criteria$")
  public void enterSearchCriteria(){
  }
  @And("^click on the search button$")
  public void clickSearchButton(){
  }
  @Then("^the results match the criteria$")
  public void validateResults(){
  }

}
