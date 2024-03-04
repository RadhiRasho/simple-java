package StandardLib;

public class ReadBytes {
    public static void readBytes() throws Exception {
        // See approximately how many bytes are waiting to be read
        int numBytesWaiting = System.in.available();
        System.out.println("Bytes Waiting: " + numBytesWaiting);

        // Read a single byte (an int from 0-255)
        int singleBytes = System.in.read();
        System.out.println("The first byte of standard input is: " + singleBytes);

        // Read a buffer's worth of bytes at once
        byte[] buffer = new byte[4];
        int offset = 0;
        System.in.read(buffer, offset, buffer.length);

        System.out.println("Next 4 bytes: " + new String(buffer));
    }
}
