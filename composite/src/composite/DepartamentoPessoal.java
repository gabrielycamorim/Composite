package composite;

public class DepartamentoPessoal implements Departamento {
	private int id;
    private String nome;
 
  


	public DepartamentoPessoal(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public void printDepartamentoNome() {
        System.out.println(getClass().getSimpleName());
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
