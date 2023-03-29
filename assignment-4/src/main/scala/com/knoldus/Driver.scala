package com.knoldus

import scala.io.StdIn.readLine

object Driver extends App {
  private val obj = new ArithmeticCalculation
  private val list = List(Some(1), Some(2), Some(3), Some(4))
  private val operationType: String = readLine("Enter Addition, Subtraction, or Multiplication :")
  private val result = obj.arithmeticOperations(list, operationType).getOrElse(0)
  println(result)
}
