package case_study.controllers;


import case_study.check_validate.CheckValidate;
import case_study.service.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chương trình");
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContactServiceImpl contactService = new ContactServiceImpl();
        int login = 0;
        int login1;
        do {
            System.out.println("1.\tEmployee Management \n" +
                    "2.\tCustomer Management \n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management \n" +
                    "5.\tPromotion Management \n" +
                    "6.\tExit");
            boolean check = true;
            while (check) {
                check = false;
                try {
                    login = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    check = true;
                    System.err.println("bị lỗi " + e);
                    System.out.println("mời nhập lại");
                }
            }
            switch (login) {
                case 1:
                    System.out.println("1.display \n" +
                            "2.Add new employee \n" +
                            "3.Edit employee \n" +
                            "4.return main menu ");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1: // hiển thị
                            employeeService.show();
                            break;
                        case 2:  // thêm đối tượng
                            employeeService.add();
                            break;
                        case 3:  // edit theo tên
                            System.out.println("nhập tên");
                            String name1 = scanner.nextLine();
                            employeeService.edit(name1);
                            break;
                        case 4: // về lại menu
                            System.out.println("về lại menu");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers \n" +
                            "2.\tadd new customers \n" +
                            "3.\tEdit customer \n" +
                            "4.\tReturn main menu");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1:  // hiển thị
                            customerService.show();
                            break;
                        // thêm
                        case 2:
                            customerService.add();
                            break;
                        case 3:
                            // edit theo tên
                            System.out.println("Vui lòng nhập tên");
                            String name = scanner.nextLine();
                            customerService.edit(name);
                            break;
                        case 4:
                            System.out.println("về menu");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility \n" +
                            "2\tAdd new facility \n" +
                            "3\tDisplay list facility maintenance \n" +
                            "4\tReturn main menu \n");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1:
                            System.out.println("1\tDisplay list facility");
                            facilityService.show();
                            break;

                        case 2:
                            System.out.println("***\tAdd new facility***");
                            facilityService.add();
                            break;
                        case 3:
                            System.out.println("3\tDisplay list facility maintenance");
                            facilityService.maintenance();
                            break;

                        case 4:
                            System.out.println("4\tReturn main menu");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking \n" +
                            "2.\tDisplay list booking \n" +
                            "3.\tCreate new constracts \n" +
                            "4.\tDisplay list contracts \n" +
                            "5.\tEdit contracts \n" +
                            "6.\tReturn main menu");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1:
                            // thêm booking
                            bookingService.add();
                            break;
                        case 2:
                            // hiển thị
                            bookingService.show();
                            break;
                        case 3:
                            System.out.println("3.\tCreate new constracts");
                            contactService.contract();
                            break;
                        case 4:
                            System.out.println("4.\tDisplay list contracts");
                            bookingService.setToqueue();
                            break;
                        case 5:
                            System.out.println("5.\tEdit contracts");
                            contactService.editContract();
                            break;
                        case 6:
                            System.out.println("6.\tReturn main menu");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use case_study.service");
                    System.out.println("2.\tDisplay list customers get voucher");
                    System.out.println("3.\tReturn main menu");
                    login1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (login1) {
                        case 1:
                            System.out.println("1.\tDisplay list customers use case_study.service");

                            break;

                        case 2:
                            System.out.println("2.\tDisplay list customers get voucher");

                            break;

                        case 3:

                            break;
                    }
                case 6:
                    System.out.println("exit");
                    break;
//                default :
//                    System.out.println("bạn nhập không đúng số lựa chọn");
//                    break;
            }

        }
        while (login != 6);
    }
}