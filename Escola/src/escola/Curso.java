
package escola;

public class Curso {
    private String nome;
    private String periodo;
    private String disciplina;
    private int qtdVagas;
    private String duracao;
    private String valorCurso;
    
    public Curso(String nome, String periodo, String disciplina, int qtdVagas, String duracao, String valorCurso) {
        this.nome = nome;
        this.periodo = periodo;
        this.disciplina = disciplina;
        this.qtdVagas = qtdVagas;
        this.duracao = duracao;
        this.valorCurso = valorCurso;
    }
    
    public void aprovarAluno(){

    }
    
    public void reprovarAluno(){
        
    }
        
    public void disponibilizarMaterialDidatico(){
        
    };
    
    public void salvarAtividades(){
        
    }
    
    
    public void printOut(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Período: " + this.getPeriodo());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Quantidade de Vagas: " + this.getQtdVagas());
        System.out.println("Duração do curso" + this.getDuracao());
        System.out.println("Valor do curso: " + this.getValorCurso() + "\n\n");
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getPeriodo(){
        return this.periodo;
    }
    
    public void setPeriodo(String p){
        this.periodo = p;
    }
    
    public String getDisciplina(){
        return this.disciplina;
    }
    
    public void setDisciplina(String d){
        this.disciplina = d;
    }
    
    public int getQtdVagas(){
        return this.qtdVagas;
    }
    
    public void setQtdVagas(int q){
        this.qtdVagas = q;
    }
    
    public String getDuracao(){
        return this.duracao;
    }
    
    public void setDuracao(String d) {
        this.duracao = d;
    }
    
    public String getValorCurso(){
        return this.valorCurso;
    }
    
    public void setValorCurso(String v){
        this.valorCurso = v;
    }
    

}


