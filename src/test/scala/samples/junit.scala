package samples

import org.junit._;
import Assert._;
import org.bigdog.scalas.c3.ScalaList;
import org.bigdog.scalas.c3.MyTuple;
import org.bigdog.scalas.c3.ScalaSet;
import org.bigdog.scalas.c3.ScalaMap;
import org.bigdog.scalas.c3.ScalaFileIO;
import org.bigdog.scalas.c6.ScalaToString;
import org.bigdog.scalas.c7.forFilter;
import org.bigdog.scalas.c8.NoNameFunction;
import org.bigdog.scalas.c8.ScalaClosure;
import org.bigdog.scalas.c10.ScalaGUI;

@Test
class AppTest {

  /**
   * Test use case luncher,all of the test code are running from here.
   */
  @Test
  def testScalaJunit(): Unit = {
    //    ScalaList_test()
    //    ScalaList_test1()
    //    MyTuple_test1()
    //    ScalaSet_test1
    //    ScalaMap_test1()
    //    ScalaFileIO_test1()
    //    ScalaToString_test1();
    //    forFilter_test1();
    //    NoNameFunction_test()
    //    ScalaClosure_test()
    //    ScalaGUI_test()

  }

  def ScalaList_test(): Unit = {
    var scalaTest = new ScalaList()
    scalaTest.listTest()
  }

  def ScalaList_test1(): Unit = {
    var scalaTest = new ScalaList()
    scalaTest.listTest1()
  }

  def MyTuple_test1(): Unit = {
    var myTuple = new MyTuple()
    myTuple.myExec()
  }

  def ScalaSet_test1(): Unit = {
    var scalaSet = new ScalaSet()
    scalaSet.myExec()
  }

  def ScalaMap_test1(): Unit = {
    var myTest = new ScalaMap()
    myTest.myExec()
  }

  def ScalaFileIO_test1(): Unit = {
    var myTest = new ScalaFileIO;
    myTest.myExec();
  }

  def ScalaToString_test1(): Unit = {
    var myTest = new ScalaToString(28, "jiunian");
    println(myTest);
  }

  def forFilter_test1(): Unit = {
    var myTest = new forFilter;
    myTest.myExec();
  }

  def NoNameFunction_test(): Unit = {
    var myTest = new NoNameFunction;
    myTest.myExec6();
  }

  def ScalaClosure_test(): Unit = {
    var myTest = new ScalaClosure;
    myTest.myExec1();
  }

  def ScalaGUI_test(): Unit = {
    var myTest = new ScalaGUI;
    myTest.myExec1();
  }

}

