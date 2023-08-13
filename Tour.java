// Anthony Lou Schwank                          Carne = 23410
// Universidad del Valle de Guatemala
// Ejercicio 1. Overloading y relaciones entre clases



import java.util.Scanner;

public class Tour {
    public static void main(String args[]){
        
        boolean Terminado = false;
        Scanner sca = new Scanner(System.in);

        Boletos Asiento1 = new Boletos();                           //Se crean los objetos (Asientos) con precios asignados
        Asiento1.Price = 100;
        Boletos Asiento2 = new Boletos();
        Asiento2.Price = 500;
        Boletos Asiento3 = new Boletos();
        Asiento3.Price = 1000;

        Rndm rn1 = new Rndm();                                      //Se crean los generadores de numeros aleatorios para las Funciones
        Rndm rn2 = new Rndm();
        Rndm ticket = new Rndm();
        Rndm boleto = new Rndm();

        Cliente cliente = new Cliente();

        while(!Terminado){
            System.out.println("======================MENU======================\nBienvenido al sistema de Eras Tours, eliga su opcion:\n1. Comprar boletos\n2. Revisar Disponiblidad\n3. Finanzas\n4. Salir");
            int ans = sca.nextInt();
                if(ans == 1){                                       //Opcion numero 1

                    int b = rn1.getrn(0, 15000);                //Valor 1 para el rango de entrada
                    int v = rn2.getrn(0, 15000);                //Valor 2 para el rango de entrada
                    int t = ticket.getrn(0, 15000);             //Valor ticket, quien tiene que estar entre Valor 1 y Valor 2
                    int bolrn = boleto.getrn(1, 3);             //Valor boleto, dicta que tipo de asiento sera asignado para comprar

                    if ((t >= Math.min(b, v)) && (t <= Math.max(b, v))) {   //Busca si Ticket esta en el rango

                        System.out.println("Cual es tu nombre?");          //Pregunta por los datos del cliente presente
                        sca.nextLine();
                        cliente.name = sca.nextLine();
                        System.out.println("Cual es tu Email?");
                        cliente.mail = sca.nextLine();
                        System.out.println("Cuanto dinero planeas gastar?");
                        cliente.dinero = sca.nextInt();
                        System.out.println("Cuantos boletos planeas comprar?");
                        cliente.tickets = sca.nextInt();
                        
                        if(bolrn == 1){                                       //El valor boleto asigna a este cliente a Localidad 1
                            if(Asiento1.Qant > 0){                                  

                                System.out.println("Estaras comprando los asientos de la Localidad 1");
                                int restante = Asiento1.Qant;                 //Se guarda el valor actual de boletos                      
                                Asiento1.Qant -= cliente.tickets;             //Se resta la cantidad de boletos disponibles entre los pedidos

                                if(Asiento1.Qant < 0){                        //Si el numero de boletos es negativo, opera

                                    Asiento1.Qant = 0;                        //Lo volvemos 0
                                    int finalprice0 = Asiento1.Price * restante;    //Calculamos el precio de los boletos que si podemos vender 

                                    if(finalprice0 > cliente.dinero){               //Si el usuario no tiene suficiente para pagar

                                        System.out.println(" \nNo tienes suficientes fondos para pagar por los boletos");
                                        Asiento1.Qant += cliente.tickets;           //Restauramos los boletos restados anteriormente

                                    }
                                    else {                                          

                                        System.out.println("Compraste un total de "+restante+" boletos");   //Si tiene suficiente, se agrega la ganancia a la banca
                                        Asiento1.Profit += (Asiento1.Price * restante);

                                    }
                                    
                                }
                                else {                                                          //Si el valor de boletos disponibles es positivo, opera
                                    int finalprice1 = Asiento1.Price * cliente.tickets;         //Calculamos el precio
                                    if(finalprice1 > cliente.dinero){                           //Si no tiene suficiente para pagar

                                       System.out.println(" \nNo tienes suficientes fondos para pagar por los boletos");
                                       Asiento1.Qant += cliente.tickets;                        //Restauramos los tickets

                                    }
                                    else {                                                      //Si tiene suficiente, se agrega la ganancia a la banca

                                        System.out.println("Compraste un total de "+cliente.tickets+" boletos");
                                        Asiento1.Profit += Asiento1.Price * (cliente.tickets);  

                                    }
                                }
                            }
                            else{                                                                //Si no hay tickets, se opera el mensaje y vuelve al menu

                            System.out.println("No hay suficientes tickets, lo sentimos");    

                            }

                        }
                        if(bolrn == 2){                                                            //Esencialmente igual al 1
                            if(Asiento2.Qant > 0){

                                System.out.println("Estaras comprando los asientos de la Localidad 5");

                                int restante = Asiento2.Qant;
                                Asiento2.Qant -= cliente.tickets;
                                
                                System.out.println("La cantidad de tickets restantes son "+Asiento2.Qant+" "+restante);

                                if(Asiento2.Qant < 0){

                                    Asiento2.Qant = 0;
                                    int finalprice0 = Asiento2.Price * restante;

                                    if(finalprice0 > cliente.dinero){

                                        System.out.println(" \nNo tienes suficientes fondos para pagar por los boletos");
                                        Asiento2.Qant += cliente.tickets;

                                    }
                                    else {

                                        System.out.println("Compraste un total de "+restante+" boletos");
                                        Asiento2.Profit += (Asiento2.Price * restante);

                                    }
                                    
                                }
                                else {
                                    int finalprice1 = Asiento2.Price * cliente.tickets;
                                    if(finalprice1 > cliente.dinero){

                                       System.out.println(" \nNo tienes suficientes fondos para pagar por los boletos");
                                       Asiento2.Qant += cliente.tickets;

                                    }
                                    else {

                                        System.out.println("Compraste un total de "+cliente.tickets+" boletos");
                                        Asiento2.Profit += Asiento2.Price * (cliente.tickets);

                                    }
                                }
                            }
                            else{
                            System.out.println("No hay suficientes tickets, lo sentimos");
                            }
                        }
                        if(bolrn == 3){                                                     //Esencialmente igual al 1
                            if(Asiento3.Qant > 0){

                                System.out.println("Estaras comprando los asientos de la Localidad 10");

                                int restante = Asiento3.Qant;
                                Asiento3.Qant -= cliente.tickets;
                                
                                System.out.println("La cantidad de tickets restantes son "+Asiento3.Qant+" "+restante);

                                if(Asiento3.Qant < 0){

                                    Asiento3.Qant = 0;
                                    int finalprice0 = Asiento3.Price * restante;

                                    if(finalprice0 > cliente.dinero){

                                        System.out.println(" \nNo tienes suficientes fondos para pagar por los boletos");
                                        Asiento3.Qant += cliente.tickets;

                                    }
                                    else {

                                        System.out.println("Compraste un total de "+restante+" boletos");
                                        Asiento3.Profit += (Asiento3.Price * restante);

                                    }
                                    
                                }
                                else {
                                    int finalprice1 = Asiento3.Price * cliente.tickets;
                                    if(finalprice1 > cliente.dinero){

                                       System.out.println(" \nNo tienes suficientes fondos para pagar por los boletos");
                                       Asiento3.Qant += cliente.tickets;

                                    }
                                    else {

                                        System.out.println("Compraste un total de "+cliente.tickets+" boletos");
                                        Asiento3.Profit += Asiento3.Price * (cliente.tickets);

                                    }
                                }
                            }
                            else{
                            System.out.println("No hay suficientes tickets, lo sentimos");
                            }
                        }
                    
                    }
                else {

                    System.out.println("Lo sentimos, tu Ticket de entrada no fue aceptado"); //Si el numero del Ticket no esta en el rango, opera

                }
    }
                if(ans == 2){                               //Opcion numero 2
                    System.out.println("======================Disponibilidad======================\nCantidad de sitios disponibles en Localidad 1: "+Asiento1.Qant);        //Se dicta la cantidad de boletos disponibles en cada Localidad
                    System.out.println("Cantidad de sitios disponibles en Localidad 5: "+Asiento2.Qant);
                    System.out.println("Cantidad de sitios disponibles en Localidad 10: "+Asiento3.Qant);
                }
                if(ans == 3){                               //Opcion numero 3
                    System.out.println("======================Finanzas======================"); 
                    System.out.println("Las ganancias la Localidad 1 son, "+Asiento1.Profit);   //Se dicta la cantidad de ganancias por Localidad
                    System.out.println("Las ganancias la Localidad 5 son, "+Asiento2.Profit);
                    System.out.println("Las ganancias La localidad 10 son, "+Asiento3.Profit);
                    int ProfitFinal = Asiento1.Profit + Asiento2.Profit + Asiento3.Profit;      //Se suman las ganancias
                    System.out.println("Las ganancias totales son, "+ProfitFinal);              //Ganancias totales
                }
                if(ans == 4){                               //Opcion 4
                    Terminado = true;                       //Termina el menu
                }
                if(0 > ans){                                //Parametro 1, no se puede ingresar valores negativos
                    System.out.println("Ese valor no esta en los parametros del menu!");
                }
                if(4 < ans){                                //Parametro 2, no se puede ingresar valores mayores a 4
                    System.out.println("Ese valor no esta en los parametros del menu!");
                }
        }
    }
}
   
