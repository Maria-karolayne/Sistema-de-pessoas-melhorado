import java.util.Scanner;
 
public class Aluno extends Pessoa {
 
    private String escola;
    private int ano;
 
 
    public Aluno() {
    super();
    }
 
    @Override
    public void lerDados(Scanner sc) {
        super.lerDados(sc); // lê dados da Pessoa
        System.out.print("Escola: ");
        escola = sc.nextLine();
        System.out.print("Ano do aluno: ");
        ano = sc.nextInt();
        sc.nextLine(); // consumir o \n
    }
 
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Escola: " + escola);
        System.out.println("Ano: " + ano);
    }
   
    //metodo construtor com parametros
    Aluno(String nome,int dataNascimento,String cpf ,String endereco,  String escola, int ano){
        super( nome, dataNascimento, cpf , endereco );
        this.escola = escola;
        this.ano = ano;
    }
 
   
 
    public String getEscola() {
    return escola;
    }
 
    public void setEscola(String escola) {
    this.escola = escola;
    }
 
public int getAno() {
    return ano;
}
 
public void setAno(int ano) {
    this.ano = ano;
}
}