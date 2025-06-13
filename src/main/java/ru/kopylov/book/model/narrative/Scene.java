package ru.kopylov.book.model.narrative;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Scene {
    private List<Scene> subScenes;
    private List<View> views;

}
