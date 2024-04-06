import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {
    Calculate calculate ;
    @BeforeEach
    void setUp (){
        calculate = new Calculate();
    }
    @Test
    @DisplayName("simple multiply should work")
    void TestMultiply(){
        assertEquals(20 , calculate.multiply(4,5) , "SUCCESSFUL");
    }
    @RepeatedTest(5)
    @DisplayName("5 multiply should work")
    void TestMultiplyRepeat(){
        assertEquals(20 , calculate.multiply(4,5) , "SUCCESSFUL");
    }
}
