package studentmanagement;

import java.util.Scanner;

public class riyas {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int c, usr;
        store ob = new store();

        do {
            System.out.println("::::MENU::::");
            System.out.println("ENTER 1 FOR ADDING DETAIL");
            System.out.println("ENTER 2 FOR SEARCHING");
            System.out.println("ENTER 3 FOR DELETION");
            System.out.println("ENTER 4 FOR UPDATION");
            System.out.println("ENTER 5 TO EXIT");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("enter the no of entries");
                    usr = s.nextInt();
                    ob.add(usr);
                    break;
                case 2:
                    ob.search();
                    break;
                case 3:
                    ob.delete();
                    break;
                case 4:
                    ob.update();
                    break;
                case 5:
                    System.exit(0);
            }

            System.out.println("press any key other than 5 to do more operations else press 5 to exit");
            c = s.nextInt();
        } while (c != 5);

    }
}

abstract class student {

    protected String name[];
    protected int roll[];

    abstract void display();
}

class store extends student {

   int usr;

    Scanner s = new Scanner(System.in);
    int i = 0, c = 0, r = 0;

    store() {
        roll = new int[10];
        name = new String[10];
    }

    public void add(int usr) {
        this.usr = usr;
        for (i = 0; i < usr; i++) {
            System.out.println("Enter name and roll no ");
            name[i] = s.next();
            roll[i] = s.nextInt();

        }
        display();

    }

    public void search() {

        System.out.println("Enter the roll no you want to search");
        r = s.nextInt();
        for (i = 0; i < roll.length; i++) {
            if (roll[i] == r) {
                break;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---DETAILS OF THE SPECIFIED STUDENT IS---");
        System.out.println("NAME        ROLL NO");
        System.out.print(name[i]+"         ");
        System.out.print(roll[i]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");    
       

    }

    public void delete() {
        System.out.println("Enter the rollno to be deleted");
        r = s.nextInt();

        for (i = 0; i < roll.length; i++) {
            if (roll[i] == r) {
                roll[i] = 0;
                name[i] = " ";
            }
        }
        display();

    }

    public void update() {
        System.out.println("Enter the rollno to be updated");
        r = s.nextInt();

        for (i = 0; i < roll.length; i++) {
            if (roll[i] == r) {
                System.out.println("Enter the new name and roll no");
                name[i] = s.next();
                roll[i] = s.nextInt();
            }
        }
        display();
    }

    @Override
    void display() {
        System.out.println("----THE UPDATED RECORDS OF STUDENTS ARE----");
        System.out.println("NAME        ROLL NO");
        for (i = 0; i < roll.length; i++) {
            if(roll[i]!=0)
            {              
            System.out.print(name[i]+"         ");
            System.out.print(roll[i]);
            System.out.println(" ");
            }
        }
    }
}
