public class Rndm {
    public int getrn(int x, int y){
        int min = x; 
        int max = y; 
        int valrn = (int)Math.floor(Math.random() * (max - min + 1) + min); //Saca valores aleatorios entre el minimo y maximo para el primer dado
        return valrn;
    }
        
}

