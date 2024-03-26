import java.io.*;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public void save(AppData data, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(String.join(";", data.header));
            for (int[] row : data.data) {
                writer.println(String.join(";", Arrays.stream(row).mapToObj(String::valueOf).toArray(String[]::new)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AppData load(String filename) {
        AppData appData = new AppData();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String headerLine = reader.readLine();
            appData.header = headerLine.split(";");
            String line;
            int rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                if (rowCount == 0) {
                    appData.data = new int[values.length][values.length];
                }
                for (int i = 0; i < values.length; i++) {
                    appData.data[rowCount][i] = Integer.parseInt(values[i]);
                }
                rowCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appData;
    }

    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.header = new String[]{"Value1", "Value2", "Value3"};
        appData.data = new int[][]{{100, 200, 123}, {300, 400, 500}};

        appData.save(appData, "data.csv");

        AppData loadedData = appData.load("data.csv");
        System.out.println("Loaded Header: " + Arrays.toString(loadedData.header));
        System.out.println("Loaded Data:");
        for (int[] row : loadedData.data) {
            System.out.println(Arrays.toString(row));
        }
    }
}