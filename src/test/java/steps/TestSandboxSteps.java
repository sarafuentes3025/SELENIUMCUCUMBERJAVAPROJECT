package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.TestSandBox;

public class TestSandboxSteps {

  TestSandBox sandBoxPage = new TestSandBox();

  @Given("^I navigate to the sandbox page$")
  public void navigateToTheSandboxSite() {
    sandBoxPage.navigateToSandbox();
  }

  @And("^select a value from the dropdown$")
  public void selectState() {
    sandBoxPage.selectCategory("Baby Cat");
  }
}
