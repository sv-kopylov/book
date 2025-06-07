package ru.kopylov.book.model.world;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.world.base.Connection;

import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class World {
    private List<Domain> domains;
    private List<Connection> connections;
}

