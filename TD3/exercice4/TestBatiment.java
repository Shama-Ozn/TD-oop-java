package exercice4;

public class TestBatiment {
    public static void main(String[] args) {
        Batiment batiment = new Batiment("5 Rue de la Paix");
        System.out.println(batiment);

        Maison maison = new Maison("10 Avenue des Fleurs", 4);
        System.out.println(maison);

        Immeuble immeuble = new Immeuble("15 Boulevard du Lac", 10);
        System.out.println(immeuble);
    }
}
