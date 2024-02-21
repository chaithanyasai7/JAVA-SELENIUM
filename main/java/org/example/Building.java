package org.example;

import java.io.*;
interface Building {
    void heightDisplay();

    class GFG implements Building {
        public void heightDisplay() {
            System.out.println("height is 5");
        }

        public static void main(String[] args) {
            GFG gfg = new GFG();
            gfg.heightDisplay();
        }
    }
}

