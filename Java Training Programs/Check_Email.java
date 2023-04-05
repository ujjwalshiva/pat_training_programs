public class Check_Email {
    public static void main(String[] args, String anObject) {
        char b[] = {'r','a','j','i','v'};
        System.out.println(b);
        String students[] = {
        "student1@iare.ac.in",
        "student2@gmail.com",
        "student3@yahoo.com",
        "student4@iare.com"
        };

        for(String email : students){
            String[] temp = email.split("@");
            if(temp[1].equals("iare.ac.in")){
                System.out.println(temp[0]);
            }
        }
    }
}
