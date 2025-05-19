package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        int size = list.size();
        System.out.println("size = " + size);
        System.out.println();

        Board board = list.get(2); // 2번 인덱스에 있는 객체 가져오기
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println(board); // toString 선언해서 나오는거
        System.out.println();

        //
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
//            System.out.println(list.get(i));
        }
        System.out.println();

        list.remove(2); // 2번인덱스 삭제해서 3번 4번 인덱스가 2번 3번이 되어
        list.remove(2); // 전에 3번이었던 인덱스가 2번이 되어 삭제됨

        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
