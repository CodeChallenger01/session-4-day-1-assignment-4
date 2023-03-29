package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ArithmeticCalculationTest extends AnyFlatSpec with Matchers {

  val arithmeticObj = new ArithmeticCalculation

  "it " should "match with None if empty list is pass " in {
    val list = List()
    val operationType: String = "addition"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = 0
    expectedOutput shouldBe result
  }

  "it " should "return sum of list" in {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val operationType: String = "addition"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = 10
    expectedOutput shouldBe result
  }

  "it " should "not return different sum of list" in {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val operationType: String = "addition"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = 100
    assert(expectedOutput != result)
  }

  "it " should "return subtraction of list " in {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val operationType: String = "subtraction"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = -8
    assert(expectedOutput == result)
  }

  "it " should " return multiplication of list " in {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val operationType: String = "multiplication"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = 24
    assert(expectedOutput == result)
  }

  "it " should " not return multiplication of list other than original result " in {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val operationType: String = "multiplication"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = 200
    assert(expectedOutput != result)
  }

  "it " should "return multiplication of list if user Type Capital Multiplication" in {
    val list = List(Some(10), Some(2), Some(3), Some(4))
    val operationType: String = "MULTIPLICATION"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = 240
    assert(expectedOutput == result)
  }

  "it " should "return 0 if other operation pass as a parameter" in {
    val list = List(Some(10), Some(2))
    val operationType: String = "division"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = 0
    assert(expectedOutput == result)
  }

  "it " should "return addition of number if it is negative also" in {
    val list = List(Some(-10), Some(-2))
    val operationType: String = "addition"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = -12
    assert(expectedOutput == result)
  }

  "it " should "return 0 if Some of Int contains zero" in {
    val list = List(Some(0), Some(100))
    val operationType: String = "multiplication"
    val result = arithmeticObj.arithmeticOperations(list, operationType).getOrElse(0)
    val expectedOutput = 0
    assert(expectedOutput == result)
  }


}
