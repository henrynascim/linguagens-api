package br.com.alura.linguagens.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface linguagemRepository extends MongoRepository<Linguagem , String> {

}
