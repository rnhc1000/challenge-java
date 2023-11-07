package stream.application;

import stream.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TutorialOracle {

  public static void main(String[] args) {

    List<Pessoa> pessoas = new Pessoa().populaPessoas();

    List<Pessoa> z = pessoas.stream().filter(x -> x.getNacionalidade().equals("Brasil")).toList();
    for (Pessoa d : z) {
      System.out.println(d);
    }
    List<Integer> y = pessoas.stream().filter(x -> x.getNacionalidade().equals("Brasil")).map(Pessoa::getIdade).toList();
    for (Integer g : y) {
      System.out.println(g);
    }

  }
}
