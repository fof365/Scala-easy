/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c3

class ScalaList {

  /**
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * list3 is:List(11, 12, 13, 15, 16)
   */
  def listTest(): Unit = {
    var list1 = List(11, 12, 13)
    var list2 = List(15, 16)
    var list3 = list1 ::: list2
    println("list3 is:" + list3)
  }

  /**
   *
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * result is:List(38, 5, 6)
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.167 sec
   */
  def listTest1(): Unit = {
    var list1 = List(5, 6)
//    var result = 38 :: list1
    var result =  list1.::(38) //this is as same as the last line of code, :: is the function invoke operator
    println("result is:" + result)
  }

}
