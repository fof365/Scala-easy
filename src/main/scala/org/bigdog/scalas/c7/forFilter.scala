/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c7

class forFilter {
  /**
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * web.java
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.166 sec
   */
  def myExec(): Unit = {
    var p = List("web.java", "x.xmll", "st.java", "a.cpp", "x.S");
    for (fileName <- p 
         if fileName.endsWith(".java");
         if fileName.size > 7
    ) {
      println(fileName)
    }
  }
}