package com.ifce.br.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.Model.Heroi;

@Repository
public interface HeroiRepository extends JpaRepository<Heroi , Long>{


}
