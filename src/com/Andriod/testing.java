package com.Andriod;

import javax.swing.*;

public class testing {
    public static void main(String[] args) {
        System.out.println(JOptionPane.showConfirmDialog(null,
                "Are you sure you want to skip this menu?\n" +
                        "Your vote wouldn't count!",
                "Confirm Skip", JOptionPane.YES_NO_OPTION));
    }
}
