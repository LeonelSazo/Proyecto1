/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comisiones;

import com.mycompany.proyecto1.ClsVendedores;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Leonel
 */
public class SistemaComisiones {
    public static void main(String[] args){
        //Establecer 2 decimales
        DecimalFormat La = new DecimalFormat("#.00");
        List<ClsVendedores> Emp = new ArrayList();
        
        ClsVendedores ven = new ClsVendedores("Leonel");
        ven.setEnero(Math.random()*(100-1500)+1500);
        ven.setFebrero(Math.random()*(100-1500)+1500);
        ven.setMarzo(Math.random()*(100-1500)+1500);
        ven.setAbril(Math.random()*(100-1500)+1500);
        ven.setMayo(Math.random()*(100-1500)+1500);
        ven.setJunio(Math.random()*(100-1500)+1500);
        ven.setJulio(Math.random()*(100-1500)+1500);
        ven.setAgosto(Math.random()*(100-1500)+1500);
        ven.setSeptiembre(Math.random()*(100-1500)+1500);
        ven.setOctubre(Math.random()*(100-1500)+1500);
        ven.setNoviembre(Math.random()*(100-1500)+1500);
        ven.setDiciembre(Math.random()*(100-1500)+1500);
        Emp.add(ven);
        
        ven = new ClsVendedores("Laura");
        ven.setEnero(Math.random()*(100-1500)+1500);
        ven.setFebrero(Math.random()*(100-1500)+1500);
        ven.setMarzo(Math.random()*(100-1500)+1500);
        ven.setAbril(Math.random()*(100-1500)+1500);
        ven.setMayo(Math.random()*(100-1500)+1500);
        ven.setJunio(Math.random()*(100-1500)+1500);
        ven.setJulio(Math.random()*(100-1500)+1500);
        ven.setAgosto(Math.random()*(100-1500)+1500);
        ven.setSeptiembre(Math.random()*(100-1500)+1500);
        ven.setOctubre(Math.random()*(100-1500)+1500);
        ven.setNoviembre(Math.random()*(100-1500)+1500);
        ven.setDiciembre(Math.random()*(100-1500)+1500);
        Emp.add(ven);
        
        ven = new ClsVendedores("Ale");
        ven.setEnero(Math.random()*(100-1500)+1500);
        ven.setFebrero(Math.random()*(100-1500)+1500);
        ven.setMarzo(Math.random()*(100-1500)+1500);
        ven.setAbril(Math.random()*(100-1500)+1500);
        ven.setMayo(Math.random()*(100-1500)+1500);
        ven.setJunio(Math.random()*(100-1500)+1500);
        ven.setJulio(Math.random()*(100-1500)+1500);
        ven.setAgosto(Math.random()*(100-1500)+1500);
        ven.setSeptiembre(Math.random()*(100-1500)+1500);
        ven.setOctubre(Math.random()*(100-1500)+1500);
        ven.setNoviembre(Math.random()*(100-1500)+1500);
        ven.setDiciembre(Math.random()*(100-1500)+1500);
        Emp.add(ven);
        
        ven = new ClsVendedores("Frank");
        ven.setEnero(Math.random()*(100-1500)+1500);
        ven.setFebrero(Math.random()*(100-1500)+1500);
        ven.setMarzo(Math.random()*(100-1500)+1500);
        ven.setAbril(Math.random()*(100-1500)+1500);
        ven.setMayo(Math.random()*(100-1500)+1500);
        ven.setJunio(Math.random()*(100-1500)+1500);
        ven.setJulio(Math.random()*(100-1500)+1500);
        ven.setAgosto(Math.random()*(100-1500)+1500);
        ven.setSeptiembre(Math.random()*(100-1500)+1500);
        ven.setOctubre(Math.random()*(100-1500)+1500);
        ven.setNoviembre(Math.random()*(100-1500)+1500);
        ven.setDiciembre(Math.random()*(100-1500)+1500);
        Emp.add(ven);
        
        ven = new ClsVendedores("Victor");
        ven.setEnero(Math.random()*(100-1500)+1500);
        ven.setFebrero(Math.random()*(100-1500)+1500);
        ven.setMarzo(Math.random()*(100-1500)+1500);
        ven.setAbril(Math.random()*(100-1500)+1500);
        ven.setMayo(Math.random()*(100-1500)+1500);
        ven.setJunio(Math.random()*(100-1500)+1500);
        ven.setJulio(Math.random()*(100-1500)+1500);
        ven.setAgosto(Math.random()*(100-1500)+1500);
        ven.setSeptiembre(Math.random()*(100-1500)+1500);
        ven.setOctubre(Math.random()*(100-1500)+1500);
        ven.setNoviembre(Math.random()*(100-1500)+1500);
        ven.setDiciembre(Math.random()*(100-1500)+1500);
        Emp.add(ven);
        
        ven = new ClsVendedores("John");
        ven.setEnero(Math.random()*(100-1500)+1500);
        ven.setFebrero(Math.random()*(100-1500)+1500);
        ven.setMarzo(Math.random()*(100-1500)+1500);
        ven.setAbril(Math.random()*(100-1500)+1500);
        ven.setMayo(Math.random()*(100-1500)+1500);
        ven.setJunio(Math.random()*(100-1500)+1500);
        ven.setJulio(Math.random()*(100-1500)+1500);
        ven.setAgosto(Math.random()*(100-1500)+1500);
        ven.setSeptiembre(Math.random()*(100-1500)+1500);
        ven.setOctubre(Math.random()*(100-1500)+1500);
        ven.setNoviembre(Math.random()*(100-1500)+1500);
        ven.setDiciembre(Math.random()*(100-1500)+1500);
        Emp.add(ven);
        
        ven = new ClsVendedores("Donald");
        ven.setEnero(Math.random()*(100-1500)+1500);
        ven.setFebrero(Math.random()*(100-1500)+1500);
        ven.setMarzo(Math.random()*(100-1500)+1500);
        ven.setAbril(Math.random()*(100-1500)+1500);
        ven.setMayo(Math.random()*(100-1500)+1500);
        ven.setJunio(Math.random()*(100-1500)+1500);
        ven.setJulio(Math.random()*(100-1500)+1500);
        ven.setAgosto(Math.random()*(100-1500)+1500);
        ven.setSeptiembre(Math.random()*(100-1500)+1500);
        ven.setOctubre(Math.random()*(100-1500)+1500);
        ven.setNoviembre(Math.random()*(100-1500)+1500);
        ven.setDiciembre(Math.random()*(100-1500)+1500);
        Emp.add(ven);
        
        ven = new ClsVendedores("Juan");
        ven.setEnero(Math.random()*(100-1500)+1500);
        ven.setFebrero(Math.random()*(100-1500)+1500);
        ven.setMarzo(Math.random()*(100-1500)+1500);
        ven.setAbril(Math.random()*(100-1500)+1500);
        ven.setMayo(Math.random()*(100-1500)+1500);
        ven.setJunio(Math.random()*(100-1500)+1500);
        ven.setJulio(Math.random()*(100-1500)+1500);
        ven.setAgosto(Math.random()*(100-1500)+1500);
        ven.setSeptiembre(Math.random()*(100-1500)+1500);
        ven.setOctubre(Math.random()*(100-1500)+1500);
        ven.setNoviembre(Math.random()*(100-1500)+1500);
        ven.setDiciembre(Math.random()*(100-1500)+1500);
        Emp.add(ven);
        
        ven = new ClsVendedores("Nuevo");
        
        double sumEne = 0; double sumFeb = 0; double sumMar = 0; double sumAb = 0;
        double sumMayo = 0; double sumJun = 0; double sumJul = 0; double sumAgo = 0;
        double sumSep = 0; double sumOct = 0; double sumNov = 0; double sumDic = 0; double Totven=0;
        double sumTot=0; double comis=0; double Totvencomis=0; double ISR=0; double Liquido =0;
        
        System.out.println("NOMBRE\t\tENERO\t\tFEBRERO\t\tMARZO\t\tABRIL\t\tMAYO\t\tJUNIO\t\tJULIO\t\tAGOSTO\t\tSEPTIEMBRE\t\tOCTUBRE\t\t"
                        + "\tNOVIEMBRE\t\tDICIEMBRE\t\tTOTAL VENTAS\t\t20%COMISIONES35%\t\tTOTALVEN YCOMI\t\tISR\t  \t\tLIQUIDO A RECIBIR");
        
        for (ClsVendedores v :Emp){
            //System.out.println("Nombre ="+v.getNombre());
            //Calculos Totales por mes
            sumEne += v.getEnero();sumFeb += v.getFebrero();
            sumMar += v.getMarzo(); sumAb += v.getAbril(); sumMayo += v.getMayo();
            sumJun += v.getJunio(); sumJul += v.getJulio(); sumAgo += v.getAgosto(); sumSep += v.getSeptiembre();
            sumOct += v.getOctubre(); sumNov += v.getNoviembre(); sumDic += v.getDiciembre();
            
            //Sumas totales
            //ven.setTotvent(v.getEnero() +v.getFebrero()+v.getMarzo() +v.getAbril() +v.getMayo() +v.getJunio() +v.getJulio() +v.getAgosto() +v.getSeptiembre() +v.getOctubre() +v.getNoviembre() +v.getDiciembre());
            sumTot=(v.getEnero() +v.getFebrero()+v.getMarzo() +v.getAbril() +v.getMayo() +v.getJunio() +v.getJulio() +v.getAgosto() +v.getSeptiembre() +v.getOctubre() +v.getNoviembre() +v.getDiciembre());
            Totven += sumTot;
            //if determinar que comision le corresponde en 12 meses
             if (sumTot <=2000){
                 comis=(sumTot*0.2);
             }
             else{
                 comis=(sumTot*0.35);
             }
             //Total de ventas por empleado con comisiones
             Totvencomis =(sumTot+comis);
             
             //ISR
             ISR= (Totvencomis *0.05);
             
             //Liquido a recibir
             Liquido = (Totvencomis-ISR);
             
             //Tabla
            System.out.println(v.getNombre()+"\t"+"\t"+La.format(v.getEnero())+"\t"+"\t"+La.format(v.getFebrero())+"\t"+"\t"+La.format(v.getMarzo())+"\t"+"\t"+La.format(v.getAbril())+"\t"+"\t"+La.format(v.getMayo())+"\t"+"\t"+La.format(v.getJunio())+"\t"+"\t"+La.format(v.getJulio())+"\t"+"\t"+La.format(v.getAgosto())+"\t"+"\t"+La.format(v.getSeptiembre())+"\t"+"\t"+"\t"+La.format(v.getOctubre())+"\t"+"\t"+"\t"+La.format(v.getNoviembre())+"\t"+"\t"+"\t"+La.format(v.getDiciembre())+"\t"+"\t"+"\t"+La.format(sumTot)+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+La.format(comis)+"\t"+"\t"+"\t"+La.format(Totvencomis)+"\t"+"\t"+"\t"+La.format(ISR)+"\t"+"\t"+La.format(Liquido));
        }
        System.out.println("Totales  " +"\t"+La.format(sumEne) +"\t"+"\t"+La.format(sumFeb)+"\t"+"\t"+La.format(sumMar)+"\t"+"\t"+La.format(sumAb)+"\t"+"\t"+La.format(sumMayo)+"\t"+"\t"+La.format(sumJun)+"\t"+"\t"+La.format(sumJul)+"\t"+"\t"+La.format(sumAgo)+"\t"+"\t"+La.format(sumSep)+"\t"+"\t"+"\t"+La.format(sumOct)+"\t"+"\t"+"\t"+La.format(sumNov)+"\t"+"\t"+"\t"+La.format(sumDic)+"\t"+"\t"+"\t"+La.format(Totven));
       
//        for (ClsVendedores v: Emp){
//            System.out.println(ven.getTotvent());
//        }
        
        
    }
}
