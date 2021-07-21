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
			{"Maria"  , 2006, "Maria voc� n�o pode votar"},
			{"Rodrigo", 2005, "Rodrigo seu voto � facultativo"},
			{"Jo�o"   , 2004, "Jo�o seu voto � facultativo"},
			{"Carla"  , 2003, "Carla seu voto � obrigat�rio"},
			{"Jos�"   , 1996, "Jos� seu voto � obrigat�rio"},
			{"Ana"    , 1951, "Ana seu voto � obrigat�rio"},
			{"Pedro"  , 1950, "Pedro seu voto � facultativo"}
		});
	}
	
}