/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c3
/**
 * tuple is a very usefull data container object which can support us to save the data as items,just look like list ,ArrayList
 */
class MyTuple {

  /**
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * 84
   * deerfield Ln Meriden CT
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.156 sec
   *
   */
  def myExec(): Unit = {
    var pair = (84, "deerfield Ln Meriden CT")
    println(pair._1)
    println(pair._2)
  }

}
