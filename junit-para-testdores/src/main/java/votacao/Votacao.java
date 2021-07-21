package votacao;

import java.util.Calendar;

public class Votacao {

	/*
	 * Retorna um texto informando se a pessoa pode ou n�o votar
	 * dado um nome e a data de nascimento
	 */
	public static String podeVotar(String nome, int anoDeNascimento) {
		String retorno = null;
		int idade = retornaAnoAtual() - anoDeNascimento;
		
		if (idade < 16) {
			retorno = nome + " voc� n�o pode votar";
			
		} else if (idade >= 16 && idade <= 17 || idade > 70) {
			retorno = nome + " seu voto � facultativo";
			
		} else if (idade >= 18 && idade <= 70) {
			retorno = nome + " seu voto � obrigat�rio";
		}
		
		return retorno;
	}
	
	
	/*
	 * Retorna o ano atual (do seu computador)
	 */
	private static int retornaAnoAtual() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}
}