public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Course javacore = new Course("Java Core");
        javacore.addStudent("Javascript");
        javacore.addStudent("NodeJS");
        javacore.addStudent("PHP");
        javacore.displayAll();
    }
}
