package objetos.componentes;

import objetos.HtmlSingleComponent;

public class HtmlText extends HtmlSingleComponent {

    public  HtmlText (String text){
        this.setTag("<p>");
        this.setValue("<p>"+text+"</p>");
    }

}
