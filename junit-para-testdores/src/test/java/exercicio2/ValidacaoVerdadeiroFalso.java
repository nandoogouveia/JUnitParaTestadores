package exercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacaoVerdadeiroFalso {
	
	@Test
	public void validacaoVerdadeiro_Sucesso() {
		boolean campoEstaPresente = true;
		assertTrue(campoEstaPresente);
	}
	
	@Test
	public void validadcaoVerdadeiro_Falha() {
		boolean campoEstaPresente = true;
		assertFalse("Campo não esta presente", campoEstaPresente);
	}

	@Test
	public void validacaoFalso_Sucesso() {
		boolean campoEstaPresente = false;
		assertTrue(campoEstaPresente);
	}
	
	@Test
	public void validadcaoFalso_Falha() {
		boolean campoEstaPresente = false;
		assertFalse("Campo não esta presente", campoEstaPresente);
	}
}
