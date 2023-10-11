package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };

    for (String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentado = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      if (continuarTentado) {
        tentativasRealizadas++;
      } else {
        System.out.println("CONTATO REALIZADO COM SUCESSO");
      }
    } while (continuarTentado && tentativasRealizadas < 3);

    if (atendeu)
      System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
    else
      System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS "
          + tentativasRealizadas + " REALIZADA");
  }

  // método auxiliar
  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };

    System.out.println("Imprimindo lista de candidatos, informando o indice do elemento");
    for (int i = 0; i < candidatos.length; i++) {
      System.out.println("O candidato de nº " + (i + 1) + " é " + candidatos[i]);
    }

    System.out.println("*** Forma abreviada de interação ForEach ***");
    for (String todosCandidatos : candidatos) {
      System.out.println("O candidato selecionado foi " + todosCandidatos);

    }
  }

  static void selecaoCandidatos() {
    String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA",
        "JORGE" };

    int candidatosSelecionado = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;

    while (candidatosSelecionado < 5 && candidatosAtual < candidatos.length) {
      String canditato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + canditato + " solicitou este valor de salário " + salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + canditato + " foi selecionado para a vaga");
        candidatosSelecionado++;
      }
      candidatosAtual++;
    }
  }

  // Método que simula o valor pretendido
  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCanditato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
    }
  }

}
