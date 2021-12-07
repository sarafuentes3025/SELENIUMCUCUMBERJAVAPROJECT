package pages;

public class AmazonSearchPage extends BasePage {

  private final String searchBox = "//input[@id='twotabsearchtextbox']";
  private final String searchButton = "//input[@id='nav-search-submit-button']";

  private final String thirdResult = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[7]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";
  private final String addToCartButton = "//input[@id='add-to-cart-button']";
  private final String AddedMessageText = "//*[contains(text(),'Added to Cart')]";

  public AmazonSearchPage() {
    super(driver);
  }

  public void navigateToAmazon() {
    navigateTo("https://www.amazon.com/");
  }

  public void enterSearchCriteria(String criteria) {
    write(searchBox, criteria);
  }

  public void clickSearch() {
    clickElement(searchButton);
  }

  public void goToPage2(String pageNumber) {
    goToLinkText(pageNumber);
  }

  public void pick3rdItem() {
    clickElement(thirdResult);
  }

  public void addToCart() {
    clickElement(addToCartButton);
  }

  public String addedToCartMessage() {
    return textFromElement(AddedMessageText);
  }
}
