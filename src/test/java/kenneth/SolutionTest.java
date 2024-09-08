package kenneth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for verifying App function(s)
 */
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        // Setting up variables before each unit test
        solution = new Solution();
    }

    @AfterEach
    void tearDown() {
        // Resetting variables after each unit test
        solution = null;
    }

    @Test
    void example1() {
        String word1 = "abc";
        String word2 = "pqr";

        String expectedResult = "apbqcr";
        String acutalResult = solution.mergeAlternately(word1, word2);

        assertEquals(expectedResult, acutalResult);
    }

    @Test
    void example2() {
        String word1 = "ab";
        String word2 = "pqrs";

        String expectedResult = "apbqrs";
        String acutalResult = solution.mergeAlternately(word1, word2);

        assertEquals(expectedResult, acutalResult);
    }

    @Test
    void example3() {
        String word1 = "abcd";
        String word2 = "pq";

        String expectedResult = "apbqcd";
        String acutalResult = solution.mergeAlternately(word1, word2);

        assertEquals(expectedResult, acutalResult);
    }
}