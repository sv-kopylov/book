package ru.kopylov.book.model.world.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Idea {
    private String gist;

    public Idea(String gist) {
        this.gist = gist;
    }

    public Idea() {
    }
}
