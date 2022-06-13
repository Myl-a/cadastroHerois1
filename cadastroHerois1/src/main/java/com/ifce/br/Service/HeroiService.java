package com.ifce.br.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.Model.Heroi;
import com.ifce.br.Repository.HeroiRepository;


@Service
public class HeroiService {

	@Autowired
	private HeroiRepository heroiRepo;
	
	public void cadastrarHeroi(Heroi heroi) {
		heroiRepo.save(heroi);

}

	public Object listarHeroi() {
		// TODO Auto-generated method stub
		return null;
	}



	public void excluir(Long codigo) {
		// TODO Auto-generated method stub
		
	}

	public Optional<Heroi> retornarPeloCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}


	}