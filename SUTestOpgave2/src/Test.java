import Controller.Controller;
import model.Konto;
import model.Kontotype;
import model.Transaktion;

public class Test {
    public static void main(String[] args) {
        Kontotype kontotype = Controller.createKontotype("Opsparing", "Konto til brug for opsparing");
        System.out.println(kontotype);

        Konto konto = Controller.createKonto(10, kontotype); // link konto --> kontotype
        System.out.println(konto);
        System.out.println();

        Controller.createTransaktion(1000, konto); // link konto --> tr1
        Controller.createTransaktion(2000, konto); // link konto --> tr2
        Controller.createTransaktion(-500, konto); // link konto --> tr3
        System.out.println("Transaktioner på konto nr. " + konto.getNr()+":");
        System.out.println(konto.getTransaktioner());
        System.out.println();

        System.out.println("Saldo på konto nr. " + konto.getNr() + ": kr " + konto.beregnSaldo());
    }
}
/* Udskrift fra programmet: (dato skal være dato for transaktionen)
    KontoType(Opsparing, Konto til brug for opsparing)
    Konto(10, Opsparing)

    Transaktioner på konto nr. 10:
    [Transaktion(kr 1000, 2023-04-11), Transaktion(kr 2000, 2023-04-11), Transaktion(kr -500, 2023-04-11)]

    Saldo på konto nr. 10: kr 2500
*/