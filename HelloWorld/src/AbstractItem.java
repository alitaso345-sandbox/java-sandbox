public abstract class AbstractItem {
    String name;

    AbstractItem(String name) {
        this.name = name;
    }

    public abstract void print(String parentPath); // 抽象メソッド。子クラスで実装する。
}
