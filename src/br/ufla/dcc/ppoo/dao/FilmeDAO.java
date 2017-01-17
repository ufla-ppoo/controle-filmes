/**
*	MANUTENCAO DO SISTEMA REALIZADA POR:
*	Valdeci Soares da Silva Junior
*                       &
*        Arlen Mendes
*	Site: conexusecia.com.br
*	Contato: (35) 9_9195-8111 - Tim + Whatsapp
*	E-mail: contato@conexusecia.com.br
*/

package br.ufla.dcc.ppoo.dao;

/**
 * Interface do Data Access Object (Padrão de Projeto) da Filme
 * @author Valdeci e Arlen
 */

// importação das classes utilizadas
import br.ufla.dcc.ppoo.modelo.Filme;
import java.util.List;

public interface FilmeDAO {
    /**
     * Adiciona um objeto Filme na Lista 
     * de Filmes
     * @param filme
     */

    public void adicionarFilme(Filme filme);
    
    /**
     * Retonar um ArrayList contendo
     * objetos da classe Filme
     * @return 
     */
    public List<Filme> getListaFilmes();
    
    /**
     * Edita filme a partir
     * de um indicador da posição da Filme na Lista
     * @param filme
     * @param a
     */
    public void editarFilme(Filme filme,int a);
    
    /**
     * Deleta filme a partir
     * de um indicador da posição da Filme na Lista
     * @param filme
     * @param a
     */
    public void deletarFilme(Filme filme, int a);
    
}
