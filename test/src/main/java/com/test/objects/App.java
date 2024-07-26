package com.test.objects;

import com.test.exams.Evi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Admin admin = new Admin();

       admin.setName("Matviy");
       admin.setLastName("Motruk");
       admin.setAge(15);

       Student student = new Student ();

       student.setName("Matviy");
       student.setLastName("Motruk");
       student.setAge (16);

       Student student2 = new Student ();

       student2.setName("Mark");
       student2.setLastName("Zukerberg");
       student2.setAge (30);


       System.out.println(admin.equals(student));
       System.out.println(admin.equals(student2));
    
       
       printUser(student);
       printUser(student2);
       
       System.out.println(admin.hashCode());
       System.out.println(student.hashCode());
       System.out.println(student2.hashCode());

   System.out.println("--------------------PART2");
      printUser(admin);
      happyBirthday(admin);
      printUser(admin);
      System.out.println("--------------------PART3");
 
          Evi eviExam = new Evi ();

          eviExam.registerStudent(student);
          eviExam.registerStudent(student2);

          eviExam.printAllParticipants();


    }

        private static void printUser(User user){
            System.out.println(user);
        }
private static void happyBirthday(User user){

      user.setAge(user.getAge() + 1);

}

}