package exercicio9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_Parametros {
	
	@Parameter(0) public String nome;
	@Parameter(1) public int anoDeNascimento;
	@Parameter(2) public String resultado;
	
	@Test
	public void validarObrigatoriedadeDeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters(name = " {0} | {1} | {2} ")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"Maria"  , 2006, "Maria você não pode votar"},
			{"Rodrigo", 2005, "Rodrigo seu voto é facultativo"},
			{"João"   , 2004, "João seu voto é facultativo"},
			{"Carla"  , 2003, "Carla seu voto é obrigatório"},
			{"José"   , 1996, "José seu voto é obrigatório"},
			{"Ana"    , 1951, "Ana seu voto é obrigatório"},
			{"Pedro"  , 1950, "Pedro seu voto é facultativo"}
		});
	}
	
}