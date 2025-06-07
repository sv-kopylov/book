package ru.kopylov.book.model.narrative;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Scene {
    private List<Scene> subScenes;
    private List<View> views;

}
