public class AnonymousClassSample {
    public static void main(String... args) {
        TaskHandler taskHandler = new TaskHandler() {
            @Override
            public boolean handle(Task task) {
                return false;
            }
        };
        Task myTask = new Task(TaskType.PRIVATE, "private task");
        taskHandler.handle(myTask);
    }
}
