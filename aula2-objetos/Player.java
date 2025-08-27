import java.util.Random;

public class Player {

    private String nome;
    private String sobrenome;
    private String posicao;
    private String time;
    private int idade;

    private Random random = new Random();
    String[] NOMES = {
            "Lionel", "Cristiano", "Michael", "LeBron", "Tom", "Leonardo", "Brad", "Will", "Angelina", "Jennifer",
            "Taylor", "Beyoncé", "Adele", "Rihanna", "Madonna", "Elvis", "Freddie", "Bob", "Stephen", "Albert",
            "Nelson", "Martin", "Barack", "Joe", "Elon", "Bill", "Mark", "Steve", "Jeff", "Warren",
            "Michael", "Dwayne", "Chris", "Ryan", "Johnny", "Keanu", "Julia", "Scarlett", "Emma", "Sandra",
            "Oprah", "J.K.", "Steven", "Quentin", "Serena", "Roger", "Rafael", "Tiger", "Muhammad", "Usain"
        };
        String[] SOBRENOMES = {
            "Messi", "Ronaldo", "Jordan", "James", "Cruise", "DiCaprio", "Pitt", "Smith", "Jolie", "Aniston",
            "Swift", "Knowles", "Adkins", "Fenty", "Gaga", "Presley", "Mercury", "Dylan", "Hawking", "Einstein",
            "Mandela", "Luther", "Obama", "Biden", "Musk", "Gates", "Zuckerberg", "Jobs", "Bezos", "Buffett",
            "Jackson", "Johnson", "Pratt", "Reynolds", "Depp", "Reeves", "Roberts", "Johansson", "Watson", "Bullock",
            "Winfrey", "Rowling", "Spielberg", "Tarantino", "Williams", "Federer", "Nadal", "Woods", "Ali", "Bolt"
        };
        String[] POSICOES = {
            "Goleiro", "Zagueiro", "Lateral Direito", "Lateral Esquerdo", "Volante",
            "Meia Central", "Meia Ofensivo", "Ponta Esquerda", "Ponta Direita", "Atacante"
        };
        String[] TIMES = {
            "Real Madrid", "Barcelona", "Manchester United", "Liverpool", "Bayern de Munique", "Paris Saint-Germain",
            "Juventus", "Inter de Milão", "Milan", "Borussia Dortmund", "Chelsea", "Arsenal", "Manchester City",
            "Atlético de Madrid", "Benfica", "Porto", "Ajax", "River Plate", "Boca Juniors", "Flamengo",
            "Corinthians", "São Paulo", "Santos", "Palmeiras", "Grêmio", "Internacional", "Cruzeiro", "Atlético Mineiro",
            "Fluminense", "Vasco da Gama", "Roma", "Napoli", "Tottenham Hotspur", "Leicester City", "Sevilla",
            "Olympique de Marseille", "Lyon", "Mónaco", "Celtic", "Rangers", "PSV", "Feyenoord", "Galatasaray",
            "Fenerbahçe", "Besiktas", "Sporting", "Al Hilal", "Al Nassr", "Borussia Mönchengladbach", "Criciúma"
        };

    public Player() {
        this.nome = NOMES[random.nextInt(NOMES.length)];
        this.sobrenome = SOBRENOMES[random.nextInt(SOBRENOMES.length)];
        this.posicao = POSICOES[random.nextInt(POSICOES.length)];
        this.time = TIMES[random.nextInt(TIMES.length)];
        this.idade = random.nextInt(24) + 17;
    }


    public String getPlayer() {
        return String.format("%s %s é um futebolista de %d anos que atua como %s. Atualmente defende o %s.",
                this.nome, this.sobrenome, this.idade, this.posicao, this.time);
    }
}
