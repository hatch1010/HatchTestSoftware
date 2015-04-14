package com.company;

/**
 * Created by michaelhatcher on 3/31/15.
 * This Class encapsulates all code for the Parsing of Radio Packet Data.
 */
public class RadioPktParsing
{
    //byte arrays
    public byte[] ReceivedRadioPkt = new byte[64];
    private byte[] receivedRadioPkt = new byte[64];
    public byte[] ParsedRadioPkt;
    private byte[] parsedRadioPkt;

    //strings

    //methods
    private void setRadioPktByte()
    {
        //This Method creates copies the public radio packet to a private buffer and executes the radio parsing method.
        //this.receivedRadioPkt = ReceivedRadioPkt;
        for (int i = 0; i<64; i++)
        {
            receivedRadioPkt[i] = ReceivedRadioPkt[i];
        }
        radioPktParsing();
    }
    private void radioPktParsing()
    {
        //This Method parses the raw radio pkt data and will spit out some human readable dialog as to what is being sent if necessary.
        switch(receivedRadioPkt[0])
        {
            case 0x01:
                //Do Stuff.
                //radioPktString = "ACK received";
                break;
            case 0x02:
                //Do Stuff.
                break;

        }
    }

}




