public class OOPS {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "Sanskar Bharti";
        System.out.println(s1.schoolName);

    }

}
class Student{
        String name;
        int roll;

        static String schoolName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }


    }
