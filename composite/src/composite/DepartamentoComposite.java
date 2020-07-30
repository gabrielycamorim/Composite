package composite;
package composite.Departamento;

import java.util.ArrayList;
import java.util.List;

public abstract class DepartamentoComposite implements Departamento {
	 
	    private int id;
	    private String nome;
	 
	    private List<Departamento> childDepartamento;
	 
	    public DepartamentoComposite(int id, String nome) {
	        this.setId(id);
	        this.setNome(nome);
	        this.childDepartamento= new ArrayList<>();
	    }
	 
	    public void printDepartamentoName() {
	    	childDepartamento.forEach(Departamento::printDepartamentoNome));
	    }
	 
	    public void adicionarDepartamento(Departamento departamento) {
	    	childDepartamento.add(departamento);
	    }
	 
	    public void removerDepartamento(Departamento departamento) {
	    	childDepartamento.remove(departamento);
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
	}

