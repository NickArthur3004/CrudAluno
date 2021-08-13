package br.com.nicolas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nicolas.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
