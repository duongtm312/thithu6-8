package validate;

import models.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Validate {
    Scanner scanner = new Scanner(System.in);
    public String validateIdName(ArrayList<Product> products) {
        while (true) {
            try {
                System.out.println("Nhập mã sản phẩm:");
                String idName = scanner.nextLine();
                if ((getIndexId(idName, products) != -1)||idName.equals("")) {
                    throw new Exception();
                }
                return idName;
            } catch (Exception e) {
                System.err.println("Nhập sai mã sản phẩm rồi");
            }
        }
    }
    public int getIndexId(String id, ArrayList<Product> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIdName().equals( id)) {
                return i;
            }
        }
        return -1;
    }
    public String validateString(String name) {
        while (true) {
            System.out.println("Nhập " + name);
            String str = scanner.nextLine();
            if (str.equals("")) {
                System.err.println("không để trống");
                continue;
            } else {
                return str;
            }
        }
    }

    public int validateAmount() {
        while (true) {
            try {
                System.out.println("Nhập số lương:");
                int age = Integer.parseInt(scanner.nextLine());
                return age;
            } catch (Exception e) {
                System.err.println("Nhập sai số lượnh rồi");
            }
        }
    }

    public double validatePrice() {
        while (true) {
            try {
                System.out.println("Nhập giá:");
                double score = Integer.parseInt(scanner.nextLine());
                return score;
            } catch (Exception e) {
                System.err.println("Nhập sai giá rồi");
            }
        }
    }
}
