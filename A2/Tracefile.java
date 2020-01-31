/*
 *  ============================================================================================
 *  Tracefile.java : read data from file and process data
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A2;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Tracefile {
    private ArrayList<String[]> tarce_data = new ArrayList<String[]>();
    private ArrayList<String> source = new ArrayList<String>();
    private ArrayList<String> destination = new ArrayList<String>();

    /** constructor to read data from file
     */
    public Tracefile(String path) {
        String temp;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            while ((temp = br.readLine()) != null) {
                String[] each_trace = temp.split("\t");
                tarce_data.add(each_trace);
            }
            br.close();
        } catch (IOException e) {
        }
    }

    /** Find and sort all the Source IPs that appear in the opened file
     * @return source        the list of all sorted Source IPs
     */
    public ArrayList<String> getSource() {
        String temp;
        for (int i = 0; i < tarce_data.size(); i++) {
            temp = tarce_data.get(i)[2];
            if (source.indexOf(temp) == -1 && !temp.equals("")) {
                source.add(temp);
            }
        }
        source.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] a = o1.split("\\.");
                String[] b = o2.split("\\.");
                int c = Integer.parseInt(a[a.length - 1]);
                int d = Integer.parseInt(b[b.length - 1]);
                return c - d;
            }
        });
        return source;
    }

    /** Find and sort all the Destination IPs that appear in the opened file
     * @return destination        the list of all sorted Destination IPs
     */
    public ArrayList<String> getDestination() {
        String temp;
        for (int i = 0; i < tarce_data.size(); i++) {
            temp = tarce_data.get(i)[4];
            if (destination.indexOf(temp) == -1 && !temp.equals("")) {
                destination.add(temp);
            }
        }
        destination.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] a = o1.split("\\.");
                String[] b = o2.split("\\.");
                int a1 = Integer.parseInt(a[2]);
                int a2 = Integer.parseInt(a[3]);
                int b1 = Integer.parseInt(b[2]);
                int b2 = Integer.parseInt(b[3]);
                if (a1 == b1){
                    return a2 - b2;
                }
                return a1 - b1;
            }
        });
        return destination;
    }

    /** find the maximum number of bytes in the data
     * @param  data          the list of the total number of bytes that the selected source/destination host sent/received for each 2 second interval
     * @return Result        the maximum number of bytes in the data
     */
    public int getMax(ArrayList<Integer> data){
        int result = 0;
        for (int i : data){
            if (i > result){
                result = i;
            }
        }
        return result;
    }

    /** Get the list of the total number of bytes that the selected source host sent/received for each 2 second interval
     * @param  ip                 the selected ip
     * @return computeResult        the list of the total number of bytes that the selected source host sent/received for each 2 second interval
     */
    public ArrayList<Integer> getSourceData(String ip){
        ArrayList<String[]> requiredSourceData = new ArrayList<String[]>();
        for (String[] i : tarce_data){
            if (i[2].equals(ip)){
                requiredSourceData.add(i);
            }
        }
        return computeData(requiredSourceData);
    }

    /** Get the list of the total number of bytes that the selected destination host sent/received for each 2 second interval
     * @param  ip                 the selected ip
     * @return computeResult        the list of the total number of bytes that the selected destination host sent/received for each 2 second interval
     */
    public ArrayList<Integer> getDestinationData(String ip){
        ArrayList<String[]> requiredDestinationData = new ArrayList<String[]>();
        for (String[] i : tarce_data){
            if (i[4].equals(ip)){
                requiredDestinationData.add(i);
            }
        }
        return computeData(requiredDestinationData);
    }

    /** Compute the list of the total number of bytes that the selected source/destination host sent/received for each 2 second interval
     * @param  data                 the list of all data of specified ip
     * @return computeResult        the total number of bytes that the selected source/destination host sent/received for each 2 second interval
     */
    public ArrayList<Integer> computeData (ArrayList<String[]> data){
        ArrayList<Integer> computeResult = new ArrayList<Integer>();
        int start = 0;
        int end = 2;
        String[] temp;
        while (end <= 660){
            int totalbytes = 0;
            for (String[] j : data) {
                temp = j[1].split("\\.");
                if (Integer.parseInt(temp[0]) < end && Integer.parseInt(temp[0]) >= start && !j[7].equals("")) {
                    totalbytes += Integer.parseInt(j[7]);
                }
            }
            computeResult.add(totalbytes);
            start = end;
            end += 2;
        }
        return computeResult;
    }
}
