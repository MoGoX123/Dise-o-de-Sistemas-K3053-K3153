import javax.xml.bind.SchemaOutputResolver;
import java.awt.*;

public class Golondrina {

    int energia;

  public static void main(String[] args) {

    Golondrina pepita = new Golondrina(40);
    pepita.comer(10);
    pepita.volar();
    pepita.getEnergia();

  }

  private int getEnergia() {
    System.out.println(this.energia);
    return this.energia;
  }

  private void setEnergia(int energia) {
    this.energia = energia;
  }

  public Golondrina(int energia) {
    setEnergia(energia);
  }

  private void volar() {
    int energiaAux = getEnergia() - 10;
    setEnergia(energiaAux);
  }

  private void comer(int alpiste) {

    int energiaAux = (alpiste * 3);
    energiaAux = energiaAux + getEnergia();
    this.setEnergia(energiaAux);
  }

}
