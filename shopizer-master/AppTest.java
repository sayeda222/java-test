public class AppTest {
    import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
}
package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class AppTest
{
private App app;
@Before
public void setUp() throws Exception {
app = new App();
}
@After
public void tearDown() throws Exception {
}
@Test
// unit test case that will check whether the method returns the 
// anticipated output or not
public void testMultiplication() {
int result = app.multiply(10, 5);
assertEquals(result,40);
}
}
If you notice in the test file I have mentioned that 40 in the assertEquals method which is clearly wrong as the product of 10 and 5 should be 50. Let’s see what happens when this unit test case runs.


GIF 2: Running the first test case
I hope by now you get why this error occurred. Try to rectify and run the code as mentioned before.

Multiple Test Cases
I have added more methods in the java file and the corresponding unit test cases in the test file. The test file looks like this:

@Test
//unit test case that will check whether the method returns
//the anticipated output or not
public void testMultiplication() {
int result = app.multiply(10, 5);
assertEquals(result,40);
}
public void testDivision() {
int result1 = app.divide(10, 5);
assertEquals(result1,40);
}
public void testAddition() {
int result2 = app.add(10, 5);
assertEquals(result2,40);
}
public void testSubtraction() {
int result3 = app.subtract(10, 5);
assertEquals(result3,40);
}
Let’s see how these test cases look like.


GIF 3: More unit test cases
Conclusion
This article definitely did not cover all the aspects of unit testing however is unquestionably useful to somebody who wishes to begin writing java unit test cases today. I have included only the simplest examples, but you can write more complex cases. I will certainly attempt to write more articles to cover boundary value analysis or related concepts. For now, I hope the current article will be useful to you.

Thank you.

