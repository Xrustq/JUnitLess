Task 1. Utilities class test

Create an application with the class Utils with following methods: concatenateWords, computeFactorial
Write tests for concatenateWords method using AssertEquals (a few conditions: nulls, emptyString, non-latin).
Create test method testComputeFactorial.
Add method testFactorialWithTimeout, that calculates factorial of random number. Add possibility of timeout and interruption of thread if time for method execution will be exceeded
To disable test add annotation @Ignore under the annotation @Test. Disable test method computeFactorial.

Task 2

Use Calculator class from “Java basic” module and cover its methods with JUnit tests with both positive and negative scenarios. Group negative and positive tests cases into separate test suites.
Test the following functionality:

    1. Addition, subsctraction, multiplication, division
    
    2. Division should check parameters and throw IllegalArgumentException (division by zero etc.).
    
    3. Invalid input are being rejected with a meaningfull reason(empty strings, chars, few operators in a row (++), etc.)
Use hamcrest matchers to validate results.


Task 3. Mocking       

Implement tests for PaymentController class.
Mock Account and DepositService for it using Mockito (use @InjectMocks annotation).
Do not implement services themselves, test using mocks.
Configure mocks that for user with id 100 isAuthenticated will return “true”. For deposit of amount less than hundred transaction (any userId) will be successful, any other – will throw InsufficientFundsException  (use Mockito AdditionalMatchers). Mock initialisation should be done in one place, for each test.

Test:

Successful deposit (userId 100, amount 50), check that isUserAuthenticated has been called exactly one time with parameter = 100.
Failed deposit for unauthenticated user
Failed deposit of large amount, expect exception
