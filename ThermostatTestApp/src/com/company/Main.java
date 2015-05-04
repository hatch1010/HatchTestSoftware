package com.company;
import java.io.*;

public class Main
{
    //Initializing Objects
    private ComPortCommunication commPortCommunication = new ComPortCommunication();
    private RadioPktParsing radioPktParsing = new RadioPktParsing();
    private BufferedReader bufferedReader;
    //Byte Arrays
    private byte[] rawRadioPkt = new byte[63];
    

    public static void main(String[] args)
    {
	//write your code here


    }
    private void setRadioPktParsing()
    {
        for(int i = 0; i<63; i++)
        {
            radioPktParsing.ReceivedRadioPkt[i] = rawRadioPkt[i];
            return;
        }
    }

}
