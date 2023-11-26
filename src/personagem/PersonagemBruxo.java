package personagem;

import skills.*;
import java.util.ArrayList;

public class PersonagemBruxo extends Personagem {
    private ArrayList<Magias> magias;

    // Construtor padrão
    public PersonagemBruxo() {
        super();
        magias = new ArrayList<>();
    }

    // Construtor com parâmetros
    public PersonagemBruxo(String nome, Integer idade, Integer forca, Integer inteligencia,
                             Integer carisma, Integer constituicao, Integer sabedoria) {
        super(nome, idade, forca, inteligencia, carisma, constituicao, sabedoria, ClassePersonagem.BRUXO);
        magias = new ArrayList<>();
    }

    // Método para adicionar uma habilidade física ao bruxo
    public void adicionarMagias(Magias magia) {
        magias.add(magia);
    }

    // Método para obter as habilidades físicas do bruxo
    public ArrayList<Magias> obterMagias() {
        return magias;
    }
    
    @Override
    public String toString() {
        return "PersonagemBruxo{" +
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