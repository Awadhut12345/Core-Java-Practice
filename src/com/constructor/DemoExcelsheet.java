/*
 package com.constructor;
 * 
 * import java.sql.Connection;
 * 
 * public class DemoExcelsheet {
 * 
 * 
 * public static void main(String[] args) { String url =
 * "jdbc:mysql://localhost:3306/awadhut"; String user = "root"; String password
 * = "Awadhut@123";
 * 
 * String excelFilePath = "  ";
 * 
 * try { Connection connection = DriverManager.getConnection(url, user,
 * password); PreparedStatment preparedStatment = connection.preparedStatment (
 * "Insert into Employee(id, firstname, middlename, lastname, mobno,address")
 * values(?,?,?,?,?,?); ); ) { try (Workbook workbook = new XSSFWorkbook(new
 * FileInputStream(excelFilePath))) { Sheet sheet workbook.getSheetAt(0);
 * 
 * for(Row row: sheet) { if (row.getRowNum() == 0) { continue; }
 * 
 * int id= (int)row.getCell(0).getNumericCellValue(); String firstname =
 * row.getCell(1).getStringCellValue(); String middlename =
 * row.getCell(2).getStringC-Value(); String lastname =
 * row.getCell(3).getStringValue(); String mobno =
 * row.getCell(4).getStringValue(); String address =
 * row.getCell(5).getStringValue();
 * 
 * preparedStatment.setInt(1,id); preparedStatment.setString(2, firstname);
 * preparedStatment.setString(3,middlename);
 * preparedStatment.setString(4,lastname); preparedStatment.setString(5,mobno);
 * preparedStatment.setString(6,address);
 * 
 * preparedStatment.executeUpdate();
 * 
 * } preparedStatment.close(); connection.close(); workbook.close();
 * excelFile.close();
 * 
 * }
 * 
 * Catch (Exception e) { e.printStackTrace(); } } }
 * 
 * }
 * 
 * }
 */