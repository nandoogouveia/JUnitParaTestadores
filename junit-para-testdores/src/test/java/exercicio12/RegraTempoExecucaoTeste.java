package exercicio12;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RegraTempoExecucaoTeste {

	@Rule public Timeout timeOutGlobal = Timeout.seconds(1);
	
	@Test
	public void falhaPorTimeout() throws InterruptedException {
		Thread.sleep(1001);
	}
	
}
