package cucumber.modelo;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	
	private int id;
	private String nomeDepartamento;
	
	public static void main(String[] args) {
        Departamento d = new Departamento();
       
        System.out.println(d.pesquisarNomeDepartamento("Depto Teste"));

	}
	
	public String pesquisarNomeDepartamento(String nome) {
		String retorno = "Não encontrado";
		Departamento dep = new Departamento();
		dep.setId(1);
		dep.setNomeDepartamento("Informática");
		Departamento dep2 = new Departamento();
		dep2.setId(2);
		dep2.setNomeDepartamento("Depto Teste");
		
		List<Departamento> dados = new ArrayList<Departamento>();
	
		dados.add(dep);
		dados.add(dep2);
		
		if (nome != null) {
			for (int i = 0; i < dados.size(); i++) {
				if (nome.equals(dados.get(i).getNomeDepartamento())) {
					retorno = "Encontrou";
					break;
				}
			}
		}		
		return retorno;
	}
		
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomeDepartamento() {
		return nomeDepartamento;
	}


	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

}
