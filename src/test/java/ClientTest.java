import org.junit.Test;
import ru.aston.Haslavskiy_DU.task1.Client;

public class ClientTest {
    @Test (expected = IllegalArgumentException.class)
    public void AgeShoudBePozitive()  {
        Client test=new Client("test","test2",-35);


    }
}
