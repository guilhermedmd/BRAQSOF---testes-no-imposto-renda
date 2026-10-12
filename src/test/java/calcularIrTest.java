import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.me.Main.calculadora;

public class calcularIrTest {

    @Test 
    public void isencaoTotalTest(){
        Assertions.assertEquals("Isenção total (100%)", calculadora.calcularIr(2876));
    }
    @Test 
    public void desconto75Test(){
        Assertions.assertEquals("Desconto de 75%", calculadora.calcularIr(5210));
    }
    @Test 
    public void desconto50Test(){
        Assertions.assertEquals("Desconto de 50%", calculadora.calcularIr(5920));
    }
    @Test 
    public void desconto25Test(){
        Assertions.assertEquals("Desconto de 25%", calculadora.calcularIr(6493));
    }
    @Test 
    public void desconto10Test(){
        Assertions.assertEquals("Desconto de 10%", calculadora.calcularIr(7000));
    }
    @Test 
    public void aliquotaTest(){
        Assertions.assertEquals("Alíquota de 27,5%", calculadora.calcularIr(9546));
    }
    @Test 
    public void rendaNegativaTest(){
        Assertions.assertThrows(RuntimeException.class, () -> calculadora.calcularIr(-1000));
    }
}
