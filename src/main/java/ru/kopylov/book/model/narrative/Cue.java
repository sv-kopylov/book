package ru.kopylov.book.model.narrative;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import ru.kopylov.book.model.actor.Actor;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Cue {
    Actor actor;
    String que;
}
