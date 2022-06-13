package com.ifce.br.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ifce.br.Model.Heroi;
import com.ifce.br.Service.HeroiService;

@Controller

public class HeroiController {

	@Autowired
	private HeroiService heroiService;


	@GetMapping("heroi/formulario")
	public String cadastroHerois() {
		return "CadastroHerois";
	}
	@GetMapping("heroi/salvar")
	public String salvar(Heroi heroi) {

		heroiService.cadastrarHeroi(heroi);
		
		return "redirect:/heroi/listar";
		
	}
	@GetMapping("/heroi/listar")
	public String listarHeroi(Model model) {
	
		model.addAttribute("heroi", heroiService.listarHeroi());
		return "PaginaListagem";
		
	}
	
	@GetMapping("/heroi/excluir/{codigo}")
	public String excluirHeroi(@PathVariable Long codigo) {
		
		heroiService.excluir(codigo);
		return "redirect:/heroi/listar";
		
	}
	
	@GetMapping("/heroi/atualizar/{codigo}")
	public String atualizarHeroi(@PathVariable Long codigo, Model model) {
		Optional<Heroi> heroiOptional = heroiService.retornarPeloCodigo(codigo);
		
		Heroi heroi = heroiOptional.get();
		model.addAttribute("heroi", heroi);
		return "Formulario";
	}
	public HeroiService getHeroiService() {
		return heroiService;
	}
	public void setHeroiService(HeroiService heroiService) {
		this.heroiService = heroiService;
	}
	

}
	
