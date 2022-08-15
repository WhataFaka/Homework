package H.day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public Teacher(String name, String subject) {
        this.fio = name;
        this.subject = subject;
    }

    public String getName() {
        return fio;
    }

    public void setName(String name) {
        this.fio = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String evaluation = " ";
        switch (randomValue) {
            case 2:
                evaluation = "Неудовлетворительно";
            break;
            case 3:
                evaluation = "Удовлетворительно";
            break;
            case 4:
                evaluation = "Хорошо";
            break;
            case 5:
                evaluation = "Отлично";
            break;
        }
        System.out.println("Преподаватель " + this.fio +  " оценил студента " +
                student.getFio() + " по предмету " + this.subject +  " на оценку " + evaluation);
    }
}
