package ru.kopylov.book.top;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.narrative.Scene;
import ru.kopylov.book.model.narrative.View;

import java.util.List;

/**
 * Верхний элемент повествование, главный элемент List<Scene>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Narrative {
    List<Scene> scenes;
    List<View> views;

    public Narrative() {
    }
}
