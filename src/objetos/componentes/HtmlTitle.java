package objetos.componentes;

import objetos.HtmlSingleComponent;

public class HtmlTitle extends HtmlSingleComponent {

    public HtmlTitle (String text){
        this.setTag("<h1>");
        this.setValue("<h1>"+text+"</h1>");
    }
}
