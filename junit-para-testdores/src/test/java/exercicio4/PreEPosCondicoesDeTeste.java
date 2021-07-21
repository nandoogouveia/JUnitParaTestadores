package exercicio4;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class PreEPosCondicoesDeTeste {
	
	@Before
	public void preCondicao() {
		System.out.println("Executou a pre condicao");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste1() {
		System.out.println("Executou o teste 1");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste2() {
		System.out.println("Executou teste 2");
	}
	
	@After
	public void posCondicao() {
		System.out.println("Executou a pós condição");
	}

}
