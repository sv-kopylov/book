package ru.kopylov.book.model.world;


import ru.kopylov.book.model.world.base.Idea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/*
    Idea имеющая реализацию в виде прав или обязанностей или неприложного правила природы
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Law extends Idea {
    public Law(String gist) {
        super(gist);
    }

    public Law() {
    }
}
