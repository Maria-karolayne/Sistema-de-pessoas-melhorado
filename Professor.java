import java.util.Scanner;
public class Professor extends Pessoa {
 
    private String materia;
    private int turmas;
 
 
    //metodo construtor filho
    Professor (){}
   
    //metodo construtor com parametros
    Professor(String nome,int dataNascimento,String cpf ,String endereco, String materia, int turmas){
        super( nome, dataNascimento, cpf , endereco);
        this.materia = materia;
        this.turmas = turmas;
    }
 
    @Override
    public void lerDados(Scanner sc) {
        super.lerDados(sc); // lê dados da Pessoa
        System.out.print("Matéria: ");
        materia = sc.nextLine();
        System.out.print("Número de turmas: ");
        turmas = sc.nextInt();
        sc.nextLine(); // consumir o \n
    }
 
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Matéria: " + materia);
        System.out.println("Número de turmas: " + turmas);
    }
 
    public String getMateria() {
    return materia;
    }
 
    public void setMateria(String materia) {
    this.materia = materia;
    }
 
    public int getTurmas() {
    return turmas;
    }
 
    public void setTurmas(int turmas) {
    this.turmas = turmas;
    }
 
}