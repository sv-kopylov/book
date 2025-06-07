package ru.kopylov.book.model.world.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

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
}
