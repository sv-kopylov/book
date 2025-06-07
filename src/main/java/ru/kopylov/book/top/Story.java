package ru.kopylov.book.top;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Story {
    private Context context;
    private Narrative narrative;

    public Story(Context context, Narrative narrative) {
        this.context = context;
        this.narrative = narrative;
    }
}
