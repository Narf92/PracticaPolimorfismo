package objetos;

public class HtmlPage extends HtmlContainer {

    public HtmlPage (){
        this.setTag("html>");
        this.addComponente(new HtmlContainer("<html>"));
        this.addComponente(this.getBody());
    }

    public HtmlContainer getBody(){
        HtmlContainer body = new HtmlContainer("<body>");
        return body;
    }

}
