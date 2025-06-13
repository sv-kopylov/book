package ru.kopylov.book.top;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Story {
    private Context context;
    private Narrative narrative;

    public Story(Context context, Narrative narrative) {
        this.context = context;
        this.narrative = narrative;
    }

    public Story() {
    }
}
