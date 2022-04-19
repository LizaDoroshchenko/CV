CV
===============

# Intro

The last few month I actively studying a new and very interesting for me Quality Assurance and Automated Quality Assurance areas. During self education I've read a lot of articles, several books, watched multiple courses and videos on YouTube. Also per each area I've done several practical tasks which can be found bellow.


#### This repository represents my self-learning roadmap.

<br>

# Tasks Report

- Web UI Technologies HTML, CSS, JS, Dev Tools - [Test Hobbit](https://github.com/LizaDoroshchenko/CV/tree/main/test-hobbit), [Calculator](https://github.com/LizaDoroshchenko/CV/tree/main/calculator)
- API Testing - [Social Network API](https://github.com/LizaDoroshchenko/CV/tree/main/social-network-api)
- SQL - [SQL task](https://github.com/LizaDoroshchenko/CV/tree/main/sql)
- Quality Assurance - [fantasy worlds](https://github.com/LizaDoroshchenko/CV/tree/main/fantasy-worlds)
- Test Automation - [Automated tests for TodoMVC](), [Converter](), [Calculator](), [Go to school]()

<br>

# Self Education Report

## 1.1 HTML

During the period of self-education, I got acquainted with the HTML language, learned the basic rules of the language, the description of the structure of the HTML page, got acquainted with the main elements and attributes.
#### At this moment I can :

1. Read and create HTML documents;
2. Place text in html document;
3. Create various buttons, links, images;
4. View information about an HTML document in a web browser;

## 1.2 CSS

Starting to learn the CSS style sheet language, I learned how to extend the design and layout of web pages. I learned about the basic parameters that apply to the elements of an HTML document and learned how to use them.
#### Using CSS, I can set such parameters of an HTML document as:

1. Text design (grouping text on the page, changing the color of the text, using different fonts);
2. Change the background color of the page;
3. Design of various elements on the page (creating frames, changing the color of elements, adding shadows);
4. Change on hover;

I can also view style data on web pages in a web browser.

## 1.3 JS

To understand better how websites work, I started learning JavaScript. I learned how to connect JS scripts to an HTML document, what data types are (string, numeric, boolean), what is a variable, what is a function.

#### At the moment with JS I can:

1. Create variables and assign them any values;
2. Create a function;
3. Set the function condition;
4. Bind a function to an event;

## 1.4 Dev Tools

Having studied development tools, I know what they consist of (such elements as Elements, Styles, Console, Sources, Network) and what information is contained in each of the elements.
#### With Dev Tools I can:

1. View information about HTML and CSS;
2. View information about JavaScript errors or error warnings;
3. View information about client requests and server responses;

## 1.5 Sources

### 1.5.1 HTML

> - Tutorial ["HTML/HTML5"](https://html5book.ru/html-html5/)
> - Directory ["Справочник по HTML"](http://htmlbook.ru/html)
> - Article ["Основы HTML"](https://developer.mozilla.org/ru/docs/Learn/Getting_started_with_the_web/HTML_basics)
> - Video lesson ["Урок по HTML для начинающих"](https://www.youtube.com/watch?v=ORPOQLSKWRA)
> - Video lesson ["Учим Html"](https://www.youtube.com/watch?v=4jYYHaTwWvY&t=228s)
> - Video lesson ["Что такое ВЕРСТКА сайта"](https://www.youtube.com/watch?v=BsQd9uOHjMM&t=2s)
> - Video lesson ["Основы HTML и CSS для тестировщика"](https://www.youtube.com/watch?v=IOk-S5h8rpc&list=PLKbJd47Kcbju2Vhi-FL7AI14vItVmGYk-&index=15)

<br>

### 1.5.2 CSS

> - Tutorial ["CSS/CSS3"](https://html5book.ru/css-css3/)
> - Directory ["Справочник CSS"](http://htmlbook.ru/css)
> - Article ["Основы CSS"](https://developer.mozilla.org/ru/docs/Learn/Getting_started_with_the_web/CSS_basics)
> - Video lesson ["УЧИМ CSS"](https://www.youtube.com/watch?v=X3fwcl_qx50)

<br>

### 1.5.3 JS

> - Article ["3.1.Основы JavaScript"](https://html5book.ru/osnovy-javascript/)
> - Article ["Основы JavaScript"](https://developer.mozilla.org/ru/docs/Learn/Getting_started_with_the_web/JavaScript_basics)
> - Video lesson ["JavaScript Основы для Начинающих"](https://www.youtube.com/watch?v=Bluxbh9CaQ0&t=12348s)
> - Video lesson ["Основы программирования на JavaScript"](https://www.youtube.com/watch?v=2yT8jMgWvko&t=1s)
> - Video lesson ["Нажатие на кнопку в JavaScript"](https://www.youtube.com/watch?v=AOovMks3O-Y&t=3s)

<br>

### 1.5.4 Dev Tools

> - Video lesson ["Что такое DevTools для тестировщика?"](https://www.youtube.com/watch?v=a3vRm9neKhs&t=2s)
> - Video lesson ["ОСНОВЫ ИСПОЛЬЗОВАНИЯ DEV TOOLS"](https://www.youtube.com/watch?v=H6laTdiVBbE)

## 1.6 Tasks

As part of the study of this block, I completed the following practical tasks: created a website [Test Hobbit](https://github.com/LizaDoroshchenko/CV/tree/main/test-hobbit) and simple [Calculator](https://github.com/LizaDoroshchenko/CV/tree/main/calculator)

### 1.6.1 Test Hobbit

[Test Hobbit](https://github.com/LizaDoroshchenko/CV/tree/main/test-hobbit) - is a small site with the ability to find out "How Much Of Bilbo Baggins Are You". The site consists of two pages, where the first page is designed as a test with riddles from the book "The Hobbit, or There and Back Again" and the ability to select and enter answers (using radio buttons and an input field), and there is also a link to the second page ( designed as a "РЕЗУЛЬТАТ ТЕСТА" button) and a "темная тема" button that allows you to change the color of the background and text of the page. By clicking on the link "РЕЗУЛЬТАТ ТЕСТА" you can view the result of passing the test and the attached image.

### 1.6.2 Calculator

[Calculator](https://github.com/LizaDoroshchenko/CV/tree/main/calculator) was created by me based on the video tutorial ["Как написать простой калькулятор"](https://www.youtube.com/watch?v=WA3EFIB8-wU&t=203s). The elements of the calculator are arranged in four columns containing 5 cells each. I also added 3 simple functions:

1. A function that allows you to add a number or an operator to the input line, corresponding to the number or operator of the button when you click on it. The onclick event is assigned to each element with a number and operators;

2. The substring function with the value (0, exp.length - 1) with the help of which it is possible to display a substring in the input field without the last number, thus realizing the removal of the last character from the input string. The onclick event is assigned to the "del" element;

3. The eval function, which reads the string in the input field and produces a result based on two values, provided that the input field has some data. The onclick event assigned to element "=";

# 2. HTTP Protocol, API Testing

## 2.1 HTTP Protocol

Continuing my self-education, I studied such a thing as the HTTP Protocol.

#### At the moment I know:

1. What does the HTTP protocol consist of;
2. What is Request and Response and what do they consist of;
3. What are query methods, types of methods;
4. What is status code, types of status codes;

## 2.2 API Testing

After studying the information about the API, I understood what the API is and why it is needed, I also learned how API testing is carried out in the Postman program and put my knowledge into practice.

#### At the moment I know:

1. How to get information about any data;
2. How to create or change data on the server;
3. How to delete data from the server;
4. How the documentation for API testing on real projects might look like;

## 2.3 Sources

### 2.3.1 HTTP Protocol

> - Article ["Обзор протокола HTTP"](https://developer.mozilla.org/ru/docs/Web/HTTP/Overview)
> - Article ["Простым языком об HTTP"](https://habr.com/ru/post/215117/)
> - Article ["Введение в протоколы HTTP и HTTPS"](https://docs.microsoft.com/ru-ru/azure/rtos/netx-duo/netx-duo-web-http/chapter1)
> - Article ["Протокол HTTP: обзор для чайников"](https://highload.today/protokol-http/)
> - Video lesson [" HTTP-протокол для чайников"](https://www.youtube.com/watch?v=OA3jExxIkew&t=903s)
> - Video lesson ["Протокол HTTP. Структура запроса/ответа. Методы HTTP"](https://www.youtube.com/watch?v=-jR7mGCNXBo&t=8s)
> - Video lesson ["HTTP протокол на пальцах"](https://www.youtube.com/watch?v=C_QZtajkDf0&t=200s)

<br>

### 2.3.2 API Testing

> - Article ["API"](https://ru.wikipedia.org/wiki/API)
> - Article ["Что такое API? Простое объяснение для начинающих"](https://devby.io/news/chto-takoe-api-prostym-yazykom)
> - Article ["Что такое API"](https://habr.com/ru/post/464261/)
> - Video lesson ["Как тестировать API с помощью Postman"](https://www.youtube.com/watch?v=VqjaDULOYOM&t=1822s)
> - Video lesson ["Тестирование API"](https://www.youtube.com/watch?v=7D7AMmgxt_I&t=2s)
> - Video lesson ["POSTMAN. Ручное тестирование API"](https://www.youtube.com/watch?v=55l6XIEK9l0&t=2115s)

## 2.4 Tasks

### 2.4.1 Social Network API

After studying API Testing, I completed a practical task [Social Network API](https://github.com/LizaDoroshchenko/CV/tree/main/social-network-api), by creating my collection of tests in Postman. Using documentation ["SamuraiJS Social Network API"](https://social-network.samuraijs.com/docs#) I have tested several functions:

1. View information about users (search for a user by name or id, search for multiple users, check specific pages);
2. Registration in a social network;
3. View personal information;
4. Deleting my account;

### 2.4.2 "SWAPI"

Using a resource ["SWAPI"](https://swapi.dev/) I learned how to create queries to get data about movies, actors, planets, I also learned how to execute queries to display specific pages.

# 3. Databases, SQL

## 3.1 Databases

My next task was to study databases.
#### At the moment I know:

1. What databases are;
2. What types of databases exist, their advantages and disadvantages;
3. How to interact with data in the database;

## 3.2 SQL

Having learned about the way data is stored in relational databases, I studied and learned how to practically apply basic SQL queries, namely:

1. SELECT FROM (find data);
2. INSERT INTO (add data);
3. UPDATE (change data);
4. DELETE (delete data);
5. JOIN (view data from multiple tables);

## 3.3 Sources

### 3.3.1 Databases

> - Article ["Что такое База Данных"](https://habr.com/ru/post/555760/)
> - Article ["Реляционные vs. нереляционные базы данных"](https://boodet.online/blog/relyacionnye-vs-nerelyacionnye-bazy-dannyh-otlichiya-i-preimushhestva)
> - Video lesson ["Базы данных для тестировщика"](https://www.youtube.com/watch?v=GIzeF6CJAm4)

<br>

### 3.3.2 SQL

> - Article ["SQL"](https://ru.wikipedia.org/wiki/SQL)
> - Tutorial ["SQL Tutorial"](https://www.w3schools.com/sql/)
> - Video lesson ["sql для тестировщиков"](https://www.youtube.com/watch?v=k8jXX7E_Wkg)
> - Video lesson ["sql уроки для начинающих Join"](https://www.youtube.com/watch?v=8jtMoSD3zH8)

## 3.4 Tasks

### 3.4.1 SQL

With tutorial [Databases "SQL Tutorial"](https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all) I was able to practically work with the data in these databases.

#### Actions that have been taken:

1. Using the SELECT FROM query, I searched for data: ```SELECT * FROM Customers WHERE CustomerName='Alfreds Futterkiste'```;
2. Set a value limit ```LIMIT 10```, pattern searching ```LIKE ('A%')```;
3. Set the sort value alphabetically ```ORDER BY ASC```;
4. Using the INSERT INTO query, I added data:```INSERT  INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('Liza', 'Dorosh', 'Street', 'Minsk', 1111, 'Belarus')```;
5. Using the UPDATE query, I changed the created data: ```UPDATE Customers SET ContactName='Lizaveta' WHERE CustomerID = 94```;
6. Using the DELETE request, I deleted the created data: ```DELETE FROM Customers WHERE ContactName='Lizaveta'```;
7. Using the INNER JOIN query, I combined the data of two tables: ```SELECT Orders.OrderID, Customers.CustomerName FROM Orders INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;```;

# 4. Quality Assurance

## 4.1 Theory of testing

I also got acquainted with the theory of testing.

#### I have learned the following concepts:

1. Testing principles;
2. Test classification;
3. Software testing cycle;
4. Test documentation: test plan, check list, test case, bug report;
5. Software Development Models (pros, cons, examples of use);
6. Test design, test design techniques;

## 4.2 Sources

> - Book "Тестирование Дот Ком, или Пособие по жестокому обращению с багами в интернет-стартапах" Roman Savin
> - Video tutorial course ["Тестировщик с нуля"](https://www.youtube.com/watch?v=CrfRUS2oudE)
> - Video lesson ["Тестировщик с нуля за 6 часов"](https://www.youtube.com/watch?v=3kgdKE7ndvI)
> - Web site ["ПРОТЕСТИНГ.RU"](http://www.protesting.ru/)

## 4.3 Tasks

### 4.3.1 Fantasy Worlds

Having mastered the theoretical material, I completed the task [fantasy worlds](https://github.com/LizaDoroshchenko/CV/tree/main/fantasy-worlds), the gist of which was:

1. Learn and analyze the functionality of the site [Fantasy Worlds](https://fantasy-worlds.net/);
2. Create use cases of the site and the test plan;
3. Conduct functional testing and UI testing of the site [Fantasy Worlds](https://fantasy-worlds.net/);
4. Find bugs and include information about them in bug reports;
5. Write several test cases;

# 5. Project Management, Bug Tracking

## 5.1 Jira

I also managed to get acquainted with such a bug-tracking system as Jira.
#### At the moment I know:

1. How to create a project;
2. How to put a bug in a bug report;
3. How to assign a task to participants;
4. What the fields for tasks are;
5. How to find a task quickly;

## 5.2 Sources

> - Article ["Для чего используется Jira?"](https://www.atlassian.com/ru/software/jira/guides/use-cases/what-is-jira-used-for#Jira-for-requirements-&-test-case-management)
> - Video lesson ["Начало работы в Jira. Создание задачи и Администрирование"](https://www.youtube.com/watch?v=rDhzX5i2qig&t=322s)
> - Video lesson ["Отчет о дефекте (баг-репорт) в Jira"](https://www.youtube.com/watch?v=6YrgKBTzb5o&t=2531s)

# 6. Using Git, GitHub

## 6.1  Using Git

Having learned about the version of control system, I began to study this topic in more detail. Now I know that this is a system that allows you to store files and their changes with the ability to return to any version of the file. This system allows you to see all the changes and who makes them. Also in such a system, there is a low posibility that files will be lost.

## 6.2 GitHub

To host my resume on the local network, I chose the GidHub web service, and began to explore its capabilities, such as creating a repository, adding files to it, and editing them.
#### To achieve these goals, at the moment I know the following commands:

1. git add (adding a file to the index for further commit);
2. git status (view file status);
3. git commit (saving the file added to the index to the local repository);
4. git push (sending a file from a local repository to a remote one);

## 6.3 Sources

### 6.3.1 Using Git

> - Article ["Git и GitHub: что это такое и в чём разница"](https://tproger.ru/translations/difference-between-git-and-github/)
> - Article ["Введение - О системе контроля версий"](https://git-scm.com/book/ru/v2/%D0%92%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%9E-%D1%81%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B5-%D0%BA%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D1%8F-%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D0%B9)

<br> 

### 6.3.2 GitHub

> - Article ["GitHub"](https://ru.wikipedia.org/wiki/GitHub)
> - Article ["Приложение C: Команды Git - Основные команды"](https://git-scm.com/book/ru/v2/%D0%9F%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5-C%3A-%D0%9A%D0%BE%D0%BC%D0%B0%D0%BD%D0%B4%D1%8B-Git-%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D0%BA%D0%BE%D0%BC%D0%B0%D0%BD%D0%B4%D1%8B)
> - Video lesson ["Основы Git для тестировщиков с нуля"](https://www.youtube.com/watch?v=Qfo78zqMzVs)
> - Video lesson ["GIT для тестировщика / Установка GIT / Регистрация в GitHub / Первый репозиторий"](https://www.youtube.com/watch?v=zbg39ink85Q)

# 7. Learned Markdown for Documentation

## 7.1 Markdown

To design my self-education plan and post it on GitHub, I chose to use the Markdown text markup language.
#### I learned the basic syntax of Markdown elements, such as:

1. Headings;
2. Blockquotes;
3. Lists;
4. Code Blocks;
5. Text selection;
6. Links;
7. Images;

## 7.2 Sources

> - Article ["Что такое Markdown"](https://guides.hexlet.io/markdown/)
> - Article ["Basic Syntax"](https://www.markdownguide.org/basic-syntax/)

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

## 8.3 Sources

> - Article ["Java"](https://ru.wikipedia.org/wiki/Java)
> - Tutorial ["Java Tutorial"](https://www.w3schools.com/java/)
> - Tutorial ["Руководство по языку программирования Java"](https://metanit.com/java/tutorial/)
> - Tutorial ["JavaRush"](https://javarush.ru/all-articles)

## 8.4 Tasks

### 8.4.1 Converter, Calculator, Go to school

Studying the theoretical material, I performed several [practical tasks](),

#### namely:

1. [Converter]() that handles 3 types of currencies, and several [tests]() that check the functions of the converter.
2. [Calculator]() which takes 2 numbers and adds them up. There are also a couple of simple [checks]() for the calculator.
3. A [Go to school]() task whose conditions are: You need to create a class with a method to help
   you decide whether to go to school. if the temperature is < -25 ℃, we don't go to school at all if the temperature is
   -25 ..- 20 ℃, you can go if the path is < 1 km. To check this task, several [tests] () are also written.

### 8.4.2 TodoMVC testing

After solving a few small tasks, I decided to write real [automated tests](https://github.com/LizaDoroshchenko/CV/tree/main/ui-automation-todo-app/src/test/java/todo) for
site [TodoMVC](https://todomvc.com/examples/vanillajs/#/) testing its core functionality.

#### List of checks:

1. Entering characters in the input field and checking the creation of the item;
2. Checking the impossibility of creating an empty item;
3. Checking the possibility of complete one item;
4. Checking the possibility of complete all items;
5. Checking the possibility to delete one item;
6. Checking the possibility of deleting all completed items;
7. Checking the view of all active items;
8. Checking the view of all completed items;

All checks are carried out in the Google Chrome browser.

# 9. Future Steps

## 9.1 Security Testing

In my future work, I plan to study security testing, study the principles of testing, types of vulnerabilities, methods of security testing. I also want to learn how to apply this knowledge in practice.
