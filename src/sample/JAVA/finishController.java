package sample.JAVA;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import oracle.jdbc.pool.OracleDataSource;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

public class finishController {
    @FXML
    private Button HOMEButton;
    @FXML
    private Button OrderNowButton;
    @FXML
    private Button UserNameButton;
    @FXML
    public void initialize() {
        UserNameButton.setText(UserInfo.getInstance().getUsername());
    }
    @FXML
    public void Home(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage root = FXMLLoader.load(getClass().getResource("/sample/FXML/HOME.fxml"));
        stage.setScene(root.getScene());

    }
    @FXML
    public void OrderNow(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage root = FXMLLoader.load(getClass().getResource("/sample/FXML/rest1.fxml"));
        stage.setScene(root.getScene());

    }
    @FXML
    public void TheInc(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage root = FXMLLoader.load(getClass().getResource("/sample/FXML/AboutUs.fxml"));
        stage.setScene(root.getScene());

    }
    @FXML
    public void Username(ActionEvent event) throws IOException {
        System.out.println(UserInfo.getInstance().isManager());
        if(UserInfo.getInstance().isManager()){
            System.out.println("111");
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Stage root = FXMLLoader.load(getClass().getResource("/sample/FXML/manager_Profile.fxml"));
            stage.setScene(root.getScene());
        }else {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Stage root = FXMLLoader.load(getClass().getResource("/sample/FXML/CUSTOMER_PROFILE.fxml"));
            stage.setScene(root.getScene());
        }

    }
//    @FXML
//    public void Report(ActionEvent event) throws IOException {
//        try {
//            OracleDataSource oracleDataSource =new OracleDataSource();
//            String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
//            oracleDataSource.setURL(url);
//            oracleDataSource.setUser("SYSTEM");
//            oracleDataSource.setPassword("f123456789");
//            Connection connection = oracleDataSource.getConnection();
//            JasperReport jasperReport=JasperCompileManager.compileReport("C:\\Users\\Msys\\IdeaProjects\\PROJECT_DATABASE\\bill.jrxml");
//            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport, null, connection);
//            JRViewer jrViewer=new JRViewer(jasperPrint);
//            jrViewer.setOpaque(true);
//            jrViewer.setVisible(true);
//
////            InputStream input=new FileInputStream(new File("C:\\Users\\Msys\\IdeaProjects\\PROJECT_DATABASE\\bill.jrxml"));
////            JasperDesign jd= JRXmlLoader.load(input);
////            JasperReport jr= JasperCompileManager.compileReport(jd);
////            JasperPrint jp= JasperFillManager.fillReport(jr, null, connection);
////            OutputStream output=new FileOutputStream(new File("bill.pdf"));
////            JasperExportManager.exportReportToPdfStream(jp,output);
////            output.close();
////            input.close();
//            connection.close();
//
//        } catch (Exception throwables) {
//            throwables.printStackTrace();
//        }
//
//    }
}
