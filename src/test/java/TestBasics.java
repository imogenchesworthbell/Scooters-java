import org.example.Basics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestBasics {

    @Test
    public void compare(){
        Basics basics = new Basics();
        int value = basics.compare(2,1);
        Assertions.assertEquals(1,value);
    }
}
