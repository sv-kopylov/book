package ru.kopylov.book.model.world;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.world.base.Idea;

/*
    Идея имеющая реализацию в виде прав или обязанностей или неприложного правила природы
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Law extends Idea {
    public Law(String gist) {
        super(gist);
    }
}
