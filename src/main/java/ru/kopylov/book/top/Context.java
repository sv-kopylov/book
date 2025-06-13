package ru.kopylov.book.top;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import ru.kopylov.book.model.actor.Actor;
import ru.kopylov.book.model.world.Epoch;
import ru.kopylov.book.model.world.Law;
import ru.kopylov.book.model.world.World;

import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Context {
    private List<Actor> actors;
    private List<World> worlds;
    private List<Epoch> epoches;
    private List<Law> laws;

    public Context() {
    }
}
