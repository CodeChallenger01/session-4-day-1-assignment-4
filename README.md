# session-4-day-1-assignment-4
This assignment contains  session-4-day-1-assignment-4

Step 1: Open IntelliJ and create a new Project of Name assignment-4
Step 2: Create a ArithmeticCalculation scala file in src/main/scala/com.knoldus/.
Step 3: Inside the ArithmeticCalculation create a class of ArithmeticCalculation.
Step 4: Create a method of name arithmeticCalculation and take one parameter of List[Option[Int]].
Step 5: Use exception handling method and first convert list of option of int to list of int and after that apply pattern matching as per user request.
Step 6: If it is addition then call the addition method and perform addition, if subtraction then call the subtractionmethod and perform subtraction else it is multiplication then perform multiplication otherwise written None and handle the exception occur in catch block.
Step 7: Create a main object in Driver scala file and inside it create instance of ArithmeticCalculation class and declare a list of Option of Int then call the method after taking operation type and store in result and print.




Step 8: After that add the scalatest dependencies in build.sbt file.
Step 9: Create a Test Class in src/test/scala/com.knoldus. Inside the test class extend the AnyFlatSpec with Matchers Class and import the scalatest package in that test class.
Step 10: Inside the test class create instance of Class in each test case with different scenario and check with assert.
Step 11: In terminal run the command sbt test it show the result that test case is passed or fail.

OUTPUT
sbt compile & sbt run
![Screenshot from 2023-03-30 22-11-05](https://user-images.githubusercontent.com/124979629/228906180-95cf4299-0a7c-4cf1-948e-0ba67054ba70.png)

sbt test

![Screenshot from 2023-03-30 22-11-16](https://user-images.githubusercontent.com/124979629/228906254-d16b8060-cb83-4cf8-9f35-b84ef8524380.png)
