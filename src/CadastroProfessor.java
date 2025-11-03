import java.util.ArrayList;

public class CadastroProfessor {
    private ArrayList<Professor> professores = new ArrayList<>();


    //@PostMapping - CADASTRAR
    public void cadastrar(Professor p) {
        professores.add(p);
        System.out.println("Professores cadastrados: " + p.getNome());
    }

    //@GetMapping - READ
    public void listar() {
        for (Professor p : professores) {
            System.out.println("Nome: " + p.getNome());
            //System.out.println(a); chama automaticamente a toString()


        }

    }
    //@PutMapping – UPDATE

    public void atualizar(String nome, int novaIdade) {

        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.setIdade(novaIdade);
                System.out.println( " idade atualizada: " + novaIdade);
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }

    //@DeleteMapping – DELETE

    public void deletar(String nome) {
        for (Professor p : this.professores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println(p.getNome() + " removido com sucesso.");
                professores.remove(p);
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }
}