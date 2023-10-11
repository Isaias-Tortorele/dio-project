public class Usuarios {
  public static void main(String[] args) {

    SistemaSmartTv sistemaSmartTv = new SistemaSmartTv();

    System.out.println("TV ligada? " + sistemaSmartTv.ligada);
    System.out.println("Volume: " + sistemaSmartTv.volume);
    System.out.println("Canal atual: " + sistemaSmartTv.canal);

    sistemaSmartTv.ligar();
    System.out.println("TV ligada? " + sistemaSmartTv.ligada);
    sistemaSmartTv.aumentarVolume();
    System.out.println("Volume: " + sistemaSmartTv.volume);

    sistemaSmartTv.mudarCanal(15);
    System.out.println("Canal depois: " + sistemaSmartTv.canal);

  }
}
