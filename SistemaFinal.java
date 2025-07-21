import java.util.Scanner;
 
public class SistemaFinal {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        Pessoa pessoa = new Pessoa();
        System.out.println("Preencha os dados da Pessoa:");
        pessoa.lerDados(sc);
        System.out.println();
 
        Aluno aluno = new Aluno();
        System.out.println("Preencha os dados do Aluno:");
        aluno.lerDados(sc);
        System.out.println();
 
        Professor professor = new Professor();
        System.out.println("Preencha os dados do Professor:");
        professor.lerDados(sc);
        System.out.println();
 
        // Mostrar dados e falar
        System.out.println("----Pessoa----");
        pessoa.mostrarDados();
       
 
        System.out.println("\n----Aluno----");
        aluno.mostrarDados();
       
 
        System.out.println("\n----Professor----");
        professor.mostrarDados();
       
 
        sc.close();
    }
}