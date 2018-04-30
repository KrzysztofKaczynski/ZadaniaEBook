package helloNtimes;

import com.sun.deploy.util.StringUtils;

import java.util.Collections;

public class WitajNrazy {

    public static void main(String[] args) {
        System.out.print(String.join("",Collections.nCopies(10, " \n Hello ")));
    }
}