import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java Iniciante");
        cursoJava.setDescricao("Neste curso, aprenda sobre o melhor da técnologia por trás da linguagem Java");
        cursoJava.setCargaHoraria(20);

        Curso cursoSpringBoot = new Curso();
        cursoSpringBoot.setTitulo("Curso Spring Boot");
        cursoSpringBoot.setDescricao("Aprenda sobre uma das maiores ferramentas do Java");
        cursoSpringBoot.setCargaHoraria(6);

        Mentoria mentoriaIntellij = new Mentoria();
        mentoriaIntellij.setTitulo("Mentoria IDE - Intellij");
        mentoriaIntellij.setDescricao("Aprenda os Atalhos, os Truques e Plugins para ser mais produtivo no Intellij");
        mentoriaIntellij.setData(LocalDate.now());

        Mentoria mentoriaMercadoJava = new Mentoria();
        mentoriaMercadoJava.setTitulo("Mentoria - Mercado Java");
        mentoriaMercadoJava.setDescricao("Saiba como ser contratado usando Java");
        mentoriaMercadoJava.setData(LocalDate.now().plusDays(1));

        Bootcamp bootcampJavaPlus = new Bootcamp();
        bootcampJavaPlus.setNome("Bootcamp Java Plus");
        bootcampJavaPlus.setDescricao("Neste Bootcamp aprenda sobre Java e ainda mais!");
        bootcampJavaPlus.getConteudos().add(cursoJava);
        bootcampJavaPlus.getConteudos().add(cursoSpringBoot);
        bootcampJavaPlus.getConteudos().add(mentoriaIntellij);
        bootcampJavaPlus.getConteudos().add(mentoriaMercadoJava);

        System.out.println("---------------------------------------------------------------------");

        Dev devEyke = new Dev();
        devEyke.setNome("Eyke");
        devEyke.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Eyke: " + devEyke.getConteudoInscritos());
        devEyke.progredir();
        devEyke.progredir();
        devEyke.progredir();
        devEyke.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Eyke: " + devEyke.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Eyke: " + devEyke.getConteudoConcluidos());
        System.out.println("XP: " + devEyke.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devMesquita = new Dev();
        devMesquita.setNome("Mesquita");
        devMesquita.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Mesquita: " + devMesquita.getConteudoInscritos());
        devMesquita.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Mesquita: " + devMesquita.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Mesquita: " + devMesquita.getConteudoConcluidos());
        System.out.println("XP: " + devMesquita.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devTeixeira = new Dev();
        devTeixeira.setNome("Teixeira");
        devTeixeira.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Teixeira: " + devTeixeira.getConteudoInscritos());
        devTeixeira.progredir();
        devTeixeira.progredir();
        devTeixeira.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Teixeira: " + devTeixeira.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Teixeira: " + devTeixeira.getConteudoConcluidos());
        System.out.println("XP: " + devTeixeira.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");
    }
}