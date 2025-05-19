package ch15.exercise.p07;

import java.util.ArrayList;
import java.util.List; // java.atw.List로 import 하지 않게 주의

public class BoardDao {
    //private List<Board> boardlist;

    public List<Board> getBoardlist() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
        return list;
    }
}
