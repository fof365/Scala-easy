/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c6

class ScalaToString(age: Int, userName: String) {

  /**
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * jiunian 's age is:28
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.157 sec
   * Results :
   */
  override def toString(): String = {
    userName + " 's age is:" + age;
  }
}
