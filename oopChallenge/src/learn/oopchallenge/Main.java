package learn.oopchallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient("John", 25,
                new Eye("Left Eye", "Short sighted", "Blue", true),
                new Eye("Right Eye", "Normal", "Blue", false),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burned", "White", 40));

        System.out.println("\n-------------------" + "\nPatient" + "\n-------------------");
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFInish = false;
        while (!shouldFInish) {
            System.out.println("\nChoose an Organ: " +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");
            System.out.print("\nEnter: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye" +
                            "\n\t\t2. Chose another Organ");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye"  +
                                "\n\t\t2. Chose another Organ");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye" +
                                "\n\t\t2. Chose another Organ");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye" +
                                "\n\t\t2. Chose another Organ");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate" +
                            "\n\t\t2. Chose another Organ");
                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter a new heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest" +
                            "\n\t\t2. Chose another Organ");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().digest();
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFInish = true;
                    break;
            }
        }
    }
}
