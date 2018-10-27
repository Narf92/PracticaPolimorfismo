package objetos.componentes;

import objetos.HtmlSingleComponent;

public class HtmlImage extends HtmlSingleComponent {

    public HtmlImage (String text){
        this.setTag("<img>");
        this.setValue("<img>"+text+"</img>");
    }

    @Override
    public String format() {
        return this.getValue();
    }
}
