package exercicio7;

import org.junit.Test;

import votacao.Votacao;

import static org.junit.Assert.*;

public class ValidarIdadePorVotacao {
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria voc� n�o pode votar", Votacao.podeVotar("Maria", 2006));
	}
	
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		assertEquals("Rodrigo seu voto � facultativo", Votacao.podeVotar("Rodrigo", 2005));
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		assertEquals("Jo�o seu voto � facultativo", Votacao.podeVotar("Jo�o", 2004 ));
	}
	
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		assertEquals("Carla seu voto � obrigat�rio", Votacao.podeVotar("Carla", 2003));
	}
	
	@Test
	public void idadeIgual25Anos_VotoObrigatorio( ) {
		assertEquals("Jos� seu voto � obrigat�rio", Votacao.podeVotar("Jos�", 1996));
	}

	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		assertEquals("Ana seu voto � obrigat�rio", Votacao.podeVotar("Ana", 1951));
	}
	
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {
		assertEquals("Pedro seu voto � facultativo", Votacao.podeVotar("Pedro", 1950));
	}
	
}
