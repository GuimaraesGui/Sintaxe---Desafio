import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        
        System.out.println("Processo seletivo\n");
        selecaoCandidatos();
        System.out.println("\n");
        imprimirCandidatos();
        
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            }
        } while (continuarTentando && tentativasRealizadas<3);
        if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		} else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }

    //Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + indice + " é " + candidatos[indice]);
            System.out.println("\n");
        }
        System.out.println("Forma abreviada de interação: ");
        for(String candidato: candidatos){
            System.out.println("O candidato foi " + candidato);
        }
    }
    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0; // Associa um candidato a um ID numérico.
        int candidatoAtual = 0; // Identifica o candidato atual através do seu ID numérico.
        double salarioBase = 2000.0; // Salário base usado no processo seletivo.
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
                        
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            System.out.println("\n")    ;
            candidatoAtual++;
        }
    }
    static double valorPretendido() { //Cria um valor aleatório para testarmos o código e associa esse valor a cada um dos candidatos
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido, double salarioBase) {
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}