package br.com.nicolas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.nicolas.entities.Aluno;
import br.com.nicolas.repositories.AlunoRepository;

@RestController
@RequestMapping(value ="/alunos")
public class AlunoService {

	@Autowired
	public AlunoRepository alunoRepository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAll(){
		List<Aluno> list = alunoRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Aluno> findById(@PathVariable Long id){
	    Aluno aluno = alunoRepository.findById(id).get();
		return ResponseEntity.ok().body(aluno);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Aluno Add(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping
	public void DeleteAluno(@RequestBody Aluno aluno) {
		 alunoRepository.delete(aluno);
	}
	
	@PutMapping
	public Aluno AtualizarArma(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
}
