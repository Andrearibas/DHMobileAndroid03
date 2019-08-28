package br.com.digitalhouse.exercicioentregavel;

public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfessorTitular("Jessica","Pereira",1234,"Desenvolvimento Mobile");
        digitalHouseManager.registrarProfessorTitular("Fernando","Ribeiro",2345,"Full Stack");

        digitalHouseManager.registrarProfessorAdjunto("João", "Gomes",0023,27);
        digitalHouseManager.registrarProfessorAdjunto("Luciane","Morais",0032,20);

        digitalHouseManager.registrarCurso("Full Stack",20001,3);
        digitalHouseManager.registrarCurso("Android",20002,2);

        digitalHouseManager.alocarProfessores(20001,2345,0032);
        digitalHouseManager.alocarProfessores(20002,1234,0023);

        digitalHouseManager.registrarAluno("Andrea","Ribas",12345);
        digitalHouseManager.registrarAluno("Maria","Da Luz",54321);
        digitalHouseManager.registrarAluno("Felipe","Assis",67890);
        digitalHouseManager.registrarAluno("Adriano","Motta",19876);
        digitalHouseManager.registrarAluno("Rosangela","Souza",34567);


        digitalHouseManager.matricularAluno(54321,20001);
        digitalHouseManager.matricularAluno(67890,20001);

        digitalHouseManager.matricularAluno(12345,20002);
        digitalHouseManager.matricularAluno(19876,20002);
        digitalHouseManager.matricularAluno(34567,20002);

        digitalHouseManager.consultarAluno(54321);




    }
}
