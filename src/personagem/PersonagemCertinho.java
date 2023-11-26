package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemCertinho extends Personagem {
    private ArrayList<Magias> magias;

    // Construtor padrão
    public PersonagemCertinho() {
        super();
        magias = new ArrayList<>();
    }

    // Construtor com parâmetros
    public PersonagemCertinho(String nome, Integer idade, Integer forca, Integer inteligencia,
                              Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.CERTINHO);
        magias = new ArrayList<>();
    }

    // Método para adicionar uma habilidade mágica ao personagem certinho
    public void adicionarmagias(Magias magia) {
        magias.add(magia);
    }	

    // Método para obter as habilidades mágicas do personagem certinho
    public ArrayList<Magias> obtermagias() {
        return magias;
    }

    @Override
    public String toString() {
        return "PersonagemCertinho{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", forca=" + getForca() +
                ", inteligencia=" + getInteligencia() +
                ", carisma=" + getCarisma() +
                ", constituicao=" + getConstituicao() +
                ", sabedoria=" + getSabedoria() +
                ", classe=" + getClasse() +
                ", dataCriacao=" + getDataCriacao() +
                ", magias=" + magias +
                '}';
    }
}