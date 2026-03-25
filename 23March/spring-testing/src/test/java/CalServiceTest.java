import com.cg.CalculatorService;
import com.cg.ICalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalServiceTest {
    private CalculatorService service;

    @BeforeEach
    public void init(){
        ICalculator cal= Mockito.mock(ICalculator.class);
        service = new CalculatorService(cal);
        when(cal.calculate(5,9)).thenReturn(14);
    }
    @Test
    public void addServiceTest(){
        assertEquals(14,service.addService(5,9));
    }
}
