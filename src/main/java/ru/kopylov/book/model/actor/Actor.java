package ru.kopylov.book.model.actor;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.narrative.Cue;
import ru.kopylov.book.model.world.Item;

import java.util.List;
import java.util.Map;

/**
Персонаж
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Actor {
    /**  шкалы ценностей (как эмбединг key - отношение , value - идея)  */
    Map<Integer,Scale> prism;

    /** ресурсы  */
    Map<Integer, Item> resources;

    /** Реплики персонажа, типовые, обычные и пр */
    List<Cue> cues;

    /** Любые черты личности проявляемые во вне (щель между зубами, носит плащ, заикается)*/
    List<String> traits;


}
