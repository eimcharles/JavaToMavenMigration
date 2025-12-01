package com.eimc.user;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *          UserTest: Unit Test Class
 *          Purpose: This class is responsible for testing the functionality of the
 *          'User.java' production class (which should reside in src/main/java/com/eimc).
 *
 *          Naming Convention:
 *          - The name 'UserTest' adheres to the standard Maven/JUnit convention (ProductionClassName + Test).
 *          - Maven's build system (specifically the maven-surefire-plugin) automatically
 *            discovers and executes all classes ending in 'Test.java' during the 'mvn test' goal.
 *
 *          Location:
 *          - This file must be located in the src/test/java directory structure
 *          (e.g., src/test/java/com/eimc/UserTest.java) to be processed by Maven.
 */

public class UserTest {

    private static final UUID TEST_UUID = UUID.fromString("11111111-1111-1111-1111-111111111111");
    private static final String TEST_NAME = "Charles";
    private static final String TEST_LAST_NAME = "Eimer";

    /**
     *
     *          @Test
     *
     *          Annotation is a marker that
     *          identifies a method as a
     *          test method that the test runner
     *          (junit-jupiter-engine dependency)
     * */

    @Test
    public void constructorSetsAllUserFields() {

        User user = new User(TEST_UUID, TEST_NAME, TEST_LAST_NAME);

        /**
         *      The assertEquals static method (provided by the junit-jupiter-api dependency)
         *      verifies that the 'expected' value (constant TEST_UUID) is identical to the 'actual'
         *      value returned by the user.getUserId() method.
         *
         *      assertEquals(expected, actual, message);
         *
         *      If they are not identical, the test fails
         *      and prints the provided message.
         */


        assertEquals(TEST_UUID, user.getUserId(), "User ID must match the ID passed to the constructor.");
        assertEquals(TEST_NAME, user.getName(), "Name must match the name passed to the constructor.");
        assertEquals(TEST_LAST_NAME, user.getLastName(), "Last name must match the last name passed to the constructor.");
    }

}
