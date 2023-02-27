package ClassAndObjects.School;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher t) {
        this.courseTeacher = t;
        if (this.prefix.equals(t.branch)) {
            System.out.println("Process Succesful..");
        } else {
            System.out.println(t.name + " Academician does not teach this course.!");
        }
    }

    void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " Academian of this  lesson : " + courseTeacher);
        } else {
            System.out.println(this.name + " Assign an academic to the lesson.");
        }
    }
}
