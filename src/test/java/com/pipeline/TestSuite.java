package com.pipeline;
// Import JUnit 5 suite annotations
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

// This annotation tells JUnit that this class is a test suite
@Suite
// List of test classes to be run together
@SelectClasses({
    NameValidatorTest.class
})
public class TestSuite {
    // No methods are needed here.
    // This class simply groups related test classes
    // so they can be run together in CI/CD pipelines.
}
