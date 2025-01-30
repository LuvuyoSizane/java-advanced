package Chapter8.UserExceptions;

public class Student {
    private String stNumber,stName;
    private int test1,test2,assignment;


    public Student(String stNumber, String stName, int test1, int test2, int assignment) throws NoExamEntryException {
        setStNumber(stNumber);
       setStName(stName);
        setTest1(test1);
        setTest2(test2);
        setAssignment(assignment);
        calcSemesterMark();
    }

    public String getStNumber() {
        return stNumber;
    }

    public void setStNumber(String stNumber) {
        this.stNumber = stNumber;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        if (stName==null || stName.length()<3)
            throw new IllegalArgumentException("Student name cannot be less than 3 characters");
        this.stName = stName;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        if(test1>100||test1<0)
        throw new IllegalArgumentException("Test 1 should be >=0 and <=100. The current Test 1 is ("+test1+")");
        else
        this.test1 = test1;
    }

    public int getTest2() {

        return test2;
    }

    public void setTest2(int test2) {
        if(test2>100||test2<0)
            throw new IllegalArgumentException("Test 2 should be >=0 and <=100. The current Test 2 is ("+test2+")");
        else
        this.test2 = test2;
    }

    public int getAssignment() {
        return assignment;
    }

    public void setAssignment(int assignment) {
        if(assignment>100||assignment<0)
            throw new IllegalArgumentException("Assignment should be >=0 and <=100. The current Assignment is ("+assignment+")");
        else
        this.assignment = assignment;
    }

    //calcSemesterMark
    public double calcSemesterMark() throws NoExamEntryException {
        double semesterMark;
       semesterMark= (test1*0.33)+(test2*0.34)+(assignment*0.33);
       if(semesterMark<45){
           throw new NoExamEntryException("Student "+getStName()+" does not qualify for exam. Current Mark is: "
           +semesterMark);
       }
       return semesterMark;
    }
    //calcFindMark
    public double calcFinalMark(double examMark) throws NoExamEntryException {
        return (calcSemesterMark()+examMark)/2;
    }


    public String display(double exam) throws NoExamEntryException {

            return "Student No: "+getStNumber()
                    +"\nName: "+getStName()
                    +"\nTest 1: "+getTest1()
                    +"\nTest 2: "+getTest2()
                    +"\nAssignment: "+getAssignment()
                    +"\nSemester Mark: "+calcSemesterMark()
                    +"\nFinal Mark: "+calcFinalMark(exam);

    }
}
