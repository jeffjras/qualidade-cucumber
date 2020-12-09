package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:feature", tags = "@DepartamentoTeste",
glue = "cucumber.teste.passos", monochrome = true, dryRun = false)
public class DepartamentoTeste {

	public static void main(String[] args) {
		

	}

}
