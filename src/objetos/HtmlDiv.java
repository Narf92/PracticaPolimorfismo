package objetos;

public class HtmlDiv extends HtmlContainer {

    public HtmlDiv(){
        this.setTag("<div>");
    }

    public HtmlDiv (String tag){

    }

    @Override
    public String format() {
        String html = this.getTag();
        for (HtmlComponent child : this.getChildren()) {
            html += child.format();
        }
        return html + "</div>";
    }
}
