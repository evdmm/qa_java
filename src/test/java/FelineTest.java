import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline = new Feline();

    @Test
    public void eatMeatSuccess() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilySuccess() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoParamsSuccess() {
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParamsSuccess() throws Exception {
        Assert.assertEquals(10, feline.getKittens(10));
    }

}
