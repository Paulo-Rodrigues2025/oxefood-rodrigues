package br.com.ifpe.oxefood.api.categoriaproduto;

import br.com.ifpe.oxefood.modelo.categoriaproduto.CategoriaProduto;

public class CategoriaProdutoRequest {

    private String descricao;

   public CategoriaProduto build() {

       return CategoriaProduto.builder()
           .descricao(descricao)
           .build();
   }
}
