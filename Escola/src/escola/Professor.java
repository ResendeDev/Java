
package escola;

import java.text.DecimalFormat;


public class Professor {
    private String nome;
    private int idade;
    private String telefone;
    private String disciplina;
    private int matricula;
    private int cargaHoraria;
    private double salario;
    private boolean horaExtra;

    public Professor(String nome, int idade, String telefone, String disciplina, int matricula, int cargaHoraria, double salario, boolean horaExtra) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.disciplina = disciplina;
        this.matricula = matricula;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.horaExtra = horaExtra;
    }
    
    
    
    public void ensinarAluno(){
        
    }
    
    public void exclarecerDuvidas(){
        
    }
    
    public void organizarExercicios(){
        
    }
    
    public void analizarAluno(){
        
    }
    
    public void lancarNota(){
        
    }
    
    public void printOut(){
        DecimalFormat df = new DecimalFormat("##.00");
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Área de especialização: " + this.getDisciplina());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Carga horária de trabalho: " + this.getCargaHoraria());
        System.out.println("Salário: " + df.format(this.getSalario()));
        System.out.println("Hora extra:" + this.getHoraExtra() + "\n\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean getHoraExtra() {
        return true;
    }

    public void setHoraExtra(boolean horaExtra) {
        this.horaExtra = horaExtra;
    }
    
    
    
}


