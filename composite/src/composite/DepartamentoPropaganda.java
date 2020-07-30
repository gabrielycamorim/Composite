package composite;

public class DepartamentoPropaganda implements Departamento {
	private int id;
    private String nome;
 
  
	public DepartamentoPropaganda(int i, String string) {
		// TODO Auto-generated constructor stub
	}


	public void printDepartamentoNome() {
        System.out.println(getClass().getSimpleName());
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
