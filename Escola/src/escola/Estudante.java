
package escola;


public class Estudante {
    
    private String nome;
    private int numeroMatricula;
    private int idadeAluno;
    private String cpf;
    private String numeroCelular;
    private String endereco;

    public Estudante(String nome, int numeroMatricula, int idadeAluno, String cpf, String numeroCelular, String endereco) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.idadeAluno = idadeAluno;
        this.cpf = cpf;
        this.numeroCelular = numeroCelular;
        this.endereco = endereco;
    }
    
    
    
    public boolean estudar(){
        return true;
    }
    
    public void printOut(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Número da matrícular: " + this.getNumeroMatricula());
        System.out.println("Idade do aluno: " + this.getIdadeAluno());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Número do celular: " + this.getNumeroCelular());
        System.out.println("Endereço do aluno: " + this.getEndereco() + "\n\n");
    }
    
   public String getNome(){
       return this.nome;
   }
   
   public void setNome(String n){
       this.nome = n;
   }
   
   public int getNumeroMatricula(){
       return this.numeroMatricula;
   }
   
   public void setNumeroMatricula(int n){
       this.numeroMatricula = n;
   }
   
   public int getIdadeAluno(){
       return this.idadeAluno;
   }
   
   public void setIdadeAluno(int i){
       this.idadeAluno = i;
   }
   
   public String getCpf(){
       return this.cpf;
   }
   
   public void setCpf(String c){
       this.cpf = c;
   }
   
   public String getNumeroCelular(){
       return this.numeroCelular;
   }
   
   public void setNumeroCelular(String n){
       this.numeroCelular = n;
   }
   
   public String getEndereco(){
       return this.endereco;
   }
   
   public void setEndereco(String e){
       this.endereco = e;
   }
}
