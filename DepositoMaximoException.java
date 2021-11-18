public class DepositoMaximoException extends Exception {
    public DepositoMaximoException(){
        super("No puedes ingresar más de 20,000 pesos");
    }
    
}