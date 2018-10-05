public class Course {
    private String name;
    private String[] students = new String[20];
    private int studentsCount = 0 ;

    public Course(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(String student){
        this.students[studentsCount] = student;
        studentsCount++;
    }

    public void removeStudent(String student){
        for(int i = 0; i < this.students.length; i++){
            if(this.students[i].equals(student)){
                this.students[i] = this.students[i+1];
            }
        }
        this.studentsCount--;
    }

    public void displayAll(){
        for (int i = 0; i < this.studentsCount; i++){
            System.out.printf("\nstudent %d: %s",i,this.students[i]);
        }
    }
}
