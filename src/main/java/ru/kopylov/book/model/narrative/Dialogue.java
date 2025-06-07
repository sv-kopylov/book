package ru.kopylov.book.model.narrative;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.actor.Actor;

import java.util.List;
/*
    Диалог имеет участников и реплики (участники - ссылочные, а реплики принадлежат диалогу)
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Dialogue {
    List<Actor> actors;
    List<Cue> cues;
}
