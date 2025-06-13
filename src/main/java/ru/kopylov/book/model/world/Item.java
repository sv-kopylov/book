package ru.kopylov.book.model.world;

import ru.kopylov.book.model.world.base.Idea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
/**
     Idea реалилизованная в материальном или нематиреальном виде (секатр, система образования)
 */
public class Item extends Idea {

    public Item(String gist) {
        super(gist);
    }

    public Item() {
    }
}
