/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c3
import scala.io.Source
class ScalaFileIO {

  /*
   *
   *-------------------------------------------------------
   *T E S T S
   *-------------------------------------------------------
   *Running samples.AppTest
   *100 adb push .\dex\attDynaDex_dex.jar /data/data/com.example.dex/app_dex
   *Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.196 sec   
   */
  def myExec(): Unit = {
    var filePath = "C:\\Users\\jw362j\\work_jiunian.wang\\pushit.bat";
    for (line <- Source.fromFile(filePath).getLines) {
      println(line.length + " " + line)
    }
  }
}

