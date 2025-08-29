public class Personagem {

  private String nome;
  private int vida;
  private int ataque;

  public Personagem(String nome, int vida, int ataque) {
    this.nome = nome;
    this.vida = vida;
    this.ataque = ataque;
  }

  public String getNome() {
    return nome;
  }

  public int getVida() {
    return vida;
  }

  public int getAtaque() {
    return ataque;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public void setAtaque(int ataque) {
    this.ataque = ataque;
  }

  public void receberDano(int dano) {
    this.vida -= dano;
    if (vida <= 0) {
      System.out.println(this.nome + " derrotado");
      this.setVida(0);
    }
  }

  public void atacar(Personagem alvo) {
    if (alvo.getVida() <= 0) {
      System.out.println("Ataque falhou!");
      return;
    }
    alvo.receberDano(this.ataque);
  }
}