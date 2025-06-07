package ru.kopylov.book.model.world.base;

/*
    Связь между любыми двумя
 */
public class Connection {
    private Idea source;
    private Idea target;

    public Connection(Idea source, Idea target) {
        this.source = source;
        this.target = target;
    }
}
