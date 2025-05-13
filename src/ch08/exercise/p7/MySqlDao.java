package ch08.exercise.p7;

public class MySqlDao implements DataAcessObject {
    @Override
    public void select() {
        System.out.println("SQL DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("SQL DB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("SQL DB를 수정");
    }

    @Override
    public void delete() {
        System.out.println("SQL DB에서 삭제");
    }
}
