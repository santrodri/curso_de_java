public class CaulculaJuros {
    public static double calculaJuros(double capitalAplicado,double taxaDeJuros, int tempoDaAplicacao, double jurosCompostos){
        double montante = capitalAplicado*Math.pow(1+taxaDeJuros,tempoDaAplicacao);
        montante = montante + jurosCompostos;
        return montante;
    }
    public static void main(String[] args) {
        System.out.println(
                calculaJuros(100,1.5,90,4)
        );
    }
}
