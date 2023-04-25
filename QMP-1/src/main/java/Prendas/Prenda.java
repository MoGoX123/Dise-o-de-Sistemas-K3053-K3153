package Prendas;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {

  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrimario;

  Color colorSecundario;

  public Prenda(TipoPrenda categoria, Material material, Color color) {
    this.tipoPrenda = requireNonNull(categoria,"Requiero un tipo de prenda obligatorio");
    this.material = requireNonNull(material, "Requiero un material obligatorio");
    this.colorPrimario = requireNonNull(color, "Requiero un colorPrimario obligatorio");;
  }

  public void PrendaColorSecundario(Color color){
    this.colorSecundario = color;
  }

  public void getCategoriaPrenda() {
    System.out.println(this.tipoPrenda.getCategoriaPrenda());
  }
}
