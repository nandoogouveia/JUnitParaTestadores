package exercicio8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;

@RunWith(Parameterized.class) 
public class ValidarIdadePorVotacao_DDT {

	String nome;
	int anoDeNascimento;
	String resultado;
	
	public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultado = resultado;
	}
	
	@Test
	public void validaObrigatoriedadeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	 
	@Parameters(name = "{0} | {1} | {2}")
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