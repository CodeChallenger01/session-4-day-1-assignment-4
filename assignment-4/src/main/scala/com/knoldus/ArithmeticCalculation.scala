package com.knoldus

class ArithmeticCalculation {

  /*This method is used to perform the arithmetic operation as per user input*/
  def arithmeticOperations(listOfOption: List[Option[Int]], operationOnList: String): Option[Int] = {
    try {
      /*In this part we are converting the List[Option[Int]] ------> List[Int] */
      val listOfInt = for {
        mayBeValue <- listOfOption
        value <- mayBeValue
      } yield value

      /*This method is used to perform the addition of element in List*/
      def additionElementOfList(listOfInt: List[Int]): Int = {
        val sumOfList: Int = listOfInt.reduceLeft((numOne: Int, numTwo: Int) => numOne + numTwo)
        sumOfList
      }

      /*This method is used to perform the subtraction of element in List*/
      def subtractionOfList(listOfInt: List[Int]): Int = {
        val subtractionResult: Int = listOfInt.reduceLeft((numOne: Int, numTwo: Int) => numOne - numTwo)
        subtractionResult
      }

      /*This method is used to perform the multiplication of element in List*/
      def multiplicationOfList(value: List[Int]): Int = {
        val multiplicationResult: Int = value.reduceLeft((numOne: Int, numTwo: Int) => numOne * numTwo)
        multiplicationResult
      }

      /*It match with user operation type and call the method as per operation type matched*/
      operationOnList.toLowerCase match {
        case "addition" => Some(additionElementOfList(listOfInt))
        case "subtraction" => Some(subtractionOfList(listOfInt))
        case "multiplication" => Some(multiplicationOfList(listOfInt))
        case _ => None
      }
    }
    catch {
      case ex: NullPointerException => None
      case _: Throwable => None
    }
  }
}
