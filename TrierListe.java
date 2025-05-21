import java.util.Arrays;

public class TrierListe {

    public static int[] croissant(int[] liste){
        while(!is_sorted_croissant(liste)){
            for (int i = 0; i < liste.length; i++) {

                for (int j = i + 1; j < liste.length; j++) {
                    if(liste[i] > liste[j]){
                        int temp = liste[j];
                        liste[j] = liste[i];
                        liste[i] = temp;
                    }
                }
            }
        }

        return liste;
    }

    public static boolean is_sorted_croissant(int[] liste){
        for (int i = 0; i < liste.length - 1; i++) {
            if(liste[i] < liste[i + 1]){
                continue;
            }
            else {
                return false;
            }
        }

        return true;
    }
}
