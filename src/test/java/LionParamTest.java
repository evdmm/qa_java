import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {

    private String sex;
    private Boolean hasMane;

    public LionParamTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] LionParamTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeParamSuccess() throws Exception {
        Lion lion = new Lion(sex);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }


}
