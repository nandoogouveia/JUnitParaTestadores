package exercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before; 
import org.junit.BeforeClass;
import org.junit.Test;



public class PreEPosCondicaoDaClasse {
	
	@BeforeClass
	public static void preCondicao_AntesClasse( ) {
		System.out.println("Executou antes de todos os testes");
	}
	
	@AfterClass
	public static void posCondicao_DepoisClasse( ) {
		System.out.println("Executou depois de todos os testes");
	}
	
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
		System.out.println("Executou a p�s condi��o");
	}

}
