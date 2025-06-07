package ru.kopylov.book.model.world;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import ru.kopylov.book.model.world.base.Idea;

/*
    Идея реалилизованная в материальном или нематиреальном виде (секатр, система образования)
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Item extends Idea {

    public Item(String gist) {
        super(gist);
    }
}
