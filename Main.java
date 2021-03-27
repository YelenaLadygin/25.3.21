package com.company;
import java.util.Collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

//public class Main {
  //  public static void main(String[] args) {
  /*      //1
        LocalDateTime date1 = LocalDateTime.of(1970, 12, 19, 00, 45, 3);
        System.out.println(date1);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(date1.format(form));

        //3 + //4
        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Asia", 450000.99, 9000000));
        continents.add(new Continent("America", 1009000.0, 6500000));
        continents.add(new Continent("Europe", 125888.00, 1115000));

        Collections.sort(continents);
        System.out.println("======== before sort ==========");
        continents.stream()
                .forEach(System.out::println);

        Collections.sort(continents, new ContentPopulationCompare());
        System.out.println("\n======== after sort by population ==========");
        continents.stream()
                .forEach(System.out::println);

        Collections.sort(continents, new ContinentSizeCompare());
        System.out.println("\n======== after sort by size ==========");
        continents.stream()
                .forEach(System.out::println);

        Collections.sort(continents, new CompareBySizeAndNumberOfPeople());
        System.out.println("\n======== after sort by size and population ==========");
        continents.stream()
                .forEach(System.out::println);
*/
        import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

        public class Main {

            public static void createNewDatabase() {

                String url = "jdbc:sqlite:D:/SQLITE/2503_.db";

                try (Connection conn = DriverManager.getConnection(url)) {
                    if (conn != null) {
                        DatabaseMetaData meta = conn.getMetaData();
                        System.out.println("The driver name is " + meta.getDriverName());
                        System.out.println("A new database has been created.");
                    }

                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

            public static void selectAll() {
                String url = "jdbc:sqlite:C:\\Users\\yelena\\SQL2203.db";

                try (Connection conn = DriverManager.getConnection(url)) {
                    if (conn != null) {
                        // String sql = "SELECT * FROM EMPLOYEES";
                        String sql = "DELETE FROM EMPLOYEES" + " " +
                         " " +
                        "WHERE ID = 4";


                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        // loop through the result set
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" +
                                    rs.getString("name") + "\t" +
                                    rs.getDouble("salary"));
                        }
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

            public static void main(String[] args) {
                selectAll();
                //createNewDatabase();
                // 2 perform insert update delete
                // 3 run the calc unit test and read the data from the
                //   caladata table + use it

            }

        }
















