package objetos.componentes;

import objetos.HtmlSingleComponent;

public class HtmlHeader extends HtmlSingleComponent {

    public HtmlHeader (String text){
        this.setTag("<h2>");
        this.setValue("<h2>"+text+"</h2>");
    }

    @Override
    public String format() {
        String html = this.getValue();
        return html;
    }
}
