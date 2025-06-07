package ru.kopylov.book.model.narrative;

import ru.kopylov.book.model.Actor;

import java.util.List;
/*
    Диалог имеет участников и реплики (участники - ссылочные, а реплики принадлежат диалогу)
 */
public class Dialogue {
    List<Actor> actors;
    List<Cue> cues;
}
