import java.util.Scanner;
public class Pessoa{
 
    private String nome;
    private int dataNascimento;
    private String cpf;
    private String endereco;
 
    public Pessoa() {}
 
    public Pessoa(String nome, int dataNascimento, String cpf, String endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }
   
 
     public void lerDados(Scanner sc) {
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Ano de nascimento: ");
        dataNascimento = sc.nextInt();
        System.out.print("CPF: ");
        cpf = sc.nextLine();
        sc.nextLine(); // consumir o \n
        System.out.print("Endereço: ");
        endereco = sc.nextLine();
    }
   
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }
 
    public String getNome (){
        return nome;
    }
 
    public void setNome(String nome){
        this.nome = nome;
    }
 
    public int getDataNascimento (){
        return dataNascimento;
    }
 
    public void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }
   
    public String getCpf(){
        return cpf;
    }
 
    public void setCpf(String cpf ){
        this.cpf = cpf ;
    }
 
    public String getEndereco(){
        return endereco;
    }
 
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
 
}