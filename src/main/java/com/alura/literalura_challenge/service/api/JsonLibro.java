package com.alura.literalura_challenge.service.api;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;


public record DatosLibro(
        @JsonAlias("id") Long id,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosAutor> autores,
        @JsonAlias("languages") List<String> idiomas,
        @JsonAlias("download_count") int descargas
) { }
