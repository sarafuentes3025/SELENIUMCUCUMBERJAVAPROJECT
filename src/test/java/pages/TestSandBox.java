package pages;

public class TestSandBox extends BasePage{

  private String categoryDropdown ="//select[@id='animals']";

  public TestSandBox() {
    super(driver);
  }

  public void navigateToSandbox(){
    navigateTo("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
  }

  public void selectCategory(String category){
    selectFromDropdownByTex(categoryDropdown,category);
  }
}
