package br.com.nicolas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.nicolas.entities.Aluno;
import br.com.nicolas.repositories.AlunoRepository;

@SpringBootApplication
public class CrudAlunoApplication implements CommandLineRunner{
	
	@Autowired
	public AlunoRepository alunoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudAlunoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Aluno a1 = new Aluno(1, "Nicolas", 13, "6 ano B");
		Aluno a2 = new Aluno(2, "Raquel", 15, "8 ano C");
		Aluno a3 = new Aluno(3, "Alanis", 14, "7 ano A");
		
		alunoRepository.save(a1);
		alunoRepository.save(a2);
		alunoRepository.save(a3);
		
	}

}
