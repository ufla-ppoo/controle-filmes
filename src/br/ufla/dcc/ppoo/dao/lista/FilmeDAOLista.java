/**
*	MANUTENCAO DO SISTEMA REALIZADA POR:
*	Valdeci Soares da Silva Junior
*                       &
*        Arlen Mendes
*	Site: conexusecia.com.br
*	Contato: (35) 9_9195-8111 - Tim + Whatsapp
*	E-mail: contato@conexusecia.com.br
*/

package br.ufla.dcc.ppoo.dao.lista;

import br.ufla.dcc.ppoo.dao.FilmeDAO;
import br.ufla.dcc.ppoo.modelo.Filme;
import java.util.ArrayList;
import java.util.List;


/**
 * Implementação do Data Access Object (Padrão de Projeto) da Filme através de
 * Lista em memória
 * 
 * @author Arlen e Valdeci
 */

public class FilmeDAOLista implements FilmeDAO {

    // instância única da classe (Padrão de Projeto Singleton)
    private static FilmeDAOLista instancia;
    
    // lista em em memória dos usuários cadastrados
    private final List<Filme> listaFilme;

    private FilmeDAOLista() {
        listaFilme = new ArrayList<Filme>();
   }

    /**
     * Retorna a instância única da classe (Padrão de Projeto Singleton)
     * 
     * @return A instância única da classe
     */
    public static FilmeDAOLista obterInstancia() {
        if (instancia == null) {
            instancia = new FilmeDAOLista();
        }
        return instancia;
    }
    
    /**
     * Adiciona um objeto Filme na Lista 
     * de Filmes
     */  
    @Override
    public List<Filme> getListaFilmes(){
        return listaFilme;
    }

     /**
     * Retonar um ArrayList contendo
     * objetos da classe Filme
     */
    @Override
    public void adicionarFilme(Filme filme) {
        listaFilme.add(filme);
    }
    
     /**
     * Deleta série a partir
     * de um indicador da posição da Filme na Lista
     */
     public void editarFilme(Filme filme,int a) {
        listaFilme.get(a).setNome(filme.getNome());
        listaFilme.get(a).setGenero(filme.getGenero());
        listaFilme.get(a).setAno(filme.getAno());
        listaFilme.get(a).setDuracao(filme.getDuracao());
        listaFilme.get(a).setDescricao(filme.getDescricao());
    }

    /**
     * Deleta série a partir
     * de um indicador da posição da Filme na Lista
     */
    @Override
    public void deletarFilme(Filme filme, int a) {
        listaFilme.remove(a);
    }
}
