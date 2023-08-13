import java.util.Scanner;

public class Tour {
    public static void main(String args[]){
        
        boolean Terminado = false;
        Scanner sca = new Scanner(System.in);

        Boletos Asiento1 = new Boletos();
        Asiento1.Price = 100;
        Boletos Asiento2 = new Boletos();
        Asiento2.Price = 500;
        Boletos Asiento3 = new Boletos();
        Asiento3.Price = 1000;

        Rndm rn1 = new Rndm();
        Rndm rn2 = new Rndm();
        Rndm ticket = new Rndm();
        Rndm boleto = new Rndm();

        Cliente cliente = new Cliente();

        while(!Terminado){
            System.out.println("======================MENU======================\nBienvenido al sistema de Eras Tours, eliga su opcion:\n1. Comprar boletos\n2. Revisar Disponiblidad\n3. Finanzas\n4. Salir");
            int ans = sca.nextInt();
                if(ans == 1){

                    int b = rn1.getrn(0, 15000);
                    int v = rn2.getrn(0, 15000);
                    int t = ticket.getrn(0, 15000);
                    int bolrn = boleto.getrn(1, 3);

                    System.out.println("B es "+b+" V es "+v+" T es "+t);

                    if ((t >= Math.min(b, v)) && (t <= Math.max(b, v))) {

                        System.out.println("Cual es tu nombre?");
                        sca.nextLine();
                        cliente.name = sca.nextLine();
                        System.out.println("Cual es tu Email?");
                        cliente.mail = sca.nextLine();
                        System.out.println("Cuanto dinero planeas gastar?");
                        cliente.dinero = sca.nextInt();
                        System.out.println("Cuantos boletos planeas comprar?");
                        cliente.tickets = sca.nextInt();

                        System.out.println("El nombre es "+cliente.name+" el email es "+cliente.mail+" el dinero es "+cliente.dinero+" y los boletos son "+cliente.tickets);
                        
                        if(bolrn == 1){
                            if(Asiento1.Qant > 0){

                                System.out.println("Estaras comprando los asientos de la Localidad 1");

                                int restante = Asiento1.Qant;
                                Asiento1.Qant -= cliente.tickets;
                                
                                System.out.println("La cantidad de tickets restantes son "+Asiento1.Qant+" "+restante);

                                if(Asiento1.Qant < 0){

                                    Asiento1.Qant = 0;
                                    int finalprice0 = Asiento1.Price * restante;

                                    if(finalprice0 > cliente.dinero){

                                        System.out.println(" \nNo tienes suficientes fondos para pagar por los boletos");

                                    }
                                    else {

                                        System.out.println("Compraste un total de "+restante+" boletos");
                                        Asiento1.Profit += (Asiento1.Price * restante);

                                    }
                                    
                                }
                                else {
                                    int finalprice1 = Asiento1.Price * cliente.tickets;
                                    if(finalprice1 > cliente.dinero){

                                       System.out.println(" \nNo tienes suficientes fondos para pagar por los boletos");

                                    }
                                    else {

                                        System.out.println("Compraste un total de "+cliente.tickets+" boletos");
                                        Asiento1.Profit += Asiento1.Price * (cliente.tickets);

                                    }
                                }
                            }
                            else{
                            System.out.println("No hay suficientes tickets, lo sentimos");
                            }

                        }
                        if(bolrn == 2){
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
                        if(bolrn == 3){
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
    }
                if(ans == 2){
                    System.out.println("======================Disponibilidad======================\nCantidad de sitios disponibles en Localidad 1: "+Asiento1.Qant);
                    System.out.println("Cantidad de sitios disponibles en Localidad 5: "+Asiento2.Qant);
                    System.out.println("Cantidad de sitios disponibles en Localidad 10: "+Asiento3.Qant);
                }
                if(ans == 3){
                    System.out.println("======================Finanzas======================");
                    System.out.println("Las ganancias la Localidad 1 son, "+Asiento1.Profit);
                    System.out.println("Las ganancias la Localidad 5 son, "+Asiento2.Profit);
                    System.out.println("Las ganancias La localidad 10 son, "+Asiento3.Profit);
                    int ProfitFinal = Asiento1.Profit + Asiento2.Profit + Asiento3.Profit;
                    System.out.println("Las ganancias totales son, "+ProfitFinal);
                }
                if(ans == 4){
                    Terminado = true;
                }
                if(0 > ans){
                    System.out.println("Ese valor no esta en los parametros del menu!");
                }
                if(4 < ans){
                    System.out.println("Ese valor no esta en los parametros del menu!");
                }
        }
    }
}
   
