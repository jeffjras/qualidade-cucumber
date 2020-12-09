package cucumber.teste.passos;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import cucumber.modelo.Departamento;

public class DepartamentoTestePassos {
	
	private Departamento departamento;

    @Dado("^informar o nome do departamento \"(.*?)\" ")
    public void informa_o_nome_departamento_a_ser_localizado(String nome) throws Throwable {
          // Definição de departamento
          departamento = new Departamento();
          departamento.setId(1);
          departamento.setNomeDepartamento(nome);
    }

    @Quando("^checo \"(.*?)\" no passo")
    public void a_pesquisa_e_realizada(String nome) throws Throwable {
    	  String ret = departamento.pesquisarNomeDepartamento(nome);
    	  boolean testeRet = false;
    	  if (ret.equals("Encontrado")) {
    		  testeRet = true;
    	  }
          assertTrue(testeRet);
    }
    
	public static void main(String[] args) {
		

	}

}
