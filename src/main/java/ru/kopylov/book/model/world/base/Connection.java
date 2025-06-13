package ru.kopylov.book.model.world.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/*
    Связь между любыми двумя идеями
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Connection {
    private Idea source;
    private Idea target;

    public Connection(Idea source, Idea target) {
        this.source = source;
        this.target = target;
    }

    public Connection() {
    }
}
