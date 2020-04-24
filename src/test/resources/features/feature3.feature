#providing multiple set of test data

Feature: create test for registration - Demowebshop

Scenario Outline: Registration test
* user should naviagtes to demowebshop on chrome browser
* user clicks on register link
* user selects gender
* user enters with first name as "<fn>"
* user enters with last name as "<ln>"
* user enters with email as "<email>"
* user enters with password as "<psd>"
* user enters with confirm password as "<confirmpsd>"
* user clicks on register button
* user should verify registration success

Examples:
|fn|ln|email|psd|confirmpsd|
|saranya|shanmugam|saranya@gmail.com|password@1|password@1|
|saranya1|shanmugam1|saranya@gmail.com|password@1|password@1|





