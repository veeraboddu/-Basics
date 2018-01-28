package Core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Solution1
{
    public static void main( String[] args )
    {
        File fileName = new File( "myfile.txt" );
        if( !fileName.exists() )
        {
            System.out.println( "this file doesn't exist " );
            try
            {
                fileName.createNewFile();
                FileWriter fileWrite = new FileWriter( fileName );
                BufferedWriter bufferedWriter = new BufferedWriter( fileWrite );
                //bufferedWriter.write( "write something here " );
                bufferedWriter.close();
            } catch ( IOException e )
            {
                //catch exception
            }
        }
        else
        {
            //System.out.println( "this file exists " );
            try
            {
                byte[] buffer = new byte[ 100 ];
                FileInputStream inputStream  = new FileInputStream( fileName );
                int readLines = -1;
                while( ( readLines = inputStream.read( buffer ) ) != -1 )
                {
                    //System.out.println( new String( buffer ) );
                }
                inputStream.close();
            } catch ( IOException e )
            {
                //catch exception
            }
        }
    }
}