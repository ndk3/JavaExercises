package strategy.ducks;


import designPatterns.strategyPattern.ducks.ModelDuck;
import org.junit.Assert;
import org.junit.Test;

public class ModelDuckTest {
    private ModelDuck modelDuck = new ModelDuck();

    @Test
    public void shouldNotQuackWhenPerformQuackCalled() {
        Assert.assertEquals("Cannot quack!", modelDuck.performQuack());
    }

    @Test
    public void shouldNotFlyWhenPerformFlightCalled() {
        Assert.assertEquals("Cannot fly.", modelDuck.performFlight());
    }
}
