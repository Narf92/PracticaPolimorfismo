package objetos;

import java.util.ArrayList;
import java.util.List;

public class HtmlContainer extends HtmlComponent{

    List<HtmlComponent> components = new ArrayList<>();

    public HtmlContainer(){

    }

    public HtmlContainer (String tag){
        this.setTag(tag);
        addComponente(this);
    }

    public void addComponente(HtmlComponent component){
        this.components.add(component);
    }

    public List<HtmlComponent> getChildren(){
        return components;
    }

    @Override
    public String format() {
        String html = "";
        for (HtmlComponent component : components) {
           if (this.components.size()>1){
               html += component.format();
               html+='\n';
           }
            html += component.getTag();
            html+='\n';
        }
        return html;
    }

    @Override
    public String toString() {
         return super.toString();
    }
}
