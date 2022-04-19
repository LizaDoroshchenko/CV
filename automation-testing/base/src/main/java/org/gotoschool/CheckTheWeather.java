package org.gotoschool;

public class CheckTheWeather {

    public static void main(String[] args) {

        GoToSchool today = new GoToSchool();

        /*boolean a = today.shouldIGotoSchool(-25, 1);
        if (a) {
            System.out.println("Wake Up");
        } else {
            System.out.println("Can sleep");
        }*/

        checkCondition(today.shouldIGotoSchool(-25.0,0.0), true);
        checkCondition(today.shouldIGotoSchool(-25.0,0.9), true);
        checkCondition(today.shouldIGotoSchool(-25.0,1.0), false);
        checkCondition(today.shouldIGotoSchool(-20.0,0.0), true);
        checkCondition(today.shouldIGotoSchool(-20.0,0.9), true);
        checkCondition(today.shouldIGotoSchool(-20.0,1.0), false);
        checkCondition(today.shouldIGotoSchool(-25.1,0.0), false);
        checkCondition(today.shouldIGotoSchool(-25.1,0.9), false);
        checkCondition(today.shouldIGotoSchool(-25.1,1.0), false);
        checkCondition(today.shouldIGotoSchool(-19.9,0.0), true);
        checkCondition(today.shouldIGotoSchool(-19.9,0.9), true);
        checkCondition(today.shouldIGotoSchool(-19.9,1.0), true);
    }
    public static void checkCondition(boolean actual, boolean expected) {
        if (actual != expected) {
            throw new Error("actual is " + actual + ", but expected: " + expected);
        }
    }
}