package jogador;
import personagem.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class CadastroAutomatico {

    public static void main(String[] args) {
        ArrayList<Personagem> personagens = gerarPersonagensAleatorios(10);

        // Exemplo de como você pode usar os personagens gerados
        for (Personagem personagem : personagens) {
            System.out.println(personagem);
        }
    }
    
    // Usando a ideia de Facory ou Abstract Factory
    public static Personagem criarPersonagem(String nome, Integer idade, Integer forca, Integer inteligencia,
                                             Integer carisma, Integer constituicao, Integer sabedoria,
                                             ClassePersonagem classe) {
        switch (classe) {
            case GUERREIRO:
                return new PersonagemGuerreiro(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria);
            case LADINO:
                return new PersonagemLadino(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria);
            case PONTEIRO:
                return new PersonagemPonteiro(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria);
            case BRUXO:
                return new PersonagemBruxo(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria);
            case CLERIGO:
                return new PersonagemClerigo(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria);
            case CERTINHO:
                return new PersonagemCertinho(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria);
            
            // Indicando classe inválida
            default:
                throw new IllegalArgumentException("Classe de personagem desconhecida: " + classe);
        }
    }

    public static ArrayList<Personagem> gerarPersonagensAleatorios(int quantidade) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            String nome = "Personagem" + i;
            Integer idade = random.nextInt(80) + 14; // Personagens entre 14 e 80 anos
            Integer forca = random.nextInt(20) + 1; // Gera um número entre 1 e 20
            Integer inteligencia = random.nextInt(20) + 1;
            Integer carisma = random.nextInt(20) + 1;
            Integer constituicao = random.nextInt(20) + 1;
            Integer sabedoria = random.nextInt(20) + 1;

            // Escolhe uma classe aleatória dentre as disponíveis no Enum ClassePersonagem
            ClassePersonagem classe = ClassePersonagem.values()[random.nextInt(ClassePersonagem.values().length)];

            // Usa a fábrica para criar uma instância específica da classe de personagem
            Personagem personagem = criarPersonagem(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria, classe);
            personagem.setDataCriacao(new Date()); // Define a data de criação como a data atual

            // Adiciona o personagem à lista
            personagens.add(personagem);
        }

        return personagens;
    }
}