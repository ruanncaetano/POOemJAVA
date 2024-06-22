package POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] arg)
    {
        String n=new String();
        int i,e;
        CodigoPostal Codigo,Codigo2,Codigo3; // definindo objeto
        Scanner ler= new Scanner(System.in); // leiturta

        // as mensagens
        System.out.println("*=====*=====*=====*");

        System.out.println("Indicativo: ");
        i= ler.nextInt();

        System.out.println("Extenção: ");
        e= ler.nextInt();

        ler.nextLine(); // limpando o buffer

        System.out.println("Nome da Rua: ");
        n=ler.nextLine();

        Codigo = new CodigoPostal(1245,021,"Ruan Caetano");
        Codigo2= new CodigoPostal();
        Codigo3= new CodigoPostal(i,e,n);


        // chamar os metodos
        System.out.println(Codigo.mostra());
        System.out.println(Codigo2.mostra());
        System.out.println(Codigo3.mostra());
    }
}
