package ru.kopylov.book.model.world;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.world.base.Connection;

import java.util.List;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Epoch {
    private List<Connection> connections;
    private List<World> worlds;
}
