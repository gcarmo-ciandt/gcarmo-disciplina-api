package gcarmo.service;

import gcarmo.model.Disciplina;
import gcarmo.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public Disciplina inserirDisciplina(String nome){

        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setId(UUID.randomUUID());

        return disciplinaRepository.save(disciplina);

    }
}
