import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Tạo Department
        Department dep1 = new Department();
        dep1.departmentID = 1;
        dep1.departmentName = "Marketing";

        Department dep2 = new Department();
        dep2.departmentID = 2;
        dep2.departmentName = "Sale";

        Department dep3 = new Department();
        dep3.departmentID = 3;
        dep3.departmentName = "BOD";

        // Tạo Position
        Position pos1 = new Position();
        pos1.positionID = 1;
        pos1.name = Position.positionName.Dev;

        Position pos2 = new Position();
        pos2.positionID = 2;
        pos2.name = Position.positionName.PM;

        Position pos3 = new Position();
        pos3.positionID = 3;
        pos3.name = Position.positionName.Scrum_Master;

        Position pos4 = new Position();
        pos4.positionID = 4;
        pos4.name = Position.positionName.Test;

        // Tạo Group
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "G1";

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "G2";

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "G3";

        // Tạo Account
        Account acc1 = new Account();
        acc1.accountID = 1;
        acc1.email = "a@gmail.com";
        acc1.userName = "aaa";
        acc1.fullName = "Anh Anh Anh";
        acc1.departmentID = dep1;
        acc1.positionID = pos1;
        acc1.createDate = Date.valueOf(LocalDate.now());
        Group[] groupAcc1 = { group1, group2 };
        acc1.groups = groupAcc1;

        Account acc2 = new Account();
        acc2.accountID = 2;
        acc2.email = "b@gmail.com";
        acc2.userName = "bbb";
        acc2.fullName = "Bao Bao Bao";
        acc2.departmentID = dep2;
        acc2.positionID = pos2;
        acc2.createDate = Date.valueOf(LocalDate.of(2021, 03, 17));
        acc2.groups = new Group[] { group3, group2 };

        Account acc3 = new Account();
        acc3.accountID = 3;
        acc3.email = "c@gmail.com";
        acc3.userName = "ccc";
        acc3.fullName = "Cao Cao Cao";
        acc3.departmentID = dep3;
        acc3.positionID = pos3;
        acc3.createDate = Date.valueOf(LocalDate.now());

        //Exercise 1 (Optional): Flow Control
        //Q1
        if (acc2.departmentID == null) {
            System.out.println("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nv này là: " + acc2.departmentName);
        }

        //Q2
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int countGroup = acc2.groups.length;
            if (countGroup == 1 || countGroup == 2) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }
            if (countGroup == 3) {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            }
            if (countGroup >= 4) {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }

        //Q3
        System.out.println(acc2.departmentID == null ? "Nhân viên này chưa có phòng ban."
                                                   : "Phòng của nhân viên này là: " + acc2.departmentID.name);

        //Q4
        System.out.println(acc1.positionID.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");

        //Exercise 2 (Optional): System out printf
        //Question 1:
        int i = 5;
        System.out.printf("%d%n", i);
        //Question 2:
        int i1 = 100000000;
        System.out.printf(Locale.US, "%,d%n", i1);
        //Question 3:
        float cc = 5.567098f;
        System.out.printf("%5.4f%n", c);
        //Question 4:
        String s = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"" + s + "\" và tôi đang độc thân\n");
        //Question 5:
        Date date1 = new Date();
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(date1);
        System.out.println(date);

        //Exercise 5: Input from console
        //Question 1:
        private static void question1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập vào 3 số nguyên");
            System.out.println("Nhập vào số 1: ");
            int a = sc.nextInt();
            System.out.println("Nhập vào số 2: ");
            int b = sc.nextInt();
            System.out.println("Nhập vào số 3: ");
            int c = sc.nextInt();
            System.out.println("Bạn vừa nhập vào các số: " + a + " " + b + " " + c);
        }

        //Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
        private static void question2() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập vào 2 số thực");
            System.out.println("Nhập vào số 1: ");
            float f1 = sc.nextFloat();
            System.out.println("Nhập vào số 2: ");
            float f2 = sc.nextFloat();
            System.out.println("Bạn vừa nhập vào các số: " + f1 + " " + f2);
        }

        //Question 3: Viết lệnh cho phép người dùng nhập họ và tên
        private static void question3() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập vào Họ: ");
            String s1 = sc.next();
            System.out.println("Mời bạn nhập vào Tên: ");
            String s2 = sc.next();
            System.out.println("Fullname của bạn là:" + s1 + " " + s2);
        }

        //Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
        private static void question4() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập vào năm sinh: ");
            int year = sc.nextInt();
            System.out.println("Mời bạn nhập vào tháng sinh: ");
            int month = sc.nextInt();
            System.out.println("Mời bạn nhập vào ngày sinh: ");
            int day = sc.nextInt();
            LocalDate dateBirth = LocalDate.of(year, month, day);
            System.out.println("Ngày sinh của bạn là: " + dateBirth);
        }

        //Exercise 6 (Optional): Method
        //Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
        private static void question1() {

            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
        }

        //Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10
        private static void question3() {

            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }

    }
}
