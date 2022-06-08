package controller;

import models.Product;
import validate.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerProduct {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
    Validate validate = new Validate();
    public void menu() {
        System.out.println("Chương trình quản lý sản phẩm");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Chỉnh sửa");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm sản phẩm giá đặt nhất");
        System.out.println("7. Đọc file");
        System.out.println("8. Ghi file");
        System.out.println("89. thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                show();
                break;
            case 2:
                addProduct(createProduct());
                break;
            case 3:
                editProduct();
                break;
            case 4:
                deleteProduct();
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
        }
    }
    public void show() {
        for (int i = 0; i < products.size(); i++) {
            if ((i+1) % 3 == 0) {
                System.out.println(products.get(i));
                scanner.nextLine();
            } else {
                System.out.println(products.get(i));
            }
        }
    }
    public Product createProduct() {
        String idName = validate.validateIdName(products);
        String name = validate.validateString("Tên sản phẩm :");
        double price = validate.validatePrice();
        int amount = validate.validateAmount();
        String describe = validate.validateString("Mô tả :");
        return new Product(idName, name, price,amount, describe);
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void editProduct() {
        System.out.println("Nhập mã sản phẩm cần sửa");
        String id = scanner.nextLine();
        int index = validate.getIndexId(id,products);
        if (index != -1){
            products.set(index, createProduct());
        } else {
            System.err.println("Mã sản phẩm không tồn tại");
        }
    }
    public void deleteProduct() {
        System.out.println("Nhập mã sản phẩm cần xóa");
        String id =scanner.nextLine();
        int index = validate.getIndexId(id,products);
        if (index != -1){
            System.out.println("Nhập y để xóa");
            String yes =scanner.nextLine();
            if (yes.equals("y")){
            products.remove(index);
                System.out.println("Xóa thất thành công");}
            else {
                System.out.println("Xóa thất bại");
            }
        } else {
            System.err.println("Mã sản phẩm không tồn tại");
        }
    }
}
