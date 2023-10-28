package example;

import example.client.CalTaxServiceLocator;
import example.client.CalTax_PortType;

import java.util.Scanner;

public class Test {
    public static void main(String[] argv) {
        try {
            CalTaxServiceLocator locator = new CalTaxServiceLocator();
            CalTax_PortType service = locator.getCalTax();
            Scanner sc  = new Scanner(System.in);
            System.out.println("请输入你的工资：");
            double income = sc.nextDouble();
            double result = Double.parseDouble(service.calTax(String.valueOf(income)));
            System.out.println("需缴税"+result);
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}