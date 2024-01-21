package onlinevoting;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class info extends JFrame{

        JButton back;
        public info() {
            setTitle("Details of Election Parties");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(500, 600);
            setLocationRelativeTo(null);

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

            add(scrollPane);


//        back = new JButton("Back");
//        back.setBounds(250, 667, 90, 25);
//        back.setForeground(new Color(255, 255, 255));
//        back.setBackground(new Color(17, 180, 229));
//        back.setBorder(BorderFactory.createEmptyBorder());
//        back.addActionListener(this);
//        textArea.add(back);

            String jsonUrl = "https://api.myjson.online/v1/records/63d82d25-05b9-46d3-99af-5fd1d4d45ec7";
            try {
                URL url = new URL(jsonUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();
                connection.disconnect();

                // Parse JSON data using Gson and display menu details in the JTextArea
                JsonElement jsonElement = JsonParser.parseString(response.toString());
                JsonObject jsonData = jsonElement.getAsJsonObject();

                JsonObject Oroutine = jsonData.getAsJsonObject("data").getAsJsonObject("election parties");

                String sname = jsonData.getAsJsonObject("data").get("authority name").getAsString();
              //  String hours = jsonData.getAsJsonObject("data").get("number of parties").getAsString();
                textArea.append("    " + sname + "\n"+"\n");

                for (String r : Oroutine.keySet()) {
                    JsonArray items = Oroutine.getAsJsonArray(r);
                    textArea.append(r.toUpperCase() + ":\n");

//                    if(r.equals("class 4") || r.equals("class 5"))
//                    {
//                        for (int i = 0; i < items.size(); i++) {
//                            JsonObject item = items.get(i).getAsJsonObject();
//                            String o = item.get("period 1").getAsString();
//                            String t = item.get("period 2").getAsString();
//                            String th = item.get("period 3").getAsString();
//                            String f = item.get("period 4").getAsString();
//                            String fi = item.get("period 5").getAsString();
//                            String six = item.get("period 6").getAsString();
//                            String ss = item.get("period 6_").getAsString();
//
//                            textArea.append(o + "\n"+ t + "\n" + th + "\n"+ f + "\n"+ fi+ "\n"+ six + "\n"+ ss + "\n");
//                        }
//                    }
//                    else {
                        for (int i = 0; i < items.size(); i++) {
                            JsonObject item = items.get(i).getAsJsonObject();
                            String o = item.get("period 1").getAsString();
                            String t = item.get("period 2").getAsString();
                            String th = item.get("period 3").getAsString();
                            String f = item.get("period 4").getAsString();
                            String fi = item.get("period 5").getAsString();

                            textArea.append(o + "\n"+ t + "\n" + th + "\n"+ f + "\n"+ fi+ "\n");
                        }
                        textArea.append("\n");
                    }


            } catch (IOException e) {
                e.printStackTrace();
                textArea.setText("Error fetching routine details. Please try again later.");
            }

            setVisible(true);
        }


        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new info());}
    }
