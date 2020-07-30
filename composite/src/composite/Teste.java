package composite;
package composite.Departamento;
package composite.DepartamentoComposite;

public class Teste {
	
	    public static void main(String args[]) {
	        Departamento departamentoControladoria = new DepartamentoControladoria(
	          1, "Departamento Controladoria");
	        Departamento departamentoPropaganda  = new DepartamentoPropaganda(
	          2, " Departamento Propaganda");
	        Departamento departamentoPessoal = new DepartamentoPessoal(
	  	      3, " Departamento Propaganda");
	 
	        DepartamentoComposite departamentoComposite = new DepartamentoComposite(
	          4, "Departamento Composite");
	 
	        departamentoComposite.adicionarDepartamento(departamentoControladoria);
	        departamentoComposite.adicionarDepartamento(departamentoPropaganda);
	        departamentoComposite.adicionarDepartamento(departamentoPessoal);
	 
	        departamentoComposite.printDepartamentoNome();
	    }
	}

