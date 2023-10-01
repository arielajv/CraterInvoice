package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ItemsPage {

    public ItemsPage() { PageFactory.initElements(Driver.getDriver(), this); }


        @FindBy(xpath = "//h3[text()='Items']")
        public WebElement items_page_item_headerText;

    @FindBy (xpath = "//a[text()=' Items']")
    public WebElement items_tab1;

    @FindBy (xpath = "//a[text()='Items']")
    public WebElement items_tab2;

    @FindBy (xpath = "//ol[contains(@class, 'flex flex-wrap')]")
    public WebElement items_home_items_tab;

    @FindBy (xpath = "//button[text()='Filter ']")
    public WebElement items_page_filter_btn;

    @FindBy (xpath = "//button[text()=' Add Item']")
    public WebElement items_page_addItem_btn;

    @FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/table")
    public WebElement items_table;

    @FindBy (xpath = "(//button[contains(@id, 'headlessui-menu-button')])[3]")
    public WebElement items_page_3dot_menu;

    @FindBy (xpath = "//a[text()=' Edit']")
    public WebElement items_page_3dot_edit_option;

    @FindBy (xpath = "//a[text()=' Delete']")
    public WebElement items_page_3dot_delete_option;

    @FindBy (tagName = "p")
    public WebElement items_page_showing_pagination;

    @FindBy (xpath = "//nav[@aria-label='Pagination']")
    public WebElement items_pagination;

    @FindBy (xpath = "//span[normalize-space()='Next']")
    public WebElement items_pagination_right_arrow;

   @FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[2]/nav/a[2]")
    public WebElement items_page_number_1;

   @FindBy (xpath = "/html/body/div/main/div/div/div[4]/div[2]/div/div/div/div[2]/div[2]/div[1]/p/span[1]")
    public WebElement items_page_number1_pagination;

   @FindBy (xpath = "//span[normalize-space()='Previous']")
    public WebElement items_pagination_left_arrow;

    @FindBy (xpath = "//button[text()=' Add Item']")
    public WebElement items_addItem_btn;

    @FindBy (xpath = "/html/body/div/main/div/div/form/div/div/div/div[1]/div/div/input")
    public WebElement items_nameField;

    @FindBy (className = "bg-multiselect-caret")
    public WebElement items_unitField;

    @FindBy (className = "v-money3")
    public WebElement items_priceField;

    @FindBy (xpath = "//h3[text()='New Item']")
    public WebElement items_Input_page_newItem_text;

    @FindBy (className = "transition-transform")
    public WebElement items_unit_dropdown;

    @FindBy (xpath = "//div[text()='Description ']")
    public WebElement items_description_text;


}
