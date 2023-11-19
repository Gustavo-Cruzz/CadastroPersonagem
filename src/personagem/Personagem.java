package personagem;

import java.util.Date;

public abstract class Personagem {
    private String nome;
    private Integer idade;
    private Integer forca;
    private Integer inteligencia;
    private Integer carisma;
    private Integer constituicao;
    private Integer sabedoria;
    private ClassePersonagem classe;
    private Date dataCriacao; // Novo campo para a data de criação

    // Construtor padrão
    public Personagem() {
        this.dataCriacao = new Date(); // Inicializa a data de criação com a data atual
    }

    // Construtor com parâmetros
    public Personagem(String nome, Integer idade, Integer forca, Integer inteligencia,
                       Integer carisma, Integer constituicao, Integer sabedoria,
                       ClassePersonagem classe) {
        this.nome = nome;
        this.idade = idade;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.constituicao = constituicao;
        this.sabedoria = sabedoria;
        this.classe = classe;
        this.dataCriacao = new Date(); // Inicializa a data de criação com a data atual
    }

    // Getters e Setters
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getCarisma() {
        return carisma;
    }

    public void setCarisma(Integer carisma) {
        this.carisma = carisma;
    }

    public Integer getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(Integer constituicao) {
        this.constituicao = constituicao;
    }

    public Integer getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(Integer sabedoria) {
        this.sabedoria = sabedoria;
    }

    public ClassePersonagem getClasse() {
        return classe;
    }

    public void setClasse(ClassePersonagem classe) {
        this.classe = classe;
    }

}
