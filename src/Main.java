import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor p = new Professor();
        CadastroProfessor cp = new CadastroProfessor();

// --- CADASTRAR ---
        System.out.print("Nome: ");
        p.setNome(sc.next());
        System.out.print("Idade: ");
        p.setIdade(sc.nextInt());
        cp.cadastrar(p);
// --- LISTAR ---
        cp.listar();

// --- ATUALIZAR ---
        System.out.print("Informe o nome que deseja atualizar a idade: ");
        p.setNome(sc.next());
        System.out.print("Nova idade: ");
        p.setIdade(sc.nextInt());
        cp.atualizar(p.getNome(), p.getIdade());

// --- DELETAR ---
        System.out.print("Informe o nome para deletar: ");
        cp.deletar(sc.next());


        sc.close();
    }
}