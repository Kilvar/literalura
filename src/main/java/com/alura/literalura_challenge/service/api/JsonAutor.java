package com.alura.literalura_challenge.service.api;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosAutor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") int nacimiento,
        @JsonAlias("death_year") int fallecimiento
) {
}
