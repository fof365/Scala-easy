/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c8

class ScalaClosure {
  private def makeIncreaser(more: Int) = {

    (i_first: Int, j_second: Int) =>
      {
        var result = 0;
        result = i_first + j_second + more + 3;
        result
      }
  }

  /**
   *
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * result a is:19
   * result b is:25
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.162 sec
   *
   * Results :
   *
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   */
  def myExec(): Unit = {
    var a = makeIncreaser(11);
    var b = makeIncreaser(13);
    println("result a is:" + a(2, 3));
    println("result b is:" + b(4, 5));
  }

  private def multipleParameters(args: String*): Unit = {
    for (arg <- args) { print(arg + " , ") }
    println();
  }

  /**
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * hello ,
   * world , is  ,
   * nice weather , food , 41 ,
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.158 sec
   *
   */
  def myExec1(): Unit = {
    multipleParameters("hello");
    multipleParameters("world", "is ");
    multipleParameters("nice weather", "food", "41");
  }

}
