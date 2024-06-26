package com.example.demo;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import java.util.*;

@EnableCosmosRepositories
public interface RepositorioLivro extends CosmosRepository<Livro, String> {

  List<Livro> findAll();

  void deleteByNome(String nome);

}
