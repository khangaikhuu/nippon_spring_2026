public class Student {
    int age;
    String name;
    double gpa;


    public Student(int age, String name, double gpa) {
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    void printHello(){
        System.out.println("Hello Student");
    }

    // introduceMySelf гэдэг 
    // утга буцаадаггүй функц бичнэ үү
    // Тэгээд
    // My name is @@@@@ and I'm ### years old
    // I have a grade of ####.
    void introduceMySelf(){
        System.out.println("My name is " + name + " and I'm " 
            + age + " years old. I have a grade of " + gpa  
        );
    }

    // nextYear гэдэг String буцаадаг функц
    // бичээд
    // Next year i will be @@@ Grade student
    // гэдэг текст буцаадаг болгоорой
    String nextYear(){
        return "Next year I will be " + (age - 5) + 
        " student.";
    }
    
    void nextYear(double gpa){
        System.out.println("Next year I will be " + gpa + 
        " student.");
    }

    // 2 class method-оо дуудаж шалгаарай.
    
    

}