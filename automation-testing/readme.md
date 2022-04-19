# 8. Test Automation, Basic Programming

## 8.1 Introduction to Automation

Continuing self-education, I delved into the study of automated testing.

#### At the moment I have the following theoretical knowledge:

1. What is automation and why is it needed;
2. Which test cases should be automated;
3. Benefits of test automation;

## 8.2 Java, Basic Programming

I started to get acquainted with the Java object-oriented programming language.

#### Now I know:

1. What packages and classes are, how to create them;
2. What does the class consist of (fields, methods);
3. What the methods are, how to call them;
4. What a variable is;
5. What a constructor is;
6. What are the types of data (int, double, boolean, String);
7. Arithmetic operations;
8. What conditional statements are (if... else);
9. What loop is (for/while);
10. What exceptions are, their types, exception handling;
11. What access modifiers are;
12. What inheritance is;

I also know what Java libraries are, what they are for and how to use them. To implement my tests, I
used libraries such as TestNG, WebDriver and Bonigarcia.

## 8.3 TBD REST API Test Automation

## 8.4 Sources

> - Article ["Java"](https://ru.wikipedia.org/wiki/Java)
> - Tutorial ["Java Tutorial"](https://www.w3schools.com/java/)
> - Tutorial ["Руководство по языку программирования Java"](https://metanit.com/java/tutorial/)
> - Tutorial ["JavaRush"](https://javarush.ru/all-articles)

## 8.5 Tasks

### 8.5.1 Converter, Calculator, Go to school

Studying the theoretical material, I performed several [practical tasks](https://github.com/LizaDoroshchenko/CV/tree/main/automation-testing/base),

#### namely:

1. [Converter](https://github.com/LizaDoroshchenko/CV/tree/main/automation-testing/base/src/main/java/org/converter) that handles 3 types of currencies, and several [tests](https://github.com/LizaDoroshchenko/CV/tree/main/automation-testing/base/src/test/java/converter) that check the functions of the converter.
2. [Calculator](https://github.com/LizaDoroshchenko/CV/tree/main/automation-testing/base/src/main/java/org/calculator) which takes 2 numbers and adds them up. There are also a couple of simple [checks](https://github.com/LizaDoroshchenko/CV/tree/main/automation-testing/base/src/test/java/calculator) for the calculator.
3. A [Go to school](https://github.com/LizaDoroshchenko/CV/tree/main/automation-testing/base/src/main/java/org/gotoschool) task whose conditions are: You need to create a class with a method to help
   you decide whether to go to school. if the temperature is < -25 ℃, we don't go to school at all if the temperature is
   -25 ..- 20 ℃, you can go if the path is < 1 km. To check this task, several [tests](https://github.com/LizaDoroshchenko/CV/tree/main/automation-testing/base/src/test/java/weathertest) are also written.

### 8.5.2 TodoMVC testing

After solving a few small tasks, I decided to write real [automated tests](https://github.com/LizaDoroshchenko/CV/tree/main/automation-testing/ui-automation-todo-app/src/test/java) for
site [TodoMVC](https://todomvc.com/examples/vanillajs/#/) testing its basic functionality.

#### List of checks:

1. Entering characters in the input field and checking the creation of the item;
2. Checking the impossibility of creating an empty item;
3. Checking the possibility of complete one item;
4. Checking the possibility of complete all items;
5. Checking the possibility to delete one item;
6. Checking the possibility of deleting all completed items;
7. Checking the view of all active items;
8. Checking the view of all completed items;

All checks are executed in the Google Chrome browser.

### Video playback of autotests is on YouTube

[![TodoMVC Automated Test](https://github.com/LizaDoroshchenko/CV/blob/main/TodoMVC.png)](https://www.youtube.com/watch?v=L-dPsqjjyms "TodoMVC Automated Test")
