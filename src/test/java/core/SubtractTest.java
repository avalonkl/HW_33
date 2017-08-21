package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class SubtractTest {
    @Test
    public void subtract_test_instanceOf() {
        assertThat(Calculator.subtract(8, 2), instanceOf(Double.class));}
    @Test
    public void subtract_test_2_param() {
        assertThat(Calculator.subtract(8.0, 4.0), equalTo(4.0));}
    @Test
    public void subtract_test_3_param() {
        assertThat(Calculator.subtract(15.0, 7.0, 2), equalTo(6.0));}
    @Test
    public void subtract_test_4_param() {
        assertThat(Calculator.subtract(20.0, 2.0, 4.0, 6.0), equalTo(8.0));}
}