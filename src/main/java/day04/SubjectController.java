package day04;

public class SubjectController {

    public static void main(String[] args) {
        SubjectService subjectService = new SubjectService("src/test/resources/beosztas.txt");

        System.out.println(subjectService.getSubjectBlocks());
    }
}
