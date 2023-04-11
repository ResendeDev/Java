package escola;

class Escola {
    
    public static void main(String[] args) {
        
//        Curso curso1 = new Curso();;
//        curso1.setNome("Técnico em Desenvolvimento de Sistemas. ");
//        curso1.setPeriodo("Diurno.");
//        curso1.setDisciplina("programação.");
//        curso1.setQtdVagas(30);
//        curso1.setDuracao("1200 horas.");
//        curso1.setValorCurso("gratuito.");
    
        Curso curso1 =  new Curso("Técnico em Desenvolvimento de Sistemas.", "Diurno.", "Programação", 30, "1200 horas.", "gratuito");
          
        
       
//        Professor professor1 = new Professor();
//        professor1.setNome("Diego");
//        professor1.setIdade(29);
//        professor1.setTelefone("564534354");
//        professor1.setDisciplina("Programação.");
//        professor1.setMatricula(7);
//        professor1.setCargaHoraria(40);
//        professor1.setSalario(20000);
//        professor1.setHoraExtra(true);
        
        Professor professor1 = new Professor("Diego", 29, "564534354", "Programação.", 7, 40, 20000, true);
        
        
        
//       Estudante estudante1 = new Estudante();;
//       estudante1.setNome("Natã");
//       estudante1.setNumeroMatricula(14);
//       estudante1.setIdadeAluno(23);
//       estudante1.setCpf("124.971.846-40");
//       estudante1.setNumeroCelular("34988112369");
//       estudante1.setEndereco("Rua João de Melo,293. Bairro São Benedito.");
       
        Estudante estudante1 =  new Estudante("Natã", 14, 23, "124.971.846-40","34988112369","Rua João de Melo,293. Bairro São Benedito.");
        
        curso1.printOut();
        professor1.printOut();
        estudante1.printOut();
    }
    
}
