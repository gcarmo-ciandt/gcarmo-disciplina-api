package gcarmo.controller;

import gcarmo.model.Disciplina;
import gcarmo.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/disciplina")
public class DisciplinaController {


    @Autowired
    private DisciplinaService disciplinaService;

    @PostMapping
    public Disciplina inserirDisciplina(@RequestParam String nome){
        return disciplinaService.inserirDisciplina(nome);
    }

}
