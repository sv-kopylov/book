package ru.kopylov.book.model.actor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.world.base.Idea;

/**
 * шкала ценностей, Idea - описание,
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Scale {
    private Idea idea;


}
