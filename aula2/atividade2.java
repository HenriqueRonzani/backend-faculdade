import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    Random random = new Random();
	    String[] nomes = {
            "Lionel", "Cristiano", "Michael", "LeBron", "Tom", "Leonardo", "Brad", "Will", "Angelina", "Jennifer",
            "Taylor", "Beyoncé", "Adele", "Rihanna", "Madonna", "Elvis", "Freddie", "Bob", "Stephen", "Albert",
            "Nelson", "Martin", "Barack", "Joe", "Elon", "Bill", "Mark", "Steve", "Jeff", "Warren",
            "Michael", "Dwayne", "Chris", "Ryan", "Johnny", "Keanu", "Julia", "Scarlett", "Emma", "Sandra",
            "Oprah", "J.K.", "Steven", "Quentin", "Serena", "Roger", "Rafael", "Tiger", "Muhammad", "Usain"
        };
        String[] sobrenomes = {
            "Messi", "Ronaldo", "Jordan", "James", "Cruise", "DiCaprio", "Pitt", "Smith", "Jolie", "Aniston",
            "Swift", "Knowles", "Adkins", "Fenty", "Gaga", "Presley", "Mercury", "Dylan", "Hawking", "Einstein",
            "Mandela", "Luther", "Obama", "Biden", "Musk", "Gates", "Zuckerberg", "Jobs", "Bezos", "Buffett",
            "Jackson", "Johnson", "Pratt", "Reynolds", "Depp", "Reeves", "Roberts", "Johansson", "Watson", "Bullock",
            "Winfrey", "Rowling", "Spielberg", "Tarantino", "Williams", "Federer", "Nadal", "Woods", "Ali", "Bolt"
        };
        String[] posicoes = {
            "Goleiro", "Zagueiro", "Lateral Direito", "Lateral Esquerdo", "Volante",
            "Meia Central", "Meia Ofensivo", "Ponta Esquerda", "Ponta Direita", "Atacante"
        };
        String[] times = {
            "Real Madrid", "Barcelona", "Manchester United", "Liverpool", "Bayern de Munique", "Paris Saint-Germain",
            "Juventus", "Inter de Milão", "Milan", "Borussia Dortmund", "Chelsea", "Arsenal", "Manchester City",
            "Atlético de Madrid", "Benfica", "Porto", "Ajax", "River Plate", "Boca Juniors", "Flamengo",
            "Corinthians", "São Paulo", "Santos", "Palmeiras", "Grêmio", "Internacional", "Cruzeiro", "Atlético Mineiro",
            "Fluminense", "Vasco da Gama", "Roma", "Napoli", "Tottenham Hotspur", "Leicester City", "Sevilla",
            "Olympique de Marseille", "Lyon", "Mónaco", "Celtic", "Rangers", "PSV", "Feyenoord", "Galatasaray",
            "Fenerbahçe", "Besiktas", "Sporting", "Al Hilal", "Al Nassr", "Borussia Mönchengladbach", "Criciúma"
        };

        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        String posicao = posicoes[random.nextInt(posicoes.length)];
        String time = times[random.nextInt(times.length)];
        int idade = random.nextInt(50);

        String frase = String.format("%s %s é um futebolista brasileiro de %d anos que atua como %s. Atualmente defende o %s", nome, sobrenome, idade, posicao, time);
        System.out.print(frase);
	}
}
