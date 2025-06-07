package ru.kopylov.book.model.actor;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.world.base.Idea;

/**
 * шкала ценностей, Idea - описание,
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Scale {
    private Idea idea;


}
