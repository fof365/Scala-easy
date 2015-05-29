/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c3
import scala.collection.mutable.Map
class ScalaMap {

  /**
   * -------------------------------------------------------
   * T E S T S
   * -------------------------------------------------------
   * Running samples.AppTest
   * map value two
   * treasureMap`s size is:3
   * Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.181 sec
   *
   */
  def myExec(): Unit = {
    //create ,inital and modufy the content of mutable map
    var treasureMap = Map[Int, String]()
    treasureMap += (1 -> "map value one")
    treasureMap += (2 -> "map value two")
    treasureMap += (3 -> "map value three")
    println(treasureMap(2))
    println("treasureMap`s size is:" + treasureMap.size)
  }

}
