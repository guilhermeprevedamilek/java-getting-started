package com.company.nomeprojeto.apijavaspringboot.tarefas.facade;

import org.springframework.stereotype.Service;
import com.company.nomeprojeto.apijavaspringboot.tarefas.dto.TarefaDTO;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TarefasFacade {
  private static final Map<Long, TarefaDTO> tarefas = new HashMap<>();

  public TarefaDTO criar(TarefaDTO tarefaDTO) {
    Long proximoId = tarefas.keySet().size() + 1L;
    tarefaDTO.setId(proximoId);

    tarefas.put(proximoId, tarefaDTO);

    return tarefaDTO;
  }

  public TarefaDTO atualizar(TarefaDTO tarefaDTO, Long tarefaId) {
    tarefas.put(tarefaId, tarefaDTO);

    return tarefaDTO;
  }

  public TarefaDTO listarTarefa(Long tarefaId) {
    return tarefas.get(tarefaId);
  }

  public List<TarefaDTO> listarTarefas() {
    return new ArrayList<>(tarefas.values());
  }

  public String deletar(Long tarefaId) {
    tarefas.remove(tarefaId);

    return "DELETED";
  }
}
