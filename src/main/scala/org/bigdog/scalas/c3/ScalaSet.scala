/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c3

class ScalaSet {
  /**
   *
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * false
   * 3
   */
  def myExec(): Unit = {
    var Myset = Set("the first", "The second")
    Myset += "the third"    //create a totally new set ,put the new value into the set ,then give value to Myset,because Myset is no-extendable, 
    println(Myset.contains("hello"))
    println(Myset.size)
  }

}
