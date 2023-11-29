package aplicacao;
import java.util.*;
import jogador.*;
import personagem.*;
import skills.*;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();
        ListaMagias ListaMagias = new ListaMagias();
        ListaSkillsFisicas ListaSkillFisicas = new ListaSkillsFisicas();
        ListaSkillFisicas.Lista_Skills();
        ListaMagias.listaMagias();
        
       CadastroAutomatico.gerarPersonagensAleatorios(10, jogador.getPersonagens());
       System.out.println("Novo jogador, qual o seu nome?");
       jogador.setNomeJogador(sc.nextLine());
       int opc = 0;
       while(opc != 3){
       System.out.println("O que gostaria de fazer? \n 1 - Criar um personagem novo \n 2 - Checar minha lista de personagens \n 3 - Sair");
       opc = sc.nextInt();
       switch(opc){
       case 1:
    	   System.out.println("Certinho! Primeiro escolha a classe de seu personagem entre essas: ");
    	   System.out.println(" - Bruxo \n - Certinho \n - Clerigo \n - Guerreiro \n - Ladino \n - Ponteiro");
    	   sc.nextLine();
    	   switch(sc.nextLine()) {
    	   case "Guerreiro":
    		   PersonagemGuerreiro guerreiro = new PersonagemGuerreiro();
    		   guerreiro.setClasse(ClassePersonagem.GUERREIRO);
    		   System.out.println("Nome: ");
    		   guerreiro.setNome(sc.nextLine());
    		   System.out.println("Idade: ");
    		   guerreiro.setIdade(sc.nextInt());
    		   System.out.println("Level: ");
    		   guerreiro.setLevel(sc.nextInt());
    		   for(int pontos=50;pontos>0;) {
    			   System.out.println("Distribua os " + pontos + " restantes entre os atributos:" );
    			   System.out.println(" - Forca: " + guerreiro.getForca() + "\n - Inteligencia: " + guerreiro.getInteligencia() + "\n - Carisma: " + guerreiro.getCarisma() + "\n - Constituicao: " + guerreiro.getConstituicao() + "\n Sabedoria: " + guerreiro.getSabedoria());
    			   System.out.println("\n Escolha o atributo que deseja colocar seus pontos: ");
    			   switch(sc.next()) {
    			   case "Forca":
    				   System.out.println("Quantos pontos deseja colocar em Forca?");
    				   int pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
                       guerreiro.setForca(guerreiro.getForca()+pontosaux);
                       break;
    			   case "Inteligencia":
    				   System.out.println("Quantos pontos deseja colocar em Inteligencia?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
                       guerreiro.setInteligencia(guerreiro.getInteligencia()+pontosaux);
                       break;
    			   case "Carisma":
    				   System.out.println("Quantos pontos deseja colocar em Carisma?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
                       guerreiro.setCarisma(guerreiro.getCarisma()+pontosaux);
                       break;
    			   case "Constituicao":
    				   System.out.println("Quantos pontos deseja colocar em Constituicao?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
                       guerreiro.setConstituicao(guerreiro.getConstituicao()+pontosaux);
                       break;
    			   case "Sabedoria":
    				   System.out.println("Quantos pontos deseja colocar em Sabedoria?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
                       guerreiro.setSabedoria(guerreiro.getSabedoria()+pontosaux);
                       break;
                   default:
                    	break;
    			   }
    		   }
    		   for (SkillFisica c : ListaSkillsFisicas.getSkills()){
    			   if(c.getLevel()<=guerreiro.getLevel()) {
  		        	 guerreiro.adicionarHabilidadeFisica(c);
    			   }
  		    }
    		   
    		   System.out.println(guerreiro);
    		   jogador.addPersonagem(guerreiro);
    		   System.out.println("Certinho!Personagem adicionado a lista, gostaria de criar outro?(1)sim (2)nao");
    		   opc = sc.nextInt();
    		   break;
    		   
    	   case "Ladino":
    		   PersonagemLadino Ladino = new PersonagemLadino();
    		   System.out.println("Nome: ");
    		   Ladino.setNome(sc.nextLine());
    		   System.out.println("Idade: ");
    		   Ladino.setIdade(sc.nextInt());
    		   System.out.println("Level: ");
    		   Ladino.setLevel(sc.nextInt());
    		   for(int pontos=50;pontos>0;) {
    			   System.out.println("Distribua os " + pontos + " restantes entre os atributos:" );
    			   System.out.println(" - Forca: " + Ladino.getForca() + "\n - Inteligencia: " + Ladino.getInteligencia() + "\n - Carisma: " + Ladino.getCarisma() + "\n - Constituicao: " + Ladino.getConstituicao() + "\n - Sabedoria: " + Ladino.getSabedoria());
    			   System.out.println("\n Escolha o atributo que deseja colocar seus pontos: ");
    			   switch(sc.next()) {
    			   case "Forca":
    				   System.out.println("Quantos pontos deseja colocar em Forca?");
    				   int pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ladino.setForca(Ladino.getForca()+pontosaux);
                       break;
    			   case "Inteligencia":
    				   System.out.println("Quantos pontos deseja colocar em Inteligencia?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ladino.setInteligencia(Ladino.getInteligencia()+pontosaux);
                       break;
    			   case "Carisma":
    				   System.out.println("Quantos pontos deseja colocar em Carisma?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ladino.setCarisma(Ladino.getCarisma()+pontosaux);
                       break;
    			   case "Constituicao":
    				   System.out.println("Quantos pontos deseja colocar em Constituicao?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ladino.setConstituicao(Ladino.getConstituicao()+pontosaux);
                       break;
    			   case "Sabedoria":
    				   System.out.println("Quantos pontos deseja colocar em Sabedoria?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ladino.setSabedoria(Ladino.getSabedoria()+pontosaux);
                       break;
                   default:
                    	break;
    			   }
    		   }
    		   for (SkillFisica c : ListaSkillsFisicas.getSkills()){
    			   if(c.getLevel()<=Ladino.getLevel()) {
    				   Ladino.adicionarHabilidadeFisica(c);
    			   }
  		    }
    		   
    		   System.out.println(Ladino);
    		   jogador.addPersonagem(Ladino);
    		   break;

    	   case "Ponteiro":
    		   PersonagemPonteiro Ponteiro = new PersonagemPonteiro();
    		   System.out.println("Nome: ");
    		   Ponteiro.setNome(sc.nextLine());
    		   System.out.println("Idade: ");
    		   Ponteiro.setIdade(sc.nextInt());
    		   System.out.println("Level: ");
    		   Ponteiro.setLevel(sc.nextInt());
    		   for(int pontos=50;pontos>0;) {
    			   System.out.println("Distribua os " + pontos + " restantes entre os atributos:" );
    			   System.out.println(" - Forca: " + Ponteiro.getForca() + "\n - Inteligencia: " + Ponteiro.getInteligencia() + "\n - Carisma: " + Ponteiro.getCarisma() + "\n - Constituicao: " + Ponteiro.getConstituicao() + "\n Sabedoria: " + Ponteiro.getSabedoria());
    			   System.out.println("\n Escolha o atributo que deseja colocar seus pontos: ");
    			   switch(sc.next()) {
    			   case "Forca":
    				   System.out.println("Quantos pontos deseja colocar em Forca?");
    				   int pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ponteiro.setForca(Ponteiro.getForca()+pontosaux);
                       break;
    			   case "Inteligencia":
    				   System.out.println("Quantos pontos deseja colocar em Inteligencia?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ponteiro.setInteligencia(Ponteiro.getInteligencia()+pontosaux);
                       break;
    			   case "Carisma":
    				   System.out.println("Quantos pontos deseja colocar em Carisma?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ponteiro.setCarisma(Ponteiro.getCarisma()+pontosaux);
                       break;
    			   case "Constituicao":
    				   System.out.println("Quantos pontos deseja colocar em Constituicao?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ponteiro.setConstituicao(Ponteiro.getConstituicao()+pontosaux);
                       break;
    			   case "Sabedoria":
    				   System.out.println("Quantos pontos deseja colocar em Sabedoria?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Ponteiro.setSabedoria(Ponteiro.getSabedoria()+pontosaux);
                       break;
                   default:
                    	break;
    			   }
    		   }
    		   for (SkillFisica c : ListaSkillsFisicas.getSkills()){
    			   if(c.getLevel()<=Ponteiro.getLevel()) {
    				   Ponteiro.adicionarHabilidadeFisica(c);
    			   }
  		    }
    		   
    		   System.out.println(Ponteiro);
    		   jogador.addPersonagem(Ponteiro);
    		   break;

    	   case "Bruxo":
    		   PersonagemBruxo Bruxo = new PersonagemBruxo();
    		   System.out.println("Nome: ");
    		   Bruxo.setNome(sc.nextLine());
    		   System.out.println("Idade: ");
    		   Bruxo.setIdade(sc.nextInt());
    		   System.out.println("Level: ");
    		   Bruxo.setLevel(sc.nextInt());
    		   for(int pontos=50;pontos>0;) {
    			   System.out.println("Distribua os " + pontos + " restantes entre os atributos:" );
    			   System.out.println(" - Forca: " + Bruxo.getForca() + "\n - Inteligencia: " + Bruxo.getInteligencia() + "\n - Carisma: " + Bruxo.getCarisma() + "\n - Constituicao: " + Bruxo.getConstituicao() + "\n Sabedoria: " + Bruxo.getSabedoria());
    			   System.out.println("\n Escolha o atributo que deseja colocar seus pontos: ");
    			   switch(sc.next()) {
    			   case "Forca":
    				   System.out.println("Quantos pontos deseja colocar em Forca?");
    				   int pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Bruxo.setForca(Bruxo.getForca()+pontosaux);
                       break;
    			   case "Inteligencia":
    				   System.out.println("Quantos pontos deseja colocar em Inteligencia?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Bruxo.setInteligencia(Bruxo.getInteligencia()+pontosaux);
                       break;
    			   case "Carisma":
    				   System.out.println("Quantos pontos deseja colocar em Carisma?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Bruxo.setCarisma(Bruxo.getCarisma()+pontosaux);
                       break;
    			   case "Constituicao":
    				   System.out.println("Quantos pontos deseja colocar em Constituicao?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Bruxo.setConstituicao(Bruxo.getConstituicao()+pontosaux);
                       break;
    			   case "Sabedoria":
    				   System.out.println("Quantos pontos deseja colocar em Sabedoria?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Bruxo.setSabedoria(Bruxo.getSabedoria()+pontosaux);
                       break;
                   default:
                    	break;
    			   }
    		   }
    		   for (Magias c : skills.ListaMagias.getMagias()){
    			   if(c.getLevel()<=Bruxo.getLevel()) {
    				   Bruxo.adicionarMagias(c);
    			   }
  		    }
    		   
    		   System.out.println(Bruxo);
    		   jogador.addPersonagem(Bruxo);
    		   break;

    	   case "Certinho":
    		   PersonagemCertinho Certinho = new PersonagemCertinho();
    		   System.out.println("Nome: ");
    		   Certinho.setNome(sc.nextLine());
    		   System.out.println("Idade: ");
    		   Certinho.setIdade(sc.nextInt());
    		   System.out.println("Level: ");
    		   Certinho.setLevel(sc.nextInt());
    		   for(int pontos=50;pontos>0;) {
    			   System.out.println("Distribua os " + pontos + " restantes entre os atributos:" );
    			   System.out.println(" - Forca: " + Certinho.getForca() + "\n - Inteligencia: " + Certinho.getInteligencia() + "\n - Carisma: " + Certinho.getCarisma() + "\n - Constituicao: " + Certinho.getConstituicao() + "\n Sabedoria: " + Certinho.getSabedoria());
    			   System.out.println("\n Escolha o atributo que deseja colocar seus pontos: ");
    			   switch(sc.next()) {
    			   case "Forca":
    				   System.out.println("Quantos pontos deseja colocar em Forca?");
    				   int pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Certinho.setForca(Certinho.getForca()+pontosaux);
                       break;
    			   case "Inteligencia":
    				   System.out.println("Quantos pontos deseja colocar em Inteligencia?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Certinho.setInteligencia(Certinho.getInteligencia()+pontosaux);
                       break;
    			   case "Carisma":
    				   System.out.println("Quantos pontos deseja colocar em Carisma?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Certinho.setCarisma(Certinho.getCarisma()+pontosaux);
                       break;
    			   case "Constituicao":
    				   System.out.println("Quantos pontos deseja colocar em Constituicao?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Certinho.setConstituicao(Certinho.getConstituicao()+pontosaux);
                       break;
    			   case "Sabedoria":
    				   System.out.println("Quantos pontos deseja colocar em Sabedoria?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Certinho.setSabedoria(Certinho.getSabedoria()+pontosaux);
                       break;
                   default:
                    	break;
    			   }
    		   }
    		   for (Magias c : skills.ListaMagias.getMagias()){
    			   if(c.getLevel()<=Certinho.getLevel()) {
    				   Certinho.adicionarMagias(c);
    			   }
  		    }
    		   
    		   System.out.println(Certinho);
    		   jogador.addPersonagem(Certinho);
    		   break;

    	   case "Clerigo":
    		   PersonagemClerigo Clerigo = new PersonagemClerigo();
    		   System.out.println("Nome: ");
    		   Clerigo.setNome(sc.nextLine());
    		   System.out.println("Idade: ");
    		   Clerigo.setIdade(sc.nextInt());
    		   System.out.println("Level: ");
    		   Clerigo.setLevel(sc.nextInt());
    		   for(int pontos=50;pontos>0;) {
    			   System.out.println("Distribua os " + pontos + " restantes entre os atributos:" );
    			   System.out.println(" - Forca: " + Clerigo.getForca() + "\n - Inteligencia: " + Clerigo.getInteligencia() + "\n - Carisma: " + Clerigo.getCarisma() + "\n - Constituicao: " + Clerigo.getConstituicao() + "\n Sabedoria: " + Clerigo.getSabedoria());
    			   System.out.println("\n Escolha o atributo que deseja colocar seus pontos: ");
    			   switch(sc.next()) {
    			   case "Forca":
    				   System.out.println("Quantos pontos deseja colocar em Forca?");
    				   int pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Clerigo.setForca(Clerigo.getForca()+pontosaux);
                       break;
    			   case "Inteligencia":
    				   System.out.println("Quantos pontos deseja colocar em Inteligencia?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Clerigo.setInteligencia(Clerigo.getInteligencia()+pontosaux);
                       break;
    			   case "Carisma":
    				   System.out.println("Quantos pontos deseja colocar em Carisma?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Clerigo.setCarisma(Clerigo.getCarisma()+pontosaux);
                       break;
    			   case "Constituicao":
    				   System.out.println("Quantos pontos deseja colocar em Constituicao?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Clerigo.setConstituicao(Clerigo.getConstituicao()+pontosaux);
                       break;
    			   case "Sabedoria":
    				   System.out.println("Quantos pontos deseja colocar em Sabedoria?");
    				   pontosaux = sc.nextInt();
    				   pontos = pontos - pontosaux;
    				   Clerigo.setSabedoria(Clerigo.getSabedoria()+pontosaux);
                       break;
                   default:
                    	break;
    			   }
    		   }
    		   for (Magias c : skills.ListaMagias.getMagias()){
    			   if(c.getLevel()<=Clerigo.getLevel()) {
    				   Clerigo.adicionarMagias(c);
    			   }
  		    }
    		   
    		   System.out.println(Clerigo);
    		   jogador.addPersonagem(Clerigo);
    		   break;

    	   }
    	   break;
       case 2:
    	   int check = 1;
    	   do {
    		   
    	   for(Personagem c : jogador.getPersonagens()) {
    		   c.toStringSimplificada();
    		   System.out.println("\n");
    	   }
    	   System.out.println("Gostaria de organizar os personagens por Nome, Idade, Forca, Inteligencia, Carisma, Constituicao, Sabedoria ou Nenhum?");
           switch(sc.next()) {
           case "Nome":
        	   jogador.sortBy(SortBy.nome);
        	   break;
           case "Idade":
        	   jogador.sortBy(SortBy.idade);
        	   break;
           case "Forca":
        	   jogador.sortBy(SortBy.forca);
        	   break;
           case "Inteligencia":
        	   jogador.sortBy(SortBy.inteligencia);
        	   break;
           case "Carisma":
        	   jogador.sortBy(SortBy.carisma);
        	   break;
           case "Constituicao":
        	   jogador.sortBy(SortBy.constituicao);
        	   break;
           case "Sabedoria":
        	   jogador.sortBy(SortBy.sabedoria);
        	   break;
        	default:
        		check = 0;
        		break;
           }
    	   }while(check!=0);
    	   break;
       case 3:
    	   break;
       default:
    	   break;
       }
       } 
       sc.close();
	}

}
