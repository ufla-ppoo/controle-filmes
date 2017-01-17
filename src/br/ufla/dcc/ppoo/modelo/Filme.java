/**
*	MANUTENCAO DO SISTEMA REALIZADA POR:
*	Valdeci Soares da Silva Junior
*                       &
*        Arlen Mendes
*	Site: conexusecia.com.br
*	Contato: (35) 9_9195-8111 - Tim + Whatsapp
*	E-mail: contato@conexusecia.com.br
*/

package br.ufla.dcc.ppoo.modelo;

/**
 *
 * Atributos
 */
public class Filme {
    private String nome;
    private String genero;
    private String ano;
    private String duracao;
    private String descricao;

    /**
     * Contrutor da classe filme
     * @param nome
     * @param genero
     * @param ano
     * @param duracao
     * @param descricao
     */
    
    public Filme( String nome, String genero, String ano, String duracao, String descricao){
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.descricao = descricao;
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the duracao
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
        /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the duracao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
