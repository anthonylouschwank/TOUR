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

        Cliente cliente = new Cliente();

        while(!Terminado){
            System.out.println("Bienvenido al sistema de Eras Tours, eliga su opcion:\n1. Comprar boletos\n2. Revisar Disponiblidad\n3. Finanzas\n4. Salir");
            int ans = sca.nextInt();
                if(ans == 1){
                    int b = rn1.getrn(0, 15000);
                    int v = rn2.getrn(0, 15000);
                    int t = ticket.getrn(0, 15000);
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

                        
                    }
                }
                if(ans == 2){
                    System.out.println("Vas a revisar la disponibilidad");
                }
                if(ans == 3){
                    System.out.println("Vas a revisar finanzas");
                }
                if(ans == 4){
                    Terminado = true;
                }
        }
    }
}
   
