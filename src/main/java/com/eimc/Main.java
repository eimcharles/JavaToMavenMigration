package com.eimc;

/**
 *
 *      Main -  Main Class comments:
 *
 *      The primary role of the Main class in
 *      this Maven project is to serve as the
 *      single, defined entry point
 *      for the Java Virtual Machine (JVM).
 *
 *      1.Execution Start: It contains the
 *      'public static void main(String[] args)'
 *      method, which is the first code
 *      executed when the application is run.
 *
 *      2. Executable Artifact: In the context of Maven,
 *      the main class is explicitly declared within the
 *      configuration of the maven-jar-plugin (in the pom.xml)
 *      using the mainClass tag, which tells the final
 *      executable JAR file where to begin execution.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("This is a Java to Maven Migration Program");
        System.out.println("Running JAR file");
        System.out.println("Execution finished");
        System.out.println();
    }

}
