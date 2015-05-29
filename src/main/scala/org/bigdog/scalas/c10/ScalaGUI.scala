/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bigdog.scalas.c10;
import scala.swing._;
class ScalaGUI extends SimpleGUIApplication {
  def myExec(): Unit = {
    var top = new MainFrame {
      title = "first title"
      contents = new Button { text = "click me" }
    }
  }
}
