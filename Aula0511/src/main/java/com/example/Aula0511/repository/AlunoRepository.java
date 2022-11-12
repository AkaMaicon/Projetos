package com.example.Aula0511.repository;

import com.example.Aula0511.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno,Integer>{

    public List<Aluno> findByNome (String nome);

    public List<Aluno> findByIdade (int idade);
}
