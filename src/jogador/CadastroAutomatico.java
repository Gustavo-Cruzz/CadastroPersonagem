package jogador;
import personagem.*;
import skills.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class CadastroAutomatico {
    
    // Usando a ideia de Facory ou Abstract Factory
    public static Personagem criarPersonagem(String nome, Integer idade,Integer level, Integer forca, Integer inteligencia,
                                             Integer carisma, Integer constituicao, Integer sabedoria,
                                             ClassePersonagem classe) {
        switch (classe) {
            case GUERREIRO:
                PersonagemGuerreiro guerreiro = new PersonagemGuerreiro(nome, idade, level, forca, inteligencia, carisma, constituicao, sabedoria);
                for (SkillFisica c : ListaSkillsFisicas.getSkills()){
     			   if(c.getLevel()<=guerreiro.getLevel()) {
   		        	 guerreiro.adicionarHabilidadeFisica(c);
     			   }
   		    }
            return guerreiro;
            case LADINO:
                PersonagemLadino ladino = new PersonagemLadino(nome, idade,level, forca, inteligencia, carisma, constituicao, sabedoria);
                for (SkillFisica c : ListaSkillsFisicas.getSkills()){
     			   if(c.getLevel()<=ladino.getLevel()) {
   		        	 ladino.adicionarHabilidadeFisica(c);
     			   }
   		    }
            return ladino;
            case PONTEIRO:
                PersonagemPonteiro ponteiro =new PersonagemPonteiro(nome, idade,level, forca, inteligencia, carisma, constituicao, sabedoria);
                for (SkillFisica c : ListaSkillsFisicas.getSkills()){
     			   if(c.getLevel()<=ponteiro.getLevel()) {
   		        	 ponteiro.adicionarHabilidadeFisica(c);
     			   }
   		    }
               return ponteiro;
            case BRUXO:
                PersonagemBruxo bruxo =new PersonagemBruxo(nome, idade, level,forca, inteligencia, carisma, constituicao, sabedoria);
                for (Magias c : ListaMagias.getMagias()){
     			   if(c.getLevel()<=bruxo.getLevel()) {
     				   bruxo.adicionarMagias(c);
     			   }
   		    }
                return bruxo;
            case CLERIGO:
                PersonagemClerigo clerigo = new PersonagemClerigo(nome, idade,level, forca, inteligencia, carisma, constituicao, sabedoria);
                for (Magias c : ListaMagias.getMagias()){
     			   if(c.getLevel()<=clerigo.getLevel()) {
     				   clerigo.adicionarMagias(c);
     			   }
   		    }
            case CERTINHO:
                PersonagemCertinho certinho = new PersonagemCertinho(nome, idade,level, forca, inteligencia, carisma, constituicao, sabedoria);
                for (Magias c : ListaMagias.getMagias()){
     			   if(c.getLevel()<=certinho.getLevel()) {
     				   certinho.adicionarMagias(c);
     			   }
   		    }
             return certinho;
            
            // Indicando classe inválida
            default:
                throw new IllegalArgumentException("Classe de personagem desconhecida: " + classe);
        }
    }

    public static ArrayList<Personagem> gerarPersonagensAleatorios(int quantidade, ArrayList<Personagem> personagens) {
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            String nome = "Personagem" + i;
            Integer idade = random.nextInt(80) + 14; // Personagens entre 14 e 80 anos
            Integer level = random.nextInt(14) + 1;  // Level entre 1 e 14
            Integer forca = random.nextInt(20) + 1; // Gera um número entre 1 e 20
            Integer inteligencia = random.nextInt(20) + 1;
            Integer carisma = random.nextInt(20) + 1;
            Integer constituicao = random.nextInt(20) + 1;
            Integer sabedoria = random.nextInt(20) + 1;

            // Escolhe uma classe aleatória dentre as disponíveis no Enum ClassePersonagem
            ClassePersonagem classe = ClassePersonagem.values()[random.nextInt(ClassePersonagem.values().length)];
            

            // Usa a fábrica para criar uma instância específica da classe de personagem
            Personagem personagem = criarPersonagem(nome, idade, level, forca, inteligencia, carisma, constituicao, sabedoria, classe);
            personagem.setDataCriacao(new Date()); // Define a data de criação como a data atual

            // Adiciona o personagem à lista
            personagens.add(personagem);
        }

        return personagens;
    }
}