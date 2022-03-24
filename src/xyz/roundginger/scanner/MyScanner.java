package xyz.roundginger.scanner;

import bit.minisys.minicc.scanner.IMiniCCScanner;

import java.io.IOException;


public class MyScanner implements IMiniCCScanner {

    @Override
    public String run(String iFile) throws Exception {
        String oFile = "";
        System.out.println("In My Scanner!");
        return oFile;
    }
}
