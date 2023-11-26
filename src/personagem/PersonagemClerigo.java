package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemClerigo extends Personagem {
    private ArrayList<Magias> magias;

    // Construtor padrão
    public PersonagemClerigo() {
        super();
        magias = new ArrayList<>();
    }

    // Construtor com parâmetros
    public PersonagemClerigo(String nome, Integer idade, Integer forca, Integer inteligencia,
                              Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.CLERIGO);
        magias = new ArrayList<>();
    }

    // Método para adicionar uma habilidade mágica ao clérigo
    public void adicionarMagia(Magias magia) {
        magias.add(magia);
    }

    // Método para obter as habilidades mágicas do clérigo
    public ArrayList<Magias> obterMagias() {
        return magias;
    }

    @Override
    public String toString() {
        return "PersonagemClerigo{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", forca=" + getForca() +
                ", inteligencia=" + getInteligencia() +
                ", carisma=" + getCarisma() +
                ", constituicao=" + getConstituicao() +
                ", sabedoria=" + getSabedoria() +
                ", classe=" + getClasse() +
                ", dataCriacao=" + getDataCriacao() +
                ", habilidadesMágicas=" + magias +
                '}';
    }
}
