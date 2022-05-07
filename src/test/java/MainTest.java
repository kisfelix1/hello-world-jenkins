import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testSum_1_2(){
        Assertions.assertEquals(Main.sum(1,2), 3);
    }
}
