package objetos;

public abstract class HtmlComponent {

    private String tag;

    public String getTag() {

        return tag;
    }

    public void setTag(String tag) {

        this.tag = tag;
    }

    public String format(){
        return "";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
