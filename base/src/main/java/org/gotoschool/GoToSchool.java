package org.gotoschool;

public class GoToSchool {

    public boolean shouldIGotoSchool(double temperature, double distanceToSchool) {
        if (temperature < -25.0) {
//            System.out.println("We don't go to school");
            return false;
        } else if (temperature <= -20.0 && distanceToSchool >= 1.0) {
//            System.out.println("We don't go to school");
            return false;
        } else {
//            System.out.println("We go to school");
            return true;
        }
    }
}



