package main;

import objetos.HtmlContainer;
import objetos.HtmlDiv;
import objetos.HtmlPage;
import objetos.componentes.HtmlHeader;
import objetos.componentes.HtmlImage;

public class main {

    public static void main(String[] args) {
        HtmlPage Page = new HtmlPage();
        HtmlContainer div = new HtmlDiv();
        div.addComponente(new HtmlHeader("Superman"));
        div.addComponente(new HtmlImage("Buenas Noches"));
        Page.addComponente(div);

        System.out.println(Page.format());

    }
}
