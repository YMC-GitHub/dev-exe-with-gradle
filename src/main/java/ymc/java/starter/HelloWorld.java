
// my package name
package ymc.java.starter;
// include some package

import org.apache.log4j.Logger;

// create my class
public class HelloWorld {
  private static Logger logger = Logger.getLogger(HelloWorld.class);

  public String sayHello() {
    return "Hello World.";
  }

  public static void main(String[] args) {
    logger.info("hello,world. welcome to gradle");
  }
}
