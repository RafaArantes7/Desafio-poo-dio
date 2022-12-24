import java.time.LocalDate;

import br.com.dio.desafio.Curso;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incristos Rafael: " + devRafael.getConteudoIncritos());
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incristos Rafael: " + devRafael.getConteudoIncritos());
        System.out.println("Conteudos Concluidos Rafael: " + devRafael.getConteudosConcluidos());
        System.out.println("XP" + devRafael.calcularTotalXp());

        System.out.println("-----------");

        Dev devEllen = new Dev();
        devEllen.setNome("Ellen");
        devEllen.inscreverBootcamp(bootcamp);
        System.out.println("COnteudos Incristos Ellen: " + devEllen.getConteudoIncritos());
        devEllen.progredir();
        devEllen.progredir();
        System.out.println("-");
        System.out.println("COnteudos Incristos Ellen: " + devEllen.getConteudoIncritos());
        System.out.println("COnteudos Concluidos Ellen: " + devEllen.getConteudosConcluidos());
        System.out.println("XP" + devEllen.calcularTotalXp());

    }

}
