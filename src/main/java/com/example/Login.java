package com.example;

public class Login {

    public static void main(String[] args) {

        var user = new BasicUser();
        user.printPrivileges();

        System.out.println();

        var adminUser = new AdminUser(user);
        adminUser.printPrivileges();

        System.out.println();

        var developerUser = new DeveloperUser(adminUser);
        developerUser.printPrivileges();

    }

}
