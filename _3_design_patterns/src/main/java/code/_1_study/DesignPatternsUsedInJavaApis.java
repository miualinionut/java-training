package code._1_study;

public class DesignPatternsUsedInJavaApis {

  public static class Creational {
  /*
  SINGLETON:
  java.langRuntime
  java.awt.Desktop
   */

  /*
  FACTORY
  getInstance() in java.util.Calendar, ResourceBundle and NumberFormat
  valueOf() method in wrapper classes like Boolean, Integer etc
   */

  /*
  ABSTRACT FACTORY
  javax.xml.parsers.DocumentBuilderFactory#newInstance()
  javax.xml.transform.TransformerFactory#newInstance()
  javax.xml.xpath.XPathFactory#newInstance()
   */

  /*
  BUILDER
  java.lang.StringBuilder#append() (unsynchronized)
  java.lang.StringBuffer#append() (synchronized)
   */

  /*
  PROTOTYPE
  Cloneable interface
  clone method
   */
  }

  public static class Structural {
  /*
  ADAPTER
  java.util.Arrays#asList()
  java.io.InputStreamReader(InputStream) (returns a Reader)
  java.io.OutputStreamWriter(OutputStream) (returns a Writer)
   */

  /*
  COMPOSITE
  java.awt.Container#add(Component)
   */

  /*
  PROXY
  Java RMI package uses proxy pattern
   */

  /*
  FLYWEIGHT
  Wrapper classes valueOf() method uses cached objects showing use of Flyweight design pattern
  String class String Pool implementation
   */

  /*
  FACADE
  -
   */

  /*
  BRIDGE
  -
   */

  /*
  DECORATOR
  Java IO classes, such as FileReader, BufferedReader
   */
  }

  public static class Behavioral {
  /*
  TEMPLATE METHOD
  All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader, java.io.Writer, java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
   */

  /*
  MEDIATOR
  java.util.Timer class scheduleXXX() methods
  java concurrency executor execute() method.
  java.lang.reflect.Method invoke() method.
   */

  /*
  CHAIN OF RESPONSABILITY
  java.util.logging.Logger#log()
  javax.servlet.Filter#doFilter()
   */

  /*
  OBSERVER
  java.util.EventListener in Swing
  javax.servlet.http.HttpSessionBindingListener
  javax.servlet.http.HttpSessionAttributeListener
   */

  /*
  STRATEGY
  -
   */

  /*
  COMMAND
  java.lang.Runnable and javax.swing.Action
   */

  /*
  STATE
  -
   */

  /*
  VISITOR
   */

  /*
  ITERATOR
  Collections framework
   */

  /*
  MEMENTO
  -
   */

  }
}
