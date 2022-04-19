package todo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static todo.SeleniumHelper.isElementDisplayed;

public class TodoSteps {

    protected WebDriver driver;

    public TodoSteps(WebDriver driver) {
        this.driver = driver;
    }

    protected By inputFieldBy = By.xpath("//input[@ng-disabled='saving']");

    protected By todoItemBy = By.xpath("//label[@ng-dblclick='editTodo(todo)']");

    protected By footerBy = By.xpath("//footer[@class='footer'][@ng-show='todos.length']");

    protected By completedButtonBy = By.xpath("//li//*[text()='Completed'][@href='#/completed']");

    protected By activeButtonBy = By.xpath("//li//*[text()='Active'][@href='#/active']");

    protected By isSomeItemCompleted = By.xpath("//li[@class='ng-scope completed']");

    protected By checkboxToCompletedItemBy(String name) {
        return By.xpath("//label[text()='" + name + "']/..//*");
    }

    protected By moveToElement(String name) {
        return By.xpath("//label[text()='" + name + "']/..");
    }

    protected By crossToRemoveItemBy(String name) {
        return By.xpath("//label[text()='" + name + "']/following-sibling::button");
    }

    protected By arrowToCompletedAllBy() {
        return By.xpath("//label[@for='toggle-all']");
    }

    protected By getTodoItemBy(String name) {
        return By.xpath("//label[@ng-dblclick='editTodo(todo)'][text()='" + name + "']");
    }

    protected By getCompletedTodoItemBy(String name) {
        return By.xpath("//li[@ng-repeat][contains(@class, 'completed')]//*[text()='" + name + "']");
    }

    protected By clearCompletedBy() {
        return By.xpath("//button[@class='clear-completed'][@ng-click='clearCompletedTodos()']");
    }

    protected void addLog(String massage) {
        System.out.println(massage);
    }

    public void navigate() {
        driver.get("https://todomvc.com/examples/angularjs/#/");
        addLog("Navigate TodoMVS app");
        SeleniumHelper.waitForElement(driver, inputFieldBy, 5);
    }

    public void addNewItem(String todoItem) {
        WebElement input = driver.findElement(inputFieldBy);
        input.clear();
        input.sendKeys(todoItem);
        input.sendKeys(Keys.ENTER);
        addLog("Create new item: " + todoItem);
        addLog("---Fill the field");
        addLog("---Press Enter");
    }

    public boolean isTodoItemCreated(String todoItem) {
        boolean result = isElementDisplayed(driver, getTodoItemBy(todoItem));
        addLog("Check if todo item " + todoItem + " is created: " + result);
        return result;
    }

    public int getTodoItemsCount() {
        int result = driver.findElements(todoItemBy).size();
        addLog("Check if todo items count: " + result);
        return result;
    }

    public boolean isTodoItemCompleted(String todoItem) {
        boolean result = isElementDisplayed(driver, getCompletedTodoItemBy(todoItem));
        addLog("Check if todo item " + todoItem + " is created: " + result);
        return result;
    }

    public boolean isFooterDisplayed() {
        boolean result = isElementDisplayed(driver, footerBy);
        addLog("Check if footer is displayed: " + result);
        return result;
    }

    public void markItemAsCompleted(String todoItem) {
        WebElement checkbox = driver.findElement(checkboxToCompletedItemBy(todoItem));
        checkbox.click();
        addLog("Mark item: " + todoItem + " as completed");
        addLog("---Click on the checkbox on the left of the item: " + todoItem);
    }

    public void markAllItemsAsCompleted() {
        WebElement arrow = driver.findElement(arrowToCompletedAllBy());
        arrow.click();
        addLog("Mark all items as completed");
        addLog("---Click on the down arrow in the input field");
    }

    public void clearAllCompletedItems() {
        WebElement clearCompleted = driver.findElement(clearCompletedBy());
        clearCompleted.click();
        addLog("Clear all completed items");
        addLog("---Click 'Clear completed' button");
    }

    public void clearOneItem(String todoItem) {
        WebElement cross = driver.findElement(moveToElement(todoItem)); //xpath the parent

        Actions act = new Actions(driver);
        act.moveToElement(cross).perform();

        WebElement clickElement = driver.findElement(crossToRemoveItemBy(todoItem));//xpath the child
        act.moveToElement(clickElement).click().perform();
        addLog("Clear one item");
        addLog("---Click on the cross to the right of the item: " + todoItem);
    }

    public void checkOnlyActiveItems() {
        WebElement activeButton = driver.findElement(activeButtonBy);
        activeButton.click();
        addLog("Check list of active items only");
        addLog("---Click on the 'Active' button");
    }

    public boolean isDisplayedOnlyActiveItems() {
        boolean result = !isElementDisplayed(driver, isSomeItemCompleted);
        addLog("Check if only active elements are displayed " + result);
        return result;
    }

    public void checkOnlyCompletedItems() {
        WebElement completedButton = driver.findElement(completedButtonBy);
        completedButton.click();
        addLog("Check list of completed items only");
        addLog("---Click on the 'Completed' button");
    }

    public void clearAll() {
        int count = getTodoItemsCount();
        boolean allItemsCompleted = !isDisplayedOnlyActiveItems();
        if (allItemsCompleted) {
            clearAllCompletedItems();
        } else if (count > 0) {
            markAllItemsAsCompleted();
            clearAllCompletedItems();
        }
    }
}