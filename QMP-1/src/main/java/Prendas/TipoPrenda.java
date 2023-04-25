package Prendas;

public enum TipoPrenda {
  REMERA(Categoria.PARTE_SUPERIOR),
  CAMISA(Categoria.PARTE_SUPERIOR),
  POLO(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  SHORTS(Categoria.PARTE_INFERIOR),
  JEAN(Categoria.PARTE_INFERIOR),
  BOTAS_CUERO(Categoria.ZAPATO),
  SANDALIA(Categoria.ZAPATO),
  COLLAR(Categoria.ACCESORIO),
  SOMBRERO(Categoria.ACCESORIO),
  RELOG(Categoria.ACCESORIO);

  private Categoria categoriaPrenda;
  private TipoPrenda(Categoria categoriaPrenda) {
    this.categoriaPrenda = categoriaPrenda;
  }

  public String getCategoriaPrenda(){
    return this.categoriaPrenda.toString();
  }

}
