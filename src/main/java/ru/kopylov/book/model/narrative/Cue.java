package ru.kopylov.book.model.narrative;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.actor.Actor;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Cue {
    Actor actor;
    String que;
}
