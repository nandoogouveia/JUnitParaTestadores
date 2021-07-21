package exercicio7;

import org.junit.Test;

import votacao.Votacao;

import static org.junit.Assert.*;

public class ValidarIdadePorVotacao {
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria você não pode votar", Votacao.podeVotar("Maria", 2006));
	}
	
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		assertEquals("Rodrigo seu voto é facultativo", Votacao.podeVotar("Rodrigo", 2005));
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		assertEquals("João seu voto é facultativo", Votacao.podeVotar("João", 2004 ));
	}
	
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		assertEquals("Carla seu voto é obrigatório", Votacao.podeVotar("Carla", 2003));
	}
	
	@Test
	public void idadeIgual25Anos_VotoObrigatorio( ) {
		assertEquals("José seu voto é obrigatório", Votacao.podeVotar("José", 1996));
	}

	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		assertEquals("Ana seu voto é obrigatório", Votacao.podeVotar("Ana", 1951));
	}
	
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {
		assertEquals("Pedro seu voto é facultativo", Votacao.podeVotar("Pedro", 1950));
	}
	
}
