package org.example;
import Prendas.*;
import java.awt.*;


public class Main {
  public static void main(String[] args) {

    TipoPrenda a1 = TipoPrenda.REMERA;
    Material   a2 = Material.ALGODON;
    Color      a3 = Color.BLACK;

    Prenda x = new Prenda(a1,a2,a3);

    x.getCategoriaPrenda();

  }
}