package com.backend.persona.dependencia;


import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.persona.modelo.Persona;

public interface Persona_Dependencia extends JpaRepository<Persona, Long> {
	

}
