package weathertest;

import org.gotoschool.GoToSchool;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class WeatherTest {
    GoToSchool today = new GoToSchool();

    @BeforeClass
    public void prepareClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }

    @Test
    public void test1() {
        assertTrue(today.shouldIGotoSchool(-25.0,0.0), "Actual result is not equal expected result");
    }

    @Test
    public void test2() {
        assertTrue(today.shouldIGotoSchool(-25.0,0.9), "Actual result is not equal expected result");
    }

    @Test
    public void test3() {
        assertTrue(today.shouldIGotoSchool(-20.0,0.0), "Actual result is not equal expected result");
    }

    @Test
    public void test4() {
        assertTrue(today.shouldIGotoSchool(-20.0,0.9), "Actual result is not equal expected result");
    }

    @Test
    public void test5() {
        assertTrue(today.shouldIGotoSchool(-19.9,0.0), "Actual result is not equal expected result");
    }

    @Test
    public void test6() {
        assertTrue(today.shouldIGotoSchool(-19.9,0.9), "Actual result is not equal expected result");
    }

    @Test
    public void test7() {
        assertTrue(today.shouldIGotoSchool(-19.9,1.0), "Actual result is not equal expected result");
    }

    @Test
    public void test8() {
        assertFalse(today.shouldIGotoSchool(-25.0,1.0), "Actual result is not equal expected result");
    }

    @Test
    public void test9() {
        assertFalse(today.shouldIGotoSchool(-20.0,1.0), "Actual result is not equal expected result");
    }

    @Test
    public void test10() {
        assertFalse(today.shouldIGotoSchool(-25.1,0.0), "Actual result is not equal expected result");
    }

    @Test
    public void test811() {
        assertFalse(today.shouldIGotoSchool(-25.1,0.9), "Actual result is not equal expected result");
    }

    @Test
    public void test12() {
        assertFalse(today.shouldIGotoSchool(-25.1,1.0), "Actual result is not equal expected result");
    }
}
