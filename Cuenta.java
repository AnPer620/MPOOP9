public class Cuenta {
    private double saldo;
    private int vecesRetiro;

    public Cuenta(){
        saldo=0;//Es redundante
    }

    public void depositar(double monto) throws DepositoMaximoException {
        System.out.println("Depositando...");
        if (monto>20000) {
            throw new DepositoMaximoException();                        
        } else {
            saldo+=monto;               
        }
     
    }

    public void retirar(double monto)throws SaldoInsuficienteException, MaximoVecesRetiroException{
        System.out.println("Retirando...");
        vecesRetiro++;
        if (vecesRetiro>3){
            throw new MaximoVecesRetiroException();
        }if(saldo<monto) {
            throw new SaldoInsuficienteException();          
        }else{
            saldo-=monto;
        }
    }    

    public double consultaSaldo(){
        System.out.println("Tu saldo es: "+saldo);
        return saldo;
    }
}