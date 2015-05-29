/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c8

class NoNameFunction {
  /**
   *
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * 1a,2a,3a,4a,5a,6a,Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.166 sec
   *
   */
  def myExec(): Unit = {
    var mylist = List("1", "2", "3", "4", "5", "6");
    //call the function which without function name ,just one time use.
    mylist.foreach((number: String) => {
      print(number + "a,")
    });
  }

  /**
   *
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * 1a,2a,3a,4a,5a,6a,Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.166 sec
   *
   */
  def myExec1(): Unit = {
    var mylist = List("1", "2", "3", "4", "5", "6");
    //call the function which without function name ,just one time use.
    mylist.foreach(x => print(x + "a,"));
  }

  /**
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * 123456Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.164 sec
   *
   * Results :
   *
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   */
  def myExec2(): Unit = {
    var mylist = List("1", "2", "3", "4", "5", "6");
    //call the function which without function name ,just one time use.
    mylist.foreach(print(_));
  }

  /**
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * 123456Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.164 sec
   *
   * Results :
   *
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   *
   */
  def myExec3(): Unit = {
    var mylist = List("1", "2", "3", "4", "5", "6");
    //call the function which without function name ,just one time use.
    mylist.foreach(print _);
  }

  private def sum(a: Int, b: Int, c: Int): Int = {
    var result = a + b + c;
    result;
  }

  /**
   *
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * result is:60
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.159 sec
   *
   * Results :
   *
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   */
  def myExec4(): Unit = {
    val tmp = sum _;
    //    println("result is:" + tmp.apply(10, 20, 30));
    println("result is:" + tmp(10, 20, 30));
  }

  /**
   *
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * result is:116
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.16 sec
   *
   * Results :
   *
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   */
  def myExec5(): Unit = {
    val tmp = sum(21, _: Int, 90);
    //    println("result is:" + tmp.apply(10, 20, 30));
    println("result is:" + tmp(5));
  }

  /**
   *
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * result is:65
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.169 sec
   *
   * Results :
   *
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   */
  def myExec6(): Unit = {
    val someInt = List(11, 12, 13, 14, 15);
    var result: Int = 0;
    someInt.foreach(result += _);
    println("result is:" + result);
  }

}
