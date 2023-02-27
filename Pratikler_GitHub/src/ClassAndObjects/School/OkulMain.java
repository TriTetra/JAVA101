package ClassAndObjects.School;

public class OkulMain {

    public static void main(String[] args) {

        Course mat = new Course("Matematik","Mat101","Mat");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher t1 = new Teacher("Mustafa Bayram","90550000000","Mat");
        Teacher t2 = new Teacher("Uygar Şaşmaz","90550000001","FZK");
        Teacher t3 = new Teacher("Hüseyin Aydın","90550000002","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }
}
