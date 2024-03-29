package case_study.service;

import case_study.check_validate.CheckFacility;
import case_study.check_validate.CheckValidate;
import case_study.models.Customer;
import case_study.read_write_file.WriteReadCustomer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    // sử dụng linked list, static protery,static blcok khởi tạo
    protected static List<Customer> list = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

//    static {
//        list.add(new Customer("Phuc", "25/5/1997", "Nam", 201785, 89798798, "Phuc@gmail.com", Customer.DIAMOND, "Gia Lai", 001));
//        list.add(new Customer("VinhRau", "27/3/1997", "Nam", 45645, 54654621, "Vinh@gmail.com", Customer.PLATINIUM, "Gia Lai", 002));
//    }


    @Override
    public void add() {
        System.out.println("họ và tên");
        String name = scanner.nextLine();
        System.out.println("ngày sinh ");
        String namSinh = CheckFacility.checkBorn();
        System.out.println("GIỚI TÍNH");
        String gender = scanner.nextLine();
        System.out.println("cmnd");
        int cmnd = Integer.parseInt(CheckValidate.checkValidate(CheckValidate.NUMBER, "bạn phải nhập số"));
        System.out.println("số điện thoại");
        int sdt = Integer.parseInt(CheckValidate.checkValidate(CheckValidate.NUMBER, "bạn phải nhập số"));
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("địa chỉ ");
        String diaChi = scanner.nextLine();
        System.out.println("Loại member");
        String loaiMember = scanner.nextLine();
        System.out.println("mã khách hàng");
        int code = Integer.parseInt(CheckValidate.checkValidate(CheckValidate.NUMBER, "bạn phải nhập số"));
        Customer customer = new Customer(name, namSinh, gender, cmnd, sdt, email, loaiMember, diaChi, code);
        list.add(customer);
        WriteReadCustomer.writeFile(list);
//        if (WriteReadCustomer.customerFile.length() > 0) {
//            list = WriteReadCustomer.readFile();
//        }
//        WriteReadCustomer.readFile();
    }

    public static void showCustomer() {
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    @Override
    public void show() {
//        list = WriteReadCustomer.readFile();
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    public static void edit(String name) {
        for (Customer customer : list) {
            if (customer.getName().equals(name)) {
                System.out.println("họ và tên");
                String name1 = scanner.nextLine();
                System.out.println("năm sinh ");
                String namSinh = CheckFacility.checkBorn();
                System.out.println("GIỚI TÍNH");
                String gender = scanner.nextLine();
                System.out.println("cmnd");
                int cmnd = Integer.parseInt(CheckValidate.checkValidate(CheckValidate.NUMBER, "bạn phải nhập số"));
                System.out.println("số điện thoại");
                int sdt = Integer.parseInt(CheckValidate.checkValidate(CheckValidate.NUMBER, "bạn phải nhập số"));
                System.out.println("email");
                String email = scanner.nextLine();
                System.out.println("địa chỉ ");
                String diaChi = scanner.nextLine();
                System.out.println("Loại member");
                customer.setName(name1);
                customer.setBorn(namSinh);
                customer.setGender(gender);
                customer.setCmnd(cmnd);
                customer.setSdt(sdt);
                customer.setEmail(email);
                customer.setAddress(diaChi);
                customer.settypeOfCustomer(Customer.GOLD);
            } else {
                System.out.println("Tên bạn tìm không tồn tại");
            }
        }
    }
}