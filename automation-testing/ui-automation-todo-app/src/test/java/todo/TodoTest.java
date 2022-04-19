package todo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static org.testng.Assert.*;

public class TodoTest {
    TodoSteps steps;
    WebDriver driver;

    @BeforeClass
    public void launchBrowser() {
        driver = SeleniumHelper.launchBrowser();
        steps = new TodoSteps(driver);
    }

    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

    @BeforeMethod
    public void navigate(Method method) {
        System.out.println("----------------------------------------------");
        System.out.println("TEST STARTED: " + method.getName());
        System.out.println("----------------------------------------------");
        steps.navigate();
        steps.clearAll();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTestMethod(Method method) {
        SeleniumHelper.takeScreenshot(driver, method.getName());
    }

    @Test(priority = 101)
    public void userCanCreateNewItemWithLettersTest() {
        String todoItem = "Add massage with letters";
        steps.addNewItem(todoItem);

        assertTrue(steps.isTodoItemCreated(todoItem), "User can not create new item");
        assertEquals(steps.getTodoItemsCount(), 1, "Incorrect Todo items count");
        assertFalse(steps.isTodoItemCompleted(todoItem), "New item is completed");
        assertTrue(steps.isFooterDisplayed(), "Footer not showing after adding new item");
    }

    @Test(priority = 102)
    public void userCanCreateNewItemWithNumbersTest() {
        String todoItem = "1234567890";
        steps.addNewItem(todoItem);

        assertTrue(steps.isTodoItemCreated(todoItem), "User can not create new item");
        assertEquals(steps.getTodoItemsCount(), 1, "Incorrect Todo items count");
        assertFalse(steps.isTodoItemCompleted(todoItem), "New item is completed");
        assertTrue(steps.isFooterDisplayed(), "Footer not showing after adding new item");
    }

    @Test(priority = 103)
    public void userCanCreateNewItemWithSpecialSymbolsTest() {
        String todoItem = "!@#$%^&*()_+";
        steps.addNewItem(todoItem);

        assertTrue(steps.isTodoItemCreated(todoItem), "User can not create new item");
        assertEquals(steps.getTodoItemsCount(), 1, "Incorrect Todo items count");
        assertFalse(steps.isTodoItemCompleted(todoItem), "New item is completed");
        assertTrue(steps.isFooterDisplayed(), "Footer is not visible after todo item created");
    }

    @Test(priority = 104)
    public void userNotAbleToCreateAnEmptyItemTest() {
        String emptyItem = "";
        steps.addNewItem(emptyItem);

        assertFalse(steps.isTodoItemCreated(emptyItem), "Empty item was created");
        assertFalse(steps.isFooterDisplayed(), "Footer is visible after adding empty item");
    }

    @Test(priority = 105)
    public void userCanCompleteOneItemTest() {
        String firstItem = "Some item";
        String secondItem = "Some item too";
        steps.addNewItem(firstItem);
        steps.addNewItem(secondItem);
        steps.markItemAsCompleted(firstItem);

        assertTrue(steps.isTodoItemCompleted(firstItem), "User not able to complete item");
    }

    @Test(priority = 106)
    public void userCanCompleteAllItemsTest() {
        String firstItem = "First item";
        String secondItem = "Second item";
        steps.navigate();
        steps.addNewItem(firstItem);
        steps.addNewItem(secondItem);
        steps.markAllItemsAsCompleted();

        assertTrue(steps.isTodoItemCompleted(firstItem), "User not able to complete item");
        assertTrue(steps.isTodoItemCompleted(secondItem), "User not able to complete item");
        assertEquals(steps.getTodoItemsCount(), 2, "Incorrect Todo items count after deleting one item");
    }

    @Test(priority = 107)
    public void userCanDeleteOneItemTest() {
        String firstItem = "First item";
        String secondItem = "Second item";
        steps.navigate();
        steps.addNewItem(firstItem);
        steps.addNewItem(secondItem);
        steps.clearOneItem(firstItem);

        assertEquals(steps.getTodoItemsCount(), 1, "Incorrect Todo items count after deleting one item");
    }

    @Test(priority = 108)
    public void userCanDeleteAllCompletedItemsTest() {
        String firstItem = "First item";
        String secondItem = "Second item";
        String thirdItem = "Third item";
        steps.navigate();
        steps.addNewItem(firstItem);
        steps.addNewItem(secondItem);
        steps.addNewItem(thirdItem);
        steps.markItemAsCompleted(firstItem);
        steps.markItemAsCompleted(secondItem);
        steps.clearAllCompletedItems();

        assertEquals(steps.getTodoItemsCount(), 1, "Incorrect Todo items count after deleting all completed items");
    }

    @Test(priority = 109)
    public void userCanViewOnlyActiveItemsTest() {
        String firstItem = "First item";
        String secondItem = "Second item";
        String thirdItem = "Third item";
        steps.navigate();
        steps.addNewItem(firstItem);
        steps.addNewItem(secondItem);
        steps.addNewItem(thirdItem);
        steps.markItemAsCompleted(firstItem);
        steps.markItemAsCompleted(secondItem);
        steps.checkOnlyActiveItems();

        assertEquals(steps.getTodoItemsCount(), 1, "Incorrect count of active items after marking items as completed");
        assertFalse(steps.isTodoItemCompleted(thirdItem), "Active item is completed");
        assertTrue(steps.isDisplayedOnlyActiveItems(), "The list displays not only active items");
    }

    @Test(priority = 110)
    public void userCanViewCompletedItemsTest() {
        String firstItem = "First item";
        String secondItem = "Second item";
        String thirdItem = "Third item";
        steps.navigate();
        steps.addNewItem(firstItem);
        steps.addNewItem(secondItem);
        steps.addNewItem(thirdItem);
        steps.markItemAsCompleted(firstItem);
        steps.markItemAsCompleted(secondItem);
        steps.checkOnlyCompletedItems();

        assertTrue(steps.isTodoItemCompleted(firstItem), "Marked item is not completed");
        assertTrue(steps.isTodoItemCompleted(secondItem), "Marked item is not completed");
        assertEquals(steps.getTodoItemsCount(), 2, "Incorrect count of active items after marking items as completed");
    }
}



