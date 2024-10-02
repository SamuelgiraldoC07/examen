package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Area area  = new Area();


        System.out.println("***************");
        System.out.println("SYSTEMA");
        System.out.println("***************");

        System.out.println("nombre");
        area.setNombre(lea.nextLine());
        System.out.println("Descripción");
        area.setDescripcion(lea.nextLine());
        System.out.println("Encargados");
        area.setEncargado(lea.nextLine());
        System.out.println("Numero_empleados");
        area.setNumeroEmpleados(lea.nextInt());
        System.out.println("Ubicación");
        area.setUbicacion(lea.nextLine());
        System.out.println("Presupuesto");
        area.setPresupuesto(lea.nextDouble());
        System.out.println("TelefonoContacto");
        area.setTelefonoContacto(lea.nextLine());
        System.out.println("emailContacto");
        area.setEmailContacto(lea.nextLine());
        System.out.println("fechaCreacion");
        area.setFechaCreacion(lea.nextLine());
        System.out.println("Esta activa?");
        area.setActiva(lea.nextBoolean());

        Area area2 = new Area(1l,"samuel","tic","juan",228,"castilla",2000000,"3001432324","samuel@gmail.com","2007/03/26",true);
        System.out.println(area2);

        Beneficiario bene = new Beneficiario(2l,"santi","giraldo","21212","calle 99 #21a 32","21212121","santi@gmail","2000/12/12","monetario",200000,"desactivado");
        System.out.println(bene);

        Empleado empleado = new Empleado(3l,"luis","zapata",21,"33233","calle32 #63 033","32121","samuel@gmail.com","jefe",20000,"2001/10/10","antioquia","Soltero","Colombiana",true,"Ingeniero");
        System.out.println(empleado);

        Nomina nomina = new Nomina("2112","322332","julian","restrepo",223232,43,19323,2000,"31","2004/21/12");
        System.out.println(nomina);

        Sucursal sucu = new Sucursal("2121","german","calle 19 #21 33","323213213","german@gmail.com","german","2001/21/12","8:00am - 9:00pm","medellin",215621);
        System.out.println(sucu);
    }


}