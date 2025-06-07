package ru.kopylov.book.top;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
}
