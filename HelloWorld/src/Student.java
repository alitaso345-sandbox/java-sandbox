/**
 * 生徒の点数を扱うクラス
 */
class Student {
    /** 名前 */
    private String name;

    /** 点数 */
    int score;

    /**
     * 名前と点数を指定してインスタンスを生成する
     * @param argName 名前
     * @param argScore スコア
     */
    Student(String argName, int argScore) {
        name = argName;
        score = argScore;
    }

    /**
     * 名前を指定してインスタンスを生成する
     * @param argName 名前
     */
    Student(String argName) {
        name = argName;
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

    /**
     * 点数を標準出力に表示する
     */
    void printScore() {
        int MAX_SCORE = 100;
        System.out.println(name + "さんは" + MAX_SCORE + "点満点中、" + score + "点です");
    }
}