package homeservice.br.ufg.inf.ria.homeservicedefinitivo.model;

import com.orm.dsl.Table;

/**
 * Created by raphael on 23/05/17.
 */

@Table
public class Servico {

    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String cidade;
    private Categoria categoria;

    public Servico() {
    }

    public Servico(Long id, String nome, String descricao, Double preco, String cidade, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.cidade = cidade;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
