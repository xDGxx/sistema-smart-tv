public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv(); //Requisitando a classe "SmartTv" para "Usuario" criando um objeto com a mesma

        System.out.println("Tv ligada? " +smartTv.ligada);
        System.out.println("Canall atual? " +smartTv.canal);
        System.out.println("Volume atual? " +smartTv.volume);
        System.out.println();

    }
}
