package com.company;

public class Main
{
    //Initializing Objects
    private ComPortCommunication commPortCommunication = new ComPortCommunication();
    private RadioPktParsing radioPktParsing = new RadioPktParsing();
    //Byte Arrays
    private byte[] rawRadioPkt = new byte[64];
    

    public static void main(String[] args)
    {
	//write your code here

    }
    private void setRadioPktParsing()
    {
        for(int i = 0; i<64; i++)
        {
            radioPktParsing.ReceivedRadioPkt[i] = rawRadioPkt[i];
            return;
        }
    }

}
