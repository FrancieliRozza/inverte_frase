import static org.junit.Assert.*;

import org.junit.Test;


public class InverteFraseTest {

	@Test
	public void deveRetornarPalavraGatoInvertida() {
		String fraseInvertida = InverteFrase.inverte("gato");
		assertEquals("otag", fraseInvertida);
	}
	
	@Test
	public void deveRetornarFraseOGatoMiuInvertida() {
		String fraseInvertida = InverteFrase.inverte("o gato miu");
		assertEquals("uim otag o", fraseInvertida);
	}

}
