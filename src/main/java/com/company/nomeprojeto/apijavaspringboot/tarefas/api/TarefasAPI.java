package com.company.nomeprojeto.apijavaspringboot.tarefas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.MediaType;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.nomeprojeto.apijavaspringboot.tarefas.dto.TarefaDTO;
import com.company.nomeprojeto.apijavaspringboot.tarefas.facade.TarefasFacade;

@RestController
// @Controller
@RequestMapping("/tarefas")
// @RequestMapping(value = "/tarefas", produces =
// MediaType.APPLICATION_JSON_VALUE);
public class TarefasAPI {
  @Autowired
  private TarefasFacade tarefasFacade;

  @PostMapping
  // @ResponseBody
  public TarefaDTO criar(@RequestBody TarefaDTO tarefaDTO) {
    return tarefasFacade.criar(tarefaDTO);
  }

  @PutMapping("/{id}")
  // @ResponseBody
  public TarefaDTO atualizar(@PathVariable("id") Long tarefaId, @RequestBody TarefaDTO tarefaDTO) {
    return tarefasFacade.atualizar(tarefaDTO, tarefaId);
  }

  @GetMapping
  // @ResponseBody
  public List<TarefaDTO> listarTarefas() {
    return tarefasFacade.listarTarefas();
  }

  @GetMapping("/{id}")
  // @ResponseBody
  public TarefaDTO listarTarefa(@PathVariable("id") Long tarefaId) {
    return tarefasFacade.listarTarefa(tarefaId);
  }

  @DeleteMapping("/{id}")
  // @ResponseBody
  public String deletar(@PathVariable("id") long tarefaId) {
    return tarefasFacade.deletar(tarefaId);
  }
}
