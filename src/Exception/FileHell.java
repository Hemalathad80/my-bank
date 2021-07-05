package Exception;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHell {
    private List<Integer> victorsIntegers;
    private static final int SIZE = 10;
    public FileHell() throws IOException {
        victorsIntegers = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            victorsIntegers.add(i);
        this.readList("infile.txt");
        this.writeList();
    }
    public void readList(String fileName) {
        String line = null;
        RandomAccessFile raf = null;
        try {
        	raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                int i = Integer.parseInt(line);
                System.out.println(i);
                victorsIntegers.add(i);
            }
        } catch (FileNotFoundException fnf) {
            System.err.println("The file could not be fount: " + fnf.getMessage());
        } catch (IOException ioException) {
            System.err.println("Wrong Input type: " + ioException.getMessage());
        }
        finally{
        	if(raf != null ){
        		try {
					raf.close();
				} catch (IOException e) {
					System.err.println("Io Exception"+ e.getMessage());
				}
        	}
        }
    }


    public void writeList() throws IOException {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
            for (int i = 0; i < victorsIntegers.size(); i++)
                out.println("Value at: " + i + " = " + victorsIntegers.get(i));
        } catch (ArrayIndexOutOfBoundsException arrayOutOfBound) {
            System.err.println("The Array Index is out of Bound: " + arrayOutOfBound.getMessage());
        } catch (IOException ioException) {
            System.err.println("There was an IOException: " + ioException.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
