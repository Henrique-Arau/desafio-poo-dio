//import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

@SuppressWarnings("ALL")
public class Main {

   public static void main(String[] args) {

      //Area de cursos

      Curso curso1 = new Curso();
      curso1.setTitulo("curso java");
      curso1.setDescricao("descrição curso java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("curso js");
      curso2.setDescricao("descrição curso js");
      curso2.setCargaHoraria(4);

      /*Polimorfismo

      Conteudo conteudo = new Curso();
      Conteudo conteudo = new Mentoria();

      List<String> palavras = new ArrayList<>();
      */

      //Area da Mentoria

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.setDescricao("descrição mentoria java");
      mentoria.setData(LocalDate.now());

      /*System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria);*/

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescricao("Descrição Bootcamp Java Developer");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);


      Dev devHenrique = new Dev();
      devHenrique.setNome("Henrique");
      devHenrique.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Henrique" + devHenrique.getConteudosInscritos());

      devHenrique.progredir();
      devHenrique.progredir();
      devHenrique.progredir();
      System.out.println("-");
      System.out.println("Conteudos Inscritos Henrique" + devHenrique.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Henrique" + devHenrique.getConteudosConcluidos());
      System.out.println("XP:" + devHenrique.calcularTotalXp());

      System.out.println("------------");

      Dev devJunior = new Dev();
      devJunior.setNome("Junior");
      devJunior.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Junior" + devJunior.getConteudosInscritos());

      devJunior.progredir();
      System.out.println("-");
      System.out.println("Conteudos Inscritos Junior" + devJunior.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Junior" + devJunior.getConteudosConcluidos());
      System.out.println("XP:" + devJunior.calcularTotalXp());
   }
}
