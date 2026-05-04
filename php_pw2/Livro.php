<?php

class Livro
{
  //guardando informações
  public function __construct(
    private string $titulo,
    private string $autor,
    private int $ano,
    private string $genero,
    ) {}

  //exibindo informações
  public function getDetalhes(): string
  {
    return "{$this->titulo} ({$this->ano})";
  }

  public function getAutor(): string
  {
    return $this->autor;
  }

  public function getGenero(): string
  {
    return $this->genero;
  }
}
