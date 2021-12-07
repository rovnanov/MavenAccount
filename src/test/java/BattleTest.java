import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Stubber;
import ru.learnup.mavenaccount.tax.StepBattle;
import ru.learnup.mavenaccount.tax.StepsManager;

import java.util.List;

import static org.mockito.Mockito.doReturn;

public class BattleTest {
    @Test
    public void battleTest(){
        StepBattle battle = new StepBattle();
        battle.addSteps(1,1,10);
        battle.addSteps(1,2,10);
        battle.addSteps(1,3,10);
        battle.addSteps(2,1,10);
        battle.addSteps(2,2,10);
        battle.addSteps(2,3,15);

        int expected = 2;
        int actual = battle.winner();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void MockitoWInnerWorksTest(){
        StepBattle battle = Mockito.mock(StepBattle.class);
        battle.addSteps(1,1,10);
        battle.addSteps(1,1,20);
        int expected = battle.winner();
        Mockito.verify(battle).winner();
    }

}
