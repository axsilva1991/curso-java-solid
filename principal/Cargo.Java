package principal;

import principal.calculo.CalculaDezOuVinte;
import principal.calculo.Calucula;

public enum Cargo {
  DESENVOLVEDOR(new CalculaDezOuVinte()),
  DBA(new CalculaDezOuVinte()),
  TESTER(new CalculaDezOuVinte());

  private Calucula calculo;

  Cargo(Calucula calculo){
    this.calculo = calculo;
  }
}
