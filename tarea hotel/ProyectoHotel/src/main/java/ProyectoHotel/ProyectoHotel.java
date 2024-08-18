/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoHotel;

import ico.fes.proyectoHotel.habitaciones.Habitacion;
import ico.fes.proyectoHotel.habitaciones.TipoHabitacion;
import ico.fes.proyectoHotel.registros.Fecha;
import ico.fes.proyectoHotel.registros.Hora;
import ico.fes.proyectoHotel.registros.Registro;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 2im3q
 */
public class ProyectoHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        TipoHabitacion sensilla=new TipoHabitacion(1, "Matrimonial" , false, false, false, false, false, false, 1600, 2200);
        TipoHabitacion doble=new TipoHabitacion(2, "Matrimoniales ",  false, false, false, false, false, false, 2650, 3650);
        TipoHabitacion suite=new TipoHabitacion(1, "King size", true, false, false, false, true, false, 4890, 5950);
        TipoHabitacion king=new TipoHabitacion(2, "King size", true, false, true, false, false, true, 6250, 9950);
        TipoHabitacion precidencial=new TipoHabitacion(2, "King size", false, true, true, true, false, true, 8100,9950);



        ArrayList<Habitacion> habitaciones=new ArrayList<Habitacion>();
        
        Habitacion pruebasen34=new Habitacion(34, sensilla, "Mar");
        Habitacion pruebasui35=new Habitacion(35, suite, "Mar");
        Habitacion pruebaking36=new Habitacion(36, king, "Mar");
        
        habitaciones.add(pruebasui35);
        habitaciones.add(pruebaking36);
        habitaciones.add(pruebasen34);
        
        ArrayList <Registro> registrados=new ArrayList<Registro>();
        
        Fecha fechaprueba=new Fecha(1,1,1);
        Fecha fechaprueba2=new Fecha(2,2,2);
        Hora horaprueba=new Hora(1,1,1);
        Hora horaprueba2=new Hora(2,2,2);
        Registro registradoprueba=new Registro("cliente", habitaciones.get(0) , fechaprueba , horaprueba ,fechaprueba2 , horaprueba2 , 2, true);
        registrados.add(registradoprueba);

        Scanner entrada=new Scanner(System.in);

        Boolean actividadnueva=true;

        while (actividadnueva) {
                System.out.println("Elija una opcion (1 / 2 / 3 / 4 / 5 / 6 /7):\n"
                + "1 Ver tipos de habitaciones\n"
                + "2 Ingresar Habitacion\n"
                + "3 Ver habitaciones\n"
                + "4 Ingresar un nuevo registro\n"
                + "5 Ver registros\n"
                + "6 ver costos finales\n"
                + "7 Ver fechas de estadia");
            int menu;
            menu=entrada.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Los tipos de habitaciones disponibles son:"
                            + "\n   Sensilla: "+sensilla.toString()
                            +"\n    Doble: "+precidencial.toString()
                            +"\n    Suit: "+suite.toString()
                            +"\n    King: "+king.toString()
                            +"\n    Precidencial: "+precidencial.toString());
                    break;
                case 2:
                    Boolean nuevahabitacion=true;
                    try {
                        while (nuevahabitacion) {                            
                            System.out.println("Ingrese nueva habitacion:");
                            Habitacion habitacion=new Habitacion();
                            
                            System.out.println("Ingrese numero de habitacion: ");
                            habitacion.setNumero(entrada.nextInt());
                            
                            System.out.println("Ingrse tipo de habitacion (Sensilla / Suit / King / Precidencial )");
                            String tipohabitacion;
                            tipohabitacion=entrada.next();
                            switch(tipohabitacion){
                                    case "Sensilla":
                                        habitacion.setTipoHabitacion(sensilla);
                                        break;
                                    case "Suit":
                                        habitacion.setTipoHabitacion(suite);
                                        break;    
                                    case "King":
                                        habitacion.setTipoHabitacion(king);
                                        break;    
                                    case "Precidencial":
                                        habitacion.setTipoHabitacion(precidencial);
                                        break;    
                            }
                            
                           
                            System.out.println("Ingrese el tipo de vista de la habitacion (Mar / Campo de golf / Sin vista ): ");
                            habitacion.setVista(entrada.nextLine());
                            habitacion.setVista(entrada.nextLine());
                            
                            
                            habitaciones.add(habitacion);
                            
                            System.out.println("Ingresar nueva habitacion ( true / false ):");
                            nuevahabitacion=entrada.nextBoolean();
                          
                        }
                    } catch (Exception e) {
                        System.err.println("Error nueva habitacion= Boolean");
                    }
                    break;
                case 3:
                    System.out.println("Las habitaciones registradas son: ");
                                        
                    for (Habitacion l : habitaciones){
                        System.out.println(l.tooString());
                    }
                    break;
                case 4:
                    Boolean nuevo=true;

                    try {
                       while (nuevo) {

                       Registro registrado=new Registro();
                       
                       System.out.print("Nuevo cliente\n");
                       
                       System.out.println("Ingrese nombre del cliente");
                       registrado.setCliente(entrada.nextLine());
                       registrado.setCliente(entrada.nextLine());
                      
                       System.out.println("Ingrese habitacion del cliente: (");
                       System.out.println("Las habitaciones disponibles son: ");                                        
                        for (Habitacion l : habitaciones){
                            System.out.println(l.getNumero());
                        }                       
                       int habitacioncliente;
                       habitacioncliente=entrada.nextInt();
                        
                       for(Habitacion l: habitaciones){
                           if (l.getNumero()==habitacioncliente ) {
                               registrado.setHabitacion(l);
                           }
                       }

                       System.out.println("Ingrese fecha de entrada : ");
                       Fecha fechadeentrada=new Fecha();
                       System.out.println("    Ingrese el dìa: ");
                       fechadeentrada.setDia(entrada.nextInt());
                       System.out.println("    Ingrese el mes (numero): ");
                       fechadeentrada.setMes(entrada.nextInt());
                       System.out.println("    Ingrese el año: ");
                       fechadeentrada.setAño(entrada.nextInt());
                       registrado.setFechaEntrada(fechadeentrada);

                       System.out.println("Ingrese horario de entrada: ");
                       Hora horadeentrada=new Hora();
                       System.out.println("     Ingrese hora de entrada (sin minutos ni segundos): ");
                       horadeentrada.setHr(entrada.nextInt());
                       System.out.println("     Ingrese minuto de entrada");
                       horadeentrada.setMin(entrada.nextInt());
                       System.out.println("     Ingrese segundo de entrada");
                       horadeentrada.setSeg(entrada.nextInt());
                       registrado.setHoraEntrada(horadeentrada);

                       System.out.println("Ingrese fecha de salida: ");
                       Fecha fechadesalida=new Fecha();
                       System.out.println("    Ingrese el dìa: ");
                       fechadesalida.setDia(entrada.nextInt());
                       System.out.println("    Ingrese el mes (numero): ");
                       fechadesalida.setMes(entrada.nextInt());
                       System.out.println("    Ingrese el año: ");
                       fechadesalida.setAño(entrada.nextInt());
                       registrado.setFechaSalida(fechadesalida);

                       System.out.println("Ingrese horario de salida: ");
                       Hora horadesalida=new Hora();
                       System.out.println("     Ingrese hora de salida (sin minutos ni segundos): ");
                       horadesalida.setHr(entrada.nextInt());
                       System.out.println("     Ingrese minuto de salida: ");
                       horadesalida.setMin(entrada.nextInt());
                       System.out.println("     Ingrese segundo de salida");
                       horadesalida.setSeg(entrada.nextInt());   
                       registrado.setHoraSalida(horadesalida);

                       System.out.println("Ingrese noches de estadia: ");
                       registrado.setNochesEstadia(entrada.nextInt());

                       System.out.println("Ingreso con todos los servicios (true / false ): ");
                       registrado.setTodosLosServicios(entrada.nextBoolean());

                       registrados.add(registrado);
                        
                       System.out.println("Ingresar nuevo registro? (true / false)");
                       nuevo=entrada.nextBoolean();
                       }
                    } catch (Exception e) {
                        System.out.println("Error : expex nueva entrada= boolean");
                    }
                    break;

                case 5:
                    System.out.println("Los clientes registrados son: ");

                    for (Registro l : registrados){
                        System.out.println(l.toString());
                    }
                    break;

                case 6:
                    System.out.println("Los los costos finales de los clientes registrados son: ");

                    for (Registro l : registrados){
                        System.out.println("Cliente registrado "+l.getCliente()+"\n     "
                                + "costo total: "+l.precioTotal());
                    }
                    break;
                    
                case 7:
                    System.out.println("Las fechas de estadia de los clientes registrados son:\n");

                    for (Registro l : registrados){
                        System.out.println("Cliente registrado "+l.getCliente()+"\n     fechas de estadia:\n"+l.fechasEstancia());
                    }
                    break;               
            }
            
            System.out.println("Realizar otra tarea? (true / false ): ");
            actividadnueva=entrada.nextBoolean();
        }
    }   
    
}
