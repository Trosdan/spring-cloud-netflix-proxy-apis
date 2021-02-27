package br.com.emmanuelneri;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.http.protocol.HTTP;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentosController {
	private static final Map<Long, AgendamentoModel> AGENDAMENTOS = ImmutableMap.of(
            1L, new AgendamentoModel(1L, "In nisl lectus, ultricies ac mollis faucibus, rutrum id velit.", new Date(1617764400000L)),
            2L, new AgendamentoModel(2L, "Phasellus vulputate sed turpis vel porttitor.", new Date(1617764400000L)),
            3L, new AgendamentoModel(3L, "Ut sed erat sollicitudin, gravida odio vel, interdum ipsum.", new Date(1617764400000L)),
            4L, new AgendamentoModel(4L, "Sed auctor magna tellus, sit amet lobortis augue convallis quis.", new Date(1617764400000L)));

	@GetMapping
	public List<AgendamentoModel> findAll() {
		return new ArrayList<>(AGENDAMENTOS.values());
	}

    @GetMapping(path = "/{id}")
    public AgendamentoModel findById(@PathVariable("id") Long id) {
        return AGENDAMENTOS.get(id);
    }

    @GetMapping(path = "/cancelarAgendamento/{id}")
    public String cancelarAgendamento(@PathVariable("id") Long id) {
    	AgendamentoModel agendamento = AGENDAMENTOS.get(id);
    	if(agendamento != null) {
    		return "Agendamento cancelado: " + agendamento.getTitulo() + " - " + agendamento.getDataFormatada();
    	} else {
    		return "Agendamento não encontrado";
    	}
    }
}
