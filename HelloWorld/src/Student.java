class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    Student(String name) {
        this(name, 0);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }

    void printScore() {
        int MAX_SCORE = 100;
        System.out.println(name + "さんは" + MAX_SCORE + "点満点中、" + score + "点です");
    }
}