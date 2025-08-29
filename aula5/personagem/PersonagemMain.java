import java.util.Random;

public class PersonagemMain {
  public static void main(String[] args) {
    Personagem[] inimigos = {
      new Personagem("Orc", 100, 10),
      new Personagem("Goblin", 50, 5),
      new Personagem("Lobo", 75, 15)
    };
    
    Random random = new Random();

    Personagem jogador = new Personagem("Steve", 200, 20);

    while (true) { 
      Personagem inimigoAtacar = inimigos[random.nextInt(inimigos.length)];
      jogador.atacar(inimigoAtacar);

      int inimigosVida = 0;
      for (Personagem inimigo : inimigos) {
        if (inimigo.getVida() > 0 && jogador.getVida() > 0) {
          inimigo.atacar(jogador);
        }
        inimigosVida += inimigo.getVida();
      }

      if (inimigosVida == 0 || jogador.getVida() == 0) {
        break;
      }
    }
  }
}
