class Student {
    String name;
    int score;
    private final int MAX_SCORE = 100;

    void printScore() {
        System.out.println(name + "さんは" + MAX_SCORE + "点満点中、" + score + "点です");
    }
}